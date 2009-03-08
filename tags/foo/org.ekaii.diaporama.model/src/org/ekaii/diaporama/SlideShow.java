/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ekaii.diaporama;

import java.util.EnumSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Slide Show</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ekaii.diaporama.SlideShow#getAllSlides <em>All Slides</em>}</li>
 *   <li>{@link org.ekaii.diaporama.SlideShow#getFirstSlide <em>First Slide</em>}</li>
 *   <li>{@link org.ekaii.diaporama.SlideShow#getDefaultSlideDuration <em>Default Slide Duration</em>}</li>
 *   <li>{@link org.ekaii.diaporama.SlideShow#getClickSoundTimeout <em>Click Sound Timeout</em>}</li>
 *   <li>{@link org.ekaii.diaporama.SlideShow#getNextSlideActionType <em>Next Slide Action Type</em>}</li>
 *   <li>{@link org.ekaii.diaporama.SlideShow#getPictureResizingPolicy <em>Picture Resizing Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ekaii.diaporama.DiaporamaPackage#getSlideShow()
 * @model
 * @generated
 */
public interface SlideShow extends EObject {
	/**
	 * Returns the value of the '<em><b>All Slides</b></em>' containment reference list.
	 * The list contents are of type {@link org.ekaii.diaporama.Slide}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Slides</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Slides</em>' containment reference list.
	 * @see org.ekaii.diaporama.DiaporamaPackage#getSlideShow_AllSlides()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Slide> getAllSlides();

	/**
	 * Returns the value of the '<em><b>First Slide</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Slide</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>First Slide</em>' reference.
	 * @see #setFirstSlide(Slide)
	 * @see org.ekaii.diaporama.DiaporamaPackage#getSlideShow_FirstSlide()
	 * @model required="true"
	 * @generated
	 */
	Slide getFirstSlide();

	/**
	 * Sets the value of the '{@link org.ekaii.diaporama.SlideShow#getFirstSlide <em>First Slide</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Slide</em>' reference.
	 * @see #getFirstSlide()
	 * @generated
	 */
	void setFirstSlide(Slide value);

	/**
	 * Returns the value of the '<em><b>Default Slide Duration</b></em>' attribute.
	 * The default value is <code>"7"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Slide Duration</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Slide Duration</em>' attribute.
	 * @see #setDefaultSlideDuration(int)
	 * @see org.ekaii.diaporama.DiaporamaPackage#getSlideShow_DefaultSlideDuration()
	 * @model default="7" required="true"
	 * @generated
	 */
	int getDefaultSlideDuration();

	/**
	 * Sets the value of the '{@link org.ekaii.diaporama.SlideShow#getDefaultSlideDuration <em>Default Slide Duration</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Default Slide Duration</em>' attribute.
	 * @see #getDefaultSlideDuration()
	 * @generated
	 */
	void setDefaultSlideDuration(int value);

	/**
	 * Returns the value of the '<em><b>Click Sound Timeout</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Click Sound Timeout</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Click Sound Timeout</em>' attribute.
	 * @see #setClickSoundTimeout(int)
	 * @see org.ekaii.diaporama.DiaporamaPackage#getSlideShow_ClickSoundTimeout()
	 * @model default="1000" required="true"
	 * @generated
	 */
	int getClickSoundTimeout();

	/**
	 * Sets the value of the '{@link org.ekaii.diaporama.SlideShow#getClickSoundTimeout <em>Click Sound Timeout</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Click Sound Timeout</em>' attribute.
	 * @see #getClickSoundTimeout()
	 * @generated
	 */
	void setClickSoundTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Next Slide Action Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Slide Action Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Slide Action Type</em>' attribute.
	 * @see #setNextSlideActionType(EnumSet)
	 * @see org.ekaii.diaporama.DiaporamaPackage#getSlideShow_NextSlideActionType()
	 * @model dataType="org.ekaii.diaporama.ActionTypeEnumSet" required="true"
	 * @generated
	 */
	EnumSet<ActionType> getNextSlideActionType();

	/**
	 * Sets the value of the '{@link org.ekaii.diaporama.SlideShow#getNextSlideActionType <em>Next Slide Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Slide Action Type</em>' attribute.
	 * @see #getNextSlideActionType()
	 * @generated
	 */
	void setNextSlideActionType(EnumSet<ActionType> value);

	/**
	 * Returns the value of the '<em><b>Picture Resizing Policy</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.ekaii.diaporama.PictureResizingPolicyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picture Resizing Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picture Resizing Policy</em>' attribute.
	 * @see org.ekaii.diaporama.PictureResizingPolicyType
	 * @see #setPictureResizingPolicy(PictureResizingPolicyType)
	 * @see org.ekaii.diaporama.DiaporamaPackage#getSlideShow_PictureResizingPolicy()
	 * @model default="" required="true"
	 * @generated
	 */
	PictureResizingPolicyType getPictureResizingPolicy();

	/**
	 * Sets the value of the '{@link org.ekaii.diaporama.SlideShow#getPictureResizingPolicy <em>Picture Resizing Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picture Resizing Policy</em>' attribute.
	 * @see org.ekaii.diaporama.PictureResizingPolicyType
	 * @see #getPictureResizingPolicy()
	 * @generated
	 */
	void setPictureResizingPolicy(PictureResizingPolicyType value);

} // SlideShow
