/**
 */
package work.andycarpenter.metamodel.security.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import work.andycarpenter.metamodel.security.Authentication;
import work.andycarpenter.metamodel.security.Role;
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
 *   <li>{@link work.andycarpenter.metamodel.security.impl.SecurityModelImpl#getRoles <em>Roles</em>}</li>
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
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

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
	@Override
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
	@Override
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
	@Override
	public boolean isIsAuthenticated() {
		return (Boolean)IS_AUTHENTICATED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsAuthenticated() {
		return IS_AUTHENTICATED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, SecurityPackage.SECURITY_MODEL__ROLES);
		}
		return roles;
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
			case SecurityPackage.SECURITY_MODEL__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case SecurityPackage.SECURITY_MODEL__ROLES:
				return getRoles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SecurityPackage.SECURITY_MODEL__AUTHENTICATION:
				setAuthentication((Authentication)newValue);
				return;
			case SecurityPackage.SECURITY_MODEL__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
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
			case SecurityPackage.SECURITY_MODEL__ROLES:
				getRoles().clear();
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
			case SecurityPackage.SECURITY_MODEL__ROLES:
				return roles != null && !roles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecurityModelImpl
