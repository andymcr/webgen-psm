/**
 */
package work.andycarpenter.metamodel.security.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import work.andycarpenter.metamodel.base.BasePackage;

import work.andycarpenter.metamodel.expression.ExpressionPackage;

import work.andycarpenter.metamodel.orm.OrmPackage;

import work.andycarpenter.metamodel.security.Authentication;
import work.andycarpenter.metamodel.security.AuthenticationElement;
import work.andycarpenter.metamodel.security.AuthenticationKeyTypes;
import work.andycarpenter.metamodel.security.CasAuthentication;
import work.andycarpenter.metamodel.security.ForgottenPasswordElement;
import work.andycarpenter.metamodel.security.LocalAuthenticationSystem;
import work.andycarpenter.metamodel.security.LoginElement;
import work.andycarpenter.metamodel.security.LogoutElement;
import work.andycarpenter.metamodel.security.RegistrationElement;
import work.andycarpenter.metamodel.security.ResetPasswordElement;
import work.andycarpenter.metamodel.security.SecurityFactory;
import work.andycarpenter.metamodel.security.SecurityModel;
import work.andycarpenter.metamodel.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityPackageImpl extends EPackageImpl implements SecurityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localAuthenticationSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registrationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logoutElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forgottenPasswordElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetPasswordElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casAuthenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authenticationKeyTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecurityPackageImpl() {
		super(eNS_URI, SecurityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SecurityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecurityPackage init() {
		if (isInited) return (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSecurityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SecurityPackageImpl theSecurityPackage = registeredSecurityPackage instanceof SecurityPackageImpl ? (SecurityPackageImpl)registeredSecurityPackage : new SecurityPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		OrmPackage.eINSTANCE.eClass();
		BasePackage.eINSTANCE.eClass();
		ExpressionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSecurityPackage.createPackageContents();

		// Initialize created meta-data
		theSecurityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecurityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecurityPackage.eNS_URI, theSecurityPackage);
		return theSecurityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityModel() {
		return securityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityModel_Authentication() {
		return (EReference)securityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityModel_IsAuthenticated() {
		return (EAttribute)securityModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthentication() {
		return authenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthentication_UserModel() {
		return (EReference)authenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthentication_UserKey() {
		return (EReference)authenticationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalAuthenticationSystem() {
		return localAuthenticationSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_AuthenticationModel() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_IdentifierFeture() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_PasswordFeature() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_AuthenticationKey() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_ResetPasswordRequestModel() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_RegistrationElement() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_HasRegistrationElement() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_LoginElement() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_LogoutElement() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_ForgottenPasswordElement() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_ResetPasswordElement() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_Captcha() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_AllowRememberMe() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_AllowSelfRegistration() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_UseEmailActivation() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_SendWelcomeEmail() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_SectionClass() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_CaptionClass() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_ContentClass() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticationElement() {
		return authenticationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_ConfirmLabel() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_UriElement() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_SectionClassOverride() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_SectionClass() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_HasSectionClass() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_CaptionClassOverride() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_CaptionClass() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_HasCaptionClass() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_ContentClassOverride() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_ContentClass() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_HasContentClass() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistrationElement() {
		return registrationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegistrationElement_Authentication() {
		return (EReference)registrationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoginElement() {
		return loginElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoginElement_Authentication() {
		return (EReference)loginElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogoutElement() {
		return logoutElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogoutElement_Authentication() {
		return (EReference)logoutElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForgottenPasswordElement() {
		return forgottenPasswordElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForgottenPasswordElement_Authentication() {
		return (EReference)forgottenPasswordElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_UriEmailSent() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_EmailSubject() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_EmailMessage() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_EmailSentCaption() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_EmailSentMessage() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResetPasswordElement() {
		return resetPasswordElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResetPasswordElement_Authentication() {
		return (EReference)resetPasswordElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCasAuthentication() {
		return casAuthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCasAuthentication_LoginLabel() {
		return (EAttribute)casAuthenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCasAuthentication_LogoutLabel() {
		return (EAttribute)casAuthenticationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuthenticationKeyTypes() {
		return authenticationKeyTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityFactory getSecurityFactory() {
		return (SecurityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		securityModelEClass = createEClass(SECURITY_MODEL);
		createEReference(securityModelEClass, SECURITY_MODEL__AUTHENTICATION);
		createEAttribute(securityModelEClass, SECURITY_MODEL__IS_AUTHENTICATED);

		authenticationEClass = createEClass(AUTHENTICATION);
		createEReference(authenticationEClass, AUTHENTICATION__USER_MODEL);
		createEReference(authenticationEClass, AUTHENTICATION__USER_KEY);

		localAuthenticationSystemEClass = createEClass(LOCAL_AUTHENTICATION_SYSTEM);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__IDENTIFIER_FETURE);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__PASSWORD_FEATURE);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__HAS_REGISTRATION_ELEMENT);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ELEMENT);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_ELEMENT);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_ELEMENT);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__SECTION_CLASS);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__CAPTION_CLASS);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__CONTENT_CLASS);

		authenticationElementEClass = createEClass(AUTHENTICATION_ELEMENT);
		createEAttribute(authenticationElementEClass, AUTHENTICATION_ELEMENT__CONFIRM_LABEL);
		createEAttribute(authenticationElementEClass, AUTHENTICATION_ELEMENT__URI_ELEMENT);
		createEAttribute(authenticationElementEClass, AUTHENTICATION_ELEMENT__SECTION_CLASS_OVERRIDE);
		createEAttribute(authenticationElementEClass, AUTHENTICATION_ELEMENT__SECTION_CLASS);
		createEAttribute(authenticationElementEClass, AUTHENTICATION_ELEMENT__HAS_SECTION_CLASS);
		createEAttribute(authenticationElementEClass, AUTHENTICATION_ELEMENT__CAPTION_CLASS_OVERRIDE);
		createEAttribute(authenticationElementEClass, AUTHENTICATION_ELEMENT__CAPTION_CLASS);
		createEAttribute(authenticationElementEClass, AUTHENTICATION_ELEMENT__HAS_CAPTION_CLASS);
		createEAttribute(authenticationElementEClass, AUTHENTICATION_ELEMENT__CONTENT_CLASS_OVERRIDE);
		createEAttribute(authenticationElementEClass, AUTHENTICATION_ELEMENT__CONTENT_CLASS);
		createEAttribute(authenticationElementEClass, AUTHENTICATION_ELEMENT__HAS_CONTENT_CLASS);

		registrationElementEClass = createEClass(REGISTRATION_ELEMENT);
		createEReference(registrationElementEClass, REGISTRATION_ELEMENT__AUTHENTICATION);

		loginElementEClass = createEClass(LOGIN_ELEMENT);
		createEReference(loginElementEClass, LOGIN_ELEMENT__AUTHENTICATION);

		logoutElementEClass = createEClass(LOGOUT_ELEMENT);
		createEReference(logoutElementEClass, LOGOUT_ELEMENT__AUTHENTICATION);

		forgottenPasswordElementEClass = createEClass(FORGOTTEN_PASSWORD_ELEMENT);
		createEReference(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SUBJECT);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__EMAIL_MESSAGE);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_CAPTION);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_MESSAGE);

		resetPasswordElementEClass = createEClass(RESET_PASSWORD_ELEMENT);
		createEReference(resetPasswordElementEClass, RESET_PASSWORD_ELEMENT__AUTHENTICATION);

		casAuthenticationEClass = createEClass(CAS_AUTHENTICATION);
		createEAttribute(casAuthenticationEClass, CAS_AUTHENTICATION__LOGIN_LABEL);
		createEAttribute(casAuthenticationEClass, CAS_AUTHENTICATION__LOGOUT_LABEL);

		// Create enums
		authenticationKeyTypesEEnum = createEEnum(AUTHENTICATION_KEY_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		OrmPackage theOrmPackage = (OrmPackage)EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI);
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		localAuthenticationSystemEClass.getESuperTypes().add(this.getAuthentication());
		authenticationElementEClass.getESuperTypes().add(theBasePackage.getNamedDisplayElement());
		registrationElementEClass.getESuperTypes().add(this.getAuthenticationElement());
		loginElementEClass.getESuperTypes().add(this.getAuthenticationElement());
		logoutElementEClass.getESuperTypes().add(this.getAuthenticationElement());
		forgottenPasswordElementEClass.getESuperTypes().add(this.getAuthenticationElement());
		resetPasswordElementEClass.getESuperTypes().add(this.getAuthenticationElement());
		casAuthenticationEClass.getESuperTypes().add(this.getAuthentication());

		// Initialize classes, features, and operations; add parameters
		initEClass(securityModelEClass, SecurityModel.class, "SecurityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityModel_Authentication(), this.getAuthentication(), null, "authentication", null, 1, 1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityModel_IsAuthenticated(), theEcorePackage.getEBoolean(), "isAuthenticated", null, 0, 1, SecurityModel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(authenticationEClass, Authentication.class, "Authentication", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthentication_UserModel(), theOrmPackage.getEntity(), null, "userModel", null, 1, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthentication_UserKey(), theOrmPackage.getAttribute(), null, "userKey", null, 1, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localAuthenticationSystemEClass, LocalAuthenticationSystem.class, "LocalAuthenticationSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalAuthenticationSystem_AuthenticationModel(), theOrmPackage.getEntity(), null, "authenticationModel", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_IdentifierFeture(), theOrmPackage.getAttribute(), null, "identifierFeture", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_PasswordFeature(), theOrmPackage.getAttribute(), null, "passwordFeature", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_AuthenticationKey(), this.getAuthenticationKeyTypes(), "authenticationKey", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_ResetPasswordRequestModel(), theOrmPackage.getEntity(), null, "resetPasswordRequestModel", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_RegistrationElement(), this.getRegistrationElement(), this.getRegistrationElement_Authentication(), "registrationElement", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_HasRegistrationElement(), theEcorePackage.getEBoolean(), "hasRegistrationElement", null, 0, 1, LocalAuthenticationSystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_LoginElement(), this.getLoginElement(), this.getLoginElement_Authentication(), "loginElement", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_LogoutElement(), this.getLogoutElement(), this.getLogoutElement_Authentication(), "logoutElement", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_ForgottenPasswordElement(), this.getForgottenPasswordElement(), this.getForgottenPasswordElement_Authentication(), "forgottenPasswordElement", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_ResetPasswordElement(), this.getResetPasswordElement(), this.getResetPasswordElement_Authentication(), "resetPasswordElement", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_Captcha(), theEcorePackage.getEBoolean(), "captcha", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_AllowRememberMe(), theEcorePackage.getEBoolean(), "allowRememberMe", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_AllowSelfRegistration(), theEcorePackage.getEBoolean(), "allowSelfRegistration", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_UseEmailActivation(), theEcorePackage.getEBoolean(), "useEmailActivation", "true", 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_SendWelcomeEmail(), theEcorePackage.getEBoolean(), "sendWelcomeEmail", "true", 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_SectionClass(), theEcorePackage.getEString(), "sectionClass", "", 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_CaptionClass(), theEcorePackage.getEString(), "captionClass", "", 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_ContentClass(), theEcorePackage.getEString(), "contentClass", "", 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationElementEClass, AuthenticationElement.class, "AuthenticationElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthenticationElement_ConfirmLabel(), theEcorePackage.getEString(), "confirmLabel", "", 1, 1, AuthenticationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationElement_UriElement(), theEcorePackage.getEString(), "uriElement", "", 0, 1, AuthenticationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationElement_SectionClassOverride(), theEcorePackage.getEString(), "sectionClassOverride", "", 0, 1, AuthenticationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationElement_SectionClass(), theEcorePackage.getEString(), "sectionClass", null, 0, 1, AuthenticationElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationElement_HasSectionClass(), theEcorePackage.getEBoolean(), "hasSectionClass", null, 0, 1, AuthenticationElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationElement_CaptionClassOverride(), theEcorePackage.getEString(), "captionClassOverride", "", 0, 1, AuthenticationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationElement_CaptionClass(), theEcorePackage.getEString(), "captionClass", null, 0, 1, AuthenticationElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationElement_HasCaptionClass(), theEcorePackage.getEBoolean(), "hasCaptionClass", null, 0, 1, AuthenticationElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationElement_ContentClassOverride(), theEcorePackage.getEString(), "contentClassOverride", "", 0, 1, AuthenticationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationElement_ContentClass(), theEcorePackage.getEString(), "contentClass", null, 0, 1, AuthenticationElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationElement_HasContentClass(), theEcorePackage.getEBoolean(), "hasContentClass", null, 0, 1, AuthenticationElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(registrationElementEClass, RegistrationElement.class, "RegistrationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegistrationElement_Authentication(), this.getLocalAuthenticationSystem(), this.getLocalAuthenticationSystem_RegistrationElement(), "authentication", null, 1, 1, RegistrationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loginElementEClass, LoginElement.class, "LoginElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoginElement_Authentication(), this.getLocalAuthenticationSystem(), this.getLocalAuthenticationSystem_LoginElement(), "authentication", null, 1, 1, LoginElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logoutElementEClass, LogoutElement.class, "LogoutElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogoutElement_Authentication(), this.getLocalAuthenticationSystem(), this.getLocalAuthenticationSystem_LogoutElement(), "authentication", null, 1, 1, LogoutElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forgottenPasswordElementEClass, ForgottenPasswordElement.class, "ForgottenPasswordElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForgottenPasswordElement_Authentication(), this.getLocalAuthenticationSystem(), this.getLocalAuthenticationSystem_ForgottenPasswordElement(), "authentication", null, 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_UriEmailSent(), theEcorePackage.getEString(), "uriEmailSent", null, 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_EmailSubject(), theEcorePackage.getEString(), "emailSubject", null, 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_EmailMessage(), theEcorePackage.getEString(), "emailMessage", null, 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_EmailSentCaption(), theEcorePackage.getEString(), "emailSentCaption", null, 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_EmailSentMessage(), theEcorePackage.getEString(), "emailSentMessage", null, 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetPasswordElementEClass, ResetPasswordElement.class, "ResetPasswordElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResetPasswordElement_Authentication(), this.getLocalAuthenticationSystem(), this.getLocalAuthenticationSystem_ResetPasswordElement(), "authentication", null, 1, 1, ResetPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(casAuthenticationEClass, CasAuthentication.class, "CasAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCasAuthentication_LoginLabel(), theEcorePackage.getEString(), "loginLabel", null, 1, 1, CasAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCasAuthentication_LogoutLabel(), theEcorePackage.getEString(), "logoutLabel", null, 0, 1, CasAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(authenticationKeyTypesEEnum, AuthenticationKeyTypes.class, "AuthenticationKeyTypes");
		addEEnumLiteral(authenticationKeyTypesEEnum, AuthenticationKeyTypes.ANY);
		addEEnumLiteral(authenticationKeyTypesEEnum, AuthenticationKeyTypes.EMAIL);
		addEEnumLiteral(authenticationKeyTypesEEnum, AuthenticationKeyTypes.USERNAME);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "OCL", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation
		  (getSecurityModel_IsAuthenticated(),
		   source,
		   new String[] {
			   "derivation", "not authentication.oclIsUndefined()"
		   });
		addAnnotation
		  (getLocalAuthenticationSystem_HasRegistrationElement(),
		   source,
		   new String[] {
			   "derivation", "not registrationElement.oclIsUndefined()"
		   });
		addAnnotation
		  (getAuthenticationElement_SectionClass(),
		   source,
		   new String[] {
			   "derivation", "if sectionClassOverride.trim() <> \'\' then\n\t\t\tsectionClassOverride.trim()\n\t\telse if self.oclAsType(ecore::EObject).eContainer().sectionClass.trim() <> \'\' then\n\t\t\tself.eContainer().sectionClass.trim()\n\t\telse\n\t\t\t\'\'\n\t\tendif endif"
		   });
		addAnnotation
		  (getAuthenticationElement_HasSectionClass(),
		   source,
		   new String[] {
			   "derivation", "sectionClass <> \'\'"
		   });
		addAnnotation
		  (getAuthenticationElement_CaptionClass(),
		   source,
		   new String[] {
			   "derivation", "if captionClassOverride.trim() <> \'\' then\n\t\t\tcaptionClassOverride.trim()\n\t\telse if self.oclAsType(ecore::EObject).eContainer().captionClass.trim() <> \'\' then\n\t\t\tself.eContainer().captionClass.trim()\n\t\telse\n\t\t\t\'\'\n\t\tendif endif"
		   });
		addAnnotation
		  (getAuthenticationElement_HasCaptionClass(),
		   source,
		   new String[] {
			   "derivation", "captionClass <> \'\'"
		   });
		addAnnotation
		  (getAuthenticationElement_ContentClass(),
		   source,
		   new String[] {
			   "derivation", "if contentClassOverride.trim() <> \'\' then\n\t\t\tcontentClassOverride.trim()\n\t\telse if self.oclAsType(ecore::EObject).eContainer().contentClass.trim() <> \'\' then\n\t\t\tself.eContainer().contentClass.trim()\n\t\telse\n\t\t\t\'\'\n\t\tendif endif"
		   });
		addAnnotation
		  (getAuthenticationElement_HasContentClass(),
		   source,
		   new String[] {
			   "derivation", "contentClass <> \'\'"
		   });
	}

} //SecurityPackageImpl
