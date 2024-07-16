/**
 */
package work.andycarpenter.metamodel.security.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import work.andycarpenter.metamodel.security.AuthorisationExpression;
import work.andycarpenter.metamodel.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorisation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AuthorisationExpressionImpl extends MinimalEObjectImpl.Container implements AuthorisationExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorisationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.AUTHORISATION_EXPRESSION;
	}

	/**
	 * The cached invocation delegate for the '{@link #areSame(work.andycarpenter.metamodel.security.AuthorisationExpression) <em>Are Same</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #areSame(work.andycarpenter.metamodel.security.AuthorisationExpression)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ARE_SAME_AUTHORISATION_EXPRESSION__EINVOCATION_DELEGATE = ((EOperation.Internal)SecurityPackage.Literals.AUTHORISATION_EXPRESSION___ARE_SAME__AUTHORISATIONEXPRESSION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean areSame(AuthorisationExpression authorisation) {
		try {
			return (Boolean)ARE_SAME_AUTHORISATION_EXPRESSION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{authorisation}));
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SecurityPackage.AUTHORISATION_EXPRESSION___ARE_SAME__AUTHORISATIONEXPRESSION:
				return areSame((AuthorisationExpression)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AuthorisationExpressionImpl
