/**
 */
package work.andycarpenter.metamodel.security;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forgotten Password Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getInvokeLabel <em>Invoke Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getRequestLabel <em>Request Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getResetLabel <em>Reset Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getUriEmailSent <em>Uri Email Sent</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getUriResetPassword <em>Uri Reset Password</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailHelp <em>Email Help</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordLabel <em>Password Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordPlaceholder <em>Password Placeholder</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordTitle <em>Password Title</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordConfirmationLabel <em>Password Confirmation Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordConfirmationPlaceholder <em>Password Confirmation Placeholder</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordConfirmationTitle <em>Password Confirmation Title</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordMessageRequired <em>Password Message Required</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordMessageValueMismatch <em>Password Message Value Mismatch</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailCheckSubject <em>Email Check Subject</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailCheckMessage <em>Email Check Message</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailCheckSentCaption <em>Email Check Sent Caption</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailCheckSentMessage <em>Email Check Sent Message</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement()
 * @model
 * @generated
 */
public interface ForgottenPasswordElement extends AuthenticationElement {
	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getForgottenPasswordElement <em>Forgotten Password Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' container reference.
	 * @see #setAuthentication(LocalAuthenticationSystem)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_Authentication()
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getForgottenPasswordElement
	 * @model opposite="forgottenPasswordElement" required="true" transient="false"
	 * @generated
	 */
	LocalAuthenticationSystem getAuthentication();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getAuthentication <em>Authentication</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' container reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(LocalAuthenticationSystem value);

	/**
	 * Returns the value of the '<em><b>Invoke Label</b></em>' attribute.
	 * The default value is <code>"Forgotten Password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoke Label</em>' attribute.
	 * @see #setInvokeLabel(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_InvokeLabel()
	 * @model default="Forgotten Password" unique="false" required="true"
	 * @generated
	 */
	String getInvokeLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getInvokeLabel <em>Invoke Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoke Label</em>' attribute.
	 * @see #getInvokeLabel()
	 * @generated
	 */
	void setInvokeLabel(String value);

	/**
	 * Returns the value of the '<em><b>Request Label</b></em>' attribute.
	 * The default value is <code>"Request Password Reset"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Label</em>' attribute.
	 * @see #setRequestLabel(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_RequestLabel()
	 * @model default="Request Password Reset" unique="false" required="true"
	 * @generated
	 */
	String getRequestLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getRequestLabel <em>Request Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Label</em>' attribute.
	 * @see #getRequestLabel()
	 * @generated
	 */
	void setRequestLabel(String value);

	/**
	 * Returns the value of the '<em><b>Reset Label</b></em>' attribute.
	 * The default value is <code>"Set Password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Label</em>' attribute.
	 * @see #setResetLabel(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_ResetLabel()
	 * @model default="Set Password" unique="false" required="true"
	 * @generated
	 */
	String getResetLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getResetLabel <em>Reset Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Label</em>' attribute.
	 * @see #getResetLabel()
	 * @generated
	 */
	void setResetLabel(String value);

	/**
	 * Returns the value of the '<em><b>Uri Element</b></em>' attribute.
	 * The default value is <code>"forgotten-password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Element</em>' attribute.
	 * @see #setUriElement(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_UriElement()
	 * @model default="forgotten-password" unique="false" required="true"
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

	/**
	 * Returns the value of the '<em><b>Uri Email Sent</b></em>' attribute.
	 * The default value is <code>"check-email"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Email Sent</em>' attribute.
	 * @see #setUriEmailSent(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_UriEmailSent()
	 * @model default="check-email" unique="false" required="true"
	 * @generated
	 */
	String getUriEmailSent();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getUriEmailSent <em>Uri Email Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Email Sent</em>' attribute.
	 * @see #getUriEmailSent()
	 * @generated
	 */
	void setUriEmailSent(String value);

	/**
	 * Returns the value of the '<em><b>Uri Reset Password</b></em>' attribute.
	 * The default value is <code>"reset"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Reset Password</em>' attribute.
	 * @see #setUriResetPassword(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_UriResetPassword()
	 * @model default="reset" unique="false" required="true"
	 * @generated
	 */
	String getUriResetPassword();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getUriResetPassword <em>Uri Reset Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Reset Password</em>' attribute.
	 * @see #getUriResetPassword()
	 * @generated
	 */
	void setUriResetPassword(String value);

	/**
	 * Returns the value of the '<em><b>Email Help</b></em>' attribute.
	 * The default value is <code>"Enter your email address and we we will send you a link to reset your password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Help</em>' attribute.
	 * @see #setEmailHelp(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_EmailHelp()
	 * @model default="Enter your email address and we we will send you a link to reset your password" unique="false" required="true"
	 * @generated
	 */
	String getEmailHelp();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailHelp <em>Email Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Help</em>' attribute.
	 * @see #getEmailHelp()
	 * @generated
	 */
	void setEmailHelp(String value);

	/**
	 * Returns the value of the '<em><b>Password Label</b></em>' attribute.
	 * The default value is <code>"New Password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Label</em>' attribute.
	 * @see #setPasswordLabel(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_PasswordLabel()
	 * @model default="New Password" unique="false" required="true"
	 * @generated
	 */
	String getPasswordLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordLabel <em>Password Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Label</em>' attribute.
	 * @see #getPasswordLabel()
	 * @generated
	 */
	void setPasswordLabel(String value);

