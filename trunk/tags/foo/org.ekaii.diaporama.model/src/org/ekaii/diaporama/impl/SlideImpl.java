/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ekaii.diaporama.impl;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.ekaii.diaporama.DiaporamaPackage;
import org.ekaii.diaporama.Slide;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Slide</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ekaii.diaporama.impl.SlideImpl#getAutomaticNextSlide <em>Automatic Next Slide</em>}</li>
 *   <li>{@link org.ekaii.diaporama.impl.SlideImpl#getSlideName <em>Slide Name</em>}</li>
 *   <li>{@link org.ekaii.diaporama.impl.SlideImpl#getSoundPath <em>Sound Path</em>}</li>
 *   <li>{@link org.ekaii.diaporama.impl.SlideImpl#getPicturePath <em>Picture Path</em>}</li>
 *   <li>{@link org.ekaii.diaporama.impl.SlideImpl#getClickedNextSlide <em>Clicked Next Slide</em>}</li>
 *   <li>{@link org.ekaii.diaporama.impl.SlideImpl#getClickedSlideSoundPath <em>Clicked Slide Sound Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlideImpl extends EObjectImpl implements Slide {
	/**
	 * The cached value of the '{@link #getAutomaticNextSlide() <em>Automatic Next Slide</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAutomaticNextSlide()
	 * @generated
	 * @ordered
	 */
	protected Slide automaticNextSlide;

	/**
	 * The default value of the '{@link #getSlideName() <em>Slide Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSlideName()
	 * @generated
	 * @ordered
	 */
	protected static final String SLIDE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlideName() <em>Slide Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSlideName()
	 * @generated
	 * @ordered
	 */
	protected String slideName = SLIDE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoundPath() <em>Sound Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSoundPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SOUND_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoundPath() <em>Sound Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSoundPath()
	 * @generated
	 * @ordered
	 */
	protected String soundPath = SOUND_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPicturePath() <em>Picture Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPicturePath()
	 * @generated
	 * @ordered
	 */
	protected static final String PICTURE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPicturePath() <em>Picture Path</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPicturePath()
	 * @generated
	 * @ordered
	 */
	protected String picturePath = PICTURE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClickedNextSlide() <em>Clicked Next Slide</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getClickedNextSlide()
	 * @generated
	 * @ordered
	 */
	protected Slide clickedNextSlide;

	/**
	 * The default value of the '{@link #getClickedSlideSoundPath() <em>Clicked Slide Sound Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClickedSlideSoundPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CLICKED_SLIDE_SOUND_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClickedSlideSoundPath() <em>Clicked Slide Sound Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClickedSlideSoundPath()
	 * @generated
	 * @ordered
	 */
	protected String clickedSlideSoundPath = CLICKED_SLIDE_SOUND_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SlideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiaporamaPackage.Literals.SLIDE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Slide getAutomaticNextSlide() {
		if (automaticNextSlide != null && automaticNextSlide.eIsProxy()) {
			InternalEObject oldAutomaticNextSlide = (InternalEObject) automaticNextSlide;
			automaticNextSlide = (Slide) eResolveProxy(oldAutomaticNextSlide);
			if (automaticNextSlide != oldAutomaticNextSlide) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiaporamaPackage.SLIDE__AUTOMATIC_NEXT_SLIDE,
							oldAutomaticNextSlide, automaticNextSlide));
			}
		}
		return automaticNextSlide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Slide basicGetAutomaticNextSlide() {
		return automaticNextSlide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticNextSlide(Slide newAutomaticNextSlide) {
		Slide oldAutomaticNextSlide = automaticNextSlide;
		automaticNextSlide = newAutomaticNextSlide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiaporamaPackage.SLIDE__AUTOMATIC_NEXT_SLIDE, oldAutomaticNextSlide,
					automaticNextSlide));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSlideName() {
		return slideName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlideName(String newSlideName) {
		String oldSlideName = slideName;
		slideName = newSlideName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiaporamaPackage.SLIDE__SLIDE_NAME, oldSlideName, slideName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSoundPath() {
		return soundPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoundPath(String newSoundPath) {
		String oldSoundPath = soundPath;
		soundPath = newSoundPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiaporamaPackage.SLIDE__SOUND_PATH, oldSoundPath, soundPath));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getPicturePath() {
		return picturePath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPicturePath(String newPicturePath) {
		String oldPicturePath = picturePath;
		picturePath = newPicturePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiaporamaPackage.SLIDE__PICTURE_PATH, oldPicturePath, picturePath));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Slide getClickedNextSlide() {
		if (clickedNextSlide != null && clickedNextSlide.eIsProxy()) {
			InternalEObject oldClickedNextSlide = (InternalEObject) clickedNextSlide;
			clickedNextSlide = (Slide) eResolveProxy(oldClickedNextSlide);
			if (clickedNextSlide != oldClickedNextSlide) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiaporamaPackage.SLIDE__CLICKED_NEXT_SLIDE,
							oldClickedNextSlide, clickedNextSlide));
			}
		}
		return clickedNextSlide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Slide basicGetClickedNextSlide() {
		return clickedNextSlide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setClickedNextSlide(Slide newClickedNextSlide) {
		Slide oldClickedNextSlide = clickedNextSlide;
		clickedNextSlide = newClickedNextSlide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiaporamaPackage.SLIDE__CLICKED_NEXT_SLIDE, oldClickedNextSlide,
					clickedNextSlide));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getClickedSlideSoundPath() {
		return clickedSlideSoundPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setClickedSlideSoundPath(String newClickedSlideSoundPath) {
		String oldClickedSlideSoundPath = clickedSlideSoundPath;
		clickedSlideSoundPath = newClickedSlideSoundPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiaporamaPackage.SLIDE__CLICKED_SLIDE_SOUND_PATH,
					oldClickedSlideSoundPath, clickedSlideSoundPath));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiaporamaPackage.SLIDE__AUTOMATIC_NEXT_SLIDE :
				if (resolve)
					return getAutomaticNextSlide();
				return basicGetAutomaticNextSlide();
			case DiaporamaPackage.SLIDE__SLIDE_NAME :
				return getSlideName();
			case DiaporamaPackage.SLIDE__SOUND_PATH :
				return getSoundPath();
			case DiaporamaPackage.SLIDE__PICTURE_PATH :
				return getPicturePath();
			case DiaporamaPackage.SLIDE__CLICKED_NEXT_SLIDE :
				if (resolve)
					return getClickedNextSlide();
				return basicGetClickedNextSlide();
			case DiaporamaPackage.SLIDE__CLICKED_SLIDE_SOUND_PATH :
				return getClickedSlideSoundPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiaporamaPackage.SLIDE__AUTOMATIC_NEXT_SLIDE :
				setAutomaticNextSlide((Slide) newValue);
				return;
			case DiaporamaPackage.SLIDE__SLIDE_NAME :
				setSlideName((String) newValue);
				return;
			case DiaporamaPackage.SLIDE__SOUND_PATH :
				setSoundPath((String) newValue);
				return;
			case DiaporamaPackage.SLIDE__PICTURE_PATH :
				setPicturePath((String) newValue);
				return;
			case DiaporamaPackage.SLIDE__CLICKED_NEXT_SLIDE :
				setClickedNextSlide((Slide) newValue);
				return;
			case DiaporamaPackage.SLIDE__CLICKED_SLIDE_SOUND_PATH :
				setClickedSlideSoundPath((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DiaporamaPackage.SLIDE__AUTOMATIC_NEXT_SLIDE :
				setAutomaticNextSlide((Slide) null);
				return;
			case DiaporamaPackage.SLIDE__SLIDE_NAME :
				setSlideName(SLIDE_NAME_EDEFAULT);
				return;
			case DiaporamaPackage.SLIDE__SOUND_PATH :
				setSoundPath(SOUND_PATH_EDEFAULT);
				return;
			case DiaporamaPackage.SLIDE__PICTURE_PATH :
				setPicturePath(PICTURE_PATH_EDEFAULT);
				return;
			case DiaporamaPackage.SLIDE__CLICKED_NEXT_SLIDE :
				setClickedNextSlide((Slide) null);
				return;
			case DiaporamaPackage.SLIDE__CLICKED_SLIDE_SOUND_PATH :
				setClickedSlideSoundPath(CLICKED_SLIDE_SOUND_PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DiaporamaPackage.SLIDE__AUTOMATIC_NEXT_SLIDE :
				return automaticNextSlide != null;
			case DiaporamaPackage.SLIDE__SLIDE_NAME :
				return SLIDE_NAME_EDEFAULT == null ? slideName != null : !SLIDE_NAME_EDEFAULT.equals(slideName);
			case DiaporamaPackage.SLIDE__SOUND_PATH :
				return SOUND_PATH_EDEFAULT == null ? soundPath != null : !SOUND_PATH_EDEFAULT.equals(soundPath);
			case DiaporamaPackage.SLIDE__PICTURE_PATH :
				return PICTURE_PATH_EDEFAULT == null ? picturePath != null : !PICTURE_PATH_EDEFAULT.equals(picturePath);
			case DiaporamaPackage.SLIDE__CLICKED_NEXT_SLIDE :
				return clickedNextSlide != null;
			case DiaporamaPackage.SLIDE__CLICKED_SLIDE_SOUND_PATH :
				return CLICKED_SLIDE_SOUND_PATH_EDEFAULT == null ? clickedSlideSoundPath != null : !CLICKED_SLIDE_SOUND_PATH_EDEFAULT
						.equals(clickedSlideSoundPath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (SlideName: "); //$NON-NLS-1$
		result.append(slideName);
		result.append(", SoundPath: "); //$NON-NLS-1$
		result.append(soundPath);
		result.append(", PicturePath: "); //$NON-NLS-1$
		result.append(picturePath);
		result.append(", ClickedSlideSoundPath: "); //$NON-NLS-1$
		result.append(clickedSlideSoundPath);
		result.append(')');
		return result.toString();
	}

	public IPath getPictureIPath() {
		return getPicturePath() != null && !"".equals(getPicturePath()) ? new Path(getPicturePath()) : null;
	}

	public IPath getSoundIPath() {
		return getSoundPath() != null && !"".equals(getSoundPath()) ? new Path(getSoundPath()) : null;
	}

	public IPath getClickedSlideSoundIPath() {
		return getClickedSlideSoundPath() != null && !"".equals(getClickedSlideSoundPath()) ? new Path(getClickedSlideSoundPath()) : null;
	}

} // SlideImpl
