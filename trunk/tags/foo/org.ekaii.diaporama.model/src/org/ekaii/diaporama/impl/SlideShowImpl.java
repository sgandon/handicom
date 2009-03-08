/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ekaii.diaporama.impl;

import java.util.Collection;
import java.util.EnumSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.ekaii.diaporama.ActionType;
import org.ekaii.diaporama.DiaporamaPackage;
import org.ekaii.diaporama.PictureResizingPolicyType;
import org.ekaii.diaporama.Slide;
import org.ekaii.diaporama.SlideShow;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Slide Show</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.ekaii.diaporama.impl.SlideShowImpl#getAllSlides <em>All Slides
 * </em>}</li>
 * <li>{@link org.ekaii.diaporama.impl.SlideShowImpl#getFirstSlide <em>First
 * Slide</em>}</li>
 * <li>{@link org.ekaii.diaporama.impl.SlideShowImpl#getDefaultSlideDuration
 * <em>Default Slide Duration</em>}</li>
 * <li>{@link org.ekaii.diaporama.impl.SlideShowImpl#getClickSoundTimeout <em>
 * Click Sound Timeout</em>}</li>
 * <li>{@link org.ekaii.diaporama.impl.SlideShowImpl#getNextSlideActionType <em>
 * Next Slide Action Type</em>}</li>
 * <li>{@link org.ekaii.diaporama.impl.SlideShowImpl#getPictureResizingPolicy
 * <em>Picture Resizing Policy</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SlideShowImpl extends EObjectImpl implements SlideShow {
	/**
	 * The cached value of the '{@link #getAllSlides() <em>All Slides</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAllSlides()
	 * @generated
	 * @ordered
	 */
	protected EList<Slide> allSlides;

	/**
	 * The cached value of the '{@link #getFirstSlide() <em>First Slide</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFirstSlide()
	 * @generated
	 * @ordered
	 */
	protected Slide firstSlide;

	/**
	 * The default value of the '{@link #getDefaultSlideDuration()
	 * <em>Default Slide Duration</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDefaultSlideDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_SLIDE_DURATION_EDEFAULT = 7;

	/**
	 * The cached value of the '{@link #getDefaultSlideDuration()
	 * <em>Default Slide Duration</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDefaultSlideDuration()
	 * @generated
	 * @ordered
	 */
	protected int defaultSlideDuration = DEFAULT_SLIDE_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getClickSoundTimeout()
	 * <em>Click Sound Timeout</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getClickSoundTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int CLICK_SOUND_TIMEOUT_EDEFAULT = 1000;

	/**
	 * The cached value of the '{@link #getClickSoundTimeout()
	 * <em>Click Sound Timeout</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getClickSoundTimeout()
	 * @generated
	 * @ordered
	 */
	protected int clickSoundTimeout = CLICK_SOUND_TIMEOUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNextSlideActionType()
	 * <em>Next Slide Action Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getNextSlideActionType()
	 * @generated
	 * @ordered
	 */
	protected EnumSet<ActionType> nextSlideActionType;

	/**
	 * The default value of the '{@link #getPictureResizingPolicy()
	 * <em>Picture Resizing Policy</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPictureResizingPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final PictureResizingPolicyType PICTURE_RESIZING_POLICY_EDEFAULT = PictureResizingPolicyType.FIT;

	/**
	 * The cached value of the '{@link #getPictureResizingPolicy()
	 * <em>Picture Resizing Policy</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPictureResizingPolicy()
	 * @generated
	 * @ordered
	 */
	protected PictureResizingPolicyType pictureResizingPolicy = PICTURE_RESIZING_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SlideShowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiaporamaPackage.Literals.SLIDE_SHOW;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Slide> getAllSlides() {
		if (allSlides == null) {
			allSlides = new EObjectContainmentEList<Slide>(Slide.class, this, DiaporamaPackage.SLIDE_SHOW__ALL_SLIDES) {
				@Override
				protected void didChange() {
					super.didChange();
					// if only one slide then make it first slide
					if (size() == 1) {
						setFirstSlide(get(0));
					}
				}
			};
		}
		return allSlides;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Slide getFirstSlide() {
		if (firstSlide != null && firstSlide.eIsProxy()) {
			InternalEObject oldFirstSlide = (InternalEObject) firstSlide;
			firstSlide = (Slide) eResolveProxy(oldFirstSlide);
			if (firstSlide != oldFirstSlide) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DiaporamaPackage.SLIDE_SHOW__FIRST_SLIDE, oldFirstSlide,
							firstSlide));
			}
		}
		return firstSlide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Slide basicGetFirstSlide() {
		return firstSlide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFirstSlide(Slide newFirstSlide) {
		Slide oldFirstSlide = firstSlide;
		firstSlide = newFirstSlide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiaporamaPackage.SLIDE_SHOW__FIRST_SLIDE, oldFirstSlide, firstSlide));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getDefaultSlideDuration() {
		return defaultSlideDuration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDefaultSlideDuration(int newDefaultSlideDuration) {
		int oldDefaultSlideDuration = defaultSlideDuration;
		defaultSlideDuration = newDefaultSlideDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiaporamaPackage.SLIDE_SHOW__DEFAULT_SLIDE_DURATION,
					oldDefaultSlideDuration, defaultSlideDuration));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getClickSoundTimeout() {
		return clickSoundTimeout;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setClickSoundTimeout(int newClickSoundTimeout) {
		int oldClickSoundTimeout = clickSoundTimeout;
		clickSoundTimeout = newClickSoundTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiaporamaPackage.SLIDE_SHOW__CLICK_SOUND_TIMEOUT, oldClickSoundTimeout,
					clickSoundTimeout));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnumSet<ActionType> getNextSlideActionType() {
		return nextSlideActionType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNextSlideActionType(EnumSet<ActionType> newNextSlideActionType) {
		EnumSet<ActionType> oldNextSlideActionType = nextSlideActionType;
		nextSlideActionType = newNextSlideActionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiaporamaPackage.SLIDE_SHOW__NEXT_SLIDE_ACTION_TYPE,
					oldNextSlideActionType, nextSlideActionType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PictureResizingPolicyType getPictureResizingPolicy() {
		return pictureResizingPolicy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPictureResizingPolicy(PictureResizingPolicyType newPictureResizingPolicy) {
		PictureResizingPolicyType oldPictureResizingPolicy = pictureResizingPolicy;
		pictureResizingPolicy = newPictureResizingPolicy == null ? PICTURE_RESIZING_POLICY_EDEFAULT : newPictureResizingPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiaporamaPackage.SLIDE_SHOW__PICTURE_RESIZING_POLICY,
					oldPictureResizingPolicy, pictureResizingPolicy));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiaporamaPackage.SLIDE_SHOW__ALL_SLIDES :
				return ((InternalEList<?>) getAllSlides()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiaporamaPackage.SLIDE_SHOW__ALL_SLIDES :
				return getAllSlides();
			case DiaporamaPackage.SLIDE_SHOW__FIRST_SLIDE :
				if (resolve)
					return getFirstSlide();
				return basicGetFirstSlide();
			case DiaporamaPackage.SLIDE_SHOW__DEFAULT_SLIDE_DURATION :
				return new Integer(getDefaultSlideDuration());
			case DiaporamaPackage.SLIDE_SHOW__CLICK_SOUND_TIMEOUT :
				return new Integer(getClickSoundTimeout());
			case DiaporamaPackage.SLIDE_SHOW__NEXT_SLIDE_ACTION_TYPE :
				return getNextSlideActionType();
			case DiaporamaPackage.SLIDE_SHOW__PICTURE_RESIZING_POLICY :
				return getPictureResizingPolicy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiaporamaPackage.SLIDE_SHOW__ALL_SLIDES :
				getAllSlides().clear();
				getAllSlides().addAll((Collection<? extends Slide>) newValue);
				return;
			case DiaporamaPackage.SLIDE_SHOW__FIRST_SLIDE :
				setFirstSlide((Slide) newValue);
				return;
			case DiaporamaPackage.SLIDE_SHOW__DEFAULT_SLIDE_DURATION :
				setDefaultSlideDuration(((Integer) newValue).intValue());
				return;
			case DiaporamaPackage.SLIDE_SHOW__CLICK_SOUND_TIMEOUT :
				setClickSoundTimeout(((Integer) newValue).intValue());
				return;
			case DiaporamaPackage.SLIDE_SHOW__NEXT_SLIDE_ACTION_TYPE :
				setNextSlideActionType((EnumSet<ActionType>) newValue);
				return;
			case DiaporamaPackage.SLIDE_SHOW__PICTURE_RESIZING_POLICY :
				setPictureResizingPolicy((PictureResizingPolicyType) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DiaporamaPackage.SLIDE_SHOW__ALL_SLIDES :
				getAllSlides().clear();
				return;
			case DiaporamaPackage.SLIDE_SHOW__FIRST_SLIDE :
				setFirstSlide((Slide) null);
				return;
			case DiaporamaPackage.SLIDE_SHOW__DEFAULT_SLIDE_DURATION :
				setDefaultSlideDuration(DEFAULT_SLIDE_DURATION_EDEFAULT);
				return;
			case DiaporamaPackage.SLIDE_SHOW__CLICK_SOUND_TIMEOUT :
				setClickSoundTimeout(CLICK_SOUND_TIMEOUT_EDEFAULT);
				return;
			case DiaporamaPackage.SLIDE_SHOW__NEXT_SLIDE_ACTION_TYPE :
				setNextSlideActionType((EnumSet<ActionType>) null);
				return;
			case DiaporamaPackage.SLIDE_SHOW__PICTURE_RESIZING_POLICY :
				setPictureResizingPolicy(PICTURE_RESIZING_POLICY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DiaporamaPackage.SLIDE_SHOW__ALL_SLIDES :
				return allSlides != null && !allSlides.isEmpty();
			case DiaporamaPackage.SLIDE_SHOW__FIRST_SLIDE :
				return firstSlide != null;
			case DiaporamaPackage.SLIDE_SHOW__DEFAULT_SLIDE_DURATION :
				return defaultSlideDuration != DEFAULT_SLIDE_DURATION_EDEFAULT;
			case DiaporamaPackage.SLIDE_SHOW__CLICK_SOUND_TIMEOUT :
				return clickSoundTimeout != CLICK_SOUND_TIMEOUT_EDEFAULT;
			case DiaporamaPackage.SLIDE_SHOW__NEXT_SLIDE_ACTION_TYPE :
				return nextSlideActionType != null;
			case DiaporamaPackage.SLIDE_SHOW__PICTURE_RESIZING_POLICY :
				return pictureResizingPolicy != PICTURE_RESIZING_POLICY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (DefaultSlideDuration: "); //$NON-NLS-1$
		result.append(defaultSlideDuration);
		result.append(", ClickSoundTimeout: "); //$NON-NLS-1$
		result.append(clickSoundTimeout);
		result.append(", NextSlideActionType: "); //$NON-NLS-1$
		result.append(nextSlideActionType);
		result.append(", PictureResizingPolicy: "); //$NON-NLS-1$
		result.append(pictureResizingPolicy);
		result.append(')');
		return result.toString();
	}

} // SlideShowImpl
