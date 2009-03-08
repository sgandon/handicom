package org.ekaii.diaporama.rcp.commands;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.ekaii.diaporama.SlideShow;
import org.ekaii.diaporama.presentation.DiaporamaEditor;
import org.ekaii.diaporama.rcp.DiaporamaPlugin;
import org.ekaii.diaporama.rcp.generator.SlideShowToHtml;

public class ModelToDiapo extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		try {
			IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
			String fileStr = null;
			if (activeEditor != null && activeEditor instanceof DiaporamaEditor) {
				activeEditor.doSave(new NullProgressMonitor());
				IEditorInput editorInput = activeEditor.getEditorInput();
				URI uri = ((URIEditorInput) editorInput).getURI();
				fileStr = uri.toFileString();
			} else {
				// choose model
				FileDialog fileDialog = new FileDialog(DiaporamaPlugin.getDefault().getWorkbench().getDisplay().getActiveShell());
				fileDialog.setText("choose a model to convert into Diaporama");
				fileStr = fileDialog.open();
			}
			try {
				if (fileStr != null) {
					ResourceSet resourceSet = new ResourceSetImpl();
					Resource resource = resourceSet.createResource(URI.createFileURI(fileStr)); //$NON-NLS-1$
					resource.load(null);
					SlideShow slideShow = (SlideShow) resource.getContents().get(0);
					System.out.println("slideshow loaded :" + slideShow);
					IPath destPath = new Path(fileStr).removeLastSegments(1).append(
							"diaporama final " + new Path(fileStr).removeFileExtension().lastSegment());
					SlideShowToHtml slideShowToHtml = new SlideShowToHtml(destPath);
					slideShowToHtml.exportSlideShowToHtml(slideShow, true, null);
					Program.launch(slideShowToHtml.getIndexHtmlPath().getAbsolutePath());
					// MessageDialog.openInformation(workbenchWindow.getShell(),
					// "Génération OK",
					// "La génération du diaporama est réussie.");
				}
			} catch (IOException e) {
				DiaporamaPlugin.logErrorMessage(e);
				MessageDialog.openError(workbenchWindow.getShell(), "Erreur au chargement du diaporama",
						"Le diaporama n'a pas pu être chargé pour les raisons suivantes : " + e.getLocalizedMessage());
			} catch (CoreException e) {
				DiaporamaPlugin.logErrorMessage(e);
				MessageDialog.openError(workbenchWindow.getShell(), "Erreur à la génération du diaporama",
						"Le diaporama n'a pas pu être exporté pour les raisons suivantes : " + e.getLocalizedMessage());
			}
		} catch (Exception e) {
			DiaporamaPlugin.logErrorMessage(e);
			MessageDialog.openError(workbenchWindow.getShell(), "Erreur à l'export du diaporama",
					"Le diaporama n'a pas pu être exporté pour les raisons suivantes : " + e.getLocalizedMessage());
		}
		return null;
	}
}
