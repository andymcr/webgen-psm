/**
 */
package work.andycarpenter.metamodel.security.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.metamodel.base.impl.NamedDisplayElementImpl;

import work.andycarpenter.metamodel.security.AuthenticationElement;
import work.andycarpenter.metamodel.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.AuthenticationElementImpl#getSectionClassOverride <em>Section Class Override</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.AuthenticationElementImpl#getSectionClass <em>Section Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.AuthenticationElementImpl#isHasSectionClass <em>Has Section Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.AuthenticationElementImpl#getCaptionClassOverride <em>Caption Class Override</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.AuthenticationElementImpl#getCaptionClass <em>Caption Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.AuthenticationElementImpl#isHasCaptionClass <em>Has Caption Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.AuthenticationElementImpl#getContentClassOverride <em>Content Class Override</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.AuthenticationElementImpl#getContentClass <em>Content Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.AuthenticationElementImpl#isHasContentClass <em>Has Content Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AuthenticationElementImpl extends NamedDisplayElementImpl implements AuthenticationElement {
	/**
	 * The default value of the '{@link #getSectionClassOverride() <em>Section Class Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionClassOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_CLASS_OVERRIDE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSectionClassOverride() <em>Section Class Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionClassOverride()
	 * @generated
	 * @ordered
	 */
	protected String sectionClassOverride = SECTION_CLASS_OVERRIDE_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getSectionClass() <em>Section Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionClass()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SECTION_CLASS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SecurityPackage.Literals.AUTHENTICATION_ELEMENT__SECTION_CLASS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isHasSectionClass() <em>Has Section Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSectionClass()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HAS_SECTION_CLASS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SecurityPackage.Literals.AUTHENTICATION_ELEMENT__HAS_SECTION_CLASS).getSettingDelegate();

	/**
	 * The default value of the '{@link #getCaptionClassOverride() <em>Caption Class Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionClassOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_CLASS_OVERRIDE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCaptionClassOverride() <em>Caption Class Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionClassOverride()
	 * @generated
	 * @ordered
	 */
	protected String captionClassOverride = CAPTION_CLASS_OVERRIDE_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getCaptionClass() <em>Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionClass()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CAPTION_CLASS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SecurityPackage.Literals.AUTHENTICATION_ELEMENT__CAPTION_CLASS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isHasCaptionClass() <em>Has Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasCaptionClass()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HAS_CAPTION_CLASS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SecurityPackage.Literals.AUTHENTICATION_ELEMENT__HAS_CAPTION_CLASS).getSettingDelegate();

	/**
	 * The default value of the '{@link #getContentClassOverride() <em>Content Class Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentClassOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_CLASS_OVERRIDE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getContentClassOverride() <em>Content Class Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentClassOverride()
	 * @generated
	 * @ordered
	 */
	protected String contentClassOverride = CONTENT_CLASS_OVERRIDE_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getContentClass() <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentClass()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONTENT_CLASS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SecurityPackage.Literals.AUTHENTICATION_ELEMENT__CONTENT_CLASS).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isHasContentClass() <em>Has Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasContentClass()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HAS_CONTENT_CLASS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SecurityPackage.Literals.AUTHENTICATION_ELEMENT__HAS_CONTENT_CLASS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.AUTHENTICATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSectionClassOverride() {
		return sectionClassOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionClassOverride(String newSectionClassOverride) {
		String oldSectionClassOverride = sectionClassOverride;
		sectionClassOverride = newSectionClassOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION_ELEMENT__SECTION_CLASS_OVERRIDE, oldSectionClassOverride, sectionClassOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSectionClass() {
		return (String)SECTION_CLASS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasSectionClass() {
		return (Boolean)HAS_SECTION_CLASS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptionClassOverride() {
		return captionClassOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionClassOverride(String newCaptionClassOverride) {
		String oldCaptionClassOverride = captionClassOverride;
		captionClassOverride = newCaptionClassOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION_ELEMENT__CAPTION_CLASS_OVERRIDE, oldCaptionClassOverride, captionClassOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaptionClass() {
		return (String)CAPTION_CLASS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasCaptionClass() {
		return (Boolean)HAS_CAPTION_CLASS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentClassOverride() {
		return contentClassOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentClassOverride(String newContentClassOverride) {
		String oldContentClassOverride = contentClassOverride;
		contentClassOverride = newContentClassOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.AUTHENTICATION_ELEMENT__CONTENT_CLASS_OVERRIDE, oldContentClassOverride, contentClassOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentClass() {
		return (String)CONTENT_CLASS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasContentClass() {
		return (Boolean)HAS_CONTENT_CLASS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPackage.AUTHENTICATION_ELEMENT__SECTION_CLASS_OVERRIDE:
				return getSectionClassOverride();
			case SecurityPackage.AUTHENTICATION_ELEMENT__SECTION_CLASS:
				return getSectionClass();
			case SecurityPackage.AUTHENTICATION_ELEMENT__HAS_SECTION_CLASS:
				return isHasSectionClass();
			case SecurityPackage.AUTHENTICATION_ELEMENT__CAPTION_CLASS_OVERRIDE:
				return getCaptionClassOverride();
			case SecurityPackage.AUTHENTICATION_ELEMENT__CAPTION_CLASS:
				return getCaptionClass();
			case SecurityPackage.AUTHENTICATION_ELEMENT__HAS_CAPTION_CLASS:
				return isHasCaptionClass();
			case SecurityPackage.AUTHENTICATION_ELEMENT__CONTENT_CLASS_OVERRIDE:
				return getContentClassOverride();
			case SecurityPackage.AUTHENTICATION_ELEMENT__CONTENT_CLASS:
				return getContentClass();
			case SecurityPackage.AUTHENTICATION_ELEMENT__HAS_CONTENT_CLASS:
				return isHasContentClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SecurityPackage.AUTHENTICATION_ELEMENT__SECTION_CLASS_OVERRIDE:
				setSectionClassOverride((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION_ELEMENT__CAPTION_CLASS_OVERRIDE:
				setCaptionClassOverride((String)newValue);
				return;
			case SecurityPackage.AUTHENTICATION_ELEMENT__CONTENT_CLASS_OVERRIDE:
				setContentClassOverride((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SecurityPackage.AUTHENTICATION_ELEMENT__SECTION_CLASS_OVERRIDE:
				setSectionClassOverride(SECTION_CLASS_OVERRIDE_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION_ELEMENT__CAPTION_CLASS_OVERRIDE:
				setCaptionClassOverride(CAPTION_CLASS_OVERRIDE_EDEFAULT);
				return;
			case SecurityPackage.AUTHENTICATION_ELEMENT__CONTENT_CLASS_OVERRIDE:
				setContentClassOverride(CONTENT_CLASS_OVERRIDE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SecurityPackage.AUTHENTICATION_ELEMENT__SECTION_CLASS_OVERRIDE:
				return SECTION_CLASS_OVERRIDE_EDEFAULT == null ? sectionClassOverride != null : !SECTION_CLASS_OVERRIDE_EDEFAULT.equals(sectionClassOverride);
			case SecurityPackage.AUTHENTICATION_ELEMENT__SECTION_CLASS:
				return SECTION_CLASS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SecurityPackage.AUTHENTICATION_ELEMENT__HAS_SECTION_CLASS:
				return HAS_SECTION_CLASS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SecurityPackage.AUTHENTICATION_ELEMENT__CAPTION_CLASS_OVERRIDE:
				return CAPTION_CLASS_OVERRIDE_EDEFAULT == null ? captionClassOverride != null : !CAPTION_CLASS_OVERRIDE_EDEFAULT.equals(captionClassOverride);
			case SecurityPackage.AUTHENTICATION_ELEMENT__CAPTION_CLASS:
				return CAPTION_CLASS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SecurityPackage.AUTHENTICATION_ELEMENT__HAS_CAPTION_CLASS:
				return HAS_CAPTION_CLASS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SecurityPackage.AUTHENTICATION_ELEMENT__CONTENT_CLASS_OVERRIDE:
				return CONTENT_CLASS_OVERRIDE_EDEFAULT == null ? contentClassOverride != null : !CONTENT_CLASS_OVERRIDE_EDEFAULT.equals(contentClassOverride);
			case SecurityPackage.AUTHENTICATION_ELEMENT__CONTENT_CLASS:
				return CONTENT_CLASS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SecurityPackage.AUTHENTICATION_ELEMENT__HAS_CONTENT_CLASS:
				return HAS_CONTENT_CLASS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sectionClassOverride: ");
		result.append(sectionClassOverride);
		result.append(", captionClassOverride: ");
		result.append(captionClassOverride);
		result.append(", contentClassOverride: ");
		result.append(contentClassOverride);
		result.append(')');
		return result.toString();
	}

} //AuthenticationElementImpl
