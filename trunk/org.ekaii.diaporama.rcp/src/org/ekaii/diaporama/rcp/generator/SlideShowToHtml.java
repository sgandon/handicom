package org.ekaii.diaporama.rcp.generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.IFileSystem;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.ekaii.diaporama.Slide;
import org.ekaii.diaporama.SlideShow;
import org.ekaii.diaporama.rcp.DiaporamaPlugin;

public class SlideShowToHtml {

	private static final String SLIDE_NAME = "@SLIDE_NAME@";
	private static final String CLICKED_NEXT_SLIDE_URL = "@CLICKED_NEXT_SLIDE_URL@";
	private static final String AUTO_NEXT_SLIDE_URL = "@AUTO_NEXT_SLIDE_URL@";
	private static final String CLICK_SOUND_URL = "@CLICK_SOUND_URL@";
	private static final String SLIDE_SOUND_URL = "@SLIDE_SOUND_URL@";
	private static final String PICTURE_URL = "@PICTURE_URL@";
	private static final String PICTURE_RESIZE_POLICY = "@PICTURE_RESIZE_POLICY@";
	private static final String CLICK_TIMEOUT = "@CLICK_TIMEOUT@";
	private static final String SLIDE_DURATION = "@SLIDE_DURATION@";
	private static final String SLIDE_HTML_TEMPLATE_PATH = "templates/slide.html.template";
	private final IPath destPath;

	public SlideShowToHtml(IPath destPath) {
		Assert.isTrue(destPath != null);
		this.destPath = destPath;
	}

	/**
	 * creates the html slide show files
	 * 
	 * @param slideShow
	 *            the slide show to be exported into html
	 * @param destination
	 *            the path to place the slide show
	 * @param overide
	 *            whether the folder can be deleted before export
	 * @param monitor
	 *            to report the progress, may be null
	 * @throws CoreException
	 *             if eclipse Filsystem api fails
	 * @throws IOException
	 *             if html file cannot be written
	 */
	public void exportSlideShowToHtml(SlideShow slideShow, boolean overide, IProgressMonitor monitor) throws CoreException, IOException {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		if (destPath.toFile().exists()) {
			if (overide) {
				IFileSystem localFileSystem = EFS.getLocalFileSystem();
				IFileStore destStore = localFileSystem.getStore(destPath);
				destStore.delete(EFS.NONE, monitor);
			} else {// do not averride so return
				return;
			}
		}// else path does not exists so continue
		// creates the directory
		IFileSystem localFileSystem = EFS.getLocalFileSystem();
		IFileStore destStore = localFileSystem.getStore(destPath);
		destStore.mkdir(EFS.NONE, monitor);
		exportSlideShow(slideShow, monitor);
	}

	private void exportSlideShow(SlideShow slideShow, IProgressMonitor monitor) throws CoreException, IOException {
		// create the introduction page
		Slide firstSlide = slideShow.getFirstSlide();
		Assert.isNotNull(firstSlide, "Le diaporama doit définir une première diapositive");
		FileWriter templateWriter = new FileWriter(getIndexHtmlPath());
		try {
			templateWriter.write("<html>\n" + "<a href=\"" + firstSlide.getSlideName() + "\\" + firstSlide.getSlideName()
					+ ".html\">Démarrer le Diaporama</a>\n" + "</html>");
		} finally {
			templateWriter.close();
		}

		// export all the slides
		String templateString = getTemplateString();
		for (Slide slide : slideShow.getAllSlides()) {
			exportSlide(slide, templateString, slideShow,monitor);
		}
	}

