/**
 */
package work.andycarpenter.metamodel.security;

import work.andycarpenter.metamodel.orm.Attribute;
import work.andycarpenter.metamodel.orm.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Authentication System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationModel <em>Authentication Model</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getUserKey <em>User Key</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationKey <em>Authentication Key</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getIdentifierFeature <em>Identifier Feature</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getPasswordFeature <em>Password Feature</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getResetPasswordRequestModel <em>Reset Password Request Model</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getRegistrationElement <em>Registration Element</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isHasRegistrationElement <em>Has Registration Element</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getLoginElement <em>Login Element</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getLogoutElement <em>Logout Element</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getForgottenPasswordElement <em>Forgotten Password Element</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getChangePasswordElement <em>Change Password Element</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isCaptcha <em>Captcha</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isAllowRememberMe <em>Allow Remember Me</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getSectionClass <em>Section Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getCaptionClass <em>Caption Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getContentClass <em>Content Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem()
 * @model
 * @generated
 */
public interface LocalAuthenticationSystem extends Authentication {
	/**
	 * Returns the value of the '<em><b>Authentication Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Model</em>' reference.
	 * @see #setAuthenticationModel(Entity)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_AuthenticationModel()
	 * @model required="true"
	 * @generated
	 */
	Entity getAuthenticationModel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationModel <em>Authentication Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Model</em>' reference.
	 * @see #getAuthenticationModel()
	 * @generated
	 */
	void setAuthenticationModel(Entity value);

	/**
	 * Returns the value of the '<em><b>User Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Key</em>' reference.
	 * @see #setUserKey(Attribute)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_UserKey()
	 * @model required="true"
	 * @generated
	 */
	Attribute getUserKey();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getUserKey <em>User Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Key</em>' reference.
	 * @see #getUserKey()
	 * @generated
	 */
	void setUserKey(Attribute value);

	/**
	 * Returns the value of the '<em><b>Authentication Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Key</em>' reference.
	 * @see #setAuthenticationKey(Attribute)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_AuthenticationKey()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAuthenticationKey();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getAuthenticationKey <em>Authentication Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Key</em>' reference.
	 * @see #getAuthenticationKey()
	 * @generated
	 */
	void setAuthenticationKey(Attribute value);

	/**
	 * Returns the value of the '<em><b>Identifier Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier Feature</em>' reference.
	 * @see #setIdentifierFeature(Attribute)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_IdentifierFeature()
	 * @model required="true"
	 * @generated
	 */
	Attribute getIdentifierFeature();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getIdentifierFeature <em>Identifier Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier Feature</em>' reference.
	 * @see #getIdentifierFeature()
	 * @generated
	 */
	void setIdentifierFeature(Attribute value);

	/**
	 * Returns the value of the '<em><b>Password Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Feature</em>' reference.
	 * @see #setPasswordFeature(Attribute)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_PasswordFeature()
	 * @model required="true"
	 * @generated
	 */
	Attribute getPasswordFeature();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getPasswordFeature <em>Password Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Feature</em>' reference.
	 * @see #getPasswordFeature()
	 * @generated
	 */
	void setPasswordFeature(Attribute value);

	/**
	 * Returns the value of the '<em><b>Reset Password Request Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Password Request Model</em>' reference.
	 * @see #setResetPasswordRequestModel(Entity)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_ResetPasswordRequestModel()
	 * @model required="true"
	 * @generated
	 */
	Entity getResetPasswordRequestModel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getResetPasswordRequestModel <em>Reset Password Request Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Password Request Model</em>' reference.
	 * @see #getResetPasswordRequestModel()
	 * @generated
	 */
	void setResetPasswordRequestModel(Entity value);

	/**
	 * Returns the value of the '<em><b>Registration Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.metamodel.security.RegistrationElement#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration Element</em>' containment reference.
	 * @see #setRegistrationElement(RegistrationElement)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_RegistrationElement()
	 * @see work.andycarpenter.metamodel.security.RegistrationElement#getAuthentication
	 * @model opposite="authentication" containment="true"
	 * @generated
	 */
	RegistrationElement getRegistrationElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getRegistrationElement <em>Registration Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Element</em>' containment reference.
	 * @see #getRegistrationElement()
	 * @generated
	 */
	void setRegistrationElement(RegistrationElement value);

	/**
	 * Returns the value of the '<em><b>Has Registration Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Registration Element</em>' attribute.
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_HasRegistrationElement()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='not registrationElement.oclIsUndefined()'"
	 * @generated
	 */
	boolean isHasRegistrationElement();

	/**
	 * Returns the value of the '<em><b>Login Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.metamodel.security.LoginElement#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Element</em>' containment reference.
	 * @see #setLoginElement(LoginElement)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_LoginElement()
	 * @see work.andycarpenter.metamodel.security.LoginElement#getAuthentication
	 * @model opposite="authentication" containment="true" required="true"
	 * @generated
	 */
	LoginElement getLoginElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getLoginElement <em>Login Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Element</em>' containment reference.
	 * @see #getLoginElement()
	 * @generated
	 */
	void setLoginElement(LoginElement value);

