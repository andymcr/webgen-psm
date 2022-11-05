/**
 */
package work.andycarpenter.metamodel.security.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import work.andycarpenter.metamodel.base.BasePackage;

import work.andycarpenter.metamodel.expression.ExpressionPackage;

import work.andycarpenter.metamodel.orm.OrmPackage;

import work.andycarpenter.metamodel.security.Authentication;
import work.andycarpenter.metamodel.security.AuthenticationElement;
import work.andycarpenter.metamodel.security.CasAuthentication;
import work.andycarpenter.metamodel.security.ChangePasswordElement;
import work.andycarpenter.metamodel.security.ForgottenPasswordElement;
import work.andycarpenter.metamodel.security.LocalAuthenticationSystem;
import work.andycarpenter.metamodel.security.LoginElement;
import work.andycarpenter.metamodel.security.LogoutElement;
import work.andycarpenter.metamodel.security.RegistrationElement;
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
	private EClass changePasswordElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casAuthenticationEClass = null;

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
	public EReference getLocalAuthenticationSystem_UserKey() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_AuthenticationKey() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_IdentifierFeature() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_PasswordFeature() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_ResetPasswordRequestModel() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_RegistrationElement() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_HasRegistrationElement() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_LoginElement() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_LogoutElement() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_ForgottenPasswordElement() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_ChangePasswordElement() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_Captcha() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_AllowRememberMe() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_AllowSelfRegistration() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_UseEmailActivation() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_SendWelcomeEmail() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_SectionClass() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_CaptionClass() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_ContentClass() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(19);
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
	public EAttribute getAuthenticationElement_SectionClassOverride() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_SectionClass() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_HasSectionClass() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_CaptionClassOverride() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_CaptionClass() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_HasCaptionClass() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_ContentClassOverride() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_ContentClass() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationElement_HasContentClass() {
		return (EAttribute)authenticationElementEClass.getEStructuralFeatures().get(8);
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
	public EAttribute getRegistrationElement_InvokeLabel() {
		return (EAttribute)registrationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationElement_ConfirmLabel() {
		return (EAttribute)registrationElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationElement_UriElement() {
		return (EAttribute)registrationElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationElement_UriEmailVerification() {
		return (EAttribute)registrationElementEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getLoginElement_InvokeLabel() {
		return (EAttribute)loginElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoginElement_ConfirmLabel() {
		return (EAttribute)loginElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoginElement_UriElement() {
		return (EAttribute)loginElementEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getLogoutElement_InvokeLabel() {
		return (EAttribute)logoutElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogoutElement_ConfirmLabel() {
		return (EAttribute)logoutElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogoutElement_UriElement() {
		return (EAttribute)logoutElementEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getForgottenPasswordElement_InvokeLabel() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_RequestLabel() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_ResetLabel() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_UriElement() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_UriEmailSent() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_UriResetPassword() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_EmailHelp() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_PasswordLabel() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_PasswordPlaceholder() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_PasswordTitle() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_PasswordConfirmationLabel() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_PasswordConfirmationPlaceholder() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_PasswordConfirmationTitle() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_PasswordMessageRequired() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_PasswordMessageValueMismatch() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_EmailCheckSubject() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_EmailCheckMessage() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_EmailCheckSentCaption() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordElement_EmailCheckSentMessage() {
		return (EAttribute)forgottenPasswordElementEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangePasswordElement() {
		return changePasswordElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangePasswordElement_Authentication() {
		return (EReference)changePasswordElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangePasswordElement_InvokeLabel() {
		return (EAttribute)changePasswordElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangePasswordElement_ConfirmLabel() {
		return (EAttribute)changePasswordElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangePasswordElement_UriElement() {
		return (EAttribute)changePasswordElementEClass.getEStructuralFeatures().get(3);
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

		localAuthenticationSystemEClass = createEClass(LOCAL_AUTHENTICATION_SYSTEM);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__USER_KEY);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__IDENTIFIER_FEATURE);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__PASSWORD_FEATURE);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__HAS_REGISTRATION_ELEMENT);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ELEMENT);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_ELEMENT);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__CHANGE_PASSWORD_ELEMENT);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__SECTION_CLASS);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__CAPTION_CLASS);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__CONTENT_CLASS);

		authenticationElementEClass = createEClass(AUTHENTICATION_ELEMENT);
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
		createEAttribute(registrationElementEClass, REGISTRATION_ELEMENT__INVOKE_LABEL);
		createEAttribute(registrationElementEClass, REGISTRATION_ELEMENT__CONFIRM_LABEL);
		createEAttribute(registrationElementEClass, REGISTRATION_ELEMENT__URI_ELEMENT);
		createEAttribute(registrationElementEClass, REGISTRATION_ELEMENT__URI_EMAIL_VERIFICATION);

		loginElementEClass = createEClass(LOGIN_ELEMENT);
		createEReference(loginElementEClass, LOGIN_ELEMENT__AUTHENTICATION);
		createEAttribute(loginElementEClass, LOGIN_ELEMENT__INVOKE_LABEL);
		createEAttribute(loginElementEClass, LOGIN_ELEMENT__CONFIRM_LABEL);
		createEAttribute(loginElementEClass, LOGIN_ELEMENT__URI_ELEMENT);

		logoutElementEClass = createEClass(LOGOUT_ELEMENT);
		createEReference(logoutElementEClass, LOGOUT_ELEMENT__AUTHENTICATION);
		createEAttribute(logoutElementEClass, LOGOUT_ELEMENT__INVOKE_LABEL);
		createEAttribute(logoutElementEClass, LOGOUT_ELEMENT__CONFIRM_LABEL);
		createEAttribute(logoutElementEClass, LOGOUT_ELEMENT__URI_ELEMENT);

		forgottenPasswordElementEClass = createEClass(FORGOTTEN_PASSWORD_ELEMENT);
		createEReference(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__INVOKE_LABEL);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__REQUEST_LABEL);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__RESET_LABEL);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__URI_ELEMENT);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__URI_RESET_PASSWORD);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__EMAIL_HELP);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_LABEL);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_PLACEHOLDER);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_TITLE);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_LABEL);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_PLACEHOLDER);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_TITLE);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_REQUIRED);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_VALUE_MISMATCH);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SUBJECT);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_MESSAGE);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_CAPTION);
		createEAttribute(forgottenPasswordElementEClass, FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_MESSAGE);

		changePasswordElementEClass = createEClass(CHANGE_PASSWORD_ELEMENT);
		createEReference(changePasswordElementEClass, CHANGE_PASSWORD_ELEMENT__AUTHENTICATION);
		createEAttribute(changePasswordElementEClass, CHANGE_PASSWORD_ELEMENT__INVOKE_LABEL);
		createEAttribute(changePasswordElementEClass, CHANGE_PASSWORD_ELEMENT__CONFIRM_LABEL);
		createEAttribute(changePasswordElementEClass, CHANGE_PASSWORD_ELEMENT__URI_ELEMENT);

		casAuthenticationEClass = createEClass(CAS_AUTHENTICATION);
		createEAttribute(casAuthenticationEClass, CAS_AUTHENTICATION__LOGIN_LABEL);
		createEAttribute(casAuthenticationEClass, CAS_AUTHENTICATION__LOGOUT_LABEL);
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
		changePasswordElementEClass.getESuperTypes().add(this.getAuthenticationElement());
		casAuthenticationEClass.getESuperTypes().add(this.getAuthentication());

		// Initialize classes, features, and operations; add parameters
		initEClass(securityModelEClass, SecurityModel.class, "SecurityModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityModel_Authentication(), this.getAuthentication(), null, "authentication", null, 1, 1, SecurityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityModel_IsAuthenticated(), theEcorePackage.getEBoolean(), "isAuthenticated", null, 0, 1, SecurityModel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(authenticationEClass, Authentication.class, "Authentication", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthentication_UserModel(), theOrmPackage.getEntity(), null, "userModel", null, 1, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localAuthenticationSystemEClass, LocalAuthenticationSystem.class, "LocalAuthenticationSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalAuthenticationSystem_AuthenticationModel(), theOrmPackage.getEntity(), null, "authenticationModel", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_UserKey(), theOrmPackage.getAttribute(), null, "userKey", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_AuthenticationKey(), theOrmPackage.getAttribute(), null, "authenticationKey", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_IdentifierFeature(), theOrmPackage.getAttribute(), null, "identifierFeature", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_PasswordFeature(), theOrmPackage.getAttribute(), null, "passwordFeature", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_ResetPasswordRequestModel(), theOrmPackage.getEntity(), null, "resetPasswordRequestModel", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_RegistrationElement(), this.getRegistrationElement(), this.getRegistrationElement_Authentication(), "registrationElement", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_HasRegistrationElement(), theEcorePackage.getEBoolean(), "hasRegistrationElement", null, 0, 1, LocalAuthenticationSystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_LoginElement(), this.getLoginElement(), this.getLoginElement_Authentication(), "loginElement", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_LogoutElement(), this.getLogoutElement(), this.getLogoutElement_Authentication(), "logoutElement", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_ForgottenPasswordElement(), this.getForgottenPasswordElement(), this.getForgottenPasswordElement_Authentication(), "forgottenPasswordElement", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_ChangePasswordElement(), this.getChangePasswordElement(), this.getChangePasswordElement_Authentication(), "changePasswordElement", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_Captcha(), theEcorePackage.getEBoolean(), "captcha", "true", 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_AllowRememberMe(), theEcorePackage.getEBoolean(), "allowRememberMe", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_AllowSelfRegistration(), theEcorePackage.getEBoolean(), "allowSelfRegistration", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_UseEmailActivation(), theEcorePackage.getEBoolean(), "useEmailActivation", "true", 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_SendWelcomeEmail(), theEcorePackage.getEBoolean(), "sendWelcomeEmail", "true", 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_SectionClass(), theEcorePackage.getEString(), "sectionClass", "", 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_CaptionClass(), theEcorePackage.getEString(), "captionClass", "", 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_ContentClass(), theEcorePackage.getEString(), "contentClass", "", 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationElementEClass, AuthenticationElement.class, "AuthenticationElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		initEAttribute(getRegistrationElement_InvokeLabel(), theEcorePackage.getEString(), "invokeLabel", "", 1, 1, RegistrationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistrationElement_ConfirmLabel(), theEcorePackage.getEString(), "confirmLabel", "", 1, 1, RegistrationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistrationElement_UriElement(), theEcorePackage.getEString(), "uriElement", "register", 1, 1, RegistrationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegistrationElement_UriEmailVerification(), theEcorePackage.getEString(), "uriEmailVerification", "verify", 1, 1, RegistrationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loginElementEClass, LoginElement.class, "LoginElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoginElement_Authentication(), this.getLocalAuthenticationSystem(), this.getLocalAuthenticationSystem_LoginElement(), "authentication", null, 1, 1, LoginElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoginElement_InvokeLabel(), theEcorePackage.getEString(), "invokeLabel", "Login", 1, 1, LoginElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoginElement_ConfirmLabel(), theEcorePackage.getEString(), "confirmLabel", "Login", 1, 1, LoginElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoginElement_UriElement(), theEcorePackage.getEString(), "uriElement", "login", 1, 1, LoginElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logoutElementEClass, LogoutElement.class, "LogoutElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogoutElement_Authentication(), this.getLocalAuthenticationSystem(), this.getLocalAuthenticationSystem_LogoutElement(), "authentication", null, 1, 1, LogoutElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogoutElement_InvokeLabel(), theEcorePackage.getEString(), "invokeLabel", "Logout", 1, 1, LogoutElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogoutElement_ConfirmLabel(), theEcorePackage.getEString(), "confirmLabel", "", 1, 1, LogoutElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogoutElement_UriElement(), theEcorePackage.getEString(), "uriElement", "logout", 1, 1, LogoutElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forgottenPasswordElementEClass, ForgottenPasswordElement.class, "ForgottenPasswordElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForgottenPasswordElement_Authentication(), this.getLocalAuthenticationSystem(), this.getLocalAuthenticationSystem_ForgottenPasswordElement(), "authentication", null, 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_InvokeLabel(), theEcorePackage.getEString(), "invokeLabel", "Forgotten Password", 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_RequestLabel(), theEcorePackage.getEString(), "requestLabel", "Request Password Reset", 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_ResetLabel(), theEcorePackage.getEString(), "resetLabel", "Set Password", 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_UriElement(), theEcorePackage.getEString(), "uriElement", "forgotten-password", 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_UriEmailSent(), theEcorePackage.getEString(), "uriEmailSent", "check-email", 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_UriResetPassword(), theEcorePackage.getEString(), "uriResetPassword", "reset", 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_EmailHelp(), theEcorePackage.getEString(), "emailHelp", "Enter your email address and we we will send you a link to reset your password", 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_PasswordLabel(), theEcorePackage.getEString(), "passwordLabel", "New Password", 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_PasswordPlaceholder(), theEcorePackage.getEString(), "passwordPlaceholder", "New Password", 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_PasswordTitle(), theEcorePackage.getEString(), "passwordTitle", "New Password", 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_PasswordConfirmationLabel(), theEcorePackage.getEString(), "passwordConfirmationLabel", "Confirm Password", 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_PasswordConfirmationPlaceholder(), theEcorePackage.getEString(), "passwordConfirmationPlaceholder", "Confirm Password", 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_PasswordConfirmationTitle(), theEcorePackage.getEString(), "passwordConfirmationTitle", "Confirm Password", 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_PasswordMessageRequired(), theEcorePackage.getEString(), "passwordMessageRequired", "A password value is required", 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_PasswordMessageValueMismatch(), theEcorePackage.getEString(), "passwordMessageValueMismatch", "The two password values do not match", 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_EmailCheckSubject(), theEcorePackage.getEString(), "emailCheckSubject", null, 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_EmailCheckMessage(), theEcorePackage.getEString(), "emailCheckMessage", null, 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_EmailCheckSentCaption(), theEcorePackage.getEString(), "emailCheckSentCaption", null, 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForgottenPasswordElement_EmailCheckSentMessage(), theEcorePackage.getEString(), "emailCheckSentMessage", null, 1, 1, ForgottenPasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changePasswordElementEClass, ChangePasswordElement.class, "ChangePasswordElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangePasswordElement_Authentication(), this.getLocalAuthenticationSystem(), this.getLocalAuthenticationSystem_ChangePasswordElement(), "authentication", null, 1, 1, ChangePasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangePasswordElement_InvokeLabel(), theEcorePackage.getEString(), "invokeLabel", "Change Password", 1, 1, ChangePasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangePasswordElement_ConfirmLabel(), theEcorePackage.getEString(), "confirmLabel", "Set Pasword", 1, 1, ChangePasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangePasswordElement_UriElement(), theEcorePackage.getEString(), "uriElement", "change-password", 1, 1, ChangePasswordElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(casAuthenticationEClass, CasAuthentication.class, "CasAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCasAuthentication_LoginLabel(), theEcorePackage.getEString(), "loginLabel", null, 1, 1, CasAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCasAuthentication_LogoutLabel(), theEcorePackage.getEString(), "logoutLabel", null, 0, 1, CasAuthentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			   "derivation", "if sectionClassOverride.trim() <> \'\' then\n\t\t\tsectionClassOverride.trim()\n\t\telse if self.oclAsType(ecore::EObject).eContainer().oclAsType(LocalAuthenticationSystem).sectionClass.trim() <> \'\' then\n\t\t\tself.oclAsType(ecore::EObject).eContainer().oclAsType(LocalAuthenticationSystem).sectionClass.trim()\n\t\telse\n\t\t\t\'\'\n\t\tendif endif"
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
			   "derivation", "if captionClassOverride.trim() <> \'\' then\n\t\t\tcaptionClassOverride.trim()\n\t\telse if self.oclAsType(ecore::EObject).eContainer().oclAsType(LocalAuthenticationSystem).captionClass.trim() <> \'\' then\n\t\t\tself.oclAsType(ecore::EObject).eContainer().oclAsType(LocalAuthenticationSystem).captionClass.trim()\n\t\telse\n\t\t\t\'\'\n\t\tendif endif"
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
			   "derivation", "if contentClassOverride.trim() <> \'\' then\n\t\t\tcontentClassOverride.trim()\n\t\telse if self.oclAsType(ecore::EObject).eContainer().oclAsType(LocalAuthenticationSystem).contentClass.trim() <> \'\' then\n\t\t\tself.oclAsType(ecore::EObject).eContainer().oclAsType(LocalAuthenticationSystem).contentClass.trim()\n\t\telse\n\t\t\t\'\'\n\t\tendif endif"
		   });
		addAnnotation
		  (getAuthenticationElement_HasContentClass(),
		   source,
		   new String[] {
			   "derivation", "contentClass <> \'\'"
		   });
	}

} //SecurityPackageImpl
