/**
 */
package work.andycarpenter.metamodel.security.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import work.andycarpenter.metamodel.base.NamedDisplayElement;
import work.andycarpenter.metamodel.base.NamedElement;

import work.andycarpenter.metamodel.security.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see work.andycarpenter.metamodel.security.SecurityPackage
 * @generated
 */
public class SecurityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecurityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SecurityPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuritySwitch<Adapter> modelSwitch =
		new SecuritySwitch<Adapter>() {
			@Override
			public Adapter caseSecurityModel(SecurityModel object) {
				return createSecurityModelAdapter();
			}
			@Override
			public Adapter caseAuthentication(Authentication object) {
				return createAuthenticationAdapter();
			}
			@Override
			public Adapter caseLocalAuthenticationSystem(LocalAuthenticationSystem object) {
				return createLocalAuthenticationSystemAdapter();
			}
			@Override
			public Adapter caseAuthenticationElement(AuthenticationElement object) {
				return createAuthenticationElementAdapter();
			}
			@Override
			public Adapter caseRegistrationElement(RegistrationElement object) {
				return createRegistrationElementAdapter();
			}
			@Override
			public Adapter caseLoginElement(LoginElement object) {
				return createLoginElementAdapter();
			}
			@Override
			public Adapter caseLogoutElement(LogoutElement object) {
				return createLogoutElementAdapter();
			}
			@Override
			public Adapter caseForgottenPasswordElement(ForgottenPasswordElement object) {
				return createForgottenPasswordElementAdapter();
			}
			@Override
			public Adapter caseChangePasswordElement(ChangePasswordElement object) {
				return createChangePasswordElementAdapter();
			}
			@Override
			public Adapter caseCasAuthentication(CasAuthentication object) {
				return createCasAuthenticationAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseAuthorisationExpression(AuthorisationExpression object) {
				return createAuthorisationExpressionAdapter();
			}
			@Override
			public Adapter caseIsGrantedRole(IsGrantedRole object) {
				return createIsGrantedRoleAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseNamedDisplayElement(NamedDisplayElement object) {
				return createNamedDisplayElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.metamodel.security.SecurityModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.metamodel.security.SecurityModel
	 * @generated
	 */
	public Adapter createSecurityModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.metamodel.security.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.metamodel.security.Authentication
	 * @generated
	 */
	public Adapter createAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem <em>Local Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.metamodel.security.LocalAuthenticationSystem
	 * @generated
	 */
	public Adapter createLocalAuthenticationSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.metamodel.security.AuthenticationElement <em>Authentication Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.metamodel.security.AuthenticationElement
	 * @generated
	 */
	public Adapter createAuthenticationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.metamodel.security.RegistrationElement <em>Registration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.metamodel.security.RegistrationElement
	 * @generated
	 */
	public Adapter createRegistrationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.metamodel.security.LoginElement <em>Login Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.metamodel.security.LoginElement
	 * @generated
	 */
	public Adapter createLoginElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.metamodel.security.LogoutElement <em>Logout Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.metamodel.security.LogoutElement
	 * @generated
	 */
	public Adapter createLogoutElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.metamodel.security.ForgottenPasswordElement <em>Forgotten Password Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.metamodel.security.ForgottenPasswordElement
	 * @generated
	 */
	public Adapter createForgottenPasswordElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.metamodel.security.ChangePasswordElement <em>Change Password Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.metamodel.security.ChangePasswordElement
	 * @generated
	 */
	public Adapter createChangePasswordElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.metamodel.security.CasAuthentication <em>Cas Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.metamodel.security.CasAuthentication
	 * @generated
	 */
	public Adapter createCasAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.metamodel.security.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.metamodel.security.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.metamodel.security.AuthorisationExpression <em>Authorisation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.metamodel.security.AuthorisationExpression
	 * @generated
	 */
	public Adapter createAuthorisationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.metamodel.security.IsGrantedRole <em>Is Granted Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.metamodel.security.IsGrantedRole
	 * @generated
	 */
	public Adapter createIsGrantedRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.metamodel.base.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.metamodel.base.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link work.andycarpenter.metamodel.base.NamedDisplayElement <em>Named Display Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see work.andycarpenter.metamodel.base.NamedDisplayElement
	 * @generated
	 */
	public Adapter createNamedDisplayElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SecurityAdapterFactory
