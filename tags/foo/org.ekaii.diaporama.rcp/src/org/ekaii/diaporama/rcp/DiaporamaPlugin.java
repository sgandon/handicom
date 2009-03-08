package org.ekaii.diaporama.rcp;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class DiaporamaPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.diaporama";

	// The shared instance
	private static DiaporamaPlugin plugin;

	/**
	 * The constructor
	 */
	public DiaporamaPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static DiaporamaPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	public static IWorkbenchWindow getWindow() {
		return getDefault().getWorkbench().getActiveWorkbenchWindow();
	}

	public static void log(Exception e) {
		getDefault().getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, e.getLocalizedMessage(), e));
	}

	/**
	 * message must not be null
	 */
	public static void logErrorMessage(String message) {
		log(new Status(IStatus.ERROR, PLUGIN_ID, message, null));
	}

	public static void logErrorMessage(String message, Throwable t) {
		log(new Status(IStatus.ERROR, PLUGIN_ID, message, t));
	}

	public static void logErrorStatus(String message, IStatus status) {
		if (status == null) {
			logErrorMessage(message);
			return;
		}
		MultiStatus multi = new MultiStatus(PLUGIN_ID, 0, message, null);
		multi.add(status);
		log(multi);
	}

	public static void logErrorMessage(Throwable e) {
		if (e instanceof CoreException) {
			log(((CoreException) e).getStatus());
		} else {
			log(new Status(IStatus.ERROR, PLUGIN_ID, e.getMessage() != null ? e.getMessage() : e.toString(), e));
		}
	}

	public static void logInfoMessage(Throwable e) {
		log(new Status(IStatus.INFO, PLUGIN_ID, e.getMessage() != null ? e.getMessage() : e.toString(), e));
	}

	public static void log(IStatus status) {
		getDefault().getLog().log(status);
	}

	/**
	 * @param string
	 */
	public static void logInfoMessage(String mess) {
		log(new Status(IStatus.INFO, PLUGIN_ID, mess));
	}

}
