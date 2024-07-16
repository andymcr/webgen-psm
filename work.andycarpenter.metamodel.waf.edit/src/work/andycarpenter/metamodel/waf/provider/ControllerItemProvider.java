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
			addCommonAuthorisationPropertyDescriptor(object);
			addIsAuthorisedPropertyDescriptor(object);
			addHasAuthorisationPropertyDescriptor(object);
			addHasCommonUnitAuthorisationPropertyDescriptor(object);
			addHasUnitsPropertyDescriptor(object);
			addHasChangableCollectionsPropertyDescriptor(object);
			addHasCaptchaUnitsPropertyDescriptor(object);
			addCollectionUnitsPropertyDescriptor(object);
			addHasCollectionUnitsPropertyDescriptor(object);
			addDynamicUnitsPropertyDescriptor(object);
			addHasDynamicUnitsPropertyDescriptor(object);
			addEditUnitsPropertyDescriptor(object);
			addHasEditUnitsPropertyDescriptor(object);
			addFormUnitsPropertyDescriptor(object);
			addHasFormUnitsPropertyDescriptor(object);
			addHasFiltersPropertyDescriptor(object);
			addGalleryUnitsPropertyDescriptor(object);
			addHasGalleryUnitsPropertyDescriptor(object);
			addTabularUnitsPropertyDescriptor(object);
			addHasTabularUnitsPropertyDescriptor(object);
			addImageUnitsPropertyDescriptor(object);
			addHasImageUnitsPropertyDescriptor(object);
			addImageCardsUnitsPropertyDescriptor(object);
			addHasImageCardsUnitsPropertyDescriptor(object);
			addMapUnitsPropertyDescriptor(object);
			addHasMapUnitsPropertyDescriptor(object);
			addSliderUnitsPropertyDescriptor(object);
			addHasSliderUnitsPropertyDescriptor(object);
			addServicesUsedPropertyDescriptor(object);
			addHasServicesUsedPropertyDescriptor(object);
			addHasPaginationPropertyDescriptor(object);
			addAssociationFieldsPropertyDescriptor(object);
			addAutocompleteFieldsPropertyDescriptor(object);
			addHasAutocompleteFieldsPropertyDescriptor(object);
			addFormFieldsPropertyDescriptor(object);
			addHasImageFieldsPropertyDescriptor(object);
			addHasInterfaceFieldsPropertyDescriptor(object);
			addHasRequiredInterfaceFieldsPropertyDescriptor(object);
			addHasResourceFieldsPropertyDescriptor(object);
			addActionsWithoutTargetPropertyDescriptor(object);
			addFileActionsPropertyDescriptor(object);
			addHasFileActionsPropertyDescriptor(object);
			addHasActionsWithDisabledMessagePropertyDescriptor(object);
			addHasSuccessMessagesPropertyDescriptor(object);
			addHasMessagesPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Common Authorisation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommonAuthorisationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_commonAuthorisation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_commonAuthorisation_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_CommonAuthorisation(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Authorised feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAuthorisedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_isAuthorised_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_isAuthorised_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_IsAuthorised(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Authorisation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAuthorisationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasAuthorisation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasAuthorisation_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasAuthorisation(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Common Unit Authorisation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCommonUnitAuthorisationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasCommonUnitAuthorisation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasCommonUnitAuthorisation_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasCommonUnitAuthorisation(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Changable Collections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasChangableCollectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasChangableCollections_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasChangableCollections_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasChangableCollections(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Captcha Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCaptchaUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasCaptchaUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasCaptchaUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasCaptchaUnits(),
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
	 * This adds a property descriptor for the Dynamic Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_dynamicUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_dynamicUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_DynamicUnits(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Dynamic Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasDynamicUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasDynamicUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasDynamicUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasDynamicUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Edit Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_editUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_editUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_EditUnits(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Edit Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasEditUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasEditUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasEditUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasEditUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Form Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_formUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_formUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_FormUnits(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Form Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasFormUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasFormUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasFormUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasFormUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Filters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasFiltersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasFilters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasFilters_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasFilters(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Gallery Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGalleryUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_galleryUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_galleryUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_GalleryUnits(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Gallery Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasGalleryUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasGalleryUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasGalleryUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasGalleryUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabular Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabularUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_tabularUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_tabularUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_TabularUnits(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Tabular Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasTabularUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasTabularUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasTabularUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasTabularUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Image Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_imageUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_imageUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_ImageUnits(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Image Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasImageUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasImageUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasImageUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasImageUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Image Cards Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageCardsUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_imageCardsUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_imageCardsUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_ImageCardsUnits(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Image Cards Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasImageCardsUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasImageCardsUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasImageCardsUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasImageCardsUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Map Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMapUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_mapUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_mapUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_MapUnits(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Map Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasMapUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasMapUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasMapUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasMapUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Slider Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSliderUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_sliderUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_sliderUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_SliderUnits(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Slider Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasSliderUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasSliderUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasSliderUnits_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasSliderUnits(),
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
	 * This adds a property descriptor for the Has Services Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasServicesUsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasServicesUsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasServicesUsed_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasServicesUsed(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
	 * This adds a property descriptor for the Has Image Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasImageFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasImageFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasImageFields_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasImageFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Interface Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasInterfaceFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasInterfaceFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasInterfaceFields_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasInterfaceFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Required Interface Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasRequiredInterfaceFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasRequiredInterfaceFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasRequiredInterfaceFields_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasRequiredInterfaceFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Resource Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasResourceFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasResourceFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasResourceFields_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasResourceFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
	 * This adds a property descriptor for the Has Actions With Disabled Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasActionsWithDisabledMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasActionsWithDisabledMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasActionsWithDisabledMessage_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasActionsWithDisabledMessage(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Success Messages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasSuccessMessagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasSuccessMessages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasSuccessMessages_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasSuccessMessages(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Messages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasMessagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Controller_hasMessages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Controller_hasMessages_feature", "_UI_Controller_type"),
				 WafPackage.eINSTANCE.getController_HasMessages(),
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
			case WafPackage.CONTROLLER__IS_AUTHORISED:
			case WafPackage.CONTROLLER__HAS_AUTHORISATION:
			case WafPackage.CONTROLLER__HAS_COMMON_UNIT_AUTHORISATION:
			case WafPackage.CONTROLLER__HAS_UNITS:
			case WafPackage.CONTROLLER__HAS_CHANGABLE_COLLECTIONS:
			case WafPackage.CONTROLLER__HAS_CAPTCHA_UNITS:
			case WafPackage.CONTROLLER__HAS_COLLECTION_UNITS:
			case WafPackage.CONTROLLER__HAS_DYNAMIC_UNITS:
			case WafPackage.CONTROLLER__HAS_EDIT_UNITS:
			case WafPackage.CONTROLLER__HAS_FORM_UNITS:
			case WafPackage.CONTROLLER__HAS_FILTERS:
			case WafPackage.CONTROLLER__HAS_GALLERY_UNITS:
			case WafPackage.CONTROLLER__HAS_TABULAR_UNITS:
			case WafPackage.CONTROLLER__HAS_IMAGE_UNITS:
			case WafPackage.CONTROLLER__HAS_IMAGE_CARDS_UNITS:
			case WafPackage.CONTROLLER__HAS_MAP_UNITS:
			case WafPackage.CONTROLLER__HAS_SLIDER_UNITS:
			case WafPackage.CONTROLLER__HAS_SERVICES_USED:
			case WafPackage.CONTROLLER__HAS_PAGINATION:
			case WafPackage.CONTROLLER__HAS_AUTOCOMPLETE_FIELDS:
			case WafPackage.CONTROLLER__HAS_IMAGE_FIELDS:
			case WafPackage.CONTROLLER__HAS_INTERFACE_FIELDS:
			case WafPackage.CONTROLLER__HAS_REQUIRED_INTERFACE_FIELDS:
			case WafPackage.CONTROLLER__HAS_RESOURCE_FIELDS:
			case WafPackage.CONTROLLER__HAS_FILE_ACTIONS:
			case WafPackage.CONTROLLER__HAS_ACTIONS_WITH_DISABLED_MESSAGE:
			case WafPackage.CONTROLLER__HAS_SUCCESS_MESSAGES:
			case WafPackage.CONTROLLER__HAS_MESSAGES:
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
