package org.ekaii.diaporama.rcp.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.ekaii.diaporama.rcp.DiaporamaPlugin;
import org.ekaii.diaporama.rcp.IConstants;

public class OpenHandler extends AbstractHandler {

	private static final String LAST_OPENNED_FOLDER_PREF_KEY = "LAST_OPENNED_FOLDER";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		FileDialog fileDialog = new FileDialog(workbenchWindow.getShell());
		fileDialog.setFilterExtensions(new String[]{"*.diaporama"});
		fileDialog.setFilterNames(new String[]{"Diaporama"});
		String lastOpenedFolder = DiaporamaPlugin.getDefault().getPreferenceStore().getString(LAST_OPENNED_FOLDER_PREF_KEY);
		if (lastOpenedFolder == null || lastOpenedFolder.equals("")) {
			lastOpenedFolder = IConstants.getDiaporamasStorageDir().getAbsolutePath();
		}
		fileDialog.setFilterPath(lastOpenedFolder);
		String fileToOpen = fileDialog.open();
		if (fileToOpen != null) {
			// stores the last opened folder
			DiaporamaPlugin.getDefault().getPreferenceStore().setValue(LAST_OPENNED_FOLDER_PREF_KEY, fileToOpen);
			URIEditorInput editorInput = new URIEditorInput(URI.createFileURI(fileToOpen));
			try {
				DiaporamaPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(editorInput,
						"org.ekaii.diaporama.presentation.DiaporamaEditorID");
			} catch (PartInitException e) {
				throw new ExecutionException("", e);
			}
		}
		return null;
	}
}
