/**
 */
package work.andycarpenter.metamodel.security;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Password Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.ChangePasswordElement#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ChangePasswordElement#getInvokeLabel <em>Invoke Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ChangePasswordElement#getConfirmLabel <em>Confirm Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.ChangePasswordElement#getUriElement <em>Uri Element</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.metamodel.security.SecurityPackage#getChangePasswordElement()
 * @model
 * @generated
 */
public interface ChangePasswordElement extends AuthenticationElement {
	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getChangePasswordElement <em>Change Password Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' container reference.
	 * @see #setAuthentication(LocalAuthenticationSystem)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getChangePasswordElement_Authentication()
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem#getChangePasswordElement
	 * @model opposite="changePasswordElement" required="true" transient="false"
	 * @generated
	 */
	LocalAuthenticationSystem getAuthentication();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ChangePasswordElement#getAuthentication <em>Authentication</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' container reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(LocalAuthenticationSystem value);

	/**
	 * Returns the value of the '<em><b>Invoke Label</b></em>' attribute.
	 * The default value is <code>"Change Password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoke Label</em>' attribute.
	 * @see #setInvokeLabel(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getChangePasswordElement_InvokeLabel()
	 * @model default="Change Password" unique="false" required="true"
	 * @generated
	 */
	String getInvokeLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ChangePasswordElement#getInvokeLabel <em>Invoke Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoke Label</em>' attribute.
	 * @see #getInvokeLabel()
	 * @generated
	 */
	void setInvokeLabel(String value);

	/**
	 * Returns the value of the '<em><b>Confirm Label</b></em>' attribute.
	 * The default value is <code>"Set Password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Label</em>' attribute.
	 * @see #setConfirmLabel(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getChangePasswordElement_ConfirmLabel()
	 * @model default="Set Password" unique="false" required="true"
	 * @generated
	 */
	String getConfirmLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ChangePasswordElement#getConfirmLabel <em>Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Label</em>' attribute.
	 * @see #getConfirmLabel()
	 * @generated
	 */
	void setConfirmLabel(String value);

	/**
	 * Returns the value of the '<em><b>Uri Element</b></em>' attribute.
	 * The default value is <code>"change-password"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Element</em>' attribute.
	 * @see #setUriElement(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getChangePasswordElement_UriElement()
	 * @model default="change-password" unique="false" required="true"
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.ChangePasswordElement#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

} // ChangePasswordElement
