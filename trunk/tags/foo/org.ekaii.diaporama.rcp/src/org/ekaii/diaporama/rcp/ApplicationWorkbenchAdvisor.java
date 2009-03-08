package org.ekaii.diaporama.rcp;

import java.io.File;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String PERSPECTIVE_ID = "org.eclipse.diaporama.perspective";

	@Override
	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		return new ApplicationWorkbenchWindowAdvisor(configurer);
	}

	@Override
	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}

	@Override
	public void initialize(IWorkbenchConfigurer configurer) {
		super.initialize(configurer);
		configurer.setSaveAndRestore(true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static boolean openEditor(IWorkbench workbench, URI fileURI) {
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();

		IEditorDescriptor editorDescriptor = workbench.getEditorRegistry().getDefaultEditor(fileURI.toFileString());
		if (editorDescriptor == null) {
			MessageDialog.openError(workbenchWindow.getShell(), "Erreur interne", //$NON-NLS-1$
					"Aucun editeur disponible pour " + fileURI.toFileString()); //$NON-NLS-1$
			return false;
		} else {
			try {
				page.openEditor(new URIEditorInput(fileURI), editorDescriptor.getId());
			} catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), "Erreur a l'ouverture de l'éditeur", //$NON-NLS-1$
						exception.getMessage());
				return false;
			}
		}

		return true;
	}

	public static String openFilePathDialog(Shell shell, String fileExtensionFilter, int style) {
		FileDialog fileDialog = new FileDialog(shell, style);
		if (fileExtensionFilter == null) {
			fileExtensionFilter = "*.diaporama"; //$NON-NLS-1$ //$NON-NLS-2$
		}
		fileDialog.setFilterExtensions(new String[]{fileExtensionFilter});

		fileDialog.open();
		if (fileDialog.getFileName() != null && fileDialog.getFileName().length() > 0) {
			return fileDialog.getFilterPath() + File.separator + fileDialog.getFileName();
		} else {
			return null;
		}
	}

}
