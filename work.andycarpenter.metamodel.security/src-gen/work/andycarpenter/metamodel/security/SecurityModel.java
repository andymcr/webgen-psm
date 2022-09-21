/**
 */
package work.andycarpenter.metamodel.security;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.SecurityModel#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.SecurityModel#isIsAuthenticated <em>Is Authenticated</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.metamodel.security.SecurityPackage#getSecurityModel()
 * @model
 * @generated
 */
public interface SecurityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' containment reference.
	 * @see #setAuthentication(Authentication)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getSecurityModel_Authentication()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Authentication getAuthentication();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.SecurityModel#getAuthentication <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' containment reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(Authentication value);

	/**
	 * Returns the value of the '<em><b>Is Authenticated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Authenticated</em>' attribute.
	 * @see #isSetIsAuthenticated()
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getSecurityModel_IsAuthenticated()
	 * @model unique="false" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='not authentication.oclIsUndefined()'"
	 * @generated
	 */
	boolean isIsAuthenticated();

	/**
	 * Returns whether the value of the '{@link work.andycarpenter.metamodel.security.SecurityModel#isIsAuthenticated <em>Is Authenticated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Authenticated</em>' attribute is set.
	 * @see #isIsAuthenticated()
	 * @generated
	 */
	boolean isSetIsAuthenticated();

} // SecurityModel
