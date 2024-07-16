/**
 */
package work.andycarpenter.metamodel.security;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Granted Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.IsGrantedRole#getNegated <em>Negated</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.IsGrantedRole#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.metamodel.security.SecurityPackage#getIsGrantedRole()
 * @model
 * @generated
 */
public interface IsGrantedRole extends AuthorisationExpression {
	/**
	 * Returns the value of the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negated</em>' attribute.
	 * @see #setNegated(Boolean)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getIsGrantedRole_Negated()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getNegated();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.IsGrantedRole#getNegated <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negated</em>' attribute.
	 * @see #getNegated()
	 * @generated
	 */
	void setNegated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getIsGrantedRole_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.IsGrantedRole#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" op2Unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if not op2.oclIsTypeOf(IsGrantedRole) then\n\t\t\t\tfalse\n\t\t\telse\n\t\t\t\tlet grant2 : IsGrantedRole = op2.oclAsType(IsGrantedRole)\n\t\t\t\t\tin if self.negated &lt;&gt; grant2.negated \n\t\t\t\t\t\t\t\tor self.role.oclIsUndefined()\n\t\t\t\t\t\t\t\tor grant2.role.oclIsUndefined() then\n\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tself.role.name = grant2.role.name\n\t\t\t\t\t\tendif\n\t\t\tendif'"
	 * @generated
	 */
	boolean areSame(AuthorisationExpression op2);

} // IsGrantedRole