	/**
	 * Returns the value of the '<em><b>Password Placeholder</b></em>' attribute.
	 * The default value is <code>"New Password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Placeholder</em>' attribute.
	 * @see #setPasswordPlaceholder(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_PasswordPlaceholder()
	 * @model default="New Password" unique="false" required="true"
	 * @generated
	 */
	String getPasswordPlaceholder();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordPlaceholder <em>Password Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Placeholder</em>' attribute.
	 * @see #getPasswordPlaceholder()
	 * @generated
	 */
	void setPasswordPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Password Title</b></em>' attribute.
	 * The default value is <code>"New Password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Title</em>' attribute.
	 * @see #setPasswordTitle(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_PasswordTitle()
	 * @model default="New Password" unique="false" required="true"
	 * @generated
	 */
	String getPasswordTitle();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordTitle <em>Password Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Title</em>' attribute.
	 * @see #getPasswordTitle()
	 * @generated
	 */
	void setPasswordTitle(String value);

	/**
	 * Returns the value of the '<em><b>Password Confirmation Label</b></em>' attribute.
	 * The default value is <code>"Confirm Password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Confirmation Label</em>' attribute.
	 * @see #setPasswordConfirmationLabel(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_PasswordConfirmationLabel()
	 * @model default="Confirm Password" unique="false" required="true"
	 * @generated
	 */
	String getPasswordConfirmationLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordConfirmationLabel <em>Password Confirmation Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Confirmation Label</em>' attribute.
	 * @see #getPasswordConfirmationLabel()
	 * @generated
	 */
	void setPasswordConfirmationLabel(String value);

	/**
	 * Returns the value of the '<em><b>Password Confirmation Placeholder</b></em>' attribute.
	 * The default value is <code>"Confirm Password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Confirmation Placeholder</em>' attribute.
	 * @see #setPasswordConfirmationPlaceholder(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_PasswordConfirmationPlaceholder()
	 * @model default="Confirm Password" unique="false" required="true"
	 * @generated
	 */
	String getPasswordConfirmationPlaceholder();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordConfirmationPlaceholder <em>Password Confirmation Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Confirmation Placeholder</em>' attribute.
	 * @see #getPasswordConfirmationPlaceholder()
	 * @generated
	 */
	void setPasswordConfirmationPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Password Confirmation Title</b></em>' attribute.
	 * The default value is <code>"Confirm Password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Confirmation Title</em>' attribute.
	 * @see #setPasswordConfirmationTitle(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_PasswordConfirmationTitle()
	 * @model default="Confirm Password" unique="false" required="true"
	 * @generated
	 */
	String getPasswordConfirmationTitle();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordConfirmationTitle <em>Password Confirmation Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Confirmation Title</em>' attribute.
	 * @see #getPasswordConfirmationTitle()
	 * @generated
	 */
	void setPasswordConfirmationTitle(String value);

	/**
	 * Returns the value of the '<em><b>Password Message Required</b></em>' attribute.
	 * The default value is <code>"A password value is required"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Message Required</em>' attribute.
	 * @see #setPasswordMessageRequired(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_PasswordMessageRequired()
	 * @model default="A password value is required" unique="false" required="true"
	 * @generated
	 */
	String getPasswordMessageRequired();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordMessageRequired <em>Password Message Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Message Required</em>' attribute.
	 * @see #getPasswordMessageRequired()
	 * @generated
	 */
	void setPasswordMessageRequired(String value);

	/**
	 * Returns the value of the '<em><b>Password Message Value Mismatch</b></em>' attribute.
	 * The default value is <code>"The two password values do not match"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Message Value Mismatch</em>' attribute.
	 * @see #setPasswordMessageValueMismatch(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_PasswordMessageValueMismatch()
	 * @model default="The two password values do not match" unique="false" required="true"
	 * @generated
	 */
	String getPasswordMessageValueMismatch();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getPasswordMessageValueMismatch <em>Password Message Value Mismatch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Message Value Mismatch</em>' attribute.
	 * @see #getPasswordMessageValueMismatch()
	 * @generated
	 */
	void setPasswordMessageValueMismatch(String value);

	/**
	 * Returns the value of the '<em><b>Email Check Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Check Subject</em>' attribute.
	 * @see #setEmailCheckSubject(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_EmailCheckSubject()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getEmailCheckSubject();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailCheckSubject <em>Email Check Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Check Subject</em>' attribute.
	 * @see #getEmailCheckSubject()
	 * @generated
	 */
	void setEmailCheckSubject(String value);

	/**
	 * Returns the value of the '<em><b>Email Check Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Check Message</em>' attribute.
	 * @see #setEmailCheckMessage(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_EmailCheckMessage()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getEmailCheckMessage();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailCheckMessage <em>Email Check Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Check Message</em>' attribute.
	 * @see #getEmailCheckMessage()
	 * @generated
	 */
	void setEmailCheckMessage(String value);

	/**
	 * Returns the value of the '<em><b>Email Check Sent Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Check Sent Caption</em>' attribute.
	 * @see #setEmailCheckSentCaption(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_EmailCheckSentCaption()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getEmailCheckSentCaption();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailCheckSentCaption <em>Email Check Sent Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Check Sent Caption</em>' attribute.
	 * @see #getEmailCheckSentCaption()
	 * @generated
	 */
	void setEmailCheckSentCaption(String value);

	/**
	 * Returns the value of the '<em><b>Email Check Sent Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Check Sent Message</em>' attribute.
	 * @see #setEmailCheckSentMessage(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_EmailCheckSentMessage()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getEmailCheckSentMessage();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailCheckSentMessage <em>Email Check Sent Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Check Sent Message</em>' attribute.
	 * @see #getEmailCheckSentMessage()
	 * @generated
	 */
	void setEmailCheckSentMessage(String value);

} // ForgottenPasswordElement
