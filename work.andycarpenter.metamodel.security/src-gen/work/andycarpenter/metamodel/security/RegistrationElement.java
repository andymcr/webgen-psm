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

} // RegistrationElement
