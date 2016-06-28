/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.orm.EntityOrView;

import uk.ac.man.cs.mdsd.waf.AuthenticationKeyTypes;
import uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit;
import uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem;
import uk.ac.man.cs.mdsd.waf.LoginUnit;
import uk.ac.man.cs.mdsd.waf.RegistrationUnit;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Authentication System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.LocalAuthenticationSystemImpl#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.LocalAuthenticationSystemImpl#getAuthenticationKey <em>Authentication Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.LocalAuthenticationSystemImpl#getLoginAttempt <em>Login Attempt</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.LocalAuthenticationSystemImpl#getAutoLogin <em>Auto Login</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.LocalAuthenticationSystemImpl#isUseCaptcha <em>Use Captcha</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.LocalAuthenticationSystemImpl#isAllowSelfRegistration <em>Allow Self Registration</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.LocalAuthenticationSystemImpl#isUseEmailActivation <em>Use Email Activation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.LocalAuthenticationSystemImpl#isSendWelcomeEmail <em>Send Welcome Email</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.LocalAuthenticationSystemImpl#getRegistrationUnit <em>Registration Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.LocalAuthenticationSystemImpl#getLoginUnit <em>Login Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.LocalAuthenticationSystemImpl#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalAuthenticationSystemImpl extends AuthenticationImpl implements LocalAuthenticationSystem {
	/**
	 * The cached value of the '{@link #getAuthentication() <em>Authentication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthentication()
	 * @generated
	 * @ordered
	 */
	protected EntityOrView authentication;

	/**
	 * The default value of the '{@link #getAuthenticationKey() <em>Authentication Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationKey()
	 * @generated
	 * @ordered
	 */
	protected static final AuthenticationKeyTypes AUTHENTICATION_KEY_EDEFAULT = AuthenticationKeyTypes.EMAIL;

	/**
	 * The cached value of the '{@link #getAuthenticationKey() <em>Authentication Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationKey()
	 * @generated
	 * @ordered
	 */
	protected AuthenticationKeyTypes authenticationKey = AUTHENTICATION_KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoginAttempt() <em>Login Attempt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginAttempt()
	 * @generated
	 * @ordered
	 */
	protected EntityOrView loginAttempt;

	/**
	 * The cached value of the '{@link #getAutoLogin() <em>Auto Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoLogin()
	 * @generated
	 * @ordered
	 */
	protected EntityOrView autoLogin;

	/**
	 * The default value of the '{@link #isUseCaptcha() <em>Use Captcha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCaptcha()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_CAPTCHA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseCaptcha() <em>Use Captcha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCaptcha()
	 * @generated
	 * @ordered
	 */
	protected boolean useCaptcha = USE_CAPTCHA_EDEFAULT;

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
	 * The cached value of the '{@link #getRegistrationUnit() <em>Registration Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationUnit()
	 * @generated
	 * @ordered
	 */
	protected RegistrationUnit registrationUnit;

	/**
	 * The cached value of the '{@link #getLoginUnit() <em>Login Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginUnit()
	 * @generated
	 * @ordered
	 */
	protected LoginUnit loginUnit;

	/**
	 * The cached value of the '{@link #getForgottenPasswordUnit() <em>Forgotten Password Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 * @ordered
	 */
	protected ForgottenPasswordUnit forgottenPasswordUnit;

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
		return WafPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getAuthentication() {
		if (authentication != null && authentication.eIsProxy()) {
			InternalEObject oldAuthentication = (InternalEObject)authentication;
			authentication = (EntityOrView)eResolveProxy(oldAuthentication);
			if (authentication != oldAuthentication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION, oldAuthentication, authentication));
			}
		}
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetAuthentication() {
		return authentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthentication(EntityOrView newAuthentication) {
		EntityOrView oldAuthentication = authentication;
		authentication = newAuthentication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION, oldAuthentication, authentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationKeyTypes getAuthenticationKey() {
		return authenticationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticationKey(AuthenticationKeyTypes newAuthenticationKey) {
		AuthenticationKeyTypes oldAuthenticationKey = authenticationKey;
		authenticationKey = newAuthenticationKey == null ? AUTHENTICATION_KEY_EDEFAULT : newAuthenticationKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY, oldAuthenticationKey, authenticationKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getLoginAttempt() {
		if (loginAttempt != null && loginAttempt.eIsProxy()) {
			InternalEObject oldLoginAttempt = (InternalEObject)loginAttempt;
			loginAttempt = (EntityOrView)eResolveProxy(oldLoginAttempt);
			if (loginAttempt != oldLoginAttempt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT, oldLoginAttempt, loginAttempt));
			}
		}
		return loginAttempt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetLoginAttempt() {
		return loginAttempt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginAttempt(EntityOrView newLoginAttempt) {
		EntityOrView oldLoginAttempt = loginAttempt;
		loginAttempt = newLoginAttempt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT, oldLoginAttempt, loginAttempt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView getAutoLogin() {
		if (autoLogin != null && autoLogin.eIsProxy()) {
			InternalEObject oldAutoLogin = (InternalEObject)autoLogin;
			autoLogin = (EntityOrView)eResolveProxy(oldAutoLogin);
			if (autoLogin != oldAutoLogin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN, oldAutoLogin, autoLogin));
			}
		}
		return autoLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOrView basicGetAutoLogin() {
		return autoLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoLogin(EntityOrView newAutoLogin) {
		EntityOrView oldAutoLogin = autoLogin;
		autoLogin = newAutoLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN, oldAutoLogin, autoLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseCaptcha() {
		return useCaptcha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCaptcha(boolean newUseCaptcha) {
		boolean oldUseCaptcha = useCaptcha;
		useCaptcha = newUseCaptcha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA, oldUseCaptcha, useCaptcha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowSelfRegistration() {
		return allowSelfRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowSelfRegistration(boolean newAllowSelfRegistration) {
		boolean oldAllowSelfRegistration = allowSelfRegistration;
		allowSelfRegistration = newAllowSelfRegistration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION, oldAllowSelfRegistration, allowSelfRegistration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseEmailActivation() {
		return useEmailActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseEmailActivation(boolean newUseEmailActivation) {
		boolean oldUseEmailActivation = useEmailActivation;
		useEmailActivation = newUseEmailActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION, oldUseEmailActivation, useEmailActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSendWelcomeEmail() {
		return sendWelcomeEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendWelcomeEmail(boolean newSendWelcomeEmail) {
		boolean oldSendWelcomeEmail = sendWelcomeEmail;
		sendWelcomeEmail = newSendWelcomeEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL, oldSendWelcomeEmail, sendWelcomeEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationUnit getRegistrationUnit() {
		if (registrationUnit != null && registrationUnit.eIsProxy()) {
			InternalEObject oldRegistrationUnit = (InternalEObject)registrationUnit;
			registrationUnit = (RegistrationUnit)eResolveProxy(oldRegistrationUnit);
			if (registrationUnit != oldRegistrationUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT, oldRegistrationUnit, registrationUnit));
			}
		}
		return registrationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegistrationUnit basicGetRegistrationUnit() {
		return registrationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistrationUnit(RegistrationUnit newRegistrationUnit, NotificationChain msgs) {
		RegistrationUnit oldRegistrationUnit = registrationUnit;
		registrationUnit = newRegistrationUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT, oldRegistrationUnit, newRegistrationUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistrationUnit(RegistrationUnit newRegistrationUnit) {
		if (newRegistrationUnit != registrationUnit) {
			NotificationChain msgs = null;
			if (registrationUnit != null)
				msgs = ((InternalEObject)registrationUnit).eInverseRemove(this, WafPackage.REGISTRATION_UNIT__AUTHENTICATION_SYSTEM, RegistrationUnit.class, msgs);
			if (newRegistrationUnit != null)
				msgs = ((InternalEObject)newRegistrationUnit).eInverseAdd(this, WafPackage.REGISTRATION_UNIT__AUTHENTICATION_SYSTEM, RegistrationUnit.class, msgs);
			msgs = basicSetRegistrationUnit(newRegistrationUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT, newRegistrationUnit, newRegistrationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginUnit getLoginUnit() {
		if (loginUnit != null && loginUnit.eIsProxy()) {
			InternalEObject oldLoginUnit = (InternalEObject)loginUnit;
			loginUnit = (LoginUnit)eResolveProxy(oldLoginUnit);
			if (loginUnit != oldLoginUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT, oldLoginUnit, loginUnit));
			}
		}
		return loginUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginUnit basicGetLoginUnit() {
		return loginUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoginUnit(LoginUnit newLoginUnit, NotificationChain msgs) {
		LoginUnit oldLoginUnit = loginUnit;
		loginUnit = newLoginUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT, oldLoginUnit, newLoginUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginUnit(LoginUnit newLoginUnit) {
		if (newLoginUnit != loginUnit) {
			NotificationChain msgs = null;
			if (loginUnit != null)
				msgs = ((InternalEObject)loginUnit).eInverseRemove(this, WafPackage.LOGIN_UNIT__AUTHENTICATION_SYSTEM, LoginUnit.class, msgs);
			if (newLoginUnit != null)
				msgs = ((InternalEObject)newLoginUnit).eInverseAdd(this, WafPackage.LOGIN_UNIT__AUTHENTICATION_SYSTEM, LoginUnit.class, msgs);
			msgs = basicSetLoginUnit(newLoginUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT, newLoginUnit, newLoginUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForgottenPasswordUnit getForgottenPasswordUnit() {
		if (forgottenPasswordUnit != null && forgottenPasswordUnit.eIsProxy()) {
			InternalEObject oldForgottenPasswordUnit = (InternalEObject)forgottenPasswordUnit;
			forgottenPasswordUnit = (ForgottenPasswordUnit)eResolveProxy(oldForgottenPasswordUnit);
			if (forgottenPasswordUnit != oldForgottenPasswordUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT, oldForgottenPasswordUnit, forgottenPasswordUnit));
			}
		}
		return forgottenPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForgottenPasswordUnit basicGetForgottenPasswordUnit() {
		return forgottenPasswordUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForgottenPasswordUnit(ForgottenPasswordUnit newForgottenPasswordUnit, NotificationChain msgs) {
		ForgottenPasswordUnit oldForgottenPasswordUnit = forgottenPasswordUnit;
		forgottenPasswordUnit = newForgottenPasswordUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT, oldForgottenPasswordUnit, newForgottenPasswordUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForgottenPasswordUnit(ForgottenPasswordUnit newForgottenPasswordUnit) {
		if (newForgottenPasswordUnit != forgottenPasswordUnit) {
			NotificationChain msgs = null;
			if (forgottenPasswordUnit != null)
				msgs = ((InternalEObject)forgottenPasswordUnit).eInverseRemove(this, WafPackage.FORGOTTEN_PASSWORD_UNIT__AUTHENTICATION_SYSTEM, ForgottenPasswordUnit.class, msgs);
			if (newForgottenPasswordUnit != null)
				msgs = ((InternalEObject)newForgottenPasswordUnit).eInverseAdd(this, WafPackage.FORGOTTEN_PASSWORD_UNIT__AUTHENTICATION_SYSTEM, ForgottenPasswordUnit.class, msgs);
			msgs = basicSetForgottenPasswordUnit(newForgottenPasswordUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT, newForgottenPasswordUnit, newForgottenPasswordUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				if (registrationUnit != null)
					msgs = ((InternalEObject)registrationUnit).eInverseRemove(this, WafPackage.REGISTRATION_UNIT__AUTHENTICATION_SYSTEM, RegistrationUnit.class, msgs);
				return basicSetRegistrationUnit((RegistrationUnit)otherEnd, msgs);
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				if (loginUnit != null)
					msgs = ((InternalEObject)loginUnit).eInverseRemove(this, WafPackage.LOGIN_UNIT__AUTHENTICATION_SYSTEM, LoginUnit.class, msgs);
				return basicSetLoginUnit((LoginUnit)otherEnd, msgs);
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				if (forgottenPasswordUnit != null)
					msgs = ((InternalEObject)forgottenPasswordUnit).eInverseRemove(this, WafPackage.FORGOTTEN_PASSWORD_UNIT__AUTHENTICATION_SYSTEM, ForgottenPasswordUnit.class, msgs);
				return basicSetForgottenPasswordUnit((ForgottenPasswordUnit)otherEnd, msgs);
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
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				return basicSetRegistrationUnit(null, msgs);
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				return basicSetLoginUnit(null, msgs);
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				return basicSetForgottenPasswordUnit(null, msgs);
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
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION:
				if (resolve) return getAuthentication();
				return basicGetAuthentication();
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				return getAuthenticationKey();
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT:
				if (resolve) return getLoginAttempt();
				return basicGetLoginAttempt();
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN:
				if (resolve) return getAutoLogin();
				return basicGetAutoLogin();
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
				return isUseCaptcha();
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				return isAllowSelfRegistration();
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				return isUseEmailActivation();
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				return isSendWelcomeEmail();
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				if (resolve) return getRegistrationUnit();
				return basicGetRegistrationUnit();
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				if (resolve) return getLoginUnit();
				return basicGetLoginUnit();
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				if (resolve) return getForgottenPasswordUnit();
				return basicGetForgottenPasswordUnit();
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
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION:
				setAuthentication((EntityOrView)newValue);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				setAuthenticationKey((AuthenticationKeyTypes)newValue);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT:
				setLoginAttempt((EntityOrView)newValue);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN:
				setAutoLogin((EntityOrView)newValue);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
				setUseCaptcha((Boolean)newValue);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				setAllowSelfRegistration((Boolean)newValue);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				setUseEmailActivation((Boolean)newValue);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				setSendWelcomeEmail((Boolean)newValue);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				setRegistrationUnit((RegistrationUnit)newValue);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				setLoginUnit((LoginUnit)newValue);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				setForgottenPasswordUnit((ForgottenPasswordUnit)newValue);
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
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION:
				setAuthentication((EntityOrView)null);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				setAuthenticationKey(AUTHENTICATION_KEY_EDEFAULT);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT:
				setLoginAttempt((EntityOrView)null);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN:
				setAutoLogin((EntityOrView)null);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
				setUseCaptcha(USE_CAPTCHA_EDEFAULT);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				setAllowSelfRegistration(ALLOW_SELF_REGISTRATION_EDEFAULT);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				setUseEmailActivation(USE_EMAIL_ACTIVATION_EDEFAULT);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				setSendWelcomeEmail(SEND_WELCOME_EMAIL_EDEFAULT);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				setRegistrationUnit((RegistrationUnit)null);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				setLoginUnit((LoginUnit)null);
				return;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				setForgottenPasswordUnit((ForgottenPasswordUnit)null);
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
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION:
				return authentication != null;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
				return authenticationKey != AUTHENTICATION_KEY_EDEFAULT;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ATTEMPT:
				return loginAttempt != null;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTO_LOGIN:
				return autoLogin != null;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA:
				return useCaptcha != USE_CAPTCHA_EDEFAULT;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
				return allowSelfRegistration != ALLOW_SELF_REGISTRATION_EDEFAULT;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
				return useEmailActivation != USE_EMAIL_ACTIVATION_EDEFAULT;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
				return sendWelcomeEmail != SEND_WELCOME_EMAIL_EDEFAULT;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT:
				return registrationUnit != null;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT:
				return loginUnit != null;
			case WafPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT:
				return forgottenPasswordUnit != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (authenticationKey: ");
		result.append(authenticationKey);
		result.append(", useCaptcha: ");
		result.append(useCaptcha);
		result.append(", allowSelfRegistration: ");
		result.append(allowSelfRegistration);
		result.append(", useEmailActivation: ");
		result.append(useEmailActivation);
		result.append(", sendWelcomeEmail: ");
		result.append(sendWelcomeEmail);
		result.append(')');
		return result.toString();
	}

} //LocalAuthenticationSystemImpl
