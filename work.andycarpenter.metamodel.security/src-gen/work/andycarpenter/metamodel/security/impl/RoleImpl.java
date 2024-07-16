/**
 */
package work.andycarpenter.metamodel.security.impl;

import org.eclipse.emf.ecore.EClass;

import work.andycarpenter.metamodel.base.impl.NamedElementImpl;

import work.andycarpenter.metamodel.security.Role;
import work.andycarpenter.metamodel.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RoleImpl extends NamedElementImpl implements Role {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.ROLE;
	}

} //RoleImpl
