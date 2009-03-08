package org.ekaii.diaporama.rcp;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.setFixed(false);
		// String editorArea = layout.getEditorArea();
		// layout.setEditorAreaVisible(false);
		// layout.setFixed(true);

		// layout.addStandaloneView(View.ID, false, IPageLayout.LEFT, 1.0f,
		// editorArea);
	}

}
