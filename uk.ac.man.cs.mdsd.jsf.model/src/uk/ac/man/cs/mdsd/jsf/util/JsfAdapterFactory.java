/**
 * <copyright>
 * </copyright>
 *
 * $Id: JsfAdapterFactory.java,v 1.55 2014/08/22 14:32:57 andy Exp $
 */
package uk.ac.man.cs.mdsd.jsf.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.criteria.Expression;
import uk.ac.man.cs.mdsd.criteria.Path;
import uk.ac.man.cs.mdsd.jsf.*;

import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;
import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.jsf.JsfPackage
 * @generated
 */
public class JsfAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JsfPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsfAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JsfPackage.eINSTANCE;
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
	protected JsfSwitch<Adapter> modelSwitch =
		new JsfSwitch<Adapter>() {
			@Override
			public Adapter caseJsfModel(JsfModel object) {
				return createJsfModelAdapter();
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
			public Adapter caseCasAuthentication(CasAuthentication object) {
				return createCasAuthenticationAdapter();
			}
			@Override
			public Adapter caseIncludedFeature(IncludedFeature object) {
				return createIncludedFeatureAdapter();
			}
			@Override
			public Adapter caseIncludedElement(IncludedElement object) {
				return createIncludedElementAdapter();
			}
			@Override
			public Adapter caseIncludedAssociation(IncludedAssociation object) {
				return createIncludedAssociationAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseModelLabel(ModelLabel object) {
				return createModelLabelAdapter();
			}
			@Override
			public Adapter caseSelection(Selection object) {
				return createSelectionAdapter();
			}
			@Override
			public Adapter caseServiceFeature(ServiceFeature object) {
				return createServiceFeatureAdapter();
			}
			@Override
			public Adapter caseServiceEntityFeature(ServiceEntityFeature object) {
				return createServiceEntityFeatureAdapter();
			}
			@Override
			public Adapter caseServiceEntityElement(ServiceEntityElement object) {
				return createServiceEntityElementAdapter();
			}
			@Override
			public Adapter caseServiceAssociation(ServiceAssociation object) {
				return createServiceAssociationAdapter();
			}
			@Override
			public Adapter caseServiceEntityAssociation(ServiceEntityAssociation object) {
				return createServiceEntityAssociationAdapter();
			}
			@Override
			public Adapter caseServiceViewAssociation(ServiceViewAssociation object) {
				return createServiceViewAssociationAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseMenu(Menu object) {
				return createMenuAdapter();
			}
			@Override
			public Adapter caseMenuEntry(MenuEntry object) {
				return createMenuEntryAdapter();
			}
			@Override
			public Adapter caseStaticMenu(StaticMenu object) {
				return createStaticMenuAdapter();
			}
			@Override
			public Adapter caseFixedPageMenuEntry(FixedPageMenuEntry object) {
				return createFixedPageMenuEntryAdapter();
			}
			@Override
			public Adapter caseFixedActionMenuEntry(FixedActionMenuEntry object) {
				return createFixedActionMenuEntryAdapter();
			}
			@Override
			public Adapter caseFixedCommandMenuEntry(FixedCommandMenuEntry object) {
				return createFixedCommandMenuEntryAdapter();
			}
			@Override
			public Adapter caseEditStaticTextMenuEntry(EditStaticTextMenuEntry object) {
				return createEditStaticTextMenuEntryAdapter();
			}
			@Override
			public Adapter caseDynamicMenu(DynamicMenu object) {
				return createDynamicMenuAdapter();
			}
			@Override
			public Adapter caseMenuIncludedFeature(MenuIncludedFeature object) {
				return createMenuIncludedFeatureAdapter();
			}
			@Override
			public Adapter caseMenuIncludedElement(MenuIncludedElement object) {
				return createMenuIncludedElementAdapter();
			}
			@Override
			public Adapter caseSelectTarget(SelectTarget object) {
				return createSelectTargetAdapter();
			}
			@Override
			public Adapter caseUnitContainer(UnitContainer object) {
				return createUnitContainerAdapter();
			}
			@Override
			public Adapter caseUnitTitle(UnitTitle object) {
				return createUnitTitleAdapter();
			}
			@Override
			public Adapter caseContentUnit(ContentUnit object) {
				return createContentUnitAdapter();
			}
			@Override
			public Adapter caseStaticUnit(StaticUnit object) {
				return createStaticUnitAdapter();
			}
			@Override
			public Adapter caseCommandUnit(CommandUnit object) {
				return createCommandUnitAdapter();
			}
			@Override
			public Adapter caseCommand(Command object) {
				return createCommandAdapter();
			}
			@Override
			public Adapter caseUserCommand(UserCommand object) {
				return createUserCommandAdapter();
			}
			@Override
			public Adapter caseCreateSitemapUnit(CreateSitemapUnit object) {
				return createCreateSitemapUnitAdapter();
			}
			@Override
			public Adapter caseDynamicUnit(DynamicUnit object) {
				return createDynamicUnitAdapter();
			}
			@Override
			public Adapter caseUnitField(UnitField object) {
				return createUnitFieldAdapter();
			}
			@Override
			public Adapter caseUnitFeature(UnitFeature object) {
				return createUnitFeatureAdapter();
			}
			@Override
			public Adapter caseUnitElement(UnitElement object) {
				return createUnitElementAdapter();
			}
			@Override
			public Adapter caseUnitAssociation(UnitAssociation object) {
				return createUnitAssociationAdapter();
			}
			@Override
			public Adapter caseUnitChildFeature(UnitChildFeature object) {
				return createUnitChildFeatureAdapter();
			}
			@Override
			public Adapter caseUnitChildElement(UnitChildElement object) {
				return createUnitChildElementAdapter();
			}
			@Override
			public Adapter caseUnitChildAssociation(UnitChildAssociation object) {
				return createUnitChildAssociationAdapter();
			}
			@Override
			public Adapter caseInterfaceField(InterfaceField object) {
				return createInterfaceFieldAdapter();
			}
			@Override
			public Adapter caseDataTypeField(DataTypeField object) {
				return createDataTypeFieldAdapter();
			}
			@Override
			public Adapter caseDateField(DateField object) {
				return createDateFieldAdapter();
			}
			@Override
			public Adapter caseCaptchaField(CaptchaField object) {
				return createCaptchaFieldAdapter();
			}
			@Override
			public Adapter caseUnitSupportAction(UnitSupportAction object) {
				return createUnitSupportActionAdapter();
			}
			@Override
			public Adapter caseEditUnit(EditUnit object) {
				return createEditUnitAdapter();
			}
			@Override
			public Adapter caseCreateUnit(CreateUnit object) {
				return createCreateUnitAdapter();
			}
			@Override
			public Adapter caseCreateUpdateUnit(CreateUpdateUnit object) {
				return createCreateUpdateUnitAdapter();
			}
			@Override
			public Adapter caseMapUnit(MapUnit object) {
				return createMapUnitAdapter();
			}
			@Override
			public Adapter caseUpdateUnit(UpdateUnit object) {
				return createUpdateUnitAdapter();
			}
			@Override
			public Adapter caseDataUnit(DataUnit object) {
				return createDataUnitAdapter();
			}
			@Override
			public Adapter caseDetailsUnit(DetailsUnit object) {
				return createDetailsUnitAdapter();
			}
			@Override
			public Adapter caseIndexUnit(IndexUnit object) {
				return createIndexUnitAdapter();
			}
			@Override
			public Adapter caseIndexGridUnit(IndexGridUnit object) {
				return createIndexGridUnitAdapter();
			}
			@Override
			public Adapter caseIndexPageDirectionUnit(IndexPageDirectionUnit object) {
				return createIndexPageDirectionUnitAdapter();
			}
			@Override
			public Adapter caseIndexLineDirectionUnit(IndexLineDirectionUnit object) {
				return createIndexLineDirectionUnitAdapter();
			}
			@Override
			public Adapter caseControlUnit(ControlUnit object) {
				return createControlUnitAdapter();
			}
			@Override
			public Adapter caseSearchUnit(SearchUnit object) {
				return createSearchUnitAdapter();
			}
			@Override
			public Adapter caseActionUnit(ActionUnit object) {
				return createActionUnitAdapter();
			}
			@Override
			public Adapter caseAuthenticationUnit(AuthenticationUnit object) {
				return createAuthenticationUnitAdapter();
			}
			@Override
			public Adapter caseRegistrationUnit(RegistrationUnit object) {
				return createRegistrationUnitAdapter();
			}
			@Override
			public Adapter caseLoginUnit(LoginUnit object) {
				return createLoginUnitAdapter();
			}
			@Override
			public Adapter caseForgottenPasswordUnit(ForgottenPasswordUnit object) {
				return createForgottenPasswordUnitAdapter();
			}
			@Override
			public Adapter caseInlineActionContainer(InlineActionContainer object) {
				return createInlineActionContainerAdapter();
			}
			@Override
			public Adapter caseInlineAction(InlineAction object) {
				return createInlineActionAdapter();
			}
			@Override
			public Adapter caseSelectAction(SelectAction object) {
				return createSelectActionAdapter();
			}
			@Override
			public Adapter caseDeleteAction(DeleteAction object) {
				return createDeleteActionAdapter();
			}
			@Override
			public Adapter caseFeatureSupportAction(FeatureSupportAction object) {
				return createFeatureSupportActionAdapter();
			}
			@Override
			public Adapter caseModelReference(ModelReference object) {
				return createModelReferenceAdapter();
			}
			@Override
			public Adapter caseFeatureReference(FeatureReference object) {
				return createFeatureReferenceAdapter();
			}
			@Override
			public Adapter caseCurrentUserReference(CurrentUserReference object) {
				return createCurrentUserReferenceAdapter();
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
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter casePath(Path object) {
				return createPathAdapter();
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
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.JsfModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.JsfModel
	 * @generated
	 */
	public Adapter createJsfModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.Authentication
	 * @generated
	 */
	public Adapter createAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem <em>Local Authentication System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.LocalAuthenticationSystem
	 * @generated
	 */
	public Adapter createLocalAuthenticationSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.CasAuthentication <em>Cas Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.CasAuthentication
	 * @generated
	 */
	public Adapter createCasAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.ModelLabel <em>Model Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.ModelLabel
	 * @generated
	 */
	public Adapter createModelLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.ServiceFeature <em>Service Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceFeature
	 * @generated
	 */
	public Adapter createServiceFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.ServiceEntityFeature <em>Service Entity Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceEntityFeature
	 * @generated
	 */
	public Adapter createServiceEntityFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.ServiceEntityElement <em>Service Entity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceEntityElement
	 * @generated
	 */
	public Adapter createServiceEntityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.ServiceAssociation <em>Service Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceAssociation
	 * @generated
	 */
	public Adapter createServiceAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.ServiceEntityAssociation <em>Service Entity Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceEntityAssociation
	 * @generated
	 */
	public Adapter createServiceEntityAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.ServiceViewAssociation <em>Service View Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.ServiceViewAssociation
	 * @generated
	 */
	public Adapter createServiceViewAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.Selection
	 * @generated
	 */
	public Adapter createSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.SelectTarget <em>Select Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.SelectTarget
	 * @generated
	 */
	public Adapter createSelectTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.UnitContainer <em>Unit Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitContainer
	 * @generated
	 */
	public Adapter createUnitContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.UnitTitle <em>Unit Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitTitle
	 * @generated
	 */
	public Adapter createUnitTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.Menu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.Menu
	 * @generated
	 */
	public Adapter createMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.MenuEntry <em>Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.MenuEntry
	 * @generated
	 */
	public Adapter createMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.MenuIncludedFeature <em>Menu Included Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.MenuIncludedFeature
	 * @generated
	 */
	public Adapter createMenuIncludedFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.MenuIncludedElement <em>Menu Included Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.MenuIncludedElement
	 * @generated
	 */
	public Adapter createMenuIncludedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.StaticMenu <em>Static Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.StaticMenu
	 * @generated
	 */
	public Adapter createStaticMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.FixedPageMenuEntry <em>Fixed Page Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.FixedPageMenuEntry
	 * @generated
	 */
	public Adapter createFixedPageMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.FixedActionMenuEntry <em>Fixed Action Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.FixedActionMenuEntry
	 * @generated
	 */
	public Adapter createFixedActionMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.FixedCommandMenuEntry <em>Fixed Command Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.FixedCommandMenuEntry
	 * @generated
	 */
	public Adapter createFixedCommandMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.EditStaticTextMenuEntry <em>Edit Static Text Menu Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.EditStaticTextMenuEntry
	 * @generated
	 */
	public Adapter createEditStaticTextMenuEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.DynamicMenu <em>Dynamic Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.DynamicMenu
	 * @generated
	 */
	public Adapter createDynamicMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.ContentUnit <em>Content Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.ContentUnit
	 * @generated
	 */
	public Adapter createContentUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.UnitField <em>Unit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitField
	 * @generated
	 */
	public Adapter createUnitFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.UnitFeature <em>Unit Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitFeature
	 * @generated
	 */
	public Adapter createUnitFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.UnitElement <em>Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitElement
	 * @generated
	 */
	public Adapter createUnitElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.UnitAssociation <em>Unit Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitAssociation
	 * @generated
	 */
	public Adapter createUnitAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.UnitChildFeature <em>Unit Child Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitChildFeature
	 * @generated
	 */
	public Adapter createUnitChildFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.UnitChildElement <em>Unit Child Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitChildElement
	 * @generated
	 */
	public Adapter createUnitChildElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.UnitChildAssociation <em>Unit Child Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitChildAssociation
	 * @generated
	 */
	public Adapter createUnitChildAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.InterfaceField <em>Interface Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.InterfaceField
	 * @generated
	 */
	public Adapter createInterfaceFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.DataTypeField <em>Data Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.DataTypeField
	 * @generated
	 */
	public Adapter createDataTypeFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.DateField <em>Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.DateField
	 * @generated
	 */
	public Adapter createDateFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.CaptchaField <em>Captcha Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.CaptchaField
	 * @generated
	 */
	public Adapter createCaptchaFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.UnitSupportAction <em>Unit Support Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.UnitSupportAction
	 * @generated
	 */
	public Adapter createUnitSupportActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.EditUnit <em>Edit Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.EditUnit
	 * @generated
	 */
	public Adapter createEditUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.IncludedFeature <em>Included Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedFeature
	 * @generated
	 */
	public Adapter createIncludedFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.IncludedElement <em>Included Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedElement
	 * @generated
	 */
	public Adapter createIncludedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.IncludedAssociation <em>Included Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.IncludedAssociation
	 * @generated
	 */
	public Adapter createIncludedAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.CreateUnit <em>Create Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.CreateUnit
	 * @generated
	 */
	public Adapter createCreateUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.CreateUpdateUnit <em>Create Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.CreateUpdateUnit
	 * @generated
	 */
	public Adapter createCreateUpdateUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.MapUnit <em>Map Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.MapUnit
	 * @generated
	 */
	public Adapter createMapUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.UpdateUnit <em>Update Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.UpdateUnit
	 * @generated
	 */
	public Adapter createUpdateUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.DataUnit <em>Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.DataUnit
	 * @generated
	 */
	public Adapter createDataUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.StaticUnit <em>Static Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.StaticUnit
	 * @generated
	 */
	public Adapter createStaticUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.CommandUnit <em>Command Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.CommandUnit
	 * @generated
	 */
	public Adapter createCommandUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.UserCommand <em>User Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.UserCommand
	 * @generated
	 */
	public Adapter createUserCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.CreateSitemapUnit <em>Create Sitemap Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.CreateSitemapUnit
	 * @generated
	 */
	public Adapter createCreateSitemapUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.DynamicUnit <em>Dynamic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.DynamicUnit
	 * @generated
	 */
	public Adapter createDynamicUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.DetailsUnit <em>Details Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.DetailsUnit
	 * @generated
	 */
	public Adapter createDetailsUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.IndexUnit <em>Index Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.IndexUnit
	 * @generated
	 */
	public Adapter createIndexUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.IndexGridUnit <em>Index Grid Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.IndexGridUnit
	 * @generated
	 */
	public Adapter createIndexGridUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.IndexPageDirectionUnit <em>Index Page Direction Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.IndexPageDirectionUnit
	 * @generated
	 */
	public Adapter createIndexPageDirectionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.IndexLineDirectionUnit <em>Index Line Direction Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.IndexLineDirectionUnit
	 * @generated
	 */
	public Adapter createIndexLineDirectionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.ControlUnit <em>Control Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.ControlUnit
	 * @generated
	 */
	public Adapter createControlUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.SearchUnit <em>Search Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.SearchUnit
	 * @generated
	 */
	public Adapter createSearchUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.ActionUnit <em>Action Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.ActionUnit
	 * @generated
	 */
	public Adapter createActionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.AuthenticationUnit <em>Authentication Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.AuthenticationUnit
	 * @generated
	 */
	public Adapter createAuthenticationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.RegistrationUnit <em>Registration Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.RegistrationUnit
	 * @generated
	 */
	public Adapter createRegistrationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.LoginUnit <em>Login Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.LoginUnit
	 * @generated
	 */
	public Adapter createLoginUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.ForgottenPasswordUnit <em>Forgotten Password Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.ForgottenPasswordUnit
	 * @generated
	 */
	public Adapter createForgottenPasswordUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.InlineActionContainer <em>Inline Action Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.InlineActionContainer
	 * @generated
	 */
	public Adapter createInlineActionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.InlineAction <em>Inline Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.InlineAction
	 * @generated
	 */
	public Adapter createInlineActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.SelectAction <em>Select Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.SelectAction
	 * @generated
	 */
	public Adapter createSelectActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.DeleteAction <em>Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.DeleteAction
	 * @generated
	 */
	public Adapter createDeleteActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.FeatureSupportAction <em>Feature Support Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.FeatureSupportAction
	 * @generated
	 */
	public Adapter createFeatureSupportActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.ModelReference
	 * @generated
	 */
	public Adapter createModelReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.FeatureReference <em>Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.FeatureReference
	 * @generated
	 */
	public Adapter createFeatureReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.jsf.CurrentUserReference <em>Current User Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.jsf.CurrentUserReference
	 * @generated
	 */
	public Adapter createCurrentUserReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.orm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.orm.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.orm.NamedDisplayElement <em>Named Display Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.orm.NamedDisplayElement
	 * @generated
	 */
	public Adapter createNamedDisplayElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.criteria.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.criteria.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.man.cs.mdsd.criteria.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.man.cs.mdsd.criteria.Path
	 * @generated
	 */
	public Adapter createPathAdapter() {
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

} //JsfAdapterFactory
