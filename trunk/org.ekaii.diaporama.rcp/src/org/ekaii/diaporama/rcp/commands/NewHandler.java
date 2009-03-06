package org.ekaii.diaporama.rcp.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.ekaii.diaporama.rcp.DiaporamaPlugin;
import org.ekaii.diaporama.rcp.wizard.DiaporamaModelWizard;

public class NewHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		DiaporamaModelWizard wizard = new DiaporamaModelWizard();
		wizard.init(DiaporamaPlugin.getWindow().getWorkbench(), StructuredSelection.EMPTY);
		WizardDialog wizardDialog = new WizardDialog(DiaporamaPlugin.getWindow().getShell(), wizard);
		wizardDialog.open();
		return null;
	}

}