	/**
	 * Returns the value of the '<em><b>Logout Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.metamodel.security.LogoutElement#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logout Element</em>' containment reference.
	 * @see #setLogoutElement(LogoutElement)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_LogoutElement()
	 * @see work.andycarpenter.metamodel.security.LogoutElement#getAuthentication
	 * @model opposite="authentication" containment="true" required="true"
	 * @generated
	 */
	LogoutElement getLogoutElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getLogoutElement <em>Logout Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logout Element</em>' containment reference.
	 * @see #getLogoutElement()
	 * @generated
	 */
	void setLogoutElement(LogoutElement value);

	/**
	 * Returns the value of the '<em><b>Forgotten Password Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forgotten Password Element</em>' containment reference.
	 * @see #setForgottenPasswordElement(ForgottenPasswordElement)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_ForgottenPasswordElement()
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement#getAuthentication
	 * @model opposite="authentication" containment="true" required="true"
	 * @generated
	 */
	ForgottenPasswordElement getForgottenPasswordElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getForgottenPasswordElement <em>Forgotten Password Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forgotten Password Element</em>' containment reference.
	 * @see #getForgottenPasswordElement()
	 * @generated
	 */
	void setForgottenPasswordElement(ForgottenPasswordElement value);

	/**
	 * Returns the value of the '<em><b>Change Password Element</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.metamodel.security.ChangePasswordElement#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Password Element</em>' containment reference.
	 * @see #setChangePasswordElement(ChangePasswordElement)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_ChangePasswordElement()
	 * @see work.andycarpenter.metamodel.security.ChangePasswordElement#getAuthentication
	 * @model opposite="authentication" containment="true" required="true"
	 * @generated
	 */
	ChangePasswordElement getChangePasswordElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getChangePasswordElement <em>Change Password Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Password Element</em>' containment reference.
	 * @see #getChangePasswordElement()
	 * @generated
	 */
	void setChangePasswordElement(ChangePasswordElement value);

	/**
	 * Returns the value of the '<em><b>Captcha</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Captcha</em>' attribute.
	 * @see #setCaptcha(boolean)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_Captcha()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isCaptcha();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isCaptcha <em>Captcha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Captcha</em>' attribute.
	 * @see #isCaptcha()
	 * @generated
	 */
	void setCaptcha(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Remember Me</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Remember Me</em>' attribute.
	 * @see #setAllowRememberMe(boolean)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_AllowRememberMe()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllowRememberMe();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isAllowRememberMe <em>Allow Remember Me</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Remember Me</em>' attribute.
	 * @see #isAllowRememberMe()
	 * @generated
	 */
	void setAllowRememberMe(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Self Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Self Registration</em>' attribute.
	 * @see #setAllowSelfRegistration(boolean)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_AllowSelfRegistration()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllowSelfRegistration();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Self Registration</em>' attribute.
	 * @see #isAllowSelfRegistration()
	 * @generated
	 */
	void setAllowSelfRegistration(boolean value);

	/**
	 * Returns the value of the '<em><b>Use Email Activation</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Email Activation</em>' attribute.
	 * @see #setUseEmailActivation(boolean)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_UseEmailActivation()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isUseEmailActivation();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Email Activation</em>' attribute.
	 * @see #isUseEmailActivation()
	 * @generated
	 */
	void setUseEmailActivation(boolean value);

	/**
	 * Returns the value of the '<em><b>Send Welcome Email</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Welcome Email</em>' attribute.
	 * @see #setSendWelcomeEmail(boolean)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_SendWelcomeEmail()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isSendWelcomeEmail();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Welcome Email</em>' attribute.
	 * @see #isSendWelcomeEmail()
	 * @generated
	 */
	void setSendWelcomeEmail(boolean value);

	/**
	 * Returns the value of the '<em><b>Section Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Class</em>' attribute.
	 * @see #setSectionClass(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_SectionClass()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getSectionClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getSectionClass <em>Section Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Class</em>' attribute.
	 * @see #getSectionClass()
	 * @generated
	 */
	void setSectionClass(String value);

	/**
	 * Returns the value of the '<em><b>Caption Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Class</em>' attribute.
	 * @see #setCaptionClass(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_CaptionClass()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getCaptionClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getCaptionClass <em>Caption Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Class</em>' attribute.
	 * @see #getCaptionClass()
	 * @generated
	 */
	void setCaptionClass(String value);

	/**
	 * Returns the value of the '<em><b>Content Class</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Class</em>' attribute.
	 * @see #setContentClass(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getLocalAuthenticationSystem_ContentClass()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getContentClass();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getContentClass <em>Content Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Class</em>' attribute.
	 * @see #getContentClass()
	 * @generated
	 */
	void setContentClass(String value);

} // LocalAuthenticationSystem
