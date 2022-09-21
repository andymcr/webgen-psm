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
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getUriEmailSent <em>Uri Email Sent</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailSubject <em>Email Subject</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailMessage <em>Email Message</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailSentCaption <em>Email Sent Caption</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailSentMessage <em>Email Sent Message</em>}</li>
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
	 * Returns the value of the '<em><b>Uri Email Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Email Sent</em>' attribute.
	 * @see #setUriEmailSent(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_UriEmailSent()
	 * @model unique="false" required="true"
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
	 * Returns the value of the '<em><b>Email Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Subject</em>' attribute.
	 * @see #setEmailSubject(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_EmailSubject()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getEmailSubject();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailSubject <em>Email Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Subject</em>' attribute.
	 * @see #getEmailSubject()
	 * @generated
	 */
	void setEmailSubject(String value);

	/**
	 * Returns the value of the '<em><b>Email Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Message</em>' attribute.
	 * @see #setEmailMessage(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_EmailMessage()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getEmailMessage();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailMessage <em>Email Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Message</em>' attribute.
	 * @see #getEmailMessage()
	 * @generated
	 */
	void setEmailMessage(String value);

	/**
	 * Returns the value of the '<em><b>Email Sent Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Sent Caption</em>' attribute.
	 * @see #setEmailSentCaption(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_EmailSentCaption()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getEmailSentCaption();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailSentCaption <em>Email Sent Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Sent Caption</em>' attribute.
	 * @see #getEmailSentCaption()
	 * @generated
	 */
	void setEmailSentCaption(String value);

	/**
	 * Returns the value of the '<em><b>Email Sent Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Sent Message</em>' attribute.
	 * @see #setEmailSentMessage(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getForgottenPasswordElement_EmailSentMessage()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getEmailSentMessage();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement#getEmailSentMessage <em>Email Sent Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Sent Message</em>' attribute.
	 * @see #getEmailSentMessage()
	 * @generated
	 */
	void setEmailSentMessage(String value);

} // ForgottenPasswordElement
