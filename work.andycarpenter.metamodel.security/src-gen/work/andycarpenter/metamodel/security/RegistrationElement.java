/**
 */
package work.andycarpenter.metamodel.security;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registration Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.RegistrationElement#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.RegistrationElement#getInvokeLabel <em>Invoke Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.RegistrationElement#getConfirmLabel <em>Confirm Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.RegistrationElement#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.RegistrationElement#getUriEmailVerification <em>Uri Email Verification</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.metamodel.security.SecurityPackage#getRegistrationElement()
 * @model
 * @generated
 */
public interface RegistrationElement extends AuthenticationElement {
	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getRegistrationElement <em>Registration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' container reference.
	 * @see #setAuthentication(LocalAuthenticationSystem)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getRegistrationElement_Authentication()
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getRegistrationElement
	 * @model opposite="registrationElement" required="true" transient="false"
	 * @generated
	 */
	LocalAuthenticationSystem getAuthentication();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.RegistrationElement#getAuthentication <em>Authentication</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' container reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(LocalAuthenticationSystem value);

	/**
	 * Returns the value of the '<em><b>Invoke Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoke Label</em>' attribute.
	 * @see #setInvokeLabel(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getRegistrationElement_InvokeLabel()
	 * @model default="" unique="false" required="true"
	 * @generated
	 */
	String getInvokeLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.RegistrationElement#getInvokeLabel <em>Invoke Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoke Label</em>' attribute.
	 * @see #getInvokeLabel()
	 * @generated
	 */
	void setInvokeLabel(String value);

	/**
	 * Returns the value of the '<em><b>Confirm Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Label</em>' attribute.
	 * @see #setConfirmLabel(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getRegistrationElement_ConfirmLabel()
	 * @model default="" unique="false" required="true"
	 * @generated
	 */
	String getConfirmLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.RegistrationElement#getConfirmLabel <em>Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Label</em>' attribute.
	 * @see #getConfirmLabel()
	 * @generated
	 */
	void setConfirmLabel(String value);

	/**
	 * Returns the value of the '<em><b>Uri Element</b></em>' attribute.
	 * The default value is <code>"register"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Element</em>' attribute.
	 * @see #setUriElement(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getRegistrationElement_UriElement()
	 * @model default="register" unique="false" required="true"
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.RegistrationElement#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

	/**
	 * Returns the value of the '<em><b>Uri Email Verification</b></em>' attribute.
	 * The default value is <code>"verify"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Email Verification</em>' attribute.
	 * @see #setUriEmailVerification(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getRegistrationElement_UriEmailVerification()
	 * @model default="verify" unique="false" required="true"
	 * @generated
	 */
	String getUriEmailVerification();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.RegistrationElement#getUriEmailVerification <em>Uri Email Verification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Email Verification</em>' attribute.
	 * @see #getUriEmailVerification()
	 * @generated
	 */
	void setUriEmailVerification(String value);

} // RegistrationElement
