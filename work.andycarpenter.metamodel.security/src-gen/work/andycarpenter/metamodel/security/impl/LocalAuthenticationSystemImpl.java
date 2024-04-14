/**
 */
package work.andycarpenter.metamodel.security.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.metamodel.orm.Attribute;
import work.andycarpenter.metamodel.orm.Entity;

import work.andycarpenter.metamodel.security.ChangePasswordElement;
import work.andycarpenter.metamodel.security.ForgottenPasswordElement;
import work.andycarpenter.metamodel.security.LocalAuthenticationSystem;
import work.andycarpenter.metamodel.security.LoginElement;
import work.andycarpenter.metamodel.security.LogoutElement;
import work.andycarpenter.metamodel.security.RegistrationElement;
import work.andycarpenter.metamodel.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Authentication System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getAuthenticationModel <em>Authentication Model</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getUserKey <em>User Key</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getAuthenticationKey <em>Authentication Key</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getIdentifierFeature <em>Identifier Feature</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getPasswordFeature <em>Password Feature</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getResetPasswordRequestModel <em>Reset Password Request Model</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getRegistrationElement <em>Registration Element</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#isHasRegistrationElement <em>Has Registration Element</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getLoginElement <em>Login Element</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getLogoutElement <em>Logout Element</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getForgottenPasswordElement <em>Forgotten Password Element</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getChangePasswordElement <em>Change Password Element</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#isCaptcha <em>Captcha</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#isAllowRememberMe <em>Allow Remember Me</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#isAllowSelfRegistration <em>Allow Self Registration</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#isUseEmailActivation <em>Use Email Activation</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#isSendWelcomeEmail <em>Send Welcome Email</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getSectionClass <em>Section Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getCaptionClass <em>Caption Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl#getContentClass <em>Content Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalAuthenticationSystemImpl extends AuthenticationImpl implements LocalAuthenticationSystem {
	/**
	 * The cached value of the '{@link #getAuthenticationModel() <em>Authentication Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationModel()
	 * @generated
	 * @ordered
	 */
	protected Entity authenticationModel;

	/**
	 * The cached value of the '{@link #getUserKey() <em>User Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserKey()
	 * @generated
	 * @ordered
	 */
	protected Attribute userKey;

	/**
	 * The cached value of the '{@link #getAuthenticationKey() <em>Authentication Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationKey()
	 * @generated
	 * @ordered
	 */
	protected Attribute authenticationKey;

	/**
	 * The cached value of the '{@link #getIdentifierFeature() <em>Identifier Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifierFeature()
	 * @generated
	 * @ordered
	 */
	protected Attribute identifierFeature;

	/**
	 * The cached value of the '{@link #getPasswordFeature() <em>Password Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordFeature()
	 * @generated
	 * @ordered
	 */
	protected Attribute passwordFeature;

	/**
	 * The cached value of the '{@link #getResetPasswordRequestModel() <em>Reset Password Request Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetPasswordRequestModel()
	 * @generated
	 * @ordered
	 */
	protected Entity resetPasswordRequestModel;

	/**
	 * The cached value of the '{@link #getRegistrationElement() <em>Registration Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationElement()
	 * @generated
	 * @ordered
	 */
	protected RegistrationElement registrationElement;

	/**
	 * The cached setting delegate for the '{@link #isHasRegistrationElement() <em>Has Registration Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasRegistrationElement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HAS_REGISTRATION_ELEMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__HAS_REGISTRATION_ELEMENT).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getLoginElement() <em>Login Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginElement()
	 * @generated
	 * @ordered
	 */
	protected LoginElement loginElement;

	/**
	 * The cached value of the '{@link #getLogoutElement() <em>Logout Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogoutElement()
	 * @generated
	 * @ordered
	 */
	protected LogoutElement logoutElement;

	/**
	 * The cached value of the '{@link #getForgottenPasswordElement() <em>Forgotten Password Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForgottenPasswordElement()
	 * @generated
	 * @ordered
	 */
	protected ForgottenPasswordElement forgottenPasswordElement;

	/**
	 * The cached value of the '{@link #getChangePasswordElement() <em>Change Password Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangePasswordElement()
	 * @generated
	 * @ordered
	 */
	protected ChangePasswordElement changePasswordElement;

	/**
	 * The default value of the '{@link #isCaptcha() <em>Captcha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCaptcha()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAPTCHA_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCaptcha() <em>Captcha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCaptcha()
	 * @generated
	 * @ordered
	 */
	protected boolean captcha = CAPTCHA_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowRememberMe() <em>Allow Remember Me</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowRememberMe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_REMEMBER_ME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowRememberMe() <em>Allow Remember Me</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowRememberMe()
	 * @generated
	 * @ordered
	 */
	protected boolean allowRememberMe = ALLOW_REMEMBER_ME_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowSelfRegistration() <em>Allow Self Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSelfRegistration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_SELF_REGISTRATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowSelfRegistration() <em>Allow Self Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSelfRegistration()
	 * @generated
	 * @ordered
	 */
	protected boolean allowSelfRegistration = ALLOW_SELF_REGISTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseEmailActivation() <em>Use Email Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseEmailActivation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_EMAIL_ACTIVATION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseEmailActivation() <em>Use Email Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseEmailActivation()
	 * @generated
	 * @ordered
	 */
	protected boolean useEmailActivation = USE_EMAIL_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isSendWelcomeEmail() <em>Send Welcome Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendWelcomeEmail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEND_WELCOME_EMAIL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSendWelcomeEmail() <em>Send Welcome Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendWelcomeEmail()
	 * @generated
	 * @ordered
	 */
	protected boolean sendWelcomeEmail = SEND_WELCOME_EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSectionClass() <em>Section Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionClass()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSectionClass() <em>Section Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionClass()
	 * @generated
	 * @ordered
	 */
	protected String sectionClass = SECTION_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaptionClass() <em>Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCaptionClass() <em>Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptionClass()
	 * @generated
	 * @ordered
	 */
	protected String captionClass = CAPTION_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentClass() <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_CLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getContentClass() <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentClass()
	 * @generated
	 * @ordered
	 */
	protected String contentClass = CONTENT_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalAuthenticationSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getAuthenticationModel() {
		if (authenticationModel != null && authenticationModel.eIsProxy()) {
			InternalEObject oldAuthenticationModel = (InternalEObject)authenticationModel;
			authenticationModel = (Entity)eResolveProxy(oldAuthenticationModel);
			if (authenticationModel != oldAuthenticationModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL, oldAuthenticationModel, authenticationModel));
			}
		}
		return authenticationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetAuthenticationModel() {
		return authenticationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationModel(Entity newAuthenticationModel) {
		Entity oldAuthenticationModel = authenticationModel;
		authenticationModel = newAuthenticationModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL, oldAuthenticationModel, authenticationModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getUserKey() {
		if (userKey != null && userKey.eIsProxy()) {
			InternalEObject oldUserKey = (InternalEObject)userKey;
			userKey = (Attribute)eResolveProxy(oldUserKey);
			if (userKey != oldUserKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_KEY, oldUserKey, userKey));
			}
		}
		return userKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetUserKey() {
		return userKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserKey(Attribute newUserKey) {
		Attribute oldUserKey = userKey;
		userKey = newUserKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_KEY, oldUserKey, userKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getAuthenticationKey() {
		if (authenticationKey != null && authenticationKey.eIsProxy()) {
			InternalEObject oldAuthenticationKey = (InternalEObject)authenticationKey;
			authenticationKey = (Attribute)eResolveProxy(oldAuthenticationKey);
			if (authenticationKey != oldAuthenticationKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY, oldAuthenticationKey, authenticationKey));
			}
		}
		return authenticationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAuthenticationKey() {
		return authenticationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationKey(Attribute newAuthenticationKey) {
		Attribute oldAuthenticationKey = authenticationKey;
		authenticationKey = newAuthenticationKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY, oldAuthenticationKey, authenticationKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getIdentifierFeature() {
		if (identifierFeature != null && identifierFeature.eIsProxy()) {
			InternalEObject oldIdentifierFeature = (InternalEObject)identifierFeature;
			identifierFeature = (Attribute)eResolveProxy(oldIdentifierFeature);
			if (identifierFeature != oldIdentifierFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__IDENTIFIER_FEATURE, oldIdentifierFeature, identifierFeature));
			}
		}
		return identifierFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetIdentifierFeature() {
		return identifierFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifierFeature(Attribute newIdentifierFeature) {
		Attribute oldIdentifierFeature = identifierFeature;
		identifierFeature = newIdentifierFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__IDENTIFIER_FEATURE, oldIdentifierFeature, identifierFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getPasswordFeature() {
		if (passwordFeature != null && passwordFeature.eIsProxy()) {
			InternalEObject oldPasswordFeature = (InternalEObject)passwordFeature;
			passwordFeature = (Attribute)eResolveProxy(oldPasswordFeature);
			if (passwordFeature != oldPasswordFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__PASSWORD_FEATURE, oldPasswordFeature, passwordFeature));
			}
		}
		return passwordFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetPasswordFeature() {
		return passwordFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPasswordFeature(Attribute newPasswordFeature) {
		Attribute oldPasswordFeature = passwordFeature;
		passwordFeature = newPasswordFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__PASSWORD_FEATURE, oldPasswordFeature, passwordFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getResetPasswordRequestModel() {
		if (resetPasswordRequestModel != null && resetPasswordRequestModel.eIsProxy()) {
			InternalEObject oldResetPasswordRequestModel = (InternalEObject)resetPasswordRequestModel;
			resetPasswordRequestModel = (Entity)eResolveProxy(oldResetPasswordRequestModel);
			if (resetPasswordRequestModel != oldResetPasswordRequestModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL, oldResetPasswordRequestModel, resetPasswordRequestModel));
			}
		}
		return resetPasswordRequestModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetResetPasswordRequestModel() {
		return resetPasswordRequestModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResetPasswordRequestModel(Entity newResetPasswordRequestModel) {
		Entity oldResetPasswordRequestModel = resetPasswordRequestModel;
		resetPasswordRequestModel = newResetPasswordRequestModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL, oldResetPasswordRequestModel, resetPasswordRequestModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegistrationElement getRegistrationElement() {
		return registrationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistrationElement(RegistrationElement newRegistrationElement, NotificationChain msgs) {
		RegistrationElement oldRegistrationElement = registrationElement;
		registrationElement = newRegistrationElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT, oldRegistrationElement, newRegistrationElement);
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
	public void setRegistrationElement(RegistrationElement newRegistrationElement) {
		if (newRegistrationElement != registrationElement) {
			NotificationChain msgs = null;
			if (registrationElement != null)
				msgs = ((InternalEObject)registrationElement).eInverseRemove(this, SecurityPackage.REGISTRATION_ELEMENT__AUTHENTICATION, RegistrationElement.class, msgs);
			if (newRegistrationElement != null)
				msgs = ((InternalEObject)newRegistrationElement).eInverseAdd(this, SecurityPackage.REGISTRATION_ELEMENT__AUTHENTICATION, RegistrationElement.class, msgs);
			msgs = basicSetRegistrationElement(newRegistrationElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT, newRegistrationElement, newRegistrationElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasRegistrationElement() {
		return (Boolean)HAS_REGISTRATION_ELEMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoginElement getLoginElement() {
		return loginElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoginElement(LoginElement newLoginElement, NotificationChain msgs) {
		LoginElement oldLoginElement = loginElement;
		loginElement = newLoginElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ELEMENT, oldLoginElement, newLoginElement);
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
	public void setLoginElement(LoginElement newLoginElement) {
		if (newLoginElement != loginElement) {
			NotificationChain msgs = null;
			if (loginElement != null)
				msgs = ((InternalEObject)loginElement).eInverseRemove(this, SecurityPackage.LOGIN_ELEMENT__AUTHENTICATION, LoginElement.class, msgs);
			if (newLoginElement != null)
				msgs = ((InternalEObject)newLoginElement).eInverseAdd(this, SecurityPackage.LOGIN_ELEMENT__AUTHENTICATION, LoginElement.class, msgs);
			msgs = basicSetLoginElement(newLoginElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ELEMENT, newLoginElement, newLoginElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogoutElement getLogoutElement() {
		return logoutElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogoutElement(LogoutElement newLogoutElement, NotificationChain msgs) {
		LogoutElement oldLogoutElement = logoutElement;
		logoutElement = newLogoutElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_ELEMENT, oldLogoutElement, newLogoutElement);
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
	public void setLogoutElement(LogoutElement newLogoutElement) {
		if (newLogoutElement != logoutElement) {
			NotificationChain msgs = null;
			if (logoutElement != null)
				msgs = ((InternalEObject)logoutElement).eInverseRemove(this, SecurityPackage.LOGOUT_ELEMENT__AUTHENTICATION, LogoutElement.class, msgs);
			if (newLogoutElement != null)
				msgs = ((InternalEObject)newLogoutElement).eInverseAdd(this, SecurityPackage.LOGOUT_ELEMENT__AUTHENTICATION, LogoutElement.class, msgs);
			msgs = basicSetLogoutElement(newLogoutElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_ELEMENT, newLogoutElement, newLogoutElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForgottenPasswordElement getForgottenPasswordElement() {
		return forgottenPasswordElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForgottenPasswordElement(ForgottenPasswordElement newForgottenPasswordElement, NotificationChain msgs) {
		ForgottenPasswordElement oldForgottenPasswordElement = forgottenPasswordElement;
		forgottenPasswordElement = newForgottenPasswordElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT, oldForgottenPasswordElement, newForgottenPasswordElement);
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
	public void setForgottenPasswordElement(ForgottenPasswordElement newForgottenPasswordElement) {
		if (newForgottenPasswordElement != forgottenPasswordElement) {
			NotificationChain msgs = null;
			if (forgottenPasswordElement != null)
				msgs = ((InternalEObject)forgottenPasswordElement).eInverseRemove(this, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION, ForgottenPasswordElement.class, msgs);
			if (newForgottenPasswordElement != null)
				msgs = ((InternalEObject)newForgottenPasswordElement).eInverseAdd(this, SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION, ForgottenPasswordElement.class, msgs);
			msgs = basicSetForgottenPasswordElement(newForgottenPasswordElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT, newForgottenPasswordElement, newForgottenPasswordElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangePasswordElement getChangePasswordElement() {
		return changePasswordElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangePasswordElement(ChangePasswordElement newChangePasswordElement, NotificationChain msgs) {
		ChangePasswordElement oldChangePasswordElement = changePasswordElement;
		changePasswordElement = newChangePasswordElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CHANGE_PASSWORD_ELEMENT, oldChangePasswordElement, newChangePasswordElement);
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
	public void setChangePasswordElement(ChangePasswordElement newChangePasswordElement) {
		if (newChangePasswordElement != changePasswordElement) {
			NotificationChain msgs = null;
			if (changePasswordElement != null)
				msgs = ((InternalEObject)changePasswordElement).eInverseRemove(this, SecurityPackage.CHANGE_PASSWORD_ELEMENT__AUTHENTICATION, ChangePasswordElement.class, msgs);
			if (newChangePasswordElement != null)
				msgs = ((InternalEObject)newChangePasswordElement).eInverseAdd(this, SecurityPackage.CHANGE_PASSWORD_ELEMENT__AUTHENTICATION, ChangePasswordElement.class, msgs);
			msgs = basicSetChangePasswordElement(newChangePasswordElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CHANGE_PASSWORD_ELEMENT, newChangePasswordElement, newChangePasswordElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCaptcha() {
		return captcha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaptcha(boolean newCaptcha) {
		boolean oldCaptcha = captcha;
		captcha = newCaptcha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA, oldCaptcha, captcha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowRememberMe() {
		return allowRememberMe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowRememberMe(boolean newAllowRememberMe) {
		boolean oldAllowRememberMe = allowRememberMe;
		allowRememberMe = newAllowRememberMe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME, oldAllowRememberMe, allowRememberMe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowSelfRegistration() {
		return allowSelfRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowSelfRegistration(boolean newAllowSelfRegistration) {
		boolean oldAllowSelfRegistration = allowSelfRegistration;
		allowSelfRegistration = newAllowSelfRegistration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION, oldAllowSelfRegistration, allowSelfRegistration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseEmailActivation() {
		return useEmailActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseEmailActivation(boolean newUseEmailActivation) {
		boolean oldUseEmailActivation = useEmailActivation;
		useEmailActivation = newUseEmailActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION, oldUseEmailActivation, useEmailActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSendWelcomeEmail() {
		return sendWelcomeEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSendWelcomeEmail(boolean newSendWelcomeEmail) {
		boolean oldSendWelcomeEmail = sendWelcomeEmail;
		sendWelcomeEmail = newSendWelcomeEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL, oldSendWelcomeEmail, sendWelcomeEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSectionClass() {
		return sectionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSectionClass(String newSectionClass) {
		String oldSectionClass = sectionClass;
		sectionClass = newSectionClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SECTION_CLASS, oldSectionClass, sectionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCaptionClass() {
		return captionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaptionClass(String newCaptionClass) {
		String oldCaptionClass = captionClass;
		captionClass = newCaptionClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CAPTION_CLASS, oldCaptionClass, captionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentClass() {
		return contentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentClass(String newContentClass) {
		String oldContentClass = contentClass;
		contentClass = newContentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CONTENT_CLASS, oldContentClass, contentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT:
				if (registrationElement != null)
					msgs = ((InternalEObject)registrationElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT, null, msgs);
				return basicSetRegistrationElement((RegistrationElement)otherEnd, msgs);
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ELEMENT:
				if (loginElement != null)
					msgs = ((InternalEObject)loginElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ELEMENT, null, msgs);
				return basicSetLoginElement((LoginElement)otherEnd, msgs);
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_ELEMENT:
				if (logoutElement != null)
					msgs = ((InternalEObject)logoutElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_ELEMENT, null, msgs);
				return basicSetLogoutElement((LogoutElement)otherEnd, msgs);
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT:
				if (forgottenPasswordElement != null)
					msgs = ((InternalEObject)forgottenPasswordElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT, null, msgs);
				return basicSetForgottenPasswordElement((ForgottenPasswordElement)otherEnd, msgs);
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CHANGE_PASSWORD_ELEMENT:
				if (changePasswordElement != null)
					msgs = ((InternalEObject)changePasswordElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CHANGE_PASSWORD_ELEMENT, null, msgs);
				return basicSetChangePasswordElement((ChangePasswordElement)otherEnd, msgs);
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT:
				return basicSetRegistrationElement(null, msgs);
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ELEMENT:
				return basicSetLoginElement(null, msgs);
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_ELEMENT:
				return basicSetLogoutElement(null, msgs);
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT:
				return basicSetForgottenPasswordElement(null, msgs);
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CHANGE_PASSWORD_ELEMENT:
				return basicSetChangePasswordElement(null, msgs);
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL:
				if (resolve) return getAuthenticationModel();
				return basicGetAuthenticationModel();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_KEY:
				if (resolve) return getUserKey();
				return basicGetUserKey();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				if (resolve) return getAuthenticationKey();
				return basicGetAuthenticationKey();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__IDENTIFIER_FEATURE:
				if (resolve) return getIdentifierFeature();
				return basicGetIdentifierFeature();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__PASSWORD_FEATURE:
				if (resolve) return getPasswordFeature();
				return basicGetPasswordFeature();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL:
				if (resolve) return getResetPasswordRequestModel();
				return basicGetResetPasswordRequestModel();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT:
				return getRegistrationElement();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__HAS_REGISTRATION_ELEMENT:
				return isHasRegistrationElement();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ELEMENT:
				return getLoginElement();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_ELEMENT:
				return getLogoutElement();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT:
				return getForgottenPasswordElement();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CHANGE_PASSWORD_ELEMENT:
				return getChangePasswordElement();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA:
				return isCaptcha();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME:
				return isAllowRememberMe();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				return isAllowSelfRegistration();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				return isUseEmailActivation();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				return isSendWelcomeEmail();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SECTION_CLASS:
				return getSectionClass();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CAPTION_CLASS:
				return getCaptionClass();
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CONTENT_CLASS:
				return getContentClass();
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL:
				setAuthenticationModel((Entity)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_KEY:
				setUserKey((Attribute)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				setAuthenticationKey((Attribute)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__IDENTIFIER_FEATURE:
				setIdentifierFeature((Attribute)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__PASSWORD_FEATURE:
				setPasswordFeature((Attribute)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL:
				setResetPasswordRequestModel((Entity)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT:
				setRegistrationElement((RegistrationElement)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ELEMENT:
				setLoginElement((LoginElement)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_ELEMENT:
				setLogoutElement((LogoutElement)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT:
				setForgottenPasswordElement((ForgottenPasswordElement)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CHANGE_PASSWORD_ELEMENT:
				setChangePasswordElement((ChangePasswordElement)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA:
				setCaptcha((Boolean)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME:
				setAllowRememberMe((Boolean)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				setAllowSelfRegistration((Boolean)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				setUseEmailActivation((Boolean)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				setSendWelcomeEmail((Boolean)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SECTION_CLASS:
				setSectionClass((String)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CAPTION_CLASS:
				setCaptionClass((String)newValue);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CONTENT_CLASS:
				setContentClass((String)newValue);
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL:
				setAuthenticationModel((Entity)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_KEY:
				setUserKey((Attribute)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				setAuthenticationKey((Attribute)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__IDENTIFIER_FEATURE:
				setIdentifierFeature((Attribute)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__PASSWORD_FEATURE:
				setPasswordFeature((Attribute)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL:
				setResetPasswordRequestModel((Entity)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT:
				setRegistrationElement((RegistrationElement)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ELEMENT:
				setLoginElement((LoginElement)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_ELEMENT:
				setLogoutElement((LogoutElement)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT:
				setForgottenPasswordElement((ForgottenPasswordElement)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CHANGE_PASSWORD_ELEMENT:
				setChangePasswordElement((ChangePasswordElement)null);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA:
				setCaptcha(CAPTCHA_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME:
				setAllowRememberMe(ALLOW_REMEMBER_ME_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				setAllowSelfRegistration(ALLOW_SELF_REGISTRATION_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				setUseEmailActivation(USE_EMAIL_ACTIVATION_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				setSendWelcomeEmail(SEND_WELCOME_EMAIL_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SECTION_CLASS:
				setSectionClass(SECTION_CLASS_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CAPTION_CLASS:
				setCaptionClass(CAPTION_CLASS_EDEFAULT);
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CONTENT_CLASS:
				setContentClass(CONTENT_CLASS_EDEFAULT);
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
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL:
				return authenticationModel != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USER_KEY:
				return userKey != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				return authenticationKey != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__IDENTIFIER_FEATURE:
				return identifierFeature != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__PASSWORD_FEATURE:
				return passwordFeature != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL:
				return resetPasswordRequestModel != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT:
				return registrationElement != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__HAS_REGISTRATION_ELEMENT:
				return HAS_REGISTRATION_ELEMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ELEMENT:
				return loginElement != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_ELEMENT:
				return logoutElement != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT:
				return forgottenPasswordElement != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CHANGE_PASSWORD_ELEMENT:
				return changePasswordElement != null;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA:
				return captcha != CAPTCHA_EDEFAULT;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME:
				return allowRememberMe != ALLOW_REMEMBER_ME_EDEFAULT;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				return allowSelfRegistration != ALLOW_SELF_REGISTRATION_EDEFAULT;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				return useEmailActivation != USE_EMAIL_ACTIVATION_EDEFAULT;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				return sendWelcomeEmail != SEND_WELCOME_EMAIL_EDEFAULT;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SECTION_CLASS:
				return SECTION_CLASS_EDEFAULT == null ? sectionClass != null : !SECTION_CLASS_EDEFAULT.equals(sectionClass);
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CAPTION_CLASS:
				return CAPTION_CLASS_EDEFAULT == null ? captionClass != null : !CAPTION_CLASS_EDEFAULT.equals(captionClass);
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CONTENT_CLASS:
				return CONTENT_CLASS_EDEFAULT == null ? contentClass != null : !CONTENT_CLASS_EDEFAULT.equals(contentClass);
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
		result.append(" (captcha: ");
		result.append(captcha);
		result.append(", allowRememberMe: ");
		result.append(allowRememberMe);
		result.append(", allowSelfRegistration: ");
		result.append(allowSelfRegistration);
		result.append(", useEmailActivation: ");
		result.append(useEmailActivation);
		result.append(", sendWelcomeEmail: ");
		result.append(sendWelcomeEmail);
		result.append(", sectionClass: ");
		result.append(sectionClass);
		result.append(", captionClass: ");
		result.append(captionClass);
		result.append(", contentClass: ");
		result.append(contentClass);
		result.append(')');
		return result.toString();
	}

} //LocalAuthenticationSystemImpl
