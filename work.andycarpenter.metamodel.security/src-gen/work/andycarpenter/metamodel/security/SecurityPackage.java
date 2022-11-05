/**
 */
package work.andycarpenter.metamodel.security;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import work.andycarpenter.metamodel.base.BasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see work.andycarpenter.metamodel.security.SecurityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore OCL='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface SecurityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "security";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://andycarpenter.work/metamodel/security";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "security";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPackage eINSTANCE = work.andycarpenter.metamodel.security.impl.SecurityPackageImpl.init();

	/**
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.impl.SecurityModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.impl.SecurityModelImpl
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getSecurityModel()
	 * @generated
	 */
	int SECURITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__AUTHENTICATION = 0;

	/**
	 * The feature id for the '<em><b>Is Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__IS_AUTHENTICATED = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.impl.AuthenticationImpl <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.impl.AuthenticationImpl
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 1;

	/**
	 * The feature id for the '<em><b>User Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__USER_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl <em>Local Authentication System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getLocalAuthenticationSystem()
	 * @generated
	 */
	int LOCAL_AUTHENTICATION_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>User Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USER_MODEL = AUTHENTICATION__USER_MODEL;

	/**
	 * The feature id for the '<em><b>Authentication Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USER_KEY = AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Authentication Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY = AUTHENTICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Identifier Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IDENTIFIER_FEATURE = AUTHENTICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Password Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__PASSWORD_FEATURE = AUTHENTICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reset Password Request Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL = AUTHENTICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Registration Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT = AUTHENTICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Has Registration Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__HAS_REGISTRATION_ELEMENT = AUTHENTICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Login Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ELEMENT = AUTHENTICATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Logout Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_ELEMENT = AUTHENTICATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Forgotten Password Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT = AUTHENTICATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Change Password Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__CHANGE_PASSWORD_ELEMENT = AUTHENTICATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Captcha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA = AUTHENTICATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Allow Remember Me</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME = AUTHENTICATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Allow Self Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION = AUTHENTICATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Use Email Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION = AUTHENTICATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Send Welcome Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL = AUTHENTICATION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__SECTION_CLASS = AUTHENTICATION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__CAPTION_CLASS = AUTHENTICATION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__CONTENT_CLASS = AUTHENTICATION_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Local Authentication System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Local Authentication System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM_OPERATION_COUNT = AUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.impl.AuthenticationElementImpl <em>Authentication Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.impl.AuthenticationElementImpl
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getAuthenticationElement()
	 * @generated
	 */
	int AUTHENTICATION_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__NAME = BasePackage.NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__DISPLAY_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Section Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__SECTION_CLASS_OVERRIDE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__SECTION_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__HAS_SECTION_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Caption Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__CAPTION_CLASS_OVERRIDE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__CAPTION_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Has Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__HAS_CAPTION_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Content Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__CONTENT_CLASS_OVERRIDE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__CONTENT_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Has Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__HAS_CONTENT_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Authentication Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Authentication Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT_OPERATION_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.impl.RegistrationElementImpl <em>Registration Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.impl.RegistrationElementImpl
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getRegistrationElement()
	 * @generated
	 */
	int REGISTRATION_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__NAME = AUTHENTICATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__DISPLAY_LABEL = AUTHENTICATION_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Section Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__SECTION_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__SECTION_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__SECTION_CLASS = AUTHENTICATION_ELEMENT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Has Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__HAS_SECTION_CLASS = AUTHENTICATION_ELEMENT__HAS_SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Caption Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__CAPTION_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__CAPTION_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__CAPTION_CLASS = AUTHENTICATION_ELEMENT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Has Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__HAS_CAPTION_CLASS = AUTHENTICATION_ELEMENT__HAS_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__CONTENT_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__CONTENT_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__CONTENT_CLASS = AUTHENTICATION_ELEMENT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Has Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__HAS_CONTENT_CLASS = AUTHENTICATION_ELEMENT__HAS_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__AUTHENTICATION = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invoke Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__INVOKE_LABEL = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__CONFIRM_LABEL = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__URI_ELEMENT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uri Email Verification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__URI_EMAIL_VERIFICATION = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Registration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT_FEATURE_COUNT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Registration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT_OPERATION_COUNT = AUTHENTICATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.impl.LoginElementImpl <em>Login Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.impl.LoginElementImpl
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getLoginElement()
	 * @generated
	 */
	int LOGIN_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT__NAME = AUTHENTICATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT__DISPLAY_LABEL = AUTHENTICATION_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Section Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT__SECTION_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__SECTION_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT__SECTION_CLASS = AUTHENTICATION_ELEMENT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Has Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT__HAS_SECTION_CLASS = AUTHENTICATION_ELEMENT__HAS_SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Caption Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT__CAPTION_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__CAPTION_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT__CAPTION_CLASS = AUTHENTICATION_ELEMENT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Has Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT__HAS_CAPTION_CLASS = AUTHENTICATION_ELEMENT__HAS_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT__CONTENT_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__CONTENT_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT__CONTENT_CLASS = AUTHENTICATION_ELEMENT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Has Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT__HAS_CONTENT_CLASS = AUTHENTICATION_ELEMENT__HAS_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT__AUTHENTICATION = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invoke Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT__INVOKE_LABEL = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT__CONFIRM_LABEL = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT__URI_ELEMENT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Login Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT_FEATURE_COUNT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Login Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT_OPERATION_COUNT = AUTHENTICATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.impl.LogoutElementImpl <em>Logout Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.impl.LogoutElementImpl
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getLogoutElement()
	 * @generated
	 */
	int LOGOUT_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT__NAME = AUTHENTICATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT__DISPLAY_LABEL = AUTHENTICATION_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Section Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT__SECTION_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__SECTION_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT__SECTION_CLASS = AUTHENTICATION_ELEMENT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Has Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT__HAS_SECTION_CLASS = AUTHENTICATION_ELEMENT__HAS_SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Caption Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT__CAPTION_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__CAPTION_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT__CAPTION_CLASS = AUTHENTICATION_ELEMENT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Has Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT__HAS_CAPTION_CLASS = AUTHENTICATION_ELEMENT__HAS_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT__CONTENT_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__CONTENT_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT__CONTENT_CLASS = AUTHENTICATION_ELEMENT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Has Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT__HAS_CONTENT_CLASS = AUTHENTICATION_ELEMENT__HAS_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT__AUTHENTICATION = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invoke Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT__INVOKE_LABEL = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT__CONFIRM_LABEL = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT__URI_ELEMENT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Logout Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT_FEATURE_COUNT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Logout Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT_OPERATION_COUNT = AUTHENTICATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl <em>Forgotten Password Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getForgottenPasswordElement()
	 * @generated
	 */
	int FORGOTTEN_PASSWORD_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__NAME = AUTHENTICATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__DISPLAY_LABEL = AUTHENTICATION_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Section Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__SECTION_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__SECTION_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__SECTION_CLASS = AUTHENTICATION_ELEMENT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Has Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__HAS_SECTION_CLASS = AUTHENTICATION_ELEMENT__HAS_SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Caption Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__CAPTION_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__CAPTION_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__CAPTION_CLASS = AUTHENTICATION_ELEMENT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Has Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__HAS_CAPTION_CLASS = AUTHENTICATION_ELEMENT__HAS_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__CONTENT_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__CONTENT_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__CONTENT_CLASS = AUTHENTICATION_ELEMENT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Has Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__HAS_CONTENT_CLASS = AUTHENTICATION_ELEMENT__HAS_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invoke Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__INVOKE_LABEL = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Request Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__REQUEST_LABEL = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reset Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__RESET_LABEL = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__URI_ELEMENT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uri Email Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uri Reset Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__URI_RESET_PASSWORD = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Email Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__EMAIL_HELP = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Password Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_LABEL = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Password Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_PLACEHOLDER = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Password Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_TITLE = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Password Confirmation Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_LABEL = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Password Confirmation Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_PLACEHOLDER = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Password Confirmation Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_TITLE = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Password Message Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_REQUIRED = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Password Message Value Mismatch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_VALUE_MISMATCH = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Email Check Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SUBJECT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Email Check Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_MESSAGE = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Email Check Sent Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_CAPTION = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Email Check Sent Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_MESSAGE = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Forgotten Password Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT_FEATURE_COUNT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Forgotten Password Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT_OPERATION_COUNT = AUTHENTICATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.impl.ChangePasswordElementImpl <em>Change Password Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.impl.ChangePasswordElementImpl
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getChangePasswordElement()
	 * @generated
	 */
	int CHANGE_PASSWORD_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PASSWORD_ELEMENT__NAME = AUTHENTICATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PASSWORD_ELEMENT__DISPLAY_LABEL = AUTHENTICATION_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Section Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PASSWORD_ELEMENT__SECTION_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__SECTION_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PASSWORD_ELEMENT__SECTION_CLASS = AUTHENTICATION_ELEMENT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Has Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PASSWORD_ELEMENT__HAS_SECTION_CLASS = AUTHENTICATION_ELEMENT__HAS_SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Caption Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PASSWORD_ELEMENT__CAPTION_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__CAPTION_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PASSWORD_ELEMENT__CAPTION_CLASS = AUTHENTICATION_ELEMENT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Has Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PASSWORD_ELEMENT__HAS_CAPTION_CLASS = AUTHENTICATION_ELEMENT__HAS_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PASSWORD_ELEMENT__CONTENT_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__CONTENT_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PASSWORD_ELEMENT__CONTENT_CLASS = AUTHENTICATION_ELEMENT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Has Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PASSWORD_ELEMENT__HAS_CONTENT_CLASS = AUTHENTICATION_ELEMENT__HAS_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PASSWORD_ELEMENT__AUTHENTICATION = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invoke Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PASSWORD_ELEMENT__INVOKE_LABEL = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PASSWORD_ELEMENT__CONFIRM_LABEL = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PASSWORD_ELEMENT__URI_ELEMENT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Change Password Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PASSWORD_ELEMENT_FEATURE_COUNT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Change Password Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PASSWORD_ELEMENT_OPERATION_COUNT = AUTHENTICATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.impl.CasAuthenticationImpl <em>Cas Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.impl.CasAuthenticationImpl
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getCasAuthentication()
	 * @generated
	 */
	int CAS_AUTHENTICATION = 9;

	/**
	 * The feature id for the '<em><b>User Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__USER_MODEL = AUTHENTICATION__USER_MODEL;

	/**
	 * The feature id for the '<em><b>Login Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__LOGIN_LABEL = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logout Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__LOGOUT_LABEL = AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cas Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cas Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION_OPERATION_COUNT = AUTHENTICATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link work.andycarpenter.metamodel.security.SecurityModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see work.andycarpenter.metamodel.security.SecurityModel
	 * @generated
	 */
	EClass getSecurityModel();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.metamodel.security.SecurityModel#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authentication</em>'.
	 * @see work.andycarpenter.metamodel.security.SecurityModel#getAuthentication()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_Authentication();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.SecurityModel#isIsAuthenticated <em>Is Authenticated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Authenticated</em>'.
	 * @see work.andycarpenter.metamodel.security.SecurityModel#isIsAuthenticated()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EAttribute getSecurityModel_IsAuthenticated();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.metamodel.security.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see work.andycarpenter.metamodel.security.Authentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.Authentication#getUserModel <em>User Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Model</em>'.
	 * @see work.andycarpenter.metamodel.security.Authentication#getUserModel()
	 * @see #getAuthentication()
	 * @generated
	 */
	EReference getAuthentication_UserModel();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem <em>Local Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Authentication System</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem
	 * @generated
	 */
	EClass getLocalAuthenticationSystem();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationModel <em>Authentication Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication Model</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationModel()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_AuthenticationModel();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getUserKey <em>User Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Key</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getUserKey()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_UserKey();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationKey <em>Authentication Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authentication Key</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationKey()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_AuthenticationKey();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getIdentifierFeature <em>Identifier Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifier Feature</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getIdentifierFeature()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_IdentifierFeature();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getPasswordFeature <em>Password Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Password Feature</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getPasswordFeature()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_PasswordFeature();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getResetPasswordRequestModel <em>Reset Password Request Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reset Password Request Model</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getResetPasswordRequestModel()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_ResetPasswordRequestModel();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getRegistrationElement <em>Registration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Registration Element</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getRegistrationElement()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_RegistrationElement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isHasRegistrationElement <em>Has Registration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Registration Element</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isHasRegistrationElement()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_HasRegistrationElement();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getLoginElement <em>Login Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Login Element</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getLoginElement()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_LoginElement();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getLogoutElement <em>Logout Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logout Element</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getLogoutElement()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_LogoutElement();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getForgottenPasswordElement <em>Forgotten Password Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forgotten Password Element</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getForgottenPasswordElement()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_ForgottenPasswordElement();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getChangePasswordElement <em>Change Password Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Password Element</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getChangePasswordElement()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_ChangePasswordElement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isCaptcha <em>Captcha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Captcha</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isCaptcha()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_Captcha();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isAllowRememberMe <em>Allow Remember Me</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Remember Me</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isAllowRememberMe()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_AllowRememberMe();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Self Registration</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isAllowSelfRegistration()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_AllowSelfRegistration();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Email Activation</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isUseEmailActivation()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_UseEmailActivation();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send Welcome Email</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isSendWelcomeEmail()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_SendWelcomeEmail();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getSectionClass <em>Section Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section Class</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getSectionClass()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_SectionClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getCaptionClass <em>Caption Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Class</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getCaptionClass()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_CaptionClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getContentClass <em>Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Class</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getContentClass()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_ContentClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.metamodel.security.AuthenticationElement <em>Authentication Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Element</em>'.
	 * @see work.andycarpenter.metamodel.security.AuthenticationElement
	 * @generated
	 */
	EClass getAuthenticationElement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.AuthenticationElement#getSectionClassOverride <em>Section Class Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section Class Override</em>'.
	 * @see work.andycarpenter.metamodel.security.AuthenticationElement#getSectionClassOverride()
	 * @see #getAuthenticationElement()
	 * @generated
	 */
	EAttribute getAuthenticationElement_SectionClassOverride();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.AuthenticationElement#getSectionClass <em>Section Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section Class</em>'.
	 * @see work.andycarpenter.metamodel.security.AuthenticationElement#getSectionClass()
	 * @see #getAuthenticationElement()
	 * @generated
	 */
	EAttribute getAuthenticationElement_SectionClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.AuthenticationElement#isHasSectionClass <em>Has Section Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Section Class</em>'.
	 * @see work.andycarpenter.metamodel.security.AuthenticationElement#isHasSectionClass()
	 * @see #getAuthenticationElement()
	 * @generated
	 */
	EAttribute getAuthenticationElement_HasSectionClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.AuthenticationElement#getCaptionClassOverride <em>Caption Class Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Class Override</em>'.
	 * @see work.andycarpenter.metamodel.security.AuthenticationElement#getCaptionClassOverride()
	 * @see #getAuthenticationElement()
	 * @generated
	 */
	EAttribute getAuthenticationElement_CaptionClassOverride();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.AuthenticationElement#getCaptionClass <em>Caption Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption Class</em>'.
	 * @see work.andycarpenter.metamodel.security.AuthenticationElement#getCaptionClass()
	 * @see #getAuthenticationElement()
	 * @generated
	 */
	EAttribute getAuthenticationElement_CaptionClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.AuthenticationElement#isHasCaptionClass <em>Has Caption Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Caption Class</em>'.
	 * @see work.andycarpenter.metamodel.security.AuthenticationElement#isHasCaptionClass()
	 * @see #getAuthenticationElement()
	 * @generated
	 */
	EAttribute getAuthenticationElement_HasCaptionClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.AuthenticationElement#getContentClassOverride <em>Content Class Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Class Override</em>'.
	 * @see work.andycarpenter.metamodel.security.AuthenticationElement#getContentClassOverride()
	 * @see #getAuthenticationElement()
	 * @generated
	 */
	EAttribute getAuthenticationElement_ContentClassOverride();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.AuthenticationElement#getContentClass <em>Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Class</em>'.
	 * @see work.andycarpenter.metamodel.security.AuthenticationElement#getContentClass()
	 * @see #getAuthenticationElement()
	 * @generated
	 */
	EAttribute getAuthenticationElement_ContentClass();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.AuthenticationElement#isHasContentClass <em>Has Content Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Content Class</em>'.
	 * @see work.andycarpenter.metamodel.security.AuthenticationElement#isHasContentClass()
	 * @see #getAuthenticationElement()
	 * @generated
	 */
	EAttribute getAuthenticationElement_HasContentClass();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.metamodel.security.RegistrationElement <em>Registration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registration Element</em>'.
	 * @see work.andycarpenter.metamodel.security.RegistrationElement
	 * @generated
	 */
	EClass getRegistrationElement();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.metamodel.security.RegistrationElement#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Authentication</em>'.
	 * @see work.andycarpenter.metamodel.security.RegistrationElement#getAuthentication()
	 * @see #getRegistrationElement()
	 * @generated
	 */
	EReference getRegistrationElement_Authentication();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.RegistrationElement#getInvokeLabel <em>Invoke Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoke Label</em>'.
	 * @see work.andycarpenter.metamodel.security.RegistrationElement#getInvokeLabel()
	 * @see #getRegistrationElement()
	 * @generated
	 */
	EAttribute getRegistrationElement_InvokeLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.RegistrationElement#getConfirmLabel <em>Confirm Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Label</em>'.
	 * @see work.andycarpenter.metamodel.security.RegistrationElement#getConfirmLabel()
	 * @see #getRegistrationElement()
	 * @generated
	 */
	EAttribute getRegistrationElement_ConfirmLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.RegistrationElement#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see work.andycarpenter.metamodel.security.RegistrationElement#getUriElement()
	 * @see #getRegistrationElement()
	 * @generated
	 */
	EAttribute getRegistrationElement_UriElement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.RegistrationElement#getUriEmailVerification <em>Uri Email Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Email Verification</em>'.
	 * @see work.andycarpenter.metamodel.security.RegistrationElement#getUriEmailVerification()
	 * @see #getRegistrationElement()
	 * @generated
	 */
	EAttribute getRegistrationElement_UriEmailVerification();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.metamodel.security.LoginElement <em>Login Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Element</em>'.
	 * @see work.andycarpenter.metamodel.security.LoginElement
	 * @generated
	 */
	EClass getLoginElement();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.metamodel.security.LoginElement#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Authentication</em>'.
	 * @see work.andycarpenter.metamodel.security.LoginElement#getAuthentication()
	 * @see #getLoginElement()
	 * @generated
	 */
	EReference getLoginElement_Authentication();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LoginElement#getInvokeLabel <em>Invoke Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoke Label</em>'.
	 * @see work.andycarpenter.metamodel.security.LoginElement#getInvokeLabel()
	 * @see #getLoginElement()
	 * @generated
	 */
	EAttribute getLoginElement_InvokeLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LoginElement#getConfirmLabel <em>Confirm Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Label</em>'.
	 * @see work.andycarpenter.metamodel.security.LoginElement#getConfirmLabel()
	 * @see #getLoginElement()
	 * @generated
	 */
	EAttribute getLoginElement_ConfirmLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LoginElement#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see work.andycarpenter.metamodel.security.LoginElement#getUriElement()
	 * @see #getLoginElement()
	 * @generated
	 */
	EAttribute getLoginElement_UriElement();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.metamodel.security.LogoutElement <em>Logout Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logout Element</em>'.
	 * @see work.andycarpenter.metamodel.security.LogoutElement
	 * @generated
	 */
	EClass getLogoutElement();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.metamodel.security.LogoutElement#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Authentication</em>'.
	 * @see work.andycarpenter.metamodel.security.LogoutElement#getAuthentication()
	 * @see #getLogoutElement()
	 * @generated
	 */
	EReference getLogoutElement_Authentication();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LogoutElement#getInvokeLabel <em>Invoke Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoke Label</em>'.
	 * @see work.andycarpenter.metamodel.security.LogoutElement#getInvokeLabel()
	 * @see #getLogoutElement()
	 * @generated
	 */
	EAttribute getLogoutElement_InvokeLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LogoutElement#getConfirmLabel <em>Confirm Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Label</em>'.
	 * @see work.andycarpenter.metamodel.security.LogoutElement#getConfirmLabel()
	 * @see #getLogoutElement()
	 * @generated
	 */
	EAttribute getLogoutElement_ConfirmLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LogoutElement#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see work.andycarpenter.metamodel.security.LogoutElement#getUriElement()
	 * @see #getLogoutElement()
	 * @generated
	 */
	EAttribute getLogoutElement_UriElement();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement <em>Forgotten Password Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forgotten Password Element</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement
	 * @generated
	 */
	EClass getForgottenPasswordElement();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Authentication</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getAuthentication()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EReference getForgottenPasswordElement_Authentication();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getInvokeLabel <em>Invoke Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoke Label</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getInvokeLabel()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_InvokeLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getRequestLabel <em>Request Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Label</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getRequestLabel()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_RequestLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getResetLabel <em>Reset Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reset Label</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getResetLabel()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_ResetLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getUriElement()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_UriElement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getUriEmailSent <em>Uri Email Sent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Email Sent</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getUriEmailSent()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_UriEmailSent();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getUriResetPassword <em>Uri Reset Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Reset Password</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getUriResetPassword()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_UriResetPassword();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailHelp <em>Email Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Help</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailHelp()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_EmailHelp();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordLabel <em>Password Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Label</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordLabel()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_PasswordLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordPlaceholder <em>Password Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Placeholder</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordPlaceholder()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_PasswordPlaceholder();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordTitle <em>Password Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Title</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordTitle()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_PasswordTitle();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordConfirmationLabel <em>Password Confirmation Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Confirmation Label</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordConfirmationLabel()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_PasswordConfirmationLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordConfirmationPlaceholder <em>Password Confirmation Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Confirmation Placeholder</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordConfirmationPlaceholder()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_PasswordConfirmationPlaceholder();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordConfirmationTitle <em>Password Confirmation Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Confirmation Title</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordConfirmationTitle()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_PasswordConfirmationTitle();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordMessageRequired <em>Password Message Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Message Required</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordMessageRequired()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_PasswordMessageRequired();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordMessageValueMismatch <em>Password Message Value Mismatch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Message Value Mismatch</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordMessageValueMismatch()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_PasswordMessageValueMismatch();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailCheckSubject <em>Email Check Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Check Subject</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailCheckSubject()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_EmailCheckSubject();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailCheckMessage <em>Email Check Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Check Message</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailCheckMessage()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_EmailCheckMessage();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailCheckSentCaption <em>Email Check Sent Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Check Sent Caption</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailCheckSentCaption()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_EmailCheckSentCaption();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailCheckSentMessage <em>Email Check Sent Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Check Sent Message</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailCheckSentMessage()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_EmailCheckSentMessage();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.metamodel.security.ChangePasswordElement <em>Change Password Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Password Element</em>'.
	 * @see work.andycarpenter.metamodel.security.ChangePasswordElement
	 * @generated
	 */
	EClass getChangePasswordElement();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.metamodel.security.ChangePasswordElement#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Authentication</em>'.
	 * @see work.andycarpenter.metamodel.security.ChangePasswordElement#getAuthentication()
	 * @see #getChangePasswordElement()
	 * @generated
	 */
	EReference getChangePasswordElement_Authentication();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ChangePasswordElement#getInvokeLabel <em>Invoke Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoke Label</em>'.
	 * @see work.andycarpenter.metamodel.security.ChangePasswordElement#getInvokeLabel()
	 * @see #getChangePasswordElement()
	 * @generated
	 */
	EAttribute getChangePasswordElement_InvokeLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ChangePasswordElement#getConfirmLabel <em>Confirm Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Label</em>'.
	 * @see work.andycarpenter.metamodel.security.ChangePasswordElement#getConfirmLabel()
	 * @see #getChangePasswordElement()
	 * @generated
	 */
	EAttribute getChangePasswordElement_ConfirmLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ChangePasswordElement#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see work.andycarpenter.metamodel.security.ChangePasswordElement#getUriElement()
	 * @see #getChangePasswordElement()
	 * @generated
	 */
	EAttribute getChangePasswordElement_UriElement();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.metamodel.security.CasAuthentication <em>Cas Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cas Authentication</em>'.
	 * @see work.andycarpenter.metamodel.security.CasAuthentication
	 * @generated
	 */
	EClass getCasAuthentication();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.CasAuthentication#getLoginLabel <em>Login Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login Label</em>'.
	 * @see work.andycarpenter.metamodel.security.CasAuthentication#getLoginLabel()
	 * @see #getCasAuthentication()
	 * @generated
	 */
	EAttribute getCasAuthentication_LoginLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.CasAuthentication#getLogoutLabel <em>Logout Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logout Label</em>'.
	 * @see work.andycarpenter.metamodel.security.CasAuthentication#getLogoutLabel()
	 * @see #getCasAuthentication()
	 * @generated
	 */
	EAttribute getCasAuthentication_LogoutLabel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecurityFactory getSecurityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.impl.SecurityModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.impl.SecurityModelImpl
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getSecurityModel()
		 * @generated
		 */
		EClass SECURITY_MODEL = eINSTANCE.getSecurityModel();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__AUTHENTICATION = eINSTANCE.getSecurityModel_Authentication();

		/**
		 * The meta object literal for the '<em><b>Is Authenticated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_MODEL__IS_AUTHENTICATED = eINSTANCE.getSecurityModel_IsAuthenticated();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.impl.AuthenticationImpl <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.impl.AuthenticationImpl
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();

		/**
		 * The meta object literal for the '<em><b>User Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION__USER_MODEL = eINSTANCE.getAuthentication_UserModel();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl <em>Local Authentication System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.impl.LocalAuthenticationSystemImpl
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getLocalAuthenticationSystem()
		 * @generated
		 */
		EClass LOCAL_AUTHENTICATION_SYSTEM = eINSTANCE.getLocalAuthenticationSystem();

		/**
		 * The meta object literal for the '<em><b>Authentication Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL = eINSTANCE.getLocalAuthenticationSystem_AuthenticationModel();

		/**
		 * The meta object literal for the '<em><b>User Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__USER_KEY = eINSTANCE.getLocalAuthenticationSystem_UserKey();

		/**
		 * The meta object literal for the '<em><b>Authentication Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY = eINSTANCE.getLocalAuthenticationSystem_AuthenticationKey();

		/**
		 * The meta object literal for the '<em><b>Identifier Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__IDENTIFIER_FEATURE = eINSTANCE.getLocalAuthenticationSystem_IdentifierFeature();

		/**
		 * The meta object literal for the '<em><b>Password Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__PASSWORD_FEATURE = eINSTANCE.getLocalAuthenticationSystem_PasswordFeature();

		/**
		 * The meta object literal for the '<em><b>Reset Password Request Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL = eINSTANCE.getLocalAuthenticationSystem_ResetPasswordRequestModel();

		/**
		 * The meta object literal for the '<em><b>Registration Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT = eINSTANCE.getLocalAuthenticationSystem_RegistrationElement();

		/**
		 * The meta object literal for the '<em><b>Has Registration Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__HAS_REGISTRATION_ELEMENT = eINSTANCE.getLocalAuthenticationSystem_HasRegistrationElement();

		/**
		 * The meta object literal for the '<em><b>Login Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ELEMENT = eINSTANCE.getLocalAuthenticationSystem_LoginElement();

		/**
		 * The meta object literal for the '<em><b>Logout Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_ELEMENT = eINSTANCE.getLocalAuthenticationSystem_LogoutElement();

		/**
		 * The meta object literal for the '<em><b>Forgotten Password Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT = eINSTANCE.getLocalAuthenticationSystem_ForgottenPasswordElement();

		/**
		 * The meta object literal for the '<em><b>Change Password Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__CHANGE_PASSWORD_ELEMENT = eINSTANCE.getLocalAuthenticationSystem_ChangePasswordElement();

		/**
		 * The meta object literal for the '<em><b>Captcha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA = eINSTANCE.getLocalAuthenticationSystem_Captcha();

		/**
		 * The meta object literal for the '<em><b>Allow Remember Me</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME = eINSTANCE.getLocalAuthenticationSystem_AllowRememberMe();

		/**
		 * The meta object literal for the '<em><b>Allow Self Registration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION = eINSTANCE.getLocalAuthenticationSystem_AllowSelfRegistration();

		/**
		 * The meta object literal for the '<em><b>Use Email Activation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION = eINSTANCE.getLocalAuthenticationSystem_UseEmailActivation();

		/**
		 * The meta object literal for the '<em><b>Send Welcome Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL = eINSTANCE.getLocalAuthenticationSystem_SendWelcomeEmail();

		/**
		 * The meta object literal for the '<em><b>Section Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__SECTION_CLASS = eINSTANCE.getLocalAuthenticationSystem_SectionClass();

		/**
		 * The meta object literal for the '<em><b>Caption Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__CAPTION_CLASS = eINSTANCE.getLocalAuthenticationSystem_CaptionClass();

		/**
		 * The meta object literal for the '<em><b>Content Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__CONTENT_CLASS = eINSTANCE.getLocalAuthenticationSystem_ContentClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.impl.AuthenticationElementImpl <em>Authentication Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.impl.AuthenticationElementImpl
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getAuthenticationElement()
		 * @generated
		 */
		EClass AUTHENTICATION_ELEMENT = eINSTANCE.getAuthenticationElement();

		/**
		 * The meta object literal for the '<em><b>Section Class Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_ELEMENT__SECTION_CLASS_OVERRIDE = eINSTANCE.getAuthenticationElement_SectionClassOverride();

		/**
		 * The meta object literal for the '<em><b>Section Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_ELEMENT__SECTION_CLASS = eINSTANCE.getAuthenticationElement_SectionClass();

		/**
		 * The meta object literal for the '<em><b>Has Section Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_ELEMENT__HAS_SECTION_CLASS = eINSTANCE.getAuthenticationElement_HasSectionClass();

		/**
		 * The meta object literal for the '<em><b>Caption Class Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_ELEMENT__CAPTION_CLASS_OVERRIDE = eINSTANCE.getAuthenticationElement_CaptionClassOverride();

		/**
		 * The meta object literal for the '<em><b>Caption Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_ELEMENT__CAPTION_CLASS = eINSTANCE.getAuthenticationElement_CaptionClass();

		/**
		 * The meta object literal for the '<em><b>Has Caption Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_ELEMENT__HAS_CAPTION_CLASS = eINSTANCE.getAuthenticationElement_HasCaptionClass();

		/**
		 * The meta object literal for the '<em><b>Content Class Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_ELEMENT__CONTENT_CLASS_OVERRIDE = eINSTANCE.getAuthenticationElement_ContentClassOverride();

		/**
		 * The meta object literal for the '<em><b>Content Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_ELEMENT__CONTENT_CLASS = eINSTANCE.getAuthenticationElement_ContentClass();

		/**
		 * The meta object literal for the '<em><b>Has Content Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_ELEMENT__HAS_CONTENT_CLASS = eINSTANCE.getAuthenticationElement_HasContentClass();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.impl.RegistrationElementImpl <em>Registration Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.impl.RegistrationElementImpl
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getRegistrationElement()
		 * @generated
		 */
		EClass REGISTRATION_ELEMENT = eINSTANCE.getRegistrationElement();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRATION_ELEMENT__AUTHENTICATION = eINSTANCE.getRegistrationElement_Authentication();

		/**
		 * The meta object literal for the '<em><b>Invoke Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_ELEMENT__INVOKE_LABEL = eINSTANCE.getRegistrationElement_InvokeLabel();

		/**
		 * The meta object literal for the '<em><b>Confirm Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_ELEMENT__CONFIRM_LABEL = eINSTANCE.getRegistrationElement_ConfirmLabel();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_ELEMENT__URI_ELEMENT = eINSTANCE.getRegistrationElement_UriElement();

		/**
		 * The meta object literal for the '<em><b>Uri Email Verification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTRATION_ELEMENT__URI_EMAIL_VERIFICATION = eINSTANCE.getRegistrationElement_UriEmailVerification();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.impl.LoginElementImpl <em>Login Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.impl.LoginElementImpl
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getLoginElement()
		 * @generated
		 */
		EClass LOGIN_ELEMENT = eINSTANCE.getLoginElement();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_ELEMENT__AUTHENTICATION = eINSTANCE.getLoginElement_Authentication();

		/**
		 * The meta object literal for the '<em><b>Invoke Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_ELEMENT__INVOKE_LABEL = eINSTANCE.getLoginElement_InvokeLabel();

		/**
		 * The meta object literal for the '<em><b>Confirm Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_ELEMENT__CONFIRM_LABEL = eINSTANCE.getLoginElement_ConfirmLabel();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_ELEMENT__URI_ELEMENT = eINSTANCE.getLoginElement_UriElement();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.impl.LogoutElementImpl <em>Logout Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.impl.LogoutElementImpl
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getLogoutElement()
		 * @generated
		 */
		EClass LOGOUT_ELEMENT = eINSTANCE.getLogoutElement();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGOUT_ELEMENT__AUTHENTICATION = eINSTANCE.getLogoutElement_Authentication();

		/**
		 * The meta object literal for the '<em><b>Invoke Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGOUT_ELEMENT__INVOKE_LABEL = eINSTANCE.getLogoutElement_InvokeLabel();

		/**
		 * The meta object literal for the '<em><b>Confirm Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGOUT_ELEMENT__CONFIRM_LABEL = eINSTANCE.getLogoutElement_ConfirmLabel();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGOUT_ELEMENT__URI_ELEMENT = eINSTANCE.getLogoutElement_UriElement();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl <em>Forgotten Password Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.impl.ForgottenPasswordElementImpl
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getForgottenPasswordElement()
		 * @generated
		 */
		EClass FORGOTTEN_PASSWORD_ELEMENT = eINSTANCE.getForgottenPasswordElement();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION = eINSTANCE.getForgottenPasswordElement_Authentication();

		/**
		 * The meta object literal for the '<em><b>Invoke Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__INVOKE_LABEL = eINSTANCE.getForgottenPasswordElement_InvokeLabel();

		/**
		 * The meta object literal for the '<em><b>Request Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__REQUEST_LABEL = eINSTANCE.getForgottenPasswordElement_RequestLabel();

		/**
		 * The meta object literal for the '<em><b>Reset Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__RESET_LABEL = eINSTANCE.getForgottenPasswordElement_ResetLabel();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__URI_ELEMENT = eINSTANCE.getForgottenPasswordElement_UriElement();

		/**
		 * The meta object literal for the '<em><b>Uri Email Sent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT = eINSTANCE.getForgottenPasswordElement_UriEmailSent();

		/**
		 * The meta object literal for the '<em><b>Uri Reset Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__URI_RESET_PASSWORD = eINSTANCE.getForgottenPasswordElement_UriResetPassword();

		/**
		 * The meta object literal for the '<em><b>Email Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__EMAIL_HELP = eINSTANCE.getForgottenPasswordElement_EmailHelp();

		/**
		 * The meta object literal for the '<em><b>Password Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_LABEL = eINSTANCE.getForgottenPasswordElement_PasswordLabel();

		/**
		 * The meta object literal for the '<em><b>Password Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_PLACEHOLDER = eINSTANCE.getForgottenPasswordElement_PasswordPlaceholder();

		/**
		 * The meta object literal for the '<em><b>Password Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_TITLE = eINSTANCE.getForgottenPasswordElement_PasswordTitle();

		/**
		 * The meta object literal for the '<em><b>Password Confirmation Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_LABEL = eINSTANCE.getForgottenPasswordElement_PasswordConfirmationLabel();

		/**
		 * The meta object literal for the '<em><b>Password Confirmation Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_PLACEHOLDER = eINSTANCE.getForgottenPasswordElement_PasswordConfirmationPlaceholder();

		/**
		 * The meta object literal for the '<em><b>Password Confirmation Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_TITLE = eINSTANCE.getForgottenPasswordElement_PasswordConfirmationTitle();

		/**
		 * The meta object literal for the '<em><b>Password Message Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_REQUIRED = eINSTANCE.getForgottenPasswordElement_PasswordMessageRequired();

		/**
		 * The meta object literal for the '<em><b>Password Message Value Mismatch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_VALUE_MISMATCH = eINSTANCE.getForgottenPasswordElement_PasswordMessageValueMismatch();

		/**
		 * The meta object literal for the '<em><b>Email Check Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SUBJECT = eINSTANCE.getForgottenPasswordElement_EmailCheckSubject();

		/**
		 * The meta object literal for the '<em><b>Email Check Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_MESSAGE = eINSTANCE.getForgottenPasswordElement_EmailCheckMessage();

		/**
		 * The meta object literal for the '<em><b>Email Check Sent Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_CAPTION = eINSTANCE.getForgottenPasswordElement_EmailCheckSentCaption();

		/**
		 * The meta object literal for the '<em><b>Email Check Sent Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_MESSAGE = eINSTANCE.getForgottenPasswordElement_EmailCheckSentMessage();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.impl.ChangePasswordElementImpl <em>Change Password Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.impl.ChangePasswordElementImpl
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getChangePasswordElement()
		 * @generated
		 */
		EClass CHANGE_PASSWORD_ELEMENT = eINSTANCE.getChangePasswordElement();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PASSWORD_ELEMENT__AUTHENTICATION = eINSTANCE.getChangePasswordElement_Authentication();

		/**
		 * The meta object literal for the '<em><b>Invoke Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_PASSWORD_ELEMENT__INVOKE_LABEL = eINSTANCE.getChangePasswordElement_InvokeLabel();

		/**
		 * The meta object literal for the '<em><b>Confirm Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_PASSWORD_ELEMENT__CONFIRM_LABEL = eINSTANCE.getChangePasswordElement_ConfirmLabel();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_PASSWORD_ELEMENT__URI_ELEMENT = eINSTANCE.getChangePasswordElement_UriElement();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.impl.CasAuthenticationImpl <em>Cas Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.impl.CasAuthenticationImpl
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getCasAuthentication()
		 * @generated
		 */
		EClass CAS_AUTHENTICATION = eINSTANCE.getCasAuthentication();

		/**
		 * The meta object literal for the '<em><b>Login Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAS_AUTHENTICATION__LOGIN_LABEL = eINSTANCE.getCasAuthentication_LoginLabel();

		/**
		 * The meta object literal for the '<em><b>Logout Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAS_AUTHENTICATION__LOGOUT_LABEL = eINSTANCE.getCasAuthentication_LogoutLabel();

	}

} //SecurityPackage
