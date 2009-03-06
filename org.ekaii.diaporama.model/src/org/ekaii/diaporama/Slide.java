/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ekaii.diaporama;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Slide</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ekaii.diaporama.Slide#getAutomaticNextSlide <em>Automatic Next Slide</em>}</li>
 *   <li>{@link org.ekaii.diaporama.Slide#getSlideName <em>Slide Name</em>}</li>
 *   <li>{@link org.ekaii.diaporama.Slide#getSoundPath <em>Sound Path</em>}</li>
 *   <li>{@link org.ekaii.diaporama.Slide#getPicturePath <em>Picture Path</em>}</li>
 *   <li>{@link org.ekaii.diaporama.Slide#getClickedNextSlide <em>Clicked Next Slide</em>}</li>
 *   <li>{@link org.ekaii.diaporama.Slide#getClickedSlideSoundPath <em>Clicked Slide Sound Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ekaii.diaporama.DiaporamaPackage#getSlide()
 * @model
 * @generated
 */
public interface Slide extends EObject {
	/**
	 * Returns the value of the '<em><b>Automatic Next Slide</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatic Next Slide</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Next Slide</em>' reference.
	 * @see #setAutomaticNextSlide(Slide)
	 * @see org.ekaii.diaporama.DiaporamaPackage#getSlide_AutomaticNextSlide()
	 * @model
	 * @generated
	 */
	Slide getAutomaticNextSlide();

	/**
	 * Sets the value of the '{@link org.ekaii.diaporama.Slide#getAutomaticNextSlide <em>Automatic Next Slide</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Automatic Next Slide</em>' reference.
	 * @see #getAutomaticNextSlide()
	 * @generated
	 */
	void setAutomaticNextSlide(Slide value);

	/**
	 * Returns the value of the '<em><b>Slide Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slide Name</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Slide Name</em>' attribute.
	 * @see #setSlideName(String)
	 * @see org.ekaii.diaporama.DiaporamaPackage#getSlide_SlideName()
	 * @model required="true"
	 * @generated
	 */
	String getSlideName();

	/**
	 * Sets the value of the '{@link org.ekaii.diaporama.Slide#getSlideName <em>Slide Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Slide Name</em>' attribute.
	 * @see #getSlideName()
	 * @generated
	 */
	void setSlideName(String value);

	/**
	 * Returns the value of the '<em><b>Sound Path</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sound Path</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sound Path</em>' attribute.
	 * @see #setSoundPath(String)
	 * @see org.ekaii.diaporama.DiaporamaPackage#getSlide_SoundPath()
	 * @model
	 * @generated
	 */
	String getSoundPath();

	/**
	 * Sets the value of the '{@link org.ekaii.diaporama.Slide#getSoundPath <em>Sound Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Sound Path</em>' attribute.
	 * @see #getSoundPath()
	 * @generated
	 */
	void setSoundPath(String value);

	/**
	 * Returns the value of the '<em><b>Picture Path</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picture Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Picture Path</em>' attribute.
	 * @see #setPicturePath(String)
	 * @see org.ekaii.diaporama.DiaporamaPackage#getSlide_PicturePath()
	 * @model
	 * @generated
	 */
	String getPicturePath();

	/**
	 * Sets the value of the '{@link org.ekaii.diaporama.Slide#getPicturePath <em>Picture Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Picture Path</em>' attribute.
	 * @see #getPicturePath()
	 * @generated
	 */
	void setPicturePath(String value);

	/**
	 * Returns the value of the '<em><b>Clicked Next Slide</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clicked Next Slide</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clicked Next Slide</em>' reference.
	 * @see #setClickedNextSlide(Slide)
	 * @see org.ekaii.diaporama.DiaporamaPackage#getSlide_ClickedNextSlide()
	 * @model
	 * @generated
	 */
	Slide getClickedNextSlide();

	/**
	 * Sets the value of the '{@link org.ekaii.diaporama.Slide#getClickedNextSlide <em>Clicked Next Slide</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Clicked Next Slide</em>' reference.
	 * @see #getClickedNextSlide()
	 * @generated
	 */
	void setClickedNextSlide(Slide value);

	/**
	 * Returns the value of the '<em><b>Clicked Slide Sound Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clicked Slide Sound Path</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clicked Slide Sound Path</em>' attribute.
	 * @see #setClickedSlideSoundPath(String)
	 * @see org.ekaii.diaporama.DiaporamaPackage#getSlide_ClickedSlideSoundPath()
	 * @model
	 * @generated
	 */
	String getClickedSlideSoundPath();

	/**
	 * Sets the value of the '{@link org.ekaii.diaporama.Slide#getClickedSlideSoundPath <em>Clicked Slide Sound Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clicked Slide Sound Path</em>' attribute.
	 * @see #getClickedSlideSoundPath()
	 * @generated
	 */
	void setClickedSlideSoundPath(String value);

	/**
	 * @return the Picture IPath if any path is set or null
	 */
	public IPath getPictureIPath();

	/**
	 * @return the sound IPath if any path is set or null
	 */
	public IPath getSoundIPath();

	/**
	 * @return the clicked sound IPath if any path is set or null
	 */
	public IPath getClickedSlideSoundIPath();

} // Slide
