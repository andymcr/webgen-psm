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
 *   <li>{@link work.andycarpenter.metamodel.security.impl.RegistrationElementImpl#getInvokeLabel <em>Invoke Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.RegistrationElementImpl#getConfirmLabel <em>Confirm Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.RegistrationElementImpl#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.RegistrationElementImpl#getUriEmailVerification <em>Uri Email Verification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegistrationElementImpl extends AuthenticationElementImpl implements RegistrationElement {
	/**
	 * The default value of the '{@link #getInvokeLabel() <em>Invoke Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokeLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOKE_LABEL_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getInvokeLabel() <em>Invoke Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokeLabel()
	 * @generated
	 * @ordered
	 */
	protected String invokeLabel = INVOKE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfirmLabel() <em>Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIRM_LABEL_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getConfirmLabel() <em>Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmLabel()
	 * @generated
	 * @ordered
	 */
	protected String confirmLabel = CONFIRM_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUriElement() <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriElement()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_ELEMENT_EDEFAULT = "register";

	/**
	 * The cached value of the '{@link #getUriElement() <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriElement()
	 * @generated
	 * @ordered
	 */
	protected String uriElement = URI_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUriEmailVerification() <em>Uri Email Verification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriEmailVerification()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EMAIL_VERIFICATION_EDEFAULT = "verify";

	/**
	 * The cached value of the '{@link #getUriEmailVerification() <em>Uri Email Verification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriEmailVerification()
	 * @generated
	 * @ordered
	 */
	protected String uriEmailVerification = URI_EMAIL_VERIFICATION_EDEFAULT;

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
	@Override
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
	@Override
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
	public String getInvokeLabel() {
		return invokeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvokeLabel(String newInvokeLabel) {
		String oldInvokeLabel = invokeLabel;
		invokeLabel = newInvokeLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.REGISTRATION_ELEMENT__INVOKE_LABEL, oldInvokeLabel, invokeLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfirmLabel() {
		return confirmLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfirmLabel(String newConfirmLabel) {
		String oldConfirmLabel = confirmLabel;
		confirmLabel = newConfirmLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.REGISTRATION_ELEMENT__CONFIRM_LABEL, oldConfirmLabel, confirmLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUriElement() {
		return uriElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUriElement(String newUriElement) {
		String oldUriElement = uriElement;
		uriElement = newUriElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.REGISTRATION_ELEMENT__URI_ELEMENT, oldUriElement, uriElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUriEmailVerification() {
		return uriEmailVerification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUriEmailVerification(String newUriEmailVerification) {
		String oldUriEmailVerification = uriEmailVerification;
		uriEmailVerification = newUriEmailVerification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.REGISTRATION_ELEMENT__URI_EMAIL_VERIFICATION, oldUriEmailVerification, uriEmailVerification));
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
			case SecurityPackage.REGISTRATION_ELEMENT__INVOKE_LABEL:
				return getInvokeLabel();
			case SecurityPackage.REGISTRATION_ELEMENT__CONFIRM_LABEL:
				return getConfirmLabel();
			case SecurityPackage.REGISTRATION_ELEMENT__URI_ELEMENT:
				return getUriElement();
			case SecurityPackage.REGISTRATION_ELEMENT__URI_EMAIL_VERIFICATION:
				return getUriEmailVerification();
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
			case SecurityPackage.REGISTRATION_ELEMENT__INVOKE_LABEL:
				setInvokeLabel((String)newValue);
				return;
			case SecurityPackage.REGISTRATION_ELEMENT__CONFIRM_LABEL:
				setConfirmLabel((String)newValue);
				return;
			case SecurityPackage.REGISTRATION_ELEMENT__URI_ELEMENT:
				setUriElement((String)newValue);
				return;
			case SecurityPackage.REGISTRATION_ELEMENT__URI_EMAIL_VERIFICATION:
				setUriEmailVerification((String)newValue);
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
			case SecurityPackage.REGISTRATION_ELEMENT__INVOKE_LABEL:
				setInvokeLabel(INVOKE_LABEL_EDEFAULT);
				return;
			case SecurityPackage.REGISTRATION_ELEMENT__CONFIRM_LABEL:
				setConfirmLabel(CONFIRM_LABEL_EDEFAULT);
				return;
			case SecurityPackage.REGISTRATION_ELEMENT__URI_ELEMENT:
				setUriElement(URI_ELEMENT_EDEFAULT);
				return;
			case SecurityPackage.REGISTRATION_ELEMENT__URI_EMAIL_VERIFICATION:
				setUriEmailVerification(URI_EMAIL_VERIFICATION_EDEFAULT);
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
			case SecurityPackage.REGISTRATION_ELEMENT__INVOKE_LABEL:
				return INVOKE_LABEL_EDEFAULT == null ? invokeLabel != null : !INVOKE_LABEL_EDEFAULT.equals(invokeLabel);
			case SecurityPackage.REGISTRATION_ELEMENT__CONFIRM_LABEL:
				return CONFIRM_LABEL_EDEFAULT == null ? confirmLabel != null : !CONFIRM_LABEL_EDEFAULT.equals(confirmLabel);
			case SecurityPackage.REGISTRATION_ELEMENT__URI_ELEMENT:
				return URI_ELEMENT_EDEFAULT == null ? uriElement != null : !URI_ELEMENT_EDEFAULT.equals(uriElement);
			case SecurityPackage.REGISTRATION_ELEMENT__URI_EMAIL_VERIFICATION:
				return URI_EMAIL_VERIFICATION_EDEFAULT == null ? uriEmailVerification != null : !URI_EMAIL_VERIFICATION_EDEFAULT.equals(uriEmailVerification);
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
		result.append(" (invokeLabel: ");
		result.append(invokeLabel);
		result.append(", confirmLabel: ");
		result.append(confirmLabel);
		result.append(", uriElement: ");
		result.append(uriElement);
		result.append(", uriEmailVerification: ");
		result.append(uriEmailVerification);
		result.append(')');
		return result.toString();
	}

} //RegistrationElementImpl
