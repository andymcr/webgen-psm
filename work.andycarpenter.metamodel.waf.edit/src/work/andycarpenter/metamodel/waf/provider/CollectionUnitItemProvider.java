/**
 */
package work.andycarpenter.metamodel.waf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.metamodel.waf.CollectionUnit;
import work.andycarpenter.metamodel.waf.WafFactory;
import work.andycarpenter.metamodel.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.waf.CollectionUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectionUnitItemProvider extends DynamicUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionUnitItemProvider(AdapterFactory adapterFactory) {
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

			addSelectorsPropertyDescriptor(object);
			addUnitTitlePropertyDescriptor(object);
			addTruncateElementTitlePropertyDescriptor(object);
			addSelectionPropertyDescriptor(object);
			addContainerTypePropertyDescriptor(object);
			addFindContainerSelectionPropertyDescriptor(object);
			addFindElementSelectionPropertyDescriptor(object);
			addFilterPropertyDescriptor(object);
			addSupportedFiltersPropertyDescriptor(object);
			addHasFiltersPropertyDescriptor(object);
			addHasGroupedResultsPropertyDescriptor(object);
			addHasPaginationPropertyDescriptor(object);
			addEmptyMessagePropertyDescriptor(object);
			addOmitFieldLabelsPropertyDescriptor(object);
			addDefaultPaginationSizePropertyDescriptor(object);
			addMaximumPaginationSizePropertyDescriptor(object);
			addPaginationControlPlacementPropertyDescriptor(object);
			addNextNpagesPropertyDescriptor(object);
			addPreviousNpagesPropertyDescriptor(object);
			addNextPageLabelPropertyDescriptor(object);
			addNextPageIconNamePropertyDescriptor(object);
			addPreviousPageLabelPropertyDescriptor(object);
			addPreviousPageIconNamePropertyDescriptor(object);
			addUseDisabledPageLinksPropertyDescriptor(object);
			addUseFirstLastPageLinksPropertyDescriptor(object);
			addFirstPageLabelPropertyDescriptor(object);
			addFirstPageIconNamePropertyDescriptor(object);
			addLastPageLabelPropertyDescriptor(object);
			addLastPageIconNamePropertyDescriptor(object);
			addPaginationClassPropertyDescriptor(object);
			addPaginationElementClassPropertyDescriptor(object);
			addPaginationAnchorClassPropertyDescriptor(object);
			addLocalInstanceControlClassPropertyDescriptor(object);
			addLocalInstanceAnchorClassPropertyDescriptor(object);
			addCommonInstanceControlClassPropertyDescriptor(object);
			addHasCommonInstanceControlClassPropertyDescriptor(object);
			addCommonInstanceAnchorClassPropertyDescriptor(object);
			addHasCommonInstanceAnchorClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Selectors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SelectableUnit_selectors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SelectableUnit_selectors_feature", "_UI_SelectableUnit_type"),
				 WafPackage.eINSTANCE.getSelectableUnit_Selectors(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unit Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_unitTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_unitTitle_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_UnitTitle(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Truncate Element Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTruncateElementTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_truncateElementTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_truncateElementTitle_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_TruncateElementTitle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_selection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_selection_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_Selection(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Container Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_containerType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_containerType_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_ContainerType(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Find Container Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFindContainerSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_findContainerSelection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_findContainerSelection_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_FindContainerSelection(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Find Element Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFindElementSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_findElementSelection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_findElementSelection_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_FindElementSelection(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_filter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_filter_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_Filter(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Supported Filters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportedFiltersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_supportedFilters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_supportedFilters_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_SupportedFilters(),
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_CollectionUnit_hasFilters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_hasFilters_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_HasFilters(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Grouped Results feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasGroupedResultsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_hasGroupedResults_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_hasGroupedResults_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_HasGroupedResults(),
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
				 getString("_UI_CollectionUnit_hasPagination_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_hasPagination_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_HasPagination(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Empty Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmptyMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_emptyMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_emptyMessage_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_EmptyMessage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Omit Field Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOmitFieldLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_omitFieldLabels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_omitFieldLabels_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_OmitFieldLabels(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Pagination Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPaginationSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_defaultPaginationSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_defaultPaginationSize_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_DefaultPaginationSize(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Pagination Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumPaginationSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_maximumPaginationSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_maximumPaginationSize_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_MaximumPaginationSize(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pagination Control Placement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaginationControlPlacementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_paginationControlPlacement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_paginationControlPlacement_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_PaginationControlPlacement(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Npages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextNpagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_nextNpages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_nextNpages_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_NextNpages(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Previous Npages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreviousNpagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_previousNpages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_previousNpages_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_PreviousNpages(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Page Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextPageLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_nextPageLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_nextPageLabel_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_NextPageLabel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Page Icon Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextPageIconNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_nextPageIconName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_nextPageIconName_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_NextPageIconName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Previous Page Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreviousPageLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_previousPageLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_previousPageLabel_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_PreviousPageLabel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Previous Page Icon Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreviousPageIconNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_previousPageIconName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_previousPageIconName_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_PreviousPageIconName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Disabled Page Links feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseDisabledPageLinksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_useDisabledPageLinks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_useDisabledPageLinks_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_UseDisabledPageLinks(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use First Last Page Links feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseFirstLastPageLinksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_useFirstLastPageLinks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_useFirstLastPageLinks_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_UseFirstLastPageLinks(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Page Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstPageLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_firstPageLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_firstPageLabel_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_FirstPageLabel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Page Icon Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstPageIconNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_firstPageIconName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_firstPageIconName_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_FirstPageIconName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Page Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastPageLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_lastPageLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_lastPageLabel_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_LastPageLabel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Page Icon Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastPageIconNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_lastPageIconName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_lastPageIconName_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_LastPageIconName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pagination Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaginationClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_paginationClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_paginationClass_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_PaginationClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pagination Element Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaginationElementClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_paginationElementClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_paginationElementClass_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_PaginationElementClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pagination Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaginationAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_paginationAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_paginationAnchorClass_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_PaginationAnchorClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Instance Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalInstanceControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_localInstanceControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_localInstanceControlClass_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_LocalInstanceControlClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Instance Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalInstanceAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_localInstanceAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_localInstanceAnchorClass_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_LocalInstanceAnchorClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Common Instance Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommonInstanceControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_commonInstanceControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_commonInstanceControlClass_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_CommonInstanceControlClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Common Instance Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCommonInstanceControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_hasCommonInstanceControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_hasCommonInstanceControlClass_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_HasCommonInstanceControlClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Common Instance Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommonInstanceAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_commonInstanceAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_commonInstanceAnchorClass_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_CommonInstanceAnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Common Instance Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCommonInstanceAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_hasCommonInstanceAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_hasCommonInstanceAnchorClass_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_HasCommonInstanceAnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(WafPackage.eINSTANCE.getCollectionUnit_ElementTitle());
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
	 * This returns CollectionUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CollectionUnit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CollectionUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CollectionUnit_type") :
			getString("_UI_CollectionUnit_type") + " " + label;
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

		switch (notification.getFeatureID(CollectionUnit.class)) {
			case WafPackage.COLLECTION_UNIT__TRUNCATE_ELEMENT_TITLE:
			case WafPackage.COLLECTION_UNIT__HAS_FILTERS:
			case WafPackage.COLLECTION_UNIT__HAS_GROUPED_RESULTS:
			case WafPackage.COLLECTION_UNIT__HAS_PAGINATION:
			case WafPackage.COLLECTION_UNIT__EMPTY_MESSAGE:
			case WafPackage.COLLECTION_UNIT__OMIT_FIELD_LABELS:
			case WafPackage.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE:
			case WafPackage.COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE:
			case WafPackage.COLLECTION_UNIT__PAGINATION_CONTROL_PLACEMENT:
			case WafPackage.COLLECTION_UNIT__NEXT_NPAGES:
			case WafPackage.COLLECTION_UNIT__PREVIOUS_NPAGES:
			case WafPackage.COLLECTION_UNIT__NEXT_PAGE_LABEL:
			case WafPackage.COLLECTION_UNIT__NEXT_PAGE_ICON_NAME:
			case WafPackage.COLLECTION_UNIT__PREVIOUS_PAGE_LABEL:
			case WafPackage.COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME:
			case WafPackage.COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS:
			case WafPackage.COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS:
			case WafPackage.COLLECTION_UNIT__FIRST_PAGE_LABEL:
			case WafPackage.COLLECTION_UNIT__FIRST_PAGE_ICON_NAME:
			case WafPackage.COLLECTION_UNIT__LAST_PAGE_LABEL:
			case WafPackage.COLLECTION_UNIT__LAST_PAGE_ICON_NAME:
			case WafPackage.COLLECTION_UNIT__PAGINATION_CLASS:
			case WafPackage.COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS:
			case WafPackage.COLLECTION_UNIT__PAGINATION_ANCHOR_CLASS:
			case WafPackage.COLLECTION_UNIT__LOCAL_INSTANCE_CONTROL_CLASS:
			case WafPackage.COLLECTION_UNIT__LOCAL_INSTANCE_ANCHOR_CLASS:
			case WafPackage.COLLECTION_UNIT__COMMON_INSTANCE_CONTROL_CLASS:
			case WafPackage.COLLECTION_UNIT__HAS_COMMON_INSTANCE_CONTROL_CLASS:
			case WafPackage.COLLECTION_UNIT__COMMON_INSTANCE_ANCHOR_CLASS:
			case WafPackage.COLLECTION_UNIT__HAS_COMMON_INSTANCE_ANCHOR_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.COLLECTION_UNIT__ELEMENT_TITLE:
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
				(WafPackage.eINSTANCE.getCollectionUnit_ElementTitle(),
				 WafFactory.eINSTANCE.createFeaturePathAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getCollectionUnit_ElementTitle(),
				 WafFactory.eINSTANCE.createFeaturePathAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getCollectionUnit_ElementTitle(),
				 WafFactory.eINSTANCE.createFeaturePathLabel()));
	}

}
