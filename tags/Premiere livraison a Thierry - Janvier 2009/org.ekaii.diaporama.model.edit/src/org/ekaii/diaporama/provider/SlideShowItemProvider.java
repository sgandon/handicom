/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ekaii.diaporama.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.ekaii.diaporama.DiaporamaFactory;
import org.ekaii.diaporama.DiaporamaPackage;
import org.ekaii.diaporama.SlideShow;

/**
 * This is the item provider adapter for a {@link org.ekaii.diaporama.SlideShow}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SlideShowItemProvider extends ItemProviderAdapter
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
	public SlideShowItemProvider(AdapterFactory adapterFactory) {
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

			addFirstSlidePropertyDescriptor(object);
			addDefaultSlideDurationPropertyDescriptor(object);
			addClickSoundTimeoutPropertyDescriptor(object);
			addNextSlideActionTypePropertyDescriptor(object);
			addPictureResizingPolicyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the First Slide feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFirstSlidePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_SlideShow_FirstSlide_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_SlideShow_FirstSlide_feature", "_UI_SlideShow_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DiaporamaPackage.Literals.SLIDE_SHOW__FIRST_SLIDE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Default Slide Duration feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addDefaultSlideDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_SlideShow_DefaultSlideDuration_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_SlideShow_DefaultSlideDuration_feature", "_UI_SlideShow_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DiaporamaPackage.Literals.SLIDE_SHOW__DEFAULT_SLIDE_DURATION, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Click Sound Timeout feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addClickSoundTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_SlideShow_ClickSoundTimeout_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_SlideShow_ClickSoundTimeout_feature", "_UI_SlideShow_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DiaporamaPackage.Literals.SLIDE_SHOW__CLICK_SOUND_TIMEOUT, true, false, false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Next Slide Action Type feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNextSlideActionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_SlideShow_NextSlideActionType_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_SlideShow_NextSlideActionType_feature", "_UI_SlideShow_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DiaporamaPackage.Literals.SLIDE_SHOW__NEXT_SLIDE_ACTION_TYPE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Picture Resizing Policy feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPictureResizingPolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_SlideShow_PictureResizingPolicy_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_SlideShow_PictureResizingPolicy_feature", "_UI_SlideShow_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				DiaporamaPackage.Literals.SLIDE_SHOW__PICTURE_RESIZING_POLICY, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to
	 * deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in
	 * {@link #createCommand}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DiaporamaPackage.Literals.SLIDE_SHOW__ALL_SLIDES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper
		// feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SlideShow.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SlideShow")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		SlideShow slideShow = (SlideShow) object;
		String fileString = slideShow.eResource().getURI().toFileString();
		Path resPath = new Path(fileString);
		return getString("_UI_SlideShow_type") + " " + resPath.removeFileExtension().lastSegment(); //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(SlideShow.class)) {
			case DiaporamaPackage.SLIDE_SHOW__DEFAULT_SLIDE_DURATION :
			case DiaporamaPackage.SLIDE_SHOW__CLICK_SOUND_TIMEOUT :
			case DiaporamaPackage.SLIDE_SHOW__NEXT_SLIDE_ACTION_TYPE :
			case DiaporamaPackage.SLIDE_SHOW__PICTURE_RESIZING_POLICY :
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DiaporamaPackage.SLIDE_SHOW__ALL_SLIDES :
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(DiaporamaPackage.Literals.SLIDE_SHOW__ALL_SLIDES, DiaporamaFactory.eINSTANCE
				.createSlide()));
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
