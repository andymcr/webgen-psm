/**
 */
package work.andycarpenter.metamodel.security;

import org.eclipse.emf.ecore.EObject;

import work.andycarpenter.metamodel.orm.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.Authentication#getUserModel <em>User Model</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.metamodel.security.SecurityPackage#getAuthentication()
 * @model abstract="true"
 * @generated
 */
public interface Authentication extends EObject {
	/**
	 * Returns the value of the '<em><b>User Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Model</em>' reference.
	 * @see #setUserModel(Entity)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getAuthentication_UserModel()
	 * @model required="true"
	 * @generated
	 */
	Entity getUserModel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.Authentication#getUserModel <em>User Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Model</em>' reference.
	 * @see #getUserModel()
	 * @generated
	 */
	void setUserModel(Entity value);

} // Authentication
