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
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getInvokeLabel <em>Invoke Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getRequestLabel <em>Request Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getResetLabel <em>Reset Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getUriEmailSent <em>Uri Email Sent</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getUriResetPassword <em>Uri Reset Password</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getEmailHelp <em>Email Help</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getPasswordLabel <em>Password Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getPasswordPlaceholder <em>Password Placeholder</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getPasswordTitle <em>Password Title</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getPasswordConfirmationLabel <em>Password Confirmation Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getPasswordConfirmationPlaceholder <em>Password Confirmation Placeholder</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getPasswordConfirmationTitle <em>Password Confirmation Title</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getPasswordMessageRequired <em>Password Message Required</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getPasswordMessageValueMismatch <em>Password Message Value Mismatch</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getEmailCheckSubject <em>Email Check Subject</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getEmailCheckMessage <em>Email Check Message</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getEmailCheckSentCaption <em>Email Check Sent Caption</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl#getEmailCheckSentMessage <em>Email Check Sent Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForgottenPasswordElementImpl extends AuthenticationElementImpl implements ForgottenPasswordElement {
	/**
	 * The default value of the '{@link #getInvokeLabel() <em>Invoke Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokeLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOKE_LABEL_EDEFAULT = "Forgotten Password";

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
	 * The default value of the '{@link #getRequestLabel() <em>Request Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_LABEL_EDEFAULT = "Request Password Reset";

	/**
	 * The cached value of the '{@link #getRequestLabel() <em>Request Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestLabel()
	 * @generated
	 * @ordered
	 */
	protected String requestLabel = REQUEST_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getResetLabel() <em>Reset Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String RESET_LABEL_EDEFAULT = "Set Password";

	/**
	 * The cached value of the '{@link #getResetLabel() <em>Reset Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetLabel()
	 * @generated
	 * @ordered
	 */
	protected String resetLabel = RESET_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUriElement() <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriElement()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_ELEMENT_EDEFAULT = "forgotten-password";

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
	 * The default value of the '{@link #getUriEmailSent() <em>Uri Email Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriEmailSent()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EMAIL_SENT_EDEFAULT = "check-email";

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
	 * The default value of the '{@link #getUriResetPassword() <em>Uri Reset Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriResetPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_RESET_PASSWORD_EDEFAULT = "reset";

	/**
	 * The cached value of the '{@link #getUriResetPassword() <em>Uri Reset Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriResetPassword()
	 * @generated
	 * @ordered
	 */
	protected String uriResetPassword = URI_RESET_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailHelp() <em>Email Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailHelp()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_HELP_EDEFAULT = "Enter your email address and we we will send you a link to reset your password";

	/**
	 * The cached value of the '{@link #getEmailHelp() <em>Email Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailHelp()
	 * @generated
	 * @ordered
	 */
	protected String emailHelp = EMAIL_HELP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswordLabel() <em>Password Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_LABEL_EDEFAULT = "New Password";

	/**
	 * The cached value of the '{@link #getPasswordLabel() <em>Password Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordLabel()
	 * @generated
	 * @ordered
	 */
	protected String passwordLabel = PASSWORD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswordPlaceholder() <em>Password Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_PLACEHOLDER_EDEFAULT = "New Password";

	/**
	 * The cached value of the '{@link #getPasswordPlaceholder() <em>Password Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected String passwordPlaceholder = PASSWORD_PLACEHOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswordTitle() <em>Password Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_TITLE_EDEFAULT = "New Password";

	/**
	 * The cached value of the '{@link #getPasswordTitle() <em>Password Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordTitle()
	 * @generated
	 * @ordered
	 */
	protected String passwordTitle = PASSWORD_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswordConfirmationLabel() <em>Password Confirmation Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordConfirmationLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_CONFIRMATION_LABEL_EDEFAULT = "Confirm Password";

	/**
	 * The cached value of the '{@link #getPasswordConfirmationLabel() <em>Password Confirmation Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordConfirmationLabel()
	 * @generated
	 * @ordered
	 */
	protected String passwordConfirmationLabel = PASSWORD_CONFIRMATION_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswordConfirmationPlaceholder() <em>Password Confirmation Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordConfirmationPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_CONFIRMATION_PLACEHOLDER_EDEFAULT = "Confirm Password";

	/**
	 * The cached value of the '{@link #getPasswordConfirmationPlaceholder() <em>Password Confirmation Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordConfirmationPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected String passwordConfirmationPlaceholder = PASSWORD_CONFIRMATION_PLACEHOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswordConfirmationTitle() <em>Password Confirmation Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordConfirmationTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_CONFIRMATION_TITLE_EDEFAULT = "Confirm Password";

	/**
	 * The cached value of the '{@link #getPasswordConfirmationTitle() <em>Password Confirmation Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordConfirmationTitle()
	 * @generated
	 * @ordered
	 */
	protected String passwordConfirmationTitle = PASSWORD_CONFIRMATION_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswordMessageRequired() <em>Password Message Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordMessageRequired()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_MESSAGE_REQUIRED_EDEFAULT = "A password value is required";

	/**
	 * The cached value of the '{@link #getPasswordMessageRequired() <em>Password Message Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordMessageRequired()
	 * @generated
	 * @ordered
	 */
	protected String passwordMessageRequired = PASSWORD_MESSAGE_REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswordMessageValueMismatch() <em>Password Message Value Mismatch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordMessageValueMismatch()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_MESSAGE_VALUE_MISMATCH_EDEFAULT = "The two password values do not match";

	/**
	 * The cached value of the '{@link #getPasswordMessageValueMismatch() <em>Password Message Value Mismatch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordMessageValueMismatch()
	 * @generated
	 * @ordered
	 */
	protected String passwordMessageValueMismatch = PASSWORD_MESSAGE_VALUE_MISMATCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailCheckSubject() <em>Email Check Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailCheckSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_CHECK_SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailCheckSubject() <em>Email Check Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailCheckSubject()
	 * @generated
	 * @ordered
	 */
	protected String emailCheckSubject = EMAIL_CHECK_SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailCheckMessage() <em>Email Check Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailCheckMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_CHECK_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailCheckMessage() <em>Email Check Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailCheckMessage()
	 * @generated
	 * @ordered
	 */
	protected String emailCheckMessage = EMAIL_CHECK_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailCheckSentCaption() <em>Email Check Sent Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailCheckSentCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_CHECK_SENT_CAPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailCheckSentCaption() <em>Email Check Sent Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailCheckSentCaption()
	 * @generated
	 * @ordered
	 */
	protected String emailCheckSentCaption = EMAIL_CHECK_SENT_CAPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmailCheckSentMessage() <em>Email Check Sent Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailCheckSentMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_CHECK_SENT_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmailCheckSentMessage() <em>Email Check Sent Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailCheckSentMessage()
	 * @generated
	 * @ordered
	 */
	protected String emailCheckSentMessage = EMAIL_CHECK_SENT_MESSAGE_EDEFAULT;

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
	public String getInvokeLabel() {
		return invokeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvokeLabel(String newInvokeLabel) {
		String oldInvokeLabel = invokeLabel;
		invokeLabel = newInvokeLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__INVOKE_LABEL, oldInvokeLabel, invokeLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequestLabel() {
		return requestLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestLabel(String newRequestLabel) {
		String oldRequestLabel = requestLabel;
		requestLabel = newRequestLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__REQUEST_LABEL, oldRequestLabel, requestLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResetLabel() {
		return resetLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResetLabel(String newResetLabel) {
		String oldResetLabel = resetLabel;
		resetLabel = newResetLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__RESET_LABEL, oldResetLabel, resetLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUriElement() {
		return uriElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUriElement(String newUriElement) {
		String oldUriElement = uriElement;
		uriElement = newUriElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_ELEMENT, oldUriElement, uriElement));
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
	public String getUriResetPassword() {
		return uriResetPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUriResetPassword(String newUriResetPassword) {
		String oldUriResetPassword = uriResetPassword;
		uriResetPassword = newUriResetPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_RESET_PASSWORD, oldUriResetPassword, uriResetPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmailHelp() {
		return emailHelp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailHelp(String newEmailHelp) {
		String oldEmailHelp = emailHelp;
		emailHelp = newEmailHelp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_HELP, oldEmailHelp, emailHelp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPasswordLabel() {
		return passwordLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordLabel(String newPasswordLabel) {
		String oldPasswordLabel = passwordLabel;
		passwordLabel = newPasswordLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_LABEL, oldPasswordLabel, passwordLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPasswordPlaceholder() {
		return passwordPlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordPlaceholder(String newPasswordPlaceholder) {
		String oldPasswordPlaceholder = passwordPlaceholder;
		passwordPlaceholder = newPasswordPlaceholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_PLACEHOLDER, oldPasswordPlaceholder, passwordPlaceholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPasswordTitle() {
		return passwordTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordTitle(String newPasswordTitle) {
		String oldPasswordTitle = passwordTitle;
		passwordTitle = newPasswordTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_TITLE, oldPasswordTitle, passwordTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPasswordConfirmationLabel() {
		return passwordConfirmationLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordConfirmationLabel(String newPasswordConfirmationLabel) {
		String oldPasswordConfirmationLabel = passwordConfirmationLabel;
		passwordConfirmationLabel = newPasswordConfirmationLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_LABEL, oldPasswordConfirmationLabel, passwordConfirmationLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPasswordConfirmationPlaceholder() {
		return passwordConfirmationPlaceholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordConfirmationPlaceholder(String newPasswordConfirmationPlaceholder) {
		String oldPasswordConfirmationPlaceholder = passwordConfirmationPlaceholder;
		passwordConfirmationPlaceholder = newPasswordConfirmationPlaceholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_PLACEHOLDER, oldPasswordConfirmationPlaceholder, passwordConfirmationPlaceholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPasswordConfirmationTitle() {
		return passwordConfirmationTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordConfirmationTitle(String newPasswordConfirmationTitle) {
		String oldPasswordConfirmationTitle = passwordConfirmationTitle;
		passwordConfirmationTitle = newPasswordConfirmationTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_TITLE, oldPasswordConfirmationTitle, passwordConfirmationTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPasswordMessageRequired() {
		return passwordMessageRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordMessageRequired(String newPasswordMessageRequired) {
		String oldPasswordMessageRequired = passwordMessageRequired;
		passwordMessageRequired = newPasswordMessageRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_REQUIRED, oldPasswordMessageRequired, passwordMessageRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPasswordMessageValueMismatch() {
		return passwordMessageValueMismatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordMessageValueMismatch(String newPasswordMessageValueMismatch) {
		String oldPasswordMessageValueMismatch = passwordMessageValueMismatch;
		passwordMessageValueMismatch = newPasswordMessageValueMismatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_VALUE_MISMATCH, oldPasswordMessageValueMismatch, passwordMessageValueMismatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmailCheckSubject() {
		return emailCheckSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailCheckSubject(String newEmailCheckSubject) {
		String oldEmailCheckSubject = emailCheckSubject;
		emailCheckSubject = newEmailCheckSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SUBJECT, oldEmailCheckSubject, emailCheckSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmailCheckMessage() {
		return emailCheckMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailCheckMessage(String newEmailCheckMessage) {
		String oldEmailCheckMessage = emailCheckMessage;
		emailCheckMessage = newEmailCheckMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_MESSAGE, oldEmailCheckMessage, emailCheckMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmailCheckSentCaption() {
		return emailCheckSentCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailCheckSentCaption(String newEmailCheckSentCaption) {
		String oldEmailCheckSentCaption = emailCheckSentCaption;
		emailCheckSentCaption = newEmailCheckSentCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_CAPTION, oldEmailCheckSentCaption, emailCheckSentCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmailCheckSentMessage() {
		return emailCheckSentMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmailCheckSentMessage(String newEmailCheckSentMessage) {
		String oldEmailCheckSentMessage = emailCheckSentMessage;
		emailCheckSentMessage = newEmailCheckSentMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_MESSAGE, oldEmailCheckSentMessage, emailCheckSentMessage));
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
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__INVOKE_LABEL:
				return getInvokeLabel();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__REQUEST_LABEL:
				return getRequestLabel();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__RESET_LABEL:
				return getResetLabel();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_ELEMENT:
				return getUriElement();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT:
				return getUriEmailSent();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_RESET_PASSWORD:
				return getUriResetPassword();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_HELP:
				return getEmailHelp();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_LABEL:
				return getPasswordLabel();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_PLACEHOLDER:
				return getPasswordPlaceholder();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_TITLE:
				return getPasswordTitle();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_LABEL:
				return getPasswordConfirmationLabel();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_PLACEHOLDER:
				return getPasswordConfirmationPlaceholder();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_TITLE:
				return getPasswordConfirmationTitle();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_REQUIRED:
				return getPasswordMessageRequired();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_VALUE_MISMATCH:
				return getPasswordMessageValueMismatch();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SUBJECT:
				return getEmailCheckSubject();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_MESSAGE:
				return getEmailCheckMessage();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_CAPTION:
				return getEmailCheckSentCaption();
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_MESSAGE:
				return getEmailCheckSentMessage();
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
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__INVOKE_LABEL:
				setInvokeLabel((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__REQUEST_LABEL:
				setRequestLabel((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__RESET_LABEL:
				setResetLabel((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_ELEMENT:
				setUriElement((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT:
				setUriEmailSent((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_RESET_PASSWORD:
				setUriResetPassword((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_HELP:
				setEmailHelp((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_LABEL:
				setPasswordLabel((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_PLACEHOLDER:
				setPasswordPlaceholder((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_TITLE:
				setPasswordTitle((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_LABEL:
				setPasswordConfirmationLabel((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_PLACEHOLDER:
				setPasswordConfirmationPlaceholder((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_TITLE:
				setPasswordConfirmationTitle((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_REQUIRED:
				setPasswordMessageRequired((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_VALUE_MISMATCH:
				setPasswordMessageValueMismatch((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SUBJECT:
				setEmailCheckSubject((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_MESSAGE:
				setEmailCheckMessage((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_CAPTION:
				setEmailCheckSentCaption((String)newValue);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_MESSAGE:
				setEmailCheckSentMessage((String)newValue);
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
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__INVOKE_LABEL:
				setInvokeLabel(INVOKE_LABEL_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__REQUEST_LABEL:
				setRequestLabel(REQUEST_LABEL_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__RESET_LABEL:
				setResetLabel(RESET_LABEL_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_ELEMENT:
				setUriElement(URI_ELEMENT_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT:
				setUriEmailSent(URI_EMAIL_SENT_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_RESET_PASSWORD:
				setUriResetPassword(URI_RESET_PASSWORD_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_HELP:
				setEmailHelp(EMAIL_HELP_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_LABEL:
				setPasswordLabel(PASSWORD_LABEL_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_PLACEHOLDER:
				setPasswordPlaceholder(PASSWORD_PLACEHOLDER_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_TITLE:
				setPasswordTitle(PASSWORD_TITLE_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_LABEL:
				setPasswordConfirmationLabel(PASSWORD_CONFIRMATION_LABEL_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_PLACEHOLDER:
				setPasswordConfirmationPlaceholder(PASSWORD_CONFIRMATION_PLACEHOLDER_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_TITLE:
				setPasswordConfirmationTitle(PASSWORD_CONFIRMATION_TITLE_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_REQUIRED:
				setPasswordMessageRequired(PASSWORD_MESSAGE_REQUIRED_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_VALUE_MISMATCH:
				setPasswordMessageValueMismatch(PASSWORD_MESSAGE_VALUE_MISMATCH_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SUBJECT:
				setEmailCheckSubject(EMAIL_CHECK_SUBJECT_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_MESSAGE:
				setEmailCheckMessage(EMAIL_CHECK_MESSAGE_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_CAPTION:
				setEmailCheckSentCaption(EMAIL_CHECK_SENT_CAPTION_EDEFAULT);
				return;
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_MESSAGE:
				setEmailCheckSentMessage(EMAIL_CHECK_SENT_MESSAGE_EDEFAULT);
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
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__INVOKE_LABEL:
				return INVOKE_LABEL_EDEFAULT == null ? invokeLabel != null : !INVOKE_LABEL_EDEFAULT.equals(invokeLabel);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__REQUEST_LABEL:
				return REQUEST_LABEL_EDEFAULT == null ? requestLabel != null : !REQUEST_LABEL_EDEFAULT.equals(requestLabel);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__RESET_LABEL:
				return RESET_LABEL_EDEFAULT == null ? resetLabel != null : !RESET_LABEL_EDEFAULT.equals(resetLabel);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_ELEMENT:
				return URI_ELEMENT_EDEFAULT == null ? uriElement != null : !URI_ELEMENT_EDEFAULT.equals(uriElement);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT:
				return URI_EMAIL_SENT_EDEFAULT == null ? uriEmailSent != null : !URI_EMAIL_SENT_EDEFAULT.equals(uriEmailSent);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_RESET_PASSWORD:
				return URI_RESET_PASSWORD_EDEFAULT == null ? uriResetPassword != null : !URI_RESET_PASSWORD_EDEFAULT.equals(uriResetPassword);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_HELP:
				return EMAIL_HELP_EDEFAULT == null ? emailHelp != null : !EMAIL_HELP_EDEFAULT.equals(emailHelp);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_LABEL:
				return PASSWORD_LABEL_EDEFAULT == null ? passwordLabel != null : !PASSWORD_LABEL_EDEFAULT.equals(passwordLabel);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_PLACEHOLDER:
				return PASSWORD_PLACEHOLDER_EDEFAULT == null ? passwordPlaceholder != null : !PASSWORD_PLACEHOLDER_EDEFAULT.equals(passwordPlaceholder);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_TITLE:
				return PASSWORD_TITLE_EDEFAULT == null ? passwordTitle != null : !PASSWORD_TITLE_EDEFAULT.equals(passwordTitle);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_LABEL:
				return PASSWORD_CONFIRMATION_LABEL_EDEFAULT == null ? passwordConfirmationLabel != null : !PASSWORD_CONFIRMATION_LABEL_EDEFAULT.equals(passwordConfirmationLabel);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_PLACEHOLDER:
				return PASSWORD_CONFIRMATION_PLACEHOLDER_EDEFAULT == null ? passwordConfirmationPlaceholder != null : !PASSWORD_CONFIRMATION_PLACEHOLDER_EDEFAULT.equals(passwordConfirmationPlaceholder);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_TITLE:
				return PASSWORD_CONFIRMATION_TITLE_EDEFAULT == null ? passwordConfirmationTitle != null : !PASSWORD_CONFIRMATION_TITLE_EDEFAULT.equals(passwordConfirmationTitle);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_REQUIRED:
				return PASSWORD_MESSAGE_REQUIRED_EDEFAULT == null ? passwordMessageRequired != null : !PASSWORD_MESSAGE_REQUIRED_EDEFAULT.equals(passwordMessageRequired);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_VALUE_MISMATCH:
				return PASSWORD_MESSAGE_VALUE_MISMATCH_EDEFAULT == null ? passwordMessageValueMismatch != null : !PASSWORD_MESSAGE_VALUE_MISMATCH_EDEFAULT.equals(passwordMessageValueMismatch);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SUBJECT:
				return EMAIL_CHECK_SUBJECT_EDEFAULT == null ? emailCheckSubject != null : !EMAIL_CHECK_SUBJECT_EDEFAULT.equals(emailCheckSubject);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_MESSAGE:
				return EMAIL_CHECK_MESSAGE_EDEFAULT == null ? emailCheckMessage != null : !EMAIL_CHECK_MESSAGE_EDEFAULT.equals(emailCheckMessage);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_CAPTION:
				return EMAIL_CHECK_SENT_CAPTION_EDEFAULT == null ? emailCheckSentCaption != null : !EMAIL_CHECK_SENT_CAPTION_EDEFAULT.equals(emailCheckSentCaption);
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_MESSAGE:
				return EMAIL_CHECK_SENT_MESSAGE_EDEFAULT == null ? emailCheckSentMessage != null : !EMAIL_CHECK_SENT_MESSAGE_EDEFAULT.equals(emailCheckSentMessage);
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
		result.append(", requestLabel: ");
		result.append(requestLabel);
		result.append(", resetLabel: ");
		result.append(resetLabel);
		result.append(", uriElement: ");
		result.append(uriElement);
		result.append(", uriEmailSent: ");
		result.append(uriEmailSent);
		result.append(", uriResetPassword: ");
		result.append(uriResetPassword);
		result.append(", emailHelp: ");
		result.append(emailHelp);
		result.append(", passwordLabel: ");
		result.append(passwordLabel);
		result.append(", passwordPlaceholder: ");
		result.append(passwordPlaceholder);
		result.append(", passwordTitle: ");
		result.append(passwordTitle);
		result.append(", passwordConfirmationLabel: ");
		result.append(passwordConfirmationLabel);
		result.append(", passwordConfirmationPlaceholder: ");
		result.append(passwordConfirmationPlaceholder);
		result.append(", passwordConfirmationTitle: ");
		result.append(passwordConfirmationTitle);
		result.append(", passwordMessageRequired: ");
		result.append(passwordMessageRequired);
		result.append(", passwordMessageValueMismatch: ");
		result.append(passwordMessageValueMismatch);
		result.append(", emailCheckSubject: ");
		result.append(emailCheckSubject);
		result.append(", emailCheckMessage: ");
		result.append(emailCheckMessage);
		result.append(", emailCheckSentCaption: ");
		result.append(emailCheckSentCaption);
		result.append(", emailCheckSentMessage: ");
		result.append(emailCheckSentMessage);
		result.append(')');
		return result.toString();
	}

} //ForgottenPasswordElementImpl
