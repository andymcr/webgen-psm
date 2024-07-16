/**
 */
package work.andycarpenter.metamodel.security.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import work.andycarpenter.metamodel.security.AuthorisationExpression;
import work.andycarpenter.metamodel.security.IsGrantedRole;
import work.andycarpenter.metamodel.security.Role;
import work.andycarpenter.metamodel.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Granted Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.IsGrantedRoleImpl#getNegated <em>Negated</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.impl.IsGrantedRoleImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IsGrantedRoleImpl extends AuthorisationExpressionImpl implements IsGrantedRole {
	/**
	 * The default value of the '{@link #getNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NEGATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegated()
	 * @generated
	 * @ordered
	 */
	protected Boolean negated = NEGATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsGrantedRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.IS_GRANTED_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getNegated() {
		return negated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNegated(Boolean newNegated) {
		Boolean oldNegated = negated;
		negated = newNegated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.IS_GRANTED_ROLE__NEGATED, oldNegated, negated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPackage.IS_GRANTED_ROLE__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.IS_GRANTED_ROLE__ROLE, oldRole, role));
	}

	/**
	 * The cached invocation delegate for the '{@link #areSame(work.andycarpenter.metamodel.security.AuthorisationExpression) <em>Are Same</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #areSame(work.andycarpenter.metamodel.security.AuthorisationExpression)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ARE_SAME_AUTHORISATION_EXPRESSION__EINVOCATION_DELEGATE = ((EOperation.Internal)SecurityPackage.Literals.IS_GRANTED_ROLE___ARE_SAME__AUTHORISATIONEXPRESSION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean areSame(AuthorisationExpression op2) {
		try {
			return (Boolean)ARE_SAME_AUTHORISATION_EXPRESSION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{op2}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPackage.IS_GRANTED_ROLE__NEGATED:
				return getNegated();
			case SecurityPackage.IS_GRANTED_ROLE__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SecurityPackage.IS_GRANTED_ROLE__NEGATED:
				setNegated((Boolean)newValue);
				return;
			case SecurityPackage.IS_GRANTED_ROLE__ROLE:
				setRole((Role)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SecurityPackage.IS_GRANTED_ROLE__NEGATED:
				setNegated(NEGATED_EDEFAULT);
				return;
			case SecurityPackage.IS_GRANTED_ROLE__ROLE:
				setRole((Role)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SecurityPackage.IS_GRANTED_ROLE__NEGATED:
				return NEGATED_EDEFAULT == null ? negated != null : !NEGATED_EDEFAULT.equals(negated);
			case SecurityPackage.IS_GRANTED_ROLE__ROLE:
				return role != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AuthorisationExpression.class) {
			switch (baseOperationID) {
				case SecurityPackage.AUTHORISATION_EXPRESSION___ARE_SAME__AUTHORISATIONEXPRESSION: return SecurityPackage.IS_GRANTED_ROLE___ARE_SAME__AUTHORISATIONEXPRESSION;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SecurityPackage.IS_GRANTED_ROLE___ARE_SAME__AUTHORISATIONEXPRESSION:
				return areSame((AuthorisationExpression)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		if (role != null) {
			result.append(" (");
			result.append(role.getName());
			result.append(')');
		}
		return result.toString();
	}

} //IsGrantedRoleImpl
