/**
 */
package work.andycarpenter.metamodel.security;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>User Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__USER_KEY = 1;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>User Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USER_KEY = AUTHENTICATION__USER_KEY;

	/**
	 * The feature id for the '<em><b>Authentication Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier Feture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__IDENTIFIER_FETURE = AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__PASSWORD_FEATURE = AUTHENTICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Authentication Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY = AUTHENTICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reset Password Request Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL = AUTHENTICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Registration Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT = AUTHENTICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Registration Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__HAS_REGISTRATION_ELEMENT = AUTHENTICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Login Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ELEMENT = AUTHENTICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Logout Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_ELEMENT = AUTHENTICATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Forgotten Password Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT = AUTHENTICATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Reset Password Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_ELEMENT = AUTHENTICATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Captcha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA = AUTHENTICATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Allow Remember Me</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME = AUTHENTICATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Allow Self Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION = AUTHENTICATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Use Email Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION = AUTHENTICATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Send Welcome Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL = AUTHENTICATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__SECTION_CLASS = AUTHENTICATION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__CAPTION_CLASS = AUTHENTICATION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM__CONTENT_CLASS = AUTHENTICATION_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Local Authentication System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_AUTHENTICATION_SYSTEM_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 19;

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
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__CONFIRM_LABEL = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__URI_ELEMENT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Section Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__SECTION_CLASS_OVERRIDE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__SECTION_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__HAS_SECTION_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Caption Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__CAPTION_CLASS_OVERRIDE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__CAPTION_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Has Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__HAS_CAPTION_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Content Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__CONTENT_CLASS_OVERRIDE = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__CONTENT_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Has Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT__HAS_CONTENT_CLASS = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Authentication Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ELEMENT_FEATURE_COUNT = BasePackage.NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 11;

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
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__CONFIRM_LABEL = AUTHENTICATION_ELEMENT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT__URI_ELEMENT = AUTHENTICATION_ELEMENT__URI_ELEMENT;

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
	 * The number of structural features of the '<em>Registration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRATION_ELEMENT_FEATURE_COUNT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT__CONFIRM_LABEL = AUTHENTICATION_ELEMENT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT__URI_ELEMENT = AUTHENTICATION_ELEMENT__URI_ELEMENT;

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
	 * The number of structural features of the '<em>Login Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ELEMENT_FEATURE_COUNT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT__CONFIRM_LABEL = AUTHENTICATION_ELEMENT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT__URI_ELEMENT = AUTHENTICATION_ELEMENT__URI_ELEMENT;

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
	 * The number of structural features of the '<em>Logout Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGOUT_ELEMENT_FEATURE_COUNT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__CONFIRM_LABEL = AUTHENTICATION_ELEMENT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__URI_ELEMENT = AUTHENTICATION_ELEMENT__URI_ELEMENT;

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
	 * The feature id for the '<em><b>Uri Email Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Email Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SUBJECT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Email Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__EMAIL_MESSAGE = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Email Sent Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_CAPTION = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Email Sent Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_MESSAGE = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Forgotten Password Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT_FEATURE_COUNT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Forgotten Password Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORGOTTEN_PASSWORD_ELEMENT_OPERATION_COUNT = AUTHENTICATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.impl.ResetPasswordElementImpl <em>Reset Password Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.impl.ResetPasswordElementImpl
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getResetPasswordElement()
	 * @generated
	 */
	int RESET_PASSWORD_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_ELEMENT__NAME = AUTHENTICATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_ELEMENT__DISPLAY_LABEL = AUTHENTICATION_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Confirm Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_ELEMENT__CONFIRM_LABEL = AUTHENTICATION_ELEMENT__CONFIRM_LABEL;

	/**
	 * The feature id for the '<em><b>Uri Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_ELEMENT__URI_ELEMENT = AUTHENTICATION_ELEMENT__URI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Section Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_ELEMENT__SECTION_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__SECTION_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_ELEMENT__SECTION_CLASS = AUTHENTICATION_ELEMENT__SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Has Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_ELEMENT__HAS_SECTION_CLASS = AUTHENTICATION_ELEMENT__HAS_SECTION_CLASS;

	/**
	 * The feature id for the '<em><b>Caption Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_ELEMENT__CAPTION_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__CAPTION_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_ELEMENT__CAPTION_CLASS = AUTHENTICATION_ELEMENT__CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Has Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_ELEMENT__HAS_CAPTION_CLASS = AUTHENTICATION_ELEMENT__HAS_CAPTION_CLASS;

	/**
	 * The feature id for the '<em><b>Content Class Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_ELEMENT__CONTENT_CLASS_OVERRIDE = AUTHENTICATION_ELEMENT__CONTENT_CLASS_OVERRIDE;

	/**
	 * The feature id for the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_ELEMENT__CONTENT_CLASS = AUTHENTICATION_ELEMENT__CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Has Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_ELEMENT__HAS_CONTENT_CLASS = AUTHENTICATION_ELEMENT__HAS_CONTENT_CLASS;

	/**
	 * The feature id for the '<em><b>Authentication</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_ELEMENT__AUTHENTICATION = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reset Password Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_ELEMENT_FEATURE_COUNT = AUTHENTICATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reset Password Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_PASSWORD_ELEMENT_OPERATION_COUNT = AUTHENTICATION_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>User Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAS_AUTHENTICATION__USER_KEY = AUTHENTICATION__USER_KEY;

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
	 * The meta object id for the '{@link work.andycarpenter.metamodel.security.AuthenticationKeyTypes <em>Authentication Key Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.security.AuthenticationKeyTypes
	 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getAuthenticationKeyTypes()
	 * @generated
	 */
	int AUTHENTICATION_KEY_TYPES = 10;


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
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.Authentication#getUserKey <em>User Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Key</em>'.
	 * @see work.andycarpenter.metamodel.security.Authentication#getUserKey()
	 * @see #getAuthentication()
	 * @generated
	 */
	EReference getAuthentication_UserKey();

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
	 * Returns the meta object for the reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getIdentifierFeture <em>Identifier Feture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifier Feture</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getIdentifierFeture()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_IdentifierFeture();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationKey <em>Authentication Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Key</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationKey()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EAttribute getLocalAuthenticationSystem_AuthenticationKey();

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
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getResetPasswordElement <em>Reset Password Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reset Password Element</em>'.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getResetPasswordElement()
	 * @see #getLocalAuthenticationSystem()
	 * @generated
	 */
	EReference getLocalAuthenticationSystem_ResetPasswordElement();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.AuthenticationElement#getConfirmLabel <em>Confirm Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Label</em>'.
	 * @see work.andycarpenter.metamodel.security.AuthenticationElement#getConfirmLabel()
	 * @see #getAuthenticationElement()
	 * @generated
	 */
	EAttribute getAuthenticationElement_ConfirmLabel();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.AuthenticationElement#getUriElement <em>Uri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Element</em>'.
	 * @see work.andycarpenter.metamodel.security.AuthenticationElement#getUriElement()
	 * @see #getAuthenticationElement()
	 * @generated
	 */
	EAttribute getAuthenticationElement_UriElement();

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
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailSubject <em>Email Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Subject</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailSubject()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_EmailSubject();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailMessage <em>Email Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Message</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailMessage()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_EmailMessage();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailSentCaption <em>Email Sent Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Sent Caption</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailSentCaption()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_EmailSentCaption();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailSentMessage <em>Email Sent Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Sent Message</em>'.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailSentMessage()
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	EAttribute getForgottenPasswordElement_EmailSentMessage();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.metamodel.security.ResetPasswordElement <em>Reset Password Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Password Element</em>'.
	 * @see work.andycarpenter.metamodel.security.ResetPasswordElement
	 * @generated
	 */
	EClass getResetPasswordElement();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.metamodel.security.ResetPasswordElement#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Authentication</em>'.
	 * @see work.andycarpenter.metamodel.security.ResetPasswordElement#getAuthentication()
	 * @see #getResetPasswordElement()
	 * @generated
	 */
	EReference getResetPasswordElement_Authentication();

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
	 * Returns the meta object for enum '{@link work.andycarpenter.metamodel.security.AuthenticationKeyTypes <em>Authentication Key Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authentication Key Types</em>'.
	 * @see work.andycarpenter.metamodel.security.AuthenticationKeyTypes
	 * @generated
	 */
	EEnum getAuthenticationKeyTypes();

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
		 * The meta object literal for the '<em><b>User Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION__USER_KEY = eINSTANCE.getAuthentication_UserKey();

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
		 * The meta object literal for the '<em><b>Identifier Feture</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__IDENTIFIER_FETURE = eINSTANCE.getLocalAuthenticationSystem_IdentifierFeture();

		/**
		 * The meta object literal for the '<em><b>Password Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__PASSWORD_FEATURE = eINSTANCE.getLocalAuthenticationSystem_PasswordFeature();

		/**
		 * The meta object literal for the '<em><b>Authentication Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY = eINSTANCE.getLocalAuthenticationSystem_AuthenticationKey();

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
		 * The meta object literal for the '<em><b>Reset Password Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_ELEMENT = eINSTANCE.getLocalAuthenticationSystem_ResetPasswordElement();

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
		 * The meta object literal for the '<em><b>Confirm Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_ELEMENT__CONFIRM_LABEL = eINSTANCE.getAuthenticationElement_ConfirmLabel();

		/**
		 * The meta object literal for the '<em><b>Uri Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_ELEMENT__URI_ELEMENT = eINSTANCE.getAuthenticationElement_UriElement();

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
		 * The meta object literal for the '<em><b>Uri Email Sent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT = eINSTANCE.getForgottenPasswordElement_UriEmailSent();

		/**
		 * The meta object literal for the '<em><b>Email Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SUBJECT = eINSTANCE.getForgottenPasswordElement_EmailSubject();

		/**
		 * The meta object literal for the '<em><b>Email Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__EMAIL_MESSAGE = eINSTANCE.getForgottenPasswordElement_EmailMessage();

		/**
		 * The meta object literal for the '<em><b>Email Sent Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_CAPTION = eINSTANCE.getForgottenPasswordElement_EmailSentCaption();

		/**
		 * The meta object literal for the '<em><b>Email Sent Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_MESSAGE = eINSTANCE.getForgottenPasswordElement_EmailSentMessage();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.impl.ResetPasswordElementImpl <em>Reset Password Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.impl.ResetPasswordElementImpl
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getResetPasswordElement()
		 * @generated
		 */
		EClass RESET_PASSWORD_ELEMENT = eINSTANCE.getResetPasswordElement();

		/**
		 * The meta object literal for the '<em><b>Authentication</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESET_PASSWORD_ELEMENT__AUTHENTICATION = eINSTANCE.getResetPasswordElement_Authentication();

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

		/**
		 * The meta object literal for the '{@link work.andycarpenter.metamodel.security.AuthenticationKeyTypes <em>Authentication Key Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.metamodel.security.AuthenticationKeyTypes
		 * @see work.andycarpenter.metamodel.security.impl.SecurityPackageImpl#getAuthenticationKeyTypes()
		 * @generated
		 */
		EEnum AUTHENTICATION_KEY_TYPES = eINSTANCE.getAuthenticationKeyTypes();

	}

} //SecurityPackage
