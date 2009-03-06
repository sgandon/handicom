/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ekaii.diaporama.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.ekaii.diaporama.DiaporamaPackage;
import org.ekaii.diaporama.Slide;

/**
 * This is the item provider adapter for a {@link org.ekaii.diaporama.Slide}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SlideItemProvider extends ItemProviderAdapter
		implements
			IEditingDomainItemProvider,
			IStructuredItemContentProvider,
			ITreeItemContentProvider,
			IItemLabelProvider,
			IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SlideItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAutomaticNextSlidePropertyDescriptor(object);
			addSlideNamePropertyDescriptor(object);
			addSoundPathPropertyDescriptor(object);
			addPicturePathPropertyDescriptor(object);
			addClickedNextSlidePropertyDescriptor(object);
			addClickedSlideSoundPathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Automatic Next Slide feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAutomaticNextSlidePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Slide_AutomaticNextSlide_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Slide_AutomaticNextSlide_feature", "_UI_Slide_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DiaporamaPackage.Literals.SLIDE__AUTOMATIC_NEXT_SLIDE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Slide Name feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSlideNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Slide_SlideName_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Slide_SlideName_feature", "_UI_Slide_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DiaporamaPackage.Literals.SLIDE__SLIDE_NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sound Path feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSoundPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Slide_SoundPath_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Slide_SoundPath_feature", "_UI_Slide_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DiaporamaPackage.Literals.SLIDE__SOUND_PATH, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Picture Path feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPicturePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Slide_PicturePath_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Slide_PicturePath_feature", "_UI_Slide_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DiaporamaPackage.Literals.SLIDE__PICTURE_PATH, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Clicked Next Slide feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addClickedNextSlidePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_Slide_ClickedNextSlide_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Slide_ClickedNextSlide_feature", "_UI_Slide_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DiaporamaPackage.Literals.SLIDE__CLICKED_NEXT_SLIDE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Clicked Slide Sound Path feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addClickedSlideSoundPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Slide_ClickedSlideSoundPath_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Slide_ClickedSlideSoundPath_feature", "_UI_Slide_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DiaporamaPackage.Literals.SLIDE__CLICKED_SLIDE_SOUND_PATH, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This returns Slide.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Slide")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Slide) object).getSlideName();
		return label == null || label.length() == 0 ? "Diapo sans nom" : label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Slide.class)) {
			case DiaporamaPackage.SLIDE__SLIDE_NAME :
			case DiaporamaPackage.SLIDE__SOUND_PATH :
			case DiaporamaPackage.SLIDE__PICTURE_PATH :
			case DiaporamaPackage.SLIDE__CLICKED_SLIDE_SOUND_PATH :
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DiaporamaEditPlugin.INSTANCE;
	}

}
