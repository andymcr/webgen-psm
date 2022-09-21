/**
 */
package work.andycarpenter.metamodel.security.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import work.andycarpenter.metamodel.security.ForgottenPasswordElement;
import work.andycarpenter.metamodel.security.LocalAuthenticationSystem;
import work.andycarpenter.metamodel.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forgotten Password Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getUriEmailSent <em>Uri Email Sent</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getEmailSubject <em>Email Subject</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getEmailMessage <em>Email Message</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getEmailSentCaption <em>Email Sent Caption</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getEmailSentMessage <em>Email Sent Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForgottenPasswordElementImpl extends AuthenticationElementImpl implements ForgottenPasswordElement {
	/**
	 * The default value of the '{@link #getUriEmailSent() <em>Uri Email Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriEmailSent()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EMAIL_SENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUriEmailSent() <em>Uri Email Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriEmailSent()
	 * @generated
	 * @ordered
	 */
	protected String uriEmailSent = URI_EMAIL_SENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailSubject() <em>Email Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailSubject() <em>Email Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSubject()
	 * @generated
	 * @ordered
	 */
	protected String emailSubject = EMAIL_SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailMessage() <em>Email Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailMessage() <em>Email Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailMessage()
	 * @generated
	 * @ordered
	 */
	protected String emailMessage = EMAIL_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailSentCaption() <em>Email Sent Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSentCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_SENT_CAPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailSentCaption() <em>Email Sent Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSentCaption()
	 * @generated
	 * @ordered
	 */
	protected String emailSentCaption = EMAIL_SENT_CAPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailSentMessage() <em>Email Sent Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSentMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_SENT_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailSentMessage() <em>Email Sent Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailSentMessage()
	 * @generated
	 * @ordered
	 */
	protected String emailSentMessage = EMAIL_SENT_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForgottenPasswordElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAuthenticationSystem getAuthentication() {
		if (eContainerFeatureID() != SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION) return null;
		return (LocalAuthenticationSystem)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAuthenticationSystem basicGetAuthentication() {
		if (eContainerFeatureID() != SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION) return null;
		return (LocalAuthenticationSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthentication(LocalAuthenticationSystem newAuthentication, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAuthentication, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthentication(LocalAuthenticationSystem newAuthentication) {
		if (newAuthentication != eInternalContainer() || (eContainerFeatureID() != SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION && newAuthentication != null)) {
			if (EcoreUtil.isAncestor(this, newAuthentication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAuthentication != null)
				msgs = ((InternalEObject)newAuthentication).eInverseAdd(this, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT, LocalAuthenticationSystem.class, msgs);
			msgs = basicSetAuthentication(newAuthentication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION, newAuthentication, newAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUriEmailSent() {
		return uriEmailSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUriEmailSent(String newUriEmailSent) {
		String oldUriEmailSent = uriEmailSent;
		uriEmailSent = newUriEmailSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT, oldUriEmailSent, uriEmailSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmailSubject() {
		return emailSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailSubject(String newEmailSubject) {
		String oldEmailSubject = emailSubject;
		emailSubject = newEmailSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SUBJECT, oldEmailSubject, emailSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmailMessage() {
		return emailMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailMessage(String newEmailMessage) {
		String oldEmailMessage = emailMessage;
		emailMessage = newEmailMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_MESSAGE, oldEmailMessage, emailMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmailSentCaption() {
		return emailSentCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailSentCaption(String newEmailSentCaption) {
		String oldEmailSentCaption = emailSentCaption;
		emailSentCaption = newEmailSentCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_CAPTION, oldEmailSentCaption, emailSentCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmailSentMessage() {
		return emailSentMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailSentMessage(String newEmailSentMessage) {
		String oldEmailSentMessage = emailSentMessage;
		emailSentMessage = newEmailSentMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_MESSAGE, oldEmailSentMessage, emailSentMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION:
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
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION:
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
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION:
				return eInternalContainer().eInverseRemove(this, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT, LocalAuthenticationSystem.class, msgs);
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
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION:
				if (resolve) return getAuthentication();
				return basicGetAuthentication();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT:
				return getUriEmailSent();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SUBJECT:
				return getEmailSubject();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_MESSAGE:
				return getEmailMessage();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_CAPTION:
				return getEmailSentCaption();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_MESSAGE:
				return getEmailSentMessage();
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
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION:
				setAuthentication((LocalAuthenticationSystem)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT:
				setUriEmailSent((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SUBJECT:
				setEmailSubject((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_MESSAGE:
				setEmailMessage((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_CAPTION:
				setEmailSentCaption((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_MESSAGE:
				setEmailSentMessage((String)newValue);
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
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION:
				setAuthentication((LocalAuthenticationSystem)null);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT:
				setUriEmailSent(URI_EMAIL_SENT_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SUBJECT:
				setEmailSubject(EMAIL_SUBJECT_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_MESSAGE:
				setEmailMessage(EMAIL_MESSAGE_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_CAPTION:
				setEmailSentCaption(EMAIL_SENT_CAPTION_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_MESSAGE:
				setEmailSentMessage(EMAIL_SENT_MESSAGE_EDEFAULT);
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
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION:
				return basicGetAuthentication() != null;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT:
				return URI_EMAIL_SENT_EDEFAULT == null ? uriEmailSent != null : !URI_EMAIL_SENT_EDEFAULT.equals(uriEmailSent);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SUBJECT:
				return EMAIL_SUBJECT_EDEFAULT == null ? emailSubject != null : !EMAIL_SUBJECT_EDEFAULT.equals(emailSubject);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_MESSAGE:
				return EMAIL_MESSAGE_EDEFAULT == null ? emailMessage != null : !EMAIL_MESSAGE_EDEFAULT.equals(emailMessage);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_CAPTION:
				return EMAIL_SENT_CAPTION_EDEFAULT == null ? emailSentCaption != null : !EMAIL_SENT_CAPTION_EDEFAULT.equals(emailSentCaption);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_MESSAGE:
				return EMAIL_SENT_MESSAGE_EDEFAULT == null ? emailSentMessage != null : !EMAIL_SENT_MESSAGE_EDEFAULT.equals(emailSentMessage);
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
		result.append(" (uriEmailSent: ");
		result.append(uriEmailSent);
		result.append(", emailSubject: ");
		result.append(emailSubject);
		result.append(", emailMessage: ");
		result.append(emailMessage);
		result.append(", emailSentCaption: ");
		result.append(emailSentCaption);
		result.append(", emailSentMessage: ");
		result.append(emailSentMessage);
		result.append(')');
		return result.toString();
	}

} //ForgottenPasswordElementImpl