	private String getTemplateString() {
		// load the slide template
		StringBuffer templateBuf = new StringBuffer();
		try {
			InputStream templateStream = FileLocator.openStream(DiaporamaPlugin.getDefault().getBundle(),
					new Path(SLIDE_HTML_TEMPLATE_PATH), false);
			try {
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(templateStream));
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					templateBuf.append(line + "\n");
				}
			} finally {
				templateStream.close();
			}
		} catch (IOException e) {// should never happend so no need to handle it
			// just convert to an error
			throw new Error(e);
		}
		return templateBuf.toString();
	}

	private void exportSlide(Slide slide, String templateString, SlideShow slideShow, IProgressMonitor monitor) throws CoreException, IOException {
		// creates a sub folder of the root with the slide name
		// may fail if the name does not comply to the filesystem
		IFileSystem localFileSystem = EFS.getLocalFileSystem();
		IPath slideFolderIPath = destPath.append(slide.getSlideName());
		IFileStore slideFolderStore = localFileSystem.getStore(slideFolderIPath);
		slideFolderStore.mkdir(EFS.NONE, monitor);

		// copy sound and image to slide folder
		IPath pictureIPath = slide.getPictureIPath();
		if (pictureIPath != null) {
			IFileStore picStore = localFileSystem.getStore(pictureIPath);
			picStore.copy(slideFolderStore.getChild(pictureIPath.lastSegment()), EFS.NONE, monitor);
		}// else no image to copy

		IPath soundIPath = slide.getSoundIPath();
		if (soundIPath != null) {
			IFileStore sndStore = localFileSystem.getStore(soundIPath);
			sndStore.copy(slideFolderStore.getChild(soundIPath.lastSegment()), EFS.NONE, monitor);
		}// else no sound to copy

		IPath clickedSndIPath = slide.getClickedSlideSoundIPath();
		if (clickedSndIPath != null) {
			IFileStore clickedSndStore = localFileSystem.getStore(clickedSndIPath);
			clickedSndStore.copy(slideFolderStore.getChild(clickedSndIPath.lastSegment()), EFS.NONE, monitor);
		}// else no sound to copy

		// replace template missing tags according to slide props
		{
			String pictureUrl = pictureIPath != null ? pictureIPath.lastSegment() : "";
			templateString = templateString.replaceAll(PICTURE_URL, pictureUrl);
		}
		{
			String soundUrl = soundIPath != null ? soundIPath.lastSegment() : "dummy.wav";
			templateString = templateString.replaceAll(SLIDE_SOUND_URL, soundUrl);
		}
		{
			String clickedSoundUrl = clickedSndIPath != null ? clickedSndIPath.lastSegment() : "dummy.wav";
			templateString = templateString.replaceAll(CLICK_SOUND_URL, clickedSoundUrl);
		}
		{
			String autoNextSlideUrl = "";
			if (slide.getAutomaticNextSlide() != null) {
				Slide nextSlide = slide.getAutomaticNextSlide();
				autoNextSlideUrl = "../" + nextSlide.getSlideName() + "/" + nextSlide.getSlideName() + ".html";
			}
			templateString = templateString.replaceAll(AUTO_NEXT_SLIDE_URL, autoNextSlideUrl);
			//if auto next slide is same then disable automatic open of URL.
			if (slide == slide.getAutomaticNextSlide()) {
				templateString = templateString.replaceAll(SLIDE_DURATION, "-1");
			}
		}
		{
			String clickedNextSlideUrl = "";
			if (slide.getClickedNextSlide() != null) {
				Slide nextSlide = slide.getClickedNextSlide();
				clickedNextSlideUrl = "../" + nextSlide.getSlideName() + "/" + nextSlide.getSlideName() + ".html";
			}
			templateString = templateString.replaceAll(CLICKED_NEXT_SLIDE_URL, clickedNextSlideUrl);
		}
		{
			String slideName = slide.getSlideName() != null ? slide.getSlideName() : "No Name";
			templateString = templateString.replaceAll(SLIDE_NAME, slideName);
		}
		// and fills template data with slideshow parameters
		templateString = templateString.replaceAll(SLIDE_DURATION, "" + slideShow.getDefaultSlideDuration());
		templateString = templateString.replaceAll(CLICK_TIMEOUT, "" + slideShow.getClickSoundTimeout());
		templateString = templateString.replaceAll(PICTURE_RESIZE_POLICY, "" + slideShow.getPictureResizingPolicy());
		
		FileWriter templateWriter = new FileWriter(slideFolderIPath.append(slide.getSlideName() + ".html").toFile());
		try {
			templateWriter.write(templateString);
		} finally {
			templateWriter.close();
		}
	}

	public File getIndexHtmlPath() {
		return destPath.append("index.html").toFile();
	}
}
