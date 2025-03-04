/**
 */
package work.andycarpenter.metamodel.waf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import work.andycarpenter.metamodel.base.provider.NamedDisplayElementItemProvider;
import work.andycarpenter.metamodel.waf.Controller;
import work.andycarpenter.metamodel.waf.WafFactory;
import work.andycarpenter.metamodel.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.waf.Controller} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControllerItemProvider extends NamedDisplayElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPartOfPropertyDescriptor(object);
			addParentControllerPropertyDescriptor(object);
			addChildControllersPropertyDescriptor(object);
			addIsSinglePagePropertyDescriptor(object);
			addIsMultiPagePropertyDescriptor(object);
			addCollectionUnitsPropertyDescriptor(object);
			addHasCollectionUnitsPropertyDescriptor(object);
			addServicesUsedPropertyDescriptor(object);
			addHasPaginationPropertyDescriptor(object);
			addAssociationFieldsPropertyDescriptor(object);
			addAutocompleteFieldsPropertyDescriptor(object);
			addHasAutocompleteFieldsPropertyDescriptor(object);
			addFormFieldsPropertyDescriptor(object);
			addActionsWithoutTargetPropertyDescriptor(object);
			addFileActionsPropertyDescriptor(object);
			addHasFileActionsPropertyDescriptor(object);
			addUriElementPropertyDescriptor(object);
			addPageClassOverridePropertyDescriptor(object);
			addPageClassPropertyDescriptor(object);
			addHasPageClassPropertyDescriptor(object);
			addGenModelPropertyDescriptor(object);
			addUiModelPropertyDescriptor(object);
			addRootControllerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Part Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_partOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_partOf_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_PartOf(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Controller feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentControllerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_parentController_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_parentController_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_ParentController(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Child Controllers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildControllersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_childControllers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_childControllers_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_ChildControllers(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Single Page feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSinglePagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_isSinglePage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_isSinglePage_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_IsSinglePage(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Multi Page feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsMultiPagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_isMultiPage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_isMultiPage_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_IsMultiPage(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Collection Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_collectionUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_collectionUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_CollectionUnits(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Collection Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCollectionUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasCollectionUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasCollectionUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasCollectionUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Services Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicesUsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_servicesUsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_servicesUsed_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_ServicesUsed(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Pagination feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasPaginationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasPagination_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasPagination_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasPagination(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Association Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_associationFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_associationFields_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_AssociationFields(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Autocomplete Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutocompleteFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_autocompleteFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_autocompleteFields_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_AutocompleteFields(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Autocomplete Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAutocompleteFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasAutocompleteFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasAutocompleteFields_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasAutocompleteFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Form Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_formFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_formFields_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_FormFields(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Actions Without Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionsWithoutTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_actionsWithoutTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_actionsWithoutTarget_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_ActionsWithoutTarget(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the File Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_fileActions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_fileActions_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_FileActions(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has File Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasFileActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasFileActions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasFileActions_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasFileActions(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Uri Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_uriElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_uriElement_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_UriElement(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_NavigationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Page Class Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPageClassOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_pageClassOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_pageClassOverride_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_PageClassOverride(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Page Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPageClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_pageClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_pageClass_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_PageClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Page Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasPageClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasPageClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasPageClass_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasPageClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Gen Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_genModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_genModel_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_GenModel(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Ui Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUiModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_uiModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_uiModel_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_UiModel(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Root Controller feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootControllerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_rootController_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_rootController_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_RootController(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WafPackage.eINSTANCE.getController_Units());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Controller)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Controller_type") :
			getString("_UI_Controller_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Controller.class)) {
			case WafPackage.CONTROLLER__IS_SINGLE_PAGE:
			case WafPackage.CONTROLLER__IS_MULTI_PAGE:
			case WafPackage.CONTROLLER__HAS_COLLECTION_UNITS:
			case WafPackage.CONTROLLER__HAS_PAGINATION:
			case WafPackage.CONTROLLER__HAS_AUTOCOMPLETE_FIELDS:
			case WafPackage.CONTROLLER__HAS_FILE_ACTIONS:
			case WafPackage.CONTROLLER__URI_ELEMENT:
			case WafPackage.CONTROLLER__PAGE_CLASS_OVERRIDE:
			case WafPackage.CONTROLLER__PAGE_CLASS:
			case WafPackage.CONTROLLER__HAS_PAGE_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.CONTROLLER__UNITS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getController_Units(),
				 WafFactory.eINSTANCE.createStaticUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getController_Units(),
				 WafFactory.eINSTANCE.createSingletonUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getController_Units(),
				 WafFactory.eINSTANCE.createCreateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getController_Units(),
				 WafFactory.eINSTANCE.createUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getController_Units(),
				 WafFactory.eINSTANCE.createCreateUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getController_Units(),
				 WafFactory.eINSTANCE.createMapUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getController_Units(),
				 WafFactory.eINSTANCE.createDetailsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getController_Units(),
				 WafFactory.eINSTANCE.createTabularUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getController_Units(),
				 WafFactory.eINSTANCE.createTextCardsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getController_Units(),
				 WafFactory.eINSTANCE.createDateCardsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getController_Units(),
				 WafFactory.eINSTANCE.createImageCardsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getController_Units(),
				 WafFactory.eINSTANCE.createSliderUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getController_Units(),
				 WafFactory.eINSTANCE.createGalleryUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getController_Units(),
				 WafFactory.eINSTANCE.createSearchUnit()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WafEditPlugin.INSTANCE;
	}

}
