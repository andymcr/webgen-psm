/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Authentication System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getUserService <em>User Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getUserAuthenticationKey <em>User Authentication Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getAuthenticationService <em>Authentication Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getLoginAttemptService <em>Login Attempt Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getAutoLoginService <em>Auto Login Service</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getRegistrationUnit <em>Registration Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getLoginUnit <em>Login Unit</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem()
 * @model
 * @generated
 */
public interface LocalAuthenticationSystem extends Authentication {
	/**
	 * Returns the value of the '<em><b>User Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Service</em>' reference.
	 * @see #setUserService(Service)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_UserService()
	 * @model required="true"
	 * @generated
	 */
	Service getUserService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getUserService <em>User Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Service</em>' reference.
	 * @see #getUserService()
	 * @generated
	 */
	void setUserService(Service value);

	/**
	 * Returns the value of the '<em><b>User Authentication Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Authentication Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Authentication Key</em>' reference.
	 * @see #setUserAuthenticationKey(ServiceAttribute)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_UserAuthenticationKey()
	 * @model required="true"
	 * @generated
	 */
	ServiceAttribute getUserAuthenticationKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getUserAuthenticationKey <em>User Authentication Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Authentication Key</em>' reference.
	 * @see #getUserAuthenticationKey()
	 * @generated
	 */
	void setUserAuthenticationKey(ServiceAttribute value);

	/**
	 * Returns the value of the '<em><b>Authentication Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Service</em>' reference.
	 * @see #setAuthenticationService(Service)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_AuthenticationService()
	 * @model
	 * @generated
	 */
	Service getAuthenticationService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getAuthenticationService <em>Authentication Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Service</em>' reference.
	 * @see #getAuthenticationService()
	 * @generated
	 */
	void setAuthenticationService(Service value);

	/**
	 * Returns the value of the '<em><b>Login Attempt Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Attempt Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Attempt Service</em>' reference.
	 * @see #setLoginAttemptService(Service)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_LoginAttemptService()
	 * @model
	 * @generated
	 */
	Service getLoginAttemptService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getLoginAttemptService <em>Login Attempt Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Attempt Service</em>' reference.
	 * @see #getLoginAttemptService()
	 * @generated
	 */
	void setLoginAttemptService(Service value);

	/**
	 * Returns the value of the '<em><b>Auto Login Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Login Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Login Service</em>' reference.
	 * @see #setAutoLoginService(Service)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_AutoLoginService()
	 * @model
	 * @generated
	 */
	Service getAutoLoginService();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getAutoLoginService <em>Auto Login Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Login Service</em>' reference.
	 * @see #getAutoLoginService()
	 * @generated
	 */
	void setAutoLoginService(Service value);

	/**
	 * Returns the value of the '<em><b>Allow Self Registration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Self Registration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Self Registration</em>' attribute.
	 * @see #setAllowSelfRegistration(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_AllowSelfRegistration()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAllowSelfRegistration();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isAllowSelfRegistration <em>Allow Self Registration</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Use Email Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Email Activation</em>' attribute.
	 * @see #setUseEmailActivation(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_UseEmailActivation()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isUseEmailActivation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isUseEmailActivation <em>Use Email Activation</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Send Welcome Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Welcome Email</em>' attribute.
	 * @see #setSendWelcomeEmail(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_SendWelcomeEmail()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isSendWelcomeEmail();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#isSendWelcomeEmail <em>Send Welcome Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Welcome Email</em>' attribute.
	 * @see #isSendWelcomeEmail()
	 * @generated
	 */
	void setSendWelcomeEmail(boolean value);

	/**
	 * Returns the value of the '<em><b>Registration Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.RegistrationUnit#getAuthenticationSystem <em>Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registration Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration Unit</em>' reference.
	 * @see #setRegistrationUnit(RegistrationUnit)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_RegistrationUnit()
	 * @see uk.ac.man.cs.mdsd.waf.RegistrationUnit#getAuthenticationSystem
	 * @model opposite="authenticationSystem"
	 * @generated
	 */
	RegistrationUnit getRegistrationUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getRegistrationUnit <em>Registration Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Unit</em>' reference.
	 * @see #getRegistrationUnit()
	 * @generated
	 */
	void setRegistrationUnit(RegistrationUnit value);

	/**
	 * Returns the value of the '<em><b>Login Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.LoginUnit#getAuthenticationSystem <em>Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Unit</em>' reference.
	 * @see #setLoginUnit(LoginUnit)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_LoginUnit()
	 * @see uk.ac.man.cs.mdsd.waf.LoginUnit#getAuthenticationSystem
	 * @model opposite="authenticationSystem" required="true"
	 * @generated
	 */
	LoginUnit getLoginUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getLoginUnit <em>Login Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Unit</em>' reference.
	 * @see #getLoginUnit()
	 * @generated
	 */
	void setLoginUnit(LoginUnit value);

	/**
	 * Returns the value of the '<em><b>Forgotten Password Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit#getAuthenticationSystem <em>Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forgotten Password Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forgotten Password Unit</em>' reference.
	 * @see #setForgottenPasswordUnit(ForgottenPasswordUnit)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getLocalAuthenticationSystem_ForgottenPasswordUnit()
	 * @see uk.ac.man.cs.mdsd.waf.ForgottenPasswordUnit#getAuthenticationSystem
	 * @model opposite="authenticationSystem"
	 * @generated
	 */
	ForgottenPasswordUnit getForgottenPasswordUnit();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.LocalAuthenticationSystem#getForgottenPasswordUnit <em>Forgotten Password Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forgotten Password Unit</em>' reference.
	 * @see #getForgottenPasswordUnit()
	 * @generated
	 */
	void setForgottenPasswordUnit(ForgottenPasswordUnit value);

} // LocalAuthenticationSystem
