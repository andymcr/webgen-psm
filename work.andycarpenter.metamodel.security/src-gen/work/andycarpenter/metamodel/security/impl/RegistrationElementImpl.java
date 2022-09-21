/**
 */
package work.andycarpenter.metamodel.security.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import work.andycarpenter.metamodel.security.LocalAuthenticationSystem;
import work.andycarpenter.metamodel.security.RegistrationElement;
import work.andycarpenter.metamodel.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registration Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.RegistrationElementImpl#getAuthentication <em>Authentication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegistrationElementImpl extends AuthenticationElementImpl implements RegistrationElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistrationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.REGISTRATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAuthenticationSystem getAuthentication() {
		if (eContainerFeatureID() != SecurityPackage.REGISTRATION_ELEMENT__AUTHENTICATION) return null;
		return (LocalAuthenticationSystem)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAuthenticationSystem basicGetAuthentication() {
		if (eContainerFeatureID() != SecurityPackage.REGISTRATION_ELEMENT__AUTHENTICATION) return null;
		return (LocalAuthenticationSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthentication(LocalAuthenticationSystem newAuthentication, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAuthentication, SecurityPackage.REGISTRATION_ELEMENT__AUTHENTICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthentication(LocalAuthenticationSystem newAuthentication) {
		if (newAuthentication != eInternalContainer() || (eContainerFeatureID() != SecurityPackage.REGISTRATION_ELEMENT__AUTHENTICATION && newAuthentication != null)) {
			if (EcoreUtil.isAncestor(this, newAuthentication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAuthentication != null)
				msgs = ((InternalEObject)newAuthentication).eInverseAdd(this, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT, LocalAuthenticationSystem.class, msgs);
			msgs = basicSetAuthentication(newAuthentication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.REGISTRATION_ELEMENT__AUTHENTICATION, newAuthentication, newAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPackage.REGISTRATION_ELEMENT__AUTHENTICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAuthentication((LocalAuthenticationSystem)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPackage.REGISTRATION_ELEMENT__AUTHENTICATION:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SecurityPackage.REGISTRATION_ELEMENT__AUTHENTICATION:
				return eInternalContainer().eInverseRemove(this, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT, LocalAuthenticationSystem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPackage.REGISTRATION_ELEMENT__AUTHENTICATION:
				if (resolve) return getAuthentication();
				return basicGetAuthentication();
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
			case SecurityPackage.REGISTRATION_ELEMENT__AUTHENTICATION:
				setAuthentication((LocalAuthenticationSystem)newValue);
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
			case SecurityPackage.REGISTRATION_ELEMENT__AUTHENTICATION:
				setAuthentication((LocalAuthenticationSystem)null);
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
			case SecurityPackage.REGISTRATION_ELEMENT__AUTHENTICATION:
				return basicGetAuthentication() != null;
		}
		return super.eIsSet(featureID);
	}

} //RegistrationElementImpl
