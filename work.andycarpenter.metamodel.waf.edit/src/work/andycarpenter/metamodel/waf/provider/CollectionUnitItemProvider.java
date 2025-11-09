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
			addFilterPropertyDescriptor(object);
			addFindContainerSelectionPropertyDescriptor(object);
			addFindElementSelectionPropertyDescriptor(object);
			addDefaultPaginationSizePropertyDescriptor(object);
			addMaximumPaginationSizePropertyDescriptor(object);
			addClearLabelOverridePropertyDescriptor(object);
			addClearIconOverridePropertyDescriptor(object);
			addSearchLabelOverridePropertyDescriptor(object);
			addSearchIconOverridePropertyDescriptor(object);
			addEmptyMessagePropertyDescriptor(object);
			addOmitFieldLabelsPropertyDescriptor(object);
			addFiltersClassOverridePropertyDescriptor(object);
			addFiltersActionClassOverridePropertyDescriptor(object);
			addFiltersBodyClassOverridePropertyDescriptor(object);
			addFiltersControlClassOverridePropertyDescriptor(object);
			addInstanceActionClassOverridePropertyDescriptor(object);
			addInstanceControlClassOverridePropertyDescriptor(object);
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
				 getString("_UI_BusinessPropertyCategory"),
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
				 getString("_UI_InterfacePropertyCategory"),
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
				 getString("_UI_InterfacePropertyCategory"),
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
				 getString("_UI_BusinessPropertyCategory"),
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
				 getString("_UI_BusinessPropertyCategory"),
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
				 getString("_UI_BusinessPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Clear Label Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClearLabelOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_clearLabelOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_clearLabelOverride_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_ClearLabelOverride(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Clear Icon Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClearIconOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_clearIconOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_clearIconOverride_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_ClearIconOverride(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Search Label Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSearchLabelOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_searchLabelOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_searchLabelOverride_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_SearchLabelOverride(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Search Icon Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSearchIconOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_searchIconOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_searchIconOverride_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_SearchIconOverride(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
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
				 getString("_UI_BusinessPropertyCategory"),
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
				 getString("_UI_InterfacePropertyCategory"),
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
				 getString("_UI_InterfacePropertyCategory"),
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
				 getString("_UI_PaginationPropertyCategory"),
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
				 getString("_UI_PaginationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Filters Class Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFiltersClassOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_filtersClassOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_filtersClassOverride_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_FiltersClassOverride(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Filters Control Class Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFiltersControlClassOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_filtersControlClassOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_filtersControlClassOverride_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_FiltersControlClassOverride(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Filters Action Class Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFiltersActionClassOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_filtersActionClassOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_filtersActionClassOverride_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_FiltersActionClassOverride(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Filters Body Class Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFiltersBodyClassOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_filtersBodyClassOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_filtersBodyClassOverride_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_FiltersBodyClassOverride(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Control Class Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceControlClassOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_instanceControlClassOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_instanceControlClassOverride_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_InstanceControlClassOverride(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Action Class Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceActionClassOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_instanceActionClassOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_instanceActionClassOverride_feature", "_UI_CollectionUnit_type"),
				 WafPackage.eINSTANCE.getCollectionUnit_InstanceActionClassOverride(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
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
			childrenFeatures.add(WafPackage.eINSTANCE.getCollectionUnit_Filters());
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
			case WafPackage.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE:
			case WafPackage.COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE:
			case WafPackage.COLLECTION_UNIT__CLEAR_LABEL_OVERRIDE:
			case WafPackage.COLLECTION_UNIT__CLEAR_ICON_OVERRIDE:
			case WafPackage.COLLECTION_UNIT__SEARCH_LABEL_OVERRIDE:
			case WafPackage.COLLECTION_UNIT__SEARCH_ICON_OVERRIDE:
			case WafPackage.COLLECTION_UNIT__EMPTY_MESSAGE:
			case WafPackage.COLLECTION_UNIT__OMIT_FIELD_LABELS:
			case WafPackage.COLLECTION_UNIT__FILTERS_CLASS_OVERRIDE:
			case WafPackage.COLLECTION_UNIT__FILTERS_ACTION_CLASS_OVERRIDE:
			case WafPackage.COLLECTION_UNIT__FILTERS_BODY_CLASS_OVERRIDE:
			case WafPackage.COLLECTION_UNIT__FILTERS_CONTROL_CLASS_OVERRIDE:
			case WafPackage.COLLECTION_UNIT__INSTANCE_ACTION_CLASS_OVERRIDE:
			case WafPackage.COLLECTION_UNIT__INSTANCE_CONTROL_CLASS_OVERRIDE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.COLLECTION_UNIT__ELEMENT_TITLE:
			case WafPackage.COLLECTION_UNIT__FILTERS:
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
				 WafFactory.eINSTANCE.createAssociationDisplayValue()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getCollectionUnit_ElementTitle(),
				 WafFactory.eINSTANCE.createAttributeDisplayValue()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getCollectionUnit_ElementTitle(),
				 WafFactory.eINSTANCE.createResourceDisplayValue()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getCollectionUnit_ElementTitle(),
				 WafFactory.eINSTANCE.createLabelDisplayValue()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getCollectionUnit_Filters(),
				 WafFactory.eINSTANCE.createArrayFilter()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getCollectionUnit_Filters(),
				 WafFactory.eINSTANCE.createBooleanFilter()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getCollectionUnit_Filters(),
				 WafFactory.eINSTANCE.createChoiceFilter()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getCollectionUnit_Filters(),
				 WafFactory.eINSTANCE.createComparisonFilter()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getCollectionUnit_Filters(),
				 WafFactory.eINSTANCE.createDateTimeFilter()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getCollectionUnit_Filters(),
				 WafFactory.eINSTANCE.createEntityFilter()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getCollectionUnit_Filters(),
				 WafFactory.eINSTANCE.createNullFilter()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getCollectionUnit_Filters(),
				 WafFactory.eINSTANCE.createNumericFilter()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getCollectionUnit_Filters(),
				 WafFactory.eINSTANCE.createTextFilter()));
	}

}
