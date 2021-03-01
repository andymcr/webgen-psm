/**
 */
package work.andycarpenter.psms.waf.provider;


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
import work.andycarpenter.psms.base.provider.NamedDisplayElementItemProvider;
import work.andycarpenter.psms.waf.Page;
import work.andycarpenter.psms.waf.WafFactory;
import work.andycarpenter.psms.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.psms.waf.Page} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PageItemProvider extends NamedDisplayElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageItemProvider(AdapterFactory adapterFactory) {
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
			addParentPagePropertyDescriptor(object);
			addChildPagesPropertyDescriptor(object);
			addCommonRolePropertyDescriptor(object);
			addIsAuthorisedPropertyDescriptor(object);
			addHasCommonUnitAuthenticationPropertyDescriptor(object);
			addHasChangableCollectionsPropertyDescriptor(object);
			addCollectionUnitsPropertyDescriptor(object);
			addHasCollectionUnitsPropertyDescriptor(object);
			addDynamicUnitsPropertyDescriptor(object);
			addHasDynamicUnitsPropertyDescriptor(object);
			addEditUnitsPropertyDescriptor(object);
			addHasEditUnitsPropertyDescriptor(object);
			addAnyEditUnitsPropertyDescriptor(object);
			addHasAnyEditUnitsPropertyDescriptor(object);
			addForgottenPasswordUnitsPropertyDescriptor(object);
			addHasForgottenPasswordUnitsPropertyDescriptor(object);
			addFormUnitsPropertyDescriptor(object);
			addHasFormUnitsPropertyDescriptor(object);
			addHasFiltersPropertyDescriptor(object);
			addGalleryUnitsPropertyDescriptor(object);
			addHasGalleryUnitsPropertyDescriptor(object);
			addIndexUnitsPropertyDescriptor(object);
			addHasIndexUnitsPropertyDescriptor(object);
			addImageUnitsPropertyDescriptor(object);
			addHasImageUnitsPropertyDescriptor(object);
			addImageCardsUnitsPropertyDescriptor(object);
			addHasImageCardsUnitsPropertyDescriptor(object);
			addLoginUnitsPropertyDescriptor(object);
			addHasLoginUnitsPropertyDescriptor(object);
			addMapUnitsPropertyDescriptor(object);
			addHasMapUnitsPropertyDescriptor(object);
			addNonSecurityUnitsPropertyDescriptor(object);
			addHasNonSecurityUnitsPropertyDescriptor(object);
			addSliderUnitsPropertyDescriptor(object);
			addHasSliderUnitsPropertyDescriptor(object);
			addRepositoriesPropertyDescriptor(object);
			addHasRepositoriesPropertyDescriptor(object);
			addServicesPropertyDescriptor(object);
			addHasServicesPropertyDescriptor(object);
			addHasPaginationPropertyDescriptor(object);
			addHasCaptchaFieldsPropertyDescriptor(object);
			addFormFieldsPropertyDescriptor(object);
			addHasInterfaceFieldsPropertyDescriptor(object);
			addHasResourceFieldsPropertyDescriptor(object);
			addActionsWithoutTargetPropertyDescriptor(object);
			addUriElementPropertyDescriptor(object);
			addLocalStyleClassPropertyDescriptor(object);
			addStyleClassPropertyDescriptor(object);
			addHasStyleClassPropertyDescriptor(object);
			addGenModelPropertyDescriptor(object);
			addUiModelPropertyDescriptor(object);
			addSecurityModelPropertyDescriptor(object);
			addRootPagePropertyDescriptor(object);
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
				 getString("_UI_Page_partOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_partOf_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_PartOf(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Page feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentPagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_parentPage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_parentPage_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_ParentPage(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Child Pages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildPagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_childPages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_childPages_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_ChildPages(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Common Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommonRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_commonRole_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_commonRole_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_CommonRole(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Page_isAuthorised_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_isAuthorised_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_IsAuthorised(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Common Unit Authentication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCommonUnitAuthenticationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_hasCommonUnitAuthentication_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasCommonUnitAuthentication_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasCommonUnitAuthentication(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Page_hasChangableCollections_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasChangableCollections_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasChangableCollections(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Page_collectionUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_collectionUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_CollectionUnits(),
				 false,
				 false,
				 false,
				 null,
				 null,
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
				 getString("_UI_Page_dynamicUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_dynamicUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_DynamicUnits(),
				 false,
				 false,
				 false,
				 null,
				 null,
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
				 getString("_UI_Page_editUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_editUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_EditUnits(),
				 false,
				 false,
				 false,
				 null,
				 null,
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
				 getString("_UI_Page_hasCollectionUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasCollectionUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasCollectionUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Page_hasDynamicUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasDynamicUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasDynamicUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Page_hasEditUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasEditUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasEditUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Any Edit Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnyEditUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_anyEditUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_anyEditUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_AnyEditUnits(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Any Edit Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAnyEditUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_hasAnyEditUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasAnyEditUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasAnyEditUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Forgotten Password Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForgottenPasswordUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_forgottenPasswordUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_forgottenPasswordUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_ForgottenPasswordUnits(),
				 false,
				 false,
				 false,
				 null,
				 null,
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
				 getString("_UI_Page_formUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_formUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_FormUnits(),
				 false,
				 false,
				 false,
				 null,
				 null,
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
				 getString("_UI_Page_hasFormUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasFormUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasFormUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Forgotten Password Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasForgottenPasswordUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_hasForgottenPasswordUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasForgottenPasswordUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasForgottenPasswordUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Page_hasFilters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasFilters_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasFilters(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Page_galleryUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_galleryUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_GalleryUnits(),
				 false,
				 false,
				 false,
				 null,
				 null,
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
				 getString("_UI_Page_hasGalleryUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasGalleryUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasGalleryUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Index Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_indexUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_indexUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_IndexUnits(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Index Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasIndexUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_hasIndexUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasIndexUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasIndexUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Page_imageUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_imageUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_ImageUnits(),
				 false,
				 false,
				 false,
				 null,
				 null,
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
				 getString("_UI_Page_hasImageUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasImageUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasImageUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Page_imageCardsUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_imageCardsUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_ImageCardsUnits(),
				 false,
				 false,
				 false,
				 null,
				 null,
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
				 getString("_UI_Page_hasImageCardsUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasImageCardsUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasImageCardsUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Login Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoginUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_loginUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_loginUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_LoginUnits(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Login Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasLoginUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_hasLoginUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasLoginUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasLoginUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Page_mapUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_mapUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_MapUnits(),
				 false,
				 false,
				 false,
				 null,
				 null,
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
				 getString("_UI_Page_hasMapUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasMapUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasMapUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Non Security Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNonSecurityUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_nonSecurityUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_nonSecurityUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_NonSecurityUnits(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Non Security Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasNonSecurityUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_hasNonSecurityUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasNonSecurityUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasNonSecurityUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Page_sliderUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_sliderUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_SliderUnits(),
				 false,
				 false,
				 false,
				 null,
				 null,
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
				 getString("_UI_Page_hasSliderUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasSliderUnits_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasSliderUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Repositories feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepositoriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_repositories_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_repositories_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_Repositories(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Repositories feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasRepositoriesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_hasRepositories_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasRepositories_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasRepositories(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_services_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_services_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_Services(),
				 false,
				 false,
				 false,
				 null,
				 null,
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
				 getString("_UI_Page_formFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_formFields_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_FormFields(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_hasServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasServices_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasServices(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Page_hasPagination_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasPagination_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasPagination(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Captcha Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCaptchaFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_hasCaptchaFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasCaptchaFields_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasCaptchaFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Page_hasInterfaceFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasInterfaceFields_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasInterfaceFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Page_hasResourceFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasResourceFields_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasResourceFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Page_actionsWithoutTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_actionsWithoutTarget_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_ActionsWithoutTarget(),
				 false,
				 false,
				 false,
				 null,
				 null,
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
				 getString("_UI_Page_uriElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_uriElement_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_UriElement(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Style Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalStyleClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_localStyleClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_localStyleClass_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_LocalStyleClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Style Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStyleClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_styleClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_styleClass_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_StyleClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Style Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasStyleClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_hasStyleClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_hasStyleClass_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_HasStyleClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Page_genModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_genModel_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_GenModel(),
				 false,
				 false,
				 false,
				 null,
				 null,
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
				 getString("_UI_Page_uiModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_uiModel_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_UiModel(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_securityModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_securityModel_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_SecurityModel(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Root Page feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootPagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Page_rootPage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Page_rootPage_feature", "_UI_Page_type"),
				 WafPackage.eINSTANCE.getPage_RootPage(),
				 false,
				 false,
				 false,
				 null,
				 null,
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
			childrenFeatures.add(WafPackage.eINSTANCE.getPage_Units());
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
	 * This returns Page.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Page"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Page)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Page_type") :
			getString("_UI_Page_type") + " " + label;
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

		switch (notification.getFeatureID(Page.class)) {
			case WafPackage.PAGE__COMMON_ROLE:
			case WafPackage.PAGE__IS_AUTHORISED:
			case WafPackage.PAGE__HAS_COMMON_UNIT_AUTHENTICATION:
			case WafPackage.PAGE__HAS_CHANGABLE_COLLECTIONS:
			case WafPackage.PAGE__HAS_COLLECTION_UNITS:
			case WafPackage.PAGE__HAS_DYNAMIC_UNITS:
			case WafPackage.PAGE__HAS_EDIT_UNITS:
			case WafPackage.PAGE__HAS_ANY_EDIT_UNITS:
			case WafPackage.PAGE__HAS_FORGOTTEN_PASSWORD_UNITS:
			case WafPackage.PAGE__HAS_FORM_UNITS:
			case WafPackage.PAGE__HAS_FILTERS:
			case WafPackage.PAGE__HAS_GALLERY_UNITS:
			case WafPackage.PAGE__HAS_INDEX_UNITS:
			case WafPackage.PAGE__HAS_IMAGE_UNITS:
			case WafPackage.PAGE__HAS_IMAGE_CARDS_UNITS:
			case WafPackage.PAGE__HAS_LOGIN_UNITS:
			case WafPackage.PAGE__HAS_MAP_UNITS:
			case WafPackage.PAGE__HAS_NON_SECURITY_UNITS:
			case WafPackage.PAGE__HAS_SLIDER_UNITS:
			case WafPackage.PAGE__HAS_REPOSITORIES:
			case WafPackage.PAGE__HAS_SERVICES:
			case WafPackage.PAGE__HAS_PAGINATION:
			case WafPackage.PAGE__HAS_CAPTCHA_FIELDS:
			case WafPackage.PAGE__HAS_INTERFACE_FIELDS:
			case WafPackage.PAGE__HAS_RESOURCE_FIELDS:
			case WafPackage.PAGE__URI_ELEMENT:
			case WafPackage.PAGE__LOCAL_STYLE_CLASS:
			case WafPackage.PAGE__STYLE_CLASS:
			case WafPackage.PAGE__HAS_STYLE_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.PAGE__UNITS:
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
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createStaticUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createSingletonUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createCollectionUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createCreateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createCreateUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createMapUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createDetailsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createIndexGridUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createIndexPageDirectionUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createIndexLineDirectionUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createTextCardsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createDateCardsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createImageCardsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createSliderUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createGalleryUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createSearchUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createRegistrationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createLoginUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createLogoutUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getPage_Units(),
				 WafFactory.eINSTANCE.createForgottenPasswordUnit()));
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
