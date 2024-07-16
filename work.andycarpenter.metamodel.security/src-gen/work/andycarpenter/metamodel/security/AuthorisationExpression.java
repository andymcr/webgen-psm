/**
 */
package work.andycarpenter.metamodel.security;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorisation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see work.andycarpenter.metamodel.security.SecurityPackage#getAuthorisationExpression()
 * @model abstract="true"
 * @generated
 */
public interface AuthorisationExpression extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" authorisationUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if units-&gt;size() &lt; 2 then\n\t\t\ttrue\n\t\telse\n\t\t\tunits-&gt;subOrderedSet(2, units-&gt;size())-&gt;forAll(u | u.authorisationRoles.trim() = units-&gt;first().authorisationRoles.trim())\n\t\tendif'"
	 * @generated
	 */
	boolean areSame(AuthorisationExpression authorisation);

} // AuthorisationExpression
