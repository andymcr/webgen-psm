/**
 */
package work.andycarpenter.psms.waf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.psms.waf.IndexUnit;
import work.andycarpenter.psms.waf.WafFactory;
import work.andycarpenter.psms.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.psms.waf.IndexUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IndexUnitItemProvider extends CollectionUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexUnitItemProvider(AdapterFactory adapterFactory) {
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

			addActionNavigationClassPropertyDescriptor(object);
			addOmitColumnLabelsPropertyDescriptor(object);
			addTargettingSearchesPropertyDescriptor(object);
			addRowClassesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Action Navigation Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionNavigationClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InlineActionContainer_actionNavigationClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InlineActionContainer_actionNavigationClass_feature", "_UI_InlineActionContainer_type"),
				 WafPackage.Literals.INLINE_ACTION_CONTAINER__ACTION_NAVIGATION_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Omit Column Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOmitColumnLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IndexUnit_omitColumnLabels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IndexUnit_omitColumnLabels_feature", "_UI_IndexUnit_type"),
				 WafPackage.Literals.INDEX_UNIT__OMIT_COLUMN_LABELS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_IndexUnit_targettingSearches_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IndexUnit_targettingSearches_feature", "_UI_IndexUnit_type"),
				 WafPackage.Literals.INDEX_UNIT__TARGETTING_SEARCHES,
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
				 getString("_UI_IndexUnit_rowClasses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IndexUnit_rowClasses_feature", "_UI_IndexUnit_type"),
				 WafPackage.Literals.INDEX_UNIT__ROW_CLASSES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(WafPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS);
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
		String label = ((IndexUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IndexUnit_type") :
			getString("_UI_IndexUnit_type") + " " + label;
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

		switch (notification.getFeatureID(IndexUnit.class)) {
			case WafPackage.INDEX_UNIT__ACTION_NAVIGATION_CLASS:
			case WafPackage.INDEX_UNIT__OMIT_COLUMN_LABELS:
			case WafPackage.INDEX_UNIT__ROW_CLASSES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.INDEX_UNIT__ACTIONS:
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
				(WafPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 WafFactory.eINSTANCE.createSelectAction()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 WafFactory.eINSTANCE.createDeleteAction()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.INLINE_ACTION_CONTAINER__ACTIONS,
				 WafFactory.eINSTANCE.createFeatureSupportAction()));
	}

}
