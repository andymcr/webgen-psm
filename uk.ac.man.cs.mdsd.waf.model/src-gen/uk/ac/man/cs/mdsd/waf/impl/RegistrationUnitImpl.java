/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem;
import uk.ac.man.cs.mdsd.waf.RegistrationUnit;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registration Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.RegistrationUnitImpl#getAuthenticationSystem <em>Authentication System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegistrationUnitImpl extends EditUnitImpl implements RegistrationUnit {
	/**
	 * The cached value of the '{@link #getAuthenticationSystem() <em>Authentication System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationSystem()
	 * @generated
	 * @ordered
	 */
	protected LocalAuthenticationSystem authenticationSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegistrationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.REGISTRATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAuthenticationSystem getAuthenticationSystem() {
		if (authenticationSystem != null && authenticationSystem.eIsProxy()) {
			InternalEObject oldAuthenticationSystem = (InternalEObject)authenticationSystem;
			authenticationSystem = (LocalAuthenticationSystem)eResolveProxy(oldAuthenticationSystem);
			if (authenticationSystem != oldAuthenticationSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.REGISTRATION_UNIT__AUTHENTICATION_SYSTEM, oldAuthenticationSystem, authenticationSystem));
			}
		}
		return authenticationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAuthenticationSystem basicGetAuthenticationSystem() {
		return authenticationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthenticationSystem(LocalAuthenticationSystem newAuthenticationSystem, NotificationChain msgs) {
		LocalAuthenticationSystem oldAuthenticationSystem = authenticationSystem;
		authenticationSystem = newAuthenticationSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.REGISTRATION_UNIT__AUTHENTICATION_SYSTEM, oldAuthenticationSystem, newAuthenticationSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticationSystem(LocalAuthenticationSystem newAuthenticationSystem) {
		if (newAuthenticationSystem != authenticationSystem) {
			NotificationChain msgs = null;
			if (authenticationSystem != null)
				msgs = ((InternalEObject)authenticationSystem).eInverseRemove(this, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT, LocalAuthenticationSystem.class, msgs);
			if (newAuthenticationSystem != null)
				msgs = ((InternalEObject)newAuthenticationSystem).eInverseAdd(this, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT, LocalAuthenticationSystem.class, msgs);
			msgs = basicSetAuthenticationSystem(newAuthenticationSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.REGISTRATION_UNIT__AUTHENTICATION_SYSTEM, newAuthenticationSystem, newAuthenticationSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.REGISTRATION_UNIT__AUTHENTICATION_SYSTEM:
				if (authenticationSystem != null)
					msgs = ((InternalEObject)authenticationSystem).eInverseRemove(this, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT, LocalAuthenticationSystem.class, msgs);
				return basicSetAuthenticationSystem((LocalAuthenticationSystem)otherEnd, msgs);
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
			case WafPackage.REGISTRATION_UNIT__AUTHENTICATION_SYSTEM:
				return basicSetAuthenticationSystem(null, msgs);
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
			case WafPackage.REGISTRATION_UNIT__AUTHENTICATION_SYSTEM:
				if (resolve) return getAuthenticationSystem();
				return basicGetAuthenticationSystem();
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
			case WafPackage.REGISTRATION_UNIT__AUTHENTICATION_SYSTEM:
				setAuthenticationSystem((LocalAuthenticationSystem)newValue);
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
			case WafPackage.REGISTRATION_UNIT__AUTHENTICATION_SYSTEM:
				setAuthenticationSystem((LocalAuthenticationSystem)null);
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
			case WafPackage.REGISTRATION_UNIT__AUTHENTICATION_SYSTEM:
				return authenticationSystem != null;
		}
		return super.eIsSet(featureID);
	}

} //RegistrationUnitImpl
