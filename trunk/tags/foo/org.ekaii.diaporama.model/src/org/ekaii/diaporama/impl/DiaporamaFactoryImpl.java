/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ekaii.diaporama.impl;

import java.util.EnumSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.ekaii.diaporama.ActionType;
import org.ekaii.diaporama.DiaporamaFactory;
import org.ekaii.diaporama.DiaporamaPackage;
import org.ekaii.diaporama.PictureResizingPolicyType;
import org.ekaii.diaporama.Slide;
import org.ekaii.diaporama.SlideShow;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class DiaporamaFactoryImpl extends EFactoryImpl implements DiaporamaFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static DiaporamaFactory init() {
		try {
			DiaporamaFactory theDiaporamaFactory = (DiaporamaFactory) EPackage.Registry.INSTANCE.getEFactory("www.ekaii.org"); //$NON-NLS-1$ 
			if (theDiaporamaFactory != null) {
				return theDiaporamaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiaporamaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public DiaporamaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DiaporamaPackage.SLIDE_SHOW :
				return createSlideShow();
			case DiaporamaPackage.SLIDE :
				return createSlide();
			default :
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DiaporamaPackage.ACTION_TYPE :
				return createActionTypeFromString(eDataType, initialValue);
			case DiaporamaPackage.PICTURE_RESIZING_POLICY_TYPE :
				return createPictureResizingPolicyTypeFromString(eDataType, initialValue);
			case DiaporamaPackage.ACTION_TYPE_ENUM_SET :
				return createActionTypeEnumSetFromString(eDataType, initialValue);
			default :
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DiaporamaPackage.ACTION_TYPE :
				return convertActionTypeToString(eDataType, instanceValue);
			case DiaporamaPackage.PICTURE_RESIZING_POLICY_TYPE :
				return convertPictureResizingPolicyTypeToString(eDataType, instanceValue);
			case DiaporamaPackage.ACTION_TYPE_ENUM_SET :
				return convertActionTypeEnumSetToString(eDataType, instanceValue);
			default :
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> creates a slide show and the initial slide <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public SlideShow createSlideShow() {
		SlideShowImpl slideShow = new SlideShowImpl();
		return slideShow;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Slide createSlide() {
		SlideImpl slide = new SlideImpl();
		return slide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PictureResizingPolicyType createPictureResizingPolicyTypeFromString(EDataType eDataType, String initialValue) {
		PictureResizingPolicyType result = PictureResizingPolicyType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertPictureResizingPolicyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EnumSet createActionTypeEnumSetFromString(EDataType eDataType, String initialValue) {
		return (EnumSet) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String convertActionTypeEnumSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DiaporamaPackage getDiaporamaPackage() {
		return (DiaporamaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiaporamaPackage getPackage() {
		return DiaporamaPackage.eINSTANCE;
	}

} // DiaporamaFactoryImpl
