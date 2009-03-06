package org.ekaii.diaporama.rcp;

import java.io.File;

import org.eclipse.core.runtime.Platform;
import org.eclipse.osgi.service.datalocation.Location;

public class IConstants {
	public static final String DIAPO_EXTENSION = "diaporama";

	public static File getDiaporamasStorageDir() {
		Location instanceLocation = Platform.getInstanceLocation();
		String instanceUrl = instanceLocation.getURL().toString().replaceAll(" ", "%20");
		File instanceFile = new File(java.net.URI.create(instanceUrl));
		return instanceFile;
	}

}
