/**
 */
package work.andycarpenter.metamodel.waf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.metamodel.waf.TabularUnit;
import work.andycarpenter.metamodel.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.waf.TabularUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TabularUnitItemProvider extends CollectionUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabularUnitItemProvider(AdapterFactory adapterFactory) {
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

			addTargettingSearchesPropertyDescriptor(object);
			addRowClassesPropertyDescriptor(object);
			addContentClassPropertyDescriptor(object);
			addHasContentClassPropertyDescriptor(object);
			addTabularFieldListClassPropertyDescriptor(object);
			addTabularDefinitionFieldListClassPropertyDescriptor(object);
			addTabularFieldLabelClassPropertyDescriptor(object);
			addTabularFieldValueClassPropertyDescriptor(object);
			addTabularControlClassPropertyDescriptor(object);
			addTabularInstanceControlClassPropertyDescriptor(object);
			addTabularAnchorClassPropertyDescriptor(object);
			addTabularInstanceAnchorClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Targetting Searches feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargettingSearchesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_targettingSearches_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_targettingSearches_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_TargettingSearches(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Row Classes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRowClassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_rowClasses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_rowClasses_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_RowClasses(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_contentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_contentClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_ContentClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_hasContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_hasContentClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_HasContentClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabular Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabularFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_tabularFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_tabularFieldListClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_TabularFieldListClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabular Definition Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabularDefinitionFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_tabularDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_tabularDefinitionFieldListClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_TabularDefinitionFieldListClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabular Field Label Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabularFieldLabelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_tabularFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_tabularFieldLabelClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_TabularFieldLabelClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabular Field Value Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabularFieldValueClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_tabularFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_tabularFieldValueClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_TabularFieldValueClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabular Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabularControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_tabularControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_tabularControlClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_TabularControlClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabular Instance Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabularInstanceControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_tabularInstanceControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_tabularInstanceControlClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_TabularInstanceControlClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabular Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabularAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_tabularAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_tabularAnchorClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_TabularAnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabular Instance Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabularInstanceAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_tabularInstanceAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_tabularInstanceAnchorClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_TabularInstanceAnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TabularUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TabularUnit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TabularUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TabularUnit_type") :
			getString("_UI_TabularUnit_type") + " " + label;
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

		switch (notification.getFeatureID(TabularUnit.class)) {
			case WafPackage.TABULAR_UNIT__ROW_CLASSES:
			case WafPackage.TABULAR_UNIT__CONTENT_CLASS:
			case WafPackage.TABULAR_UNIT__HAS_CONTENT_CLASS:
			case WafPackage.TABULAR_UNIT__TABULAR_FIELD_LIST_CLASS:
			case WafPackage.TABULAR_UNIT__TABULAR_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.TABULAR_UNIT__TABULAR_FIELD_LABEL_CLASS:
			case WafPackage.TABULAR_UNIT__TABULAR_FIELD_VALUE_CLASS:
			case WafPackage.TABULAR_UNIT__TABULAR_CONTROL_CLASS:
			case WafPackage.TABULAR_UNIT__TABULAR_INSTANCE_CONTROL_CLASS:
			case WafPackage.TABULAR_UNIT__TABULAR_ANCHOR_CLASS:
			case WafPackage.TABULAR_UNIT__TABULAR_INSTANCE_ANCHOR_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
