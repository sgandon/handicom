/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ekaii.diaporama.impl;

import java.util.EnumSet;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ekaii.diaporama.ActionType;
import org.ekaii.diaporama.DiaporamaFactory;
import org.ekaii.diaporama.DiaporamaPackage;
import org.ekaii.diaporama.PictureResizingPolicyType;
import org.ekaii.diaporama.PictureResizingPolicy;
import org.ekaii.diaporama.Slide;
import org.ekaii.diaporama.SlideShow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiaporamaPackageImpl extends EPackageImpl implements DiaporamaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slideShowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pictureResizingPolicyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType actionTypeEnumSetEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ekaii.diaporama.DiaporamaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiaporamaPackageImpl() {
		super(eNS_URI, DiaporamaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiaporamaPackage init() {
		if (isInited)
			return (DiaporamaPackage) EPackage.Registry.INSTANCE.getEPackage(DiaporamaPackage.eNS_URI);

		// Obtain or create and register package
		DiaporamaPackageImpl theDiaporamaPackage = (DiaporamaPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof DiaporamaPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(eNS_URI)
				: new DiaporamaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDiaporamaPackage.createPackageContents();

		// Initialize created meta-data
		theDiaporamaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiaporamaPackage.freeze();

		return theDiaporamaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlideShow() {
		return slideShowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlideShow_AllSlides() {
		return (EReference) slideShowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlideShow_FirstSlide() {
		return (EReference) slideShowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlideShow_DefaultSlideDuration() {
		return (EAttribute) slideShowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlideShow_ClickSoundTimeout() {
		return (EAttribute) slideShowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlideShow_NextSlideActionType() {
		return (EAttribute) slideShowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlideShow_PictureResizingPolicy() {
		return (EAttribute) slideShowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlide() {
		return slideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlide_AutomaticNextSlide() {
		return (EReference) slideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlide_SlideName() {
		return (EAttribute) slideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlide_SoundPath() {
		return (EAttribute) slideEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlide_PicturePath() {
		return (EAttribute) slideEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlide_ClickedNextSlide() {
		return (EReference) slideEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlide_ClickedSlideSoundPath() {
		return (EAttribute) slideEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionType() {
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPictureResizingPolicyType() {
		return pictureResizingPolicyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getActionTypeEnumSet() {
		return actionTypeEnumSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiaporamaFactory getDiaporamaFactory() {
		return (DiaporamaFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		slideShowEClass = createEClass(SLIDE_SHOW);
		createEReference(slideShowEClass, SLIDE_SHOW__ALL_SLIDES);
		createEReference(slideShowEClass, SLIDE_SHOW__FIRST_SLIDE);
		createEAttribute(slideShowEClass, SLIDE_SHOW__DEFAULT_SLIDE_DURATION);
		createEAttribute(slideShowEClass, SLIDE_SHOW__CLICK_SOUND_TIMEOUT);
		createEAttribute(slideShowEClass, SLIDE_SHOW__NEXT_SLIDE_ACTION_TYPE);
		createEAttribute(slideShowEClass, SLIDE_SHOW__PICTURE_RESIZING_POLICY);

		slideEClass = createEClass(SLIDE);
		createEReference(slideEClass, SLIDE__AUTOMATIC_NEXT_SLIDE);
		createEAttribute(slideEClass, SLIDE__SLIDE_NAME);
		createEAttribute(slideEClass, SLIDE__SOUND_PATH);
		createEAttribute(slideEClass, SLIDE__PICTURE_PATH);
		createEReference(slideEClass, SLIDE__CLICKED_NEXT_SLIDE);
		createEAttribute(slideEClass, SLIDE__CLICKED_SLIDE_SOUND_PATH);

		// Create enums
		actionTypeEEnum = createEEnum(ACTION_TYPE);
		pictureResizingPolicyTypeEEnum = createEEnum(PICTURE_RESIZING_POLICY_TYPE);

		// Create data types
		actionTypeEnumSetEDataType = createEDataType(ACTION_TYPE_ENUM_SET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(slideShowEClass, SlideShow.class, "SlideShow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getSlideShow_AllSlides(),
				this.getSlide(),
				null,
				"AllSlides", null, 1, -1, SlideShow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getSlideShow_FirstSlide(),
				this.getSlide(),
				null,
				"FirstSlide", null, 1, 1, SlideShow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getSlideShow_DefaultSlideDuration(),
				ecorePackage.getEInt(),
				"DefaultSlideDuration", "7", 1, 1, SlideShow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(
				getSlideShow_ClickSoundTimeout(),
				ecorePackage.getEInt(),
				"ClickSoundTimeout", "1000", 1, 1, SlideShow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(
				getSlideShow_NextSlideActionType(),
				this.getActionTypeEnumSet(),
				"NextSlideActionType", null, 1, 1, SlideShow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getSlideShow_PictureResizingPolicy(),
				this.getPictureResizingPolicyType(),
				"PictureResizingPolicy", "", 1, 1, SlideShow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(slideEClass, Slide.class, "Slide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getSlide_AutomaticNextSlide(),
				this.getSlide(),
				null,
				"AutomaticNextSlide", null, 0, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getSlide_SlideName(),
				ecorePackage.getEString(),
				"SlideName", null, 1, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getSlide_SoundPath(),
				ecorePackage.getEString(),
				"SoundPath", null, 0, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getSlide_PicturePath(),
				ecorePackage.getEString(),
				"PicturePath", null, 0, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getSlide_ClickedNextSlide(),
				this.getSlide(),
				null,
				"ClickedNextSlide", null, 0, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getSlide_ClickedSlideSoundPath(),
				ecorePackage.getEString(),
				"ClickedSlideSoundPath", null, 0, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(actionTypeEEnum, ActionType.class, "ActionType"); //$NON-NLS-1$
		addEEnumLiteral(actionTypeEEnum, ActionType.MOUSE);
		addEEnumLiteral(actionTypeEEnum, ActionType.SPACE_BAR);
		addEEnumLiteral(actionTypeEEnum, ActionType.KEYBOARD);

		initEEnum(pictureResizingPolicyTypeEEnum, PictureResizingPolicyType.class, "PictureResizingPolicyType"); //$NON-NLS-1$
		addEEnumLiteral(pictureResizingPolicyTypeEEnum, PictureResizingPolicyType.FIT);
		addEEnumLiteral(pictureResizingPolicyTypeEEnum, PictureResizingPolicyType.STRETCH);

		// Initialize data types
		initEDataType(actionTypeEnumSetEDataType, EnumSet.class,
				"ActionTypeEnumSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.EnumSet<org.ekaii.diaporama.ActionType>"); //$NON-NLS-1$ //$NON-NLS-2$

		// Create resource
		createResource(eNS_URI);
	}

} //DiaporamaPackageImpl
