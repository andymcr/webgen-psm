/**
 */
package uk.ac.man.cs.mdsd.waf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import uk.ac.man.cs.mdsd.waf.ImageUnit;
import uk.ac.man.cs.mdsd.waf.WafFactory;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.waf.ImageUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageUnitItemProvider extends DynamicUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageUnitItemProvider(AdapterFactory adapterFactory) {
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

			addSelectionTypePropertyDescriptor(object);
			addSelectorsPropertyDescriptor(object);
			addContainingFeaturePropertyDescriptor(object);
			addContentTypePropertyDescriptor(object);
			addSelectionPropertyDescriptor(object);
			addSupportedFiltersPropertyDescriptor(object);
			addEmptyMessagePropertyDescriptor(object);
			addDefaultPaginationSizePropertyDescriptor(object);
			addMaximumPaginationSizePropertyDescriptor(object);
			addNextNpagesPropertyDescriptor(object);
			addPreviousNpagesPropertyDescriptor(object);
			addNextPageLabelPropertyDescriptor(object);
			addPreviousPageLabelPropertyDescriptor(object);
			addUseDisabledPageLinksPropertyDescriptor(object);
			addUseFirstLastPageLinksPropertyDescriptor(object);
			addFirstPageLabelPropertyDescriptor(object);
			addLastPageLabelPropertyDescriptor(object);
			addDefaultSelectionPropertyDescriptor(object);
			addMissingImagePathPropertyDescriptor(object);
			addImageFilterPropertyDescriptor(object);
			addShowTimePropertyDescriptor(object);
			addTransitionTimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Selection Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SelectableUnit_selectionType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SelectableUnit_selectionType_feature", "_UI_SelectableUnit_type"),
				 WafPackage.Literals.SELECTABLE_UNIT__SELECTION_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 WafPackage.Literals.SELECTABLE_UNIT__SELECTORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Containing Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainingFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_containingFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_containingFeature_feature", "_UI_CollectionUnit_type"),
				 WafPackage.Literals.COLLECTION_UNIT__CONTAINING_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollectionUnit_contentType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollectionUnit_contentType_feature", "_UI_CollectionUnit_type"),
				 WafPackage.Literals.COLLECTION_UNIT__CONTENT_TYPE,
				 true,
				 false,
				 true,
				 null,
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
				 WafPackage.Literals.COLLECTION_UNIT__SELECTION,
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
				 WafPackage.Literals.COLLECTION_UNIT__SUPPORTED_FILTERS,
				 true,
				 false,
				 true,
				 null,
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
				 WafPackage.Literals.COLLECTION_UNIT__EMPTY_MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 WafPackage.Literals.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE,
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
				 WafPackage.Literals.COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 WafPackage.Literals.COLLECTION_UNIT__NEXT_NPAGES,
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
				 WafPackage.Literals.COLLECTION_UNIT__PREVIOUS_NPAGES,
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
				 WafPackage.Literals.COLLECTION_UNIT__NEXT_PAGE_LABEL,
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
				 WafPackage.Literals.COLLECTION_UNIT__PREVIOUS_PAGE_LABEL,
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
				 WafPackage.Literals.COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS,
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
				 WafPackage.Literals.COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS,
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
				 WafPackage.Literals.COLLECTION_UNIT__FIRST_PAGE_LABEL,
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
				 WafPackage.Literals.COLLECTION_UNIT__LAST_PAGE_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageUnit_defaultSelection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_defaultSelection_feature", "_UI_ImageUnit_type"),
				 WafPackage.Literals.IMAGE_UNIT__DEFAULT_SELECTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Missing Image Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMissingImagePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageUnit_missingImagePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_missingImagePath_feature", "_UI_ImageUnit_type"),
				 WafPackage.Literals.IMAGE_UNIT__MISSING_IMAGE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageUnit_imageFilter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_imageFilter_feature", "_UI_ImageUnit_type"),
				 WafPackage.Literals.IMAGE_UNIT__IMAGE_FILTER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageUnit_showTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_showTime_feature", "_UI_ImageUnit_type"),
				 WafPackage.Literals.IMAGE_UNIT__SHOW_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transition Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitionTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageUnit_transitionTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageUnit_transitionTime_feature", "_UI_ImageUnit_type"),
				 WafPackage.Literals.IMAGE_UNIT__TRANSITION_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(WafPackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE);
			childrenFeatures.add(WafPackage.Literals.IMAGE_UNIT__TITLE_FEATURE);
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
		String label = ((ImageUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ImageUnit_type") :
			getString("_UI_ImageUnit_type") + " " + label;
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

		switch (notification.getFeatureID(ImageUnit.class)) {
			case WafPackage.IMAGE_UNIT__EMPTY_MESSAGE:
			case WafPackage.IMAGE_UNIT__DEFAULT_PAGINATION_SIZE:
			case WafPackage.IMAGE_UNIT__MAXIMUM_PAGINATION_SIZE:
			case WafPackage.IMAGE_UNIT__NEXT_NPAGES:
			case WafPackage.IMAGE_UNIT__PREVIOUS_NPAGES:
			case WafPackage.IMAGE_UNIT__NEXT_PAGE_LABEL:
			case WafPackage.IMAGE_UNIT__PREVIOUS_PAGE_LABEL:
			case WafPackage.IMAGE_UNIT__USE_DISABLED_PAGE_LINKS:
			case WafPackage.IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS:
			case WafPackage.IMAGE_UNIT__FIRST_PAGE_LABEL:
			case WafPackage.IMAGE_UNIT__LAST_PAGE_LABEL:
			case WafPackage.IMAGE_UNIT__MISSING_IMAGE_PATH:
			case WafPackage.IMAGE_UNIT__SHOW_TIME:
			case WafPackage.IMAGE_UNIT__TRANSITION_TIME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
			case WafPackage.IMAGE_UNIT__TITLE_FEATURE:
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
				(WafPackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE,
				 WafFactory.eINSTANCE.createFeaturePathAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE,
				 WafFactory.eINSTANCE.createFeaturePathAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.IMAGE_UNIT__TITLE_FEATURE,
				 WafFactory.eINSTANCE.createFeaturePathAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.IMAGE_UNIT__TITLE_FEATURE,
				 WafFactory.eINSTANCE.createFeaturePathAssociation()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == WafPackage.Literals.IMAGE_UNIT__IMAGE_PATH_FEATURE ||
			childFeature == WafPackage.Literals.IMAGE_UNIT__TITLE_FEATURE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
