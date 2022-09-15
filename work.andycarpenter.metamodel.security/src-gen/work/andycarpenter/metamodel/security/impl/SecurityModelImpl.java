/**
 */
package work.andycarpenter.metamodel.security.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import work.andycarpenter.metamodel.security.Authentication;
import work.andycarpenter.metamodel.security.CasAuthentication;
import work.andycarpenter.metamodel.security.LocalAuthenticationSystem;
import work.andycarpenter.metamodel.security.SecurityModel;
import work.andycarpenter.metamodel.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.SecurityModelImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.SecurityModelImpl#isIsAuthenticated <em>Is Authenticated</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.SecurityModelImpl#isIsCasAuthenticated <em>Is Cas Authenticated</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.SecurityModelImpl#getCasAuthentication <em>Cas Authentication</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.SecurityModelImpl#isIsLocallyAuthenticated <em>Is Locally Authenticated</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.SecurityModelImpl#getLocalAuthentication <em>Local Authentication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityModelImpl extends MinimalEObjectImpl.Container implements SecurityModel {
	/**
	 * The cached value of the '{@link #getAuthentication() <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthentication()
	 * @generated
	 * @ordered
	 */
	protected Authentication authentication;

	/**
	 * The cached setting delegate for the '{@link #isIsAuthenticated() <em>Is Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_AUTHENTICATED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SecurityPackage.Literals.SECURITY_MODEL__IS_AUTHENTICATED).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isIsCasAuthenticated() <em>Is Cas Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCasAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_CAS_AUTHENTICATED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SecurityPackage.Literals.SECURITY_MODEL__IS_CAS_AUTHENTICATED).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getCasAuthentication() <em>Cas Authentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasAuthentication()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CAS_AUTHENTICATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SecurityPackage.Literals.SECURITY_MODEL__CAS_AUTHENTICATION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #isIsLocallyAuthenticated() <em>Is Locally Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocallyAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_LOCALLY_AUTHENTICATED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SecurityPackage.Literals.SECURITY_MODEL__IS_LOCALLY_AUTHENTICATED).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getLocalAuthentication() <em>Local Authentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalAuthentication()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate LOCAL_AUTHENTICATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SecurityPackage.Literals.SECURITY_MODEL__LOCAL_AUTHENTICATION).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.SECURITY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authentication getAuthentication() {
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthentication(Authentication newAuthentication, NotificationChain msgs) {
		Authentication oldAuthentication = authentication;
		authentication = newAuthentication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecurityPackage.SECURITY_MODEL__AUTHENTICATION, oldAuthentication, newAuthentication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthentication(Authentication newAuthentication) {
		if (newAuthentication != authentication) {
			NotificationChain msgs = null;
			if (authentication != null)
				msgs = ((InternalEObject)authentication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.SECURITY_MODEL__AUTHENTICATION, null, msgs);
			if (newAuthentication != null)
				msgs = ((InternalEObject)newAuthentication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.SECURITY_MODEL__AUTHENTICATION, null, msgs);
			msgs = basicSetAuthentication(newAuthentication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.SECURITY_MODEL__AUTHENTICATION, newAuthentication, newAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAuthenticated() {
		return (Boolean)IS_AUTHENTICATED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsAuthenticated() {
		return IS_AUTHENTICATED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCasAuthenticated() {
		return (Boolean)IS_CAS_AUTHENTICATED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsCasAuthenticated() {
		return IS_CAS_AUTHENTICATED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasAuthentication getCasAuthentication() {
		return (CasAuthentication)CAS_AUTHENTICATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasAuthentication basicGetCasAuthentication() {
		return (CasAuthentication)CAS_AUTHENTICATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCasAuthentication() {
		return CAS_AUTHENTICATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLocallyAuthenticated() {
		return (Boolean)IS_LOCALLY_AUTHENTICATED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsLocallyAuthenticated() {
		return IS_LOCALLY_AUTHENTICATED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAuthenticationSystem getLocalAuthentication() {
		return (LocalAuthenticationSystem)LOCAL_AUTHENTICATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAuthenticationSystem basicGetLocalAuthentication() {
		return (LocalAuthenticationSystem)LOCAL_AUTHENTICATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocalAuthentication() {
		return LOCAL_AUTHENTICATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPackage.SECURITY_MODEL__AUTHENTICATION:
				return basicSetAuthentication(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPackage.SECURITY_MODEL__AUTHENTICATION:
				return getAuthentication();
			case SecurityPackage.SECURITY_MODEL__IS_AUTHENTICATED:
				return isIsAuthenticated();
			case SecurityPackage.SECURITY_MODEL__IS_CAS_AUTHENTICATED:
				return isIsCasAuthenticated();
			case SecurityPackage.SECURITY_MODEL__CAS_AUTHENTICATION:
				if (resolve) return getCasAuthentication();
				return basicGetCasAuthentication();
			case SecurityPackage.SECURITY_MODEL__IS_LOCALLY_AUTHENTICATED:
				return isIsLocallyAuthenticated();
			case SecurityPackage.SECURITY_MODEL__LOCAL_AUTHENTICATION:
				if (resolve) return getLocalAuthentication();
				return basicGetLocalAuthentication();
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
			case SecurityPackage.SECURITY_MODEL__AUTHENTICATION:
				setAuthentication((Authentication)newValue);
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
			case SecurityPackage.SECURITY_MODEL__AUTHENTICATION:
				setAuthentication((Authentication)null);
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
			case SecurityPackage.SECURITY_MODEL__AUTHENTICATION:
				return authentication != null;
			case SecurityPackage.SECURITY_MODEL__IS_AUTHENTICATED:
				return isSetIsAuthenticated();
			case SecurityPackage.SECURITY_MODEL__IS_CAS_AUTHENTICATED:
				return isSetIsCasAuthenticated();
			case SecurityPackage.SECURITY_MODEL__CAS_AUTHENTICATION:
				return isSetCasAuthentication();
			case SecurityPackage.SECURITY_MODEL__IS_LOCALLY_AUTHENTICATED:
				return isSetIsLocallyAuthenticated();
			case SecurityPackage.SECURITY_MODEL__LOCAL_AUTHENTICATION:
				return isSetLocalAuthentication();
		}
		return super.eIsSet(featureID);
	}

} //SecurityModelImpl
