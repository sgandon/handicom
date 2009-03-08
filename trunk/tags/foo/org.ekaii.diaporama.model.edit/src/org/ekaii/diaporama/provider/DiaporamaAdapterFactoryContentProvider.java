package org.ekaii.diaporama.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.ekaii.diaporama.DiaporamaPackage;

public class DiaporamaAdapterFactoryContentProvider extends AdapterFactoryContentProvider {

	private final class FileDialogCellEditor extends DialogCellEditor {
		private final String[] filterExts;
		private final String initialPath;

		private FileDialogCellEditor(Composite parent, String[] filterExts, String intialPath) {
			super(parent);
			this.filterExts = filterExts;
			this.initialPath = intialPath;
		}

		@Override
		protected Object openDialogBox(Control cellEditorWindow) {
			FileDialog fileDialog = new FileDialog(cellEditorWindow.getShell());
			fileDialog.setFilterExtensions(filterExts);
			fileDialog.setFileName(initialPath);
			return fileDialog.open();
		}
	}

	public DiaporamaAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	protected IPropertySource createPropertySource(Object object, IItemPropertySource itemPropertySource) {
		return new PropertySource(object, itemPropertySource) {
			@Override
			protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
				return new PropertyDescriptor(object, itemPropertyDescriptor) {
					@Override
					public CellEditor createPropertyEditor(Composite composite) {
						// Test for your case based on the feature or the type
						// of the feature.
						// See the super method for details.
						//
						Object feature = itemPropertyDescriptor.getFeature(this.object);
						if (feature == DiaporamaPackage.Literals.SLIDE__PICTURE_PATH) {
							Object value = ((EObject) this.object).eGet((EStructuralFeature) feature);
							return new FileDialogCellEditor(composite, new String[]{"*.jpg;*.gif;*.png;*.bmp"}, value != null ? value
									.toString() : null);
						}
						if (feature == DiaporamaPackage.Literals.SLIDE__SOUND_PATH
								|| feature == DiaporamaPackage.Literals.SLIDE__CLICKED_SLIDE_SOUND_PATH) {
							Object value = ((EObject) this.object).eGet((EStructuralFeature) feature);
							return new FileDialogCellEditor(composite, new String[]{"*.wav;*.mp3"}, value != null ? value.toString() : null);
						} else {
							return super.createPropertyEditor(composite);
						}
					}

				};
			}
		};
	}

}
