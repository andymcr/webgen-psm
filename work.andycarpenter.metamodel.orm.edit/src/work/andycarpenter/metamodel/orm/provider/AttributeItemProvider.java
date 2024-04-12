/**
 */
package work.andycarpenter.metamodel.orm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import work.andycarpenter.metamodel.base.BaseFactory;
import work.andycarpenter.metamodel.expression.ExpressionFactory;
import work.andycarpenter.metamodel.orm.Attribute;
import work.andycarpenter.metamodel.orm.OrmFactory;
import work.andycarpenter.metamodel.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.orm.Attribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeItemProvider extends FeatureItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeItemProvider(AdapterFactory adapterFactory) {
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

			addHiddenPropertyDescriptor(object);
			addBooleanIsHasChoicePropertyDescriptor(object);
			addSlugFieldsPropertyDescriptor(object);
			addHasSerializationControlAttributePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Hidden feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHiddenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_hidden_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_hidden_feature", "_UI_Attribute_type"),
				 OrmPackage.Literals.ATTRIBUTE__HIDDEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Boolean Is Has Choice feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBooleanIsHasChoicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_booleanIsHasChoice_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_booleanIsHasChoice_feature", "_UI_Attribute_type"),
				 OrmPackage.Literals.ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slug Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlugFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_slugFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_slugFields_feature", "_UI_Attribute_type"),
				 OrmPackage.Literals.ATTRIBUTE__SLUG_FIELDS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Serialization Control Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasSerializationControlAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_hasSerializationControlAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_hasSerializationControlAttribute_feature", "_UI_Attribute_type"),
				 OrmPackage.Literals.ATTRIBUTE__HAS_SERIALIZATION_CONTROL_ATTRIBUTE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE);
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
		String label = ((Attribute)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Attribute_type") :
			getString("_UI_Attribute_type") + " " + label;
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

		switch (notification.getFeatureID(Attribute.class)) {
			case OrmPackage.ATTRIBUTE__HIDDEN:
			case OrmPackage.ATTRIBUTE__BOOLEAN_IS_HAS_CHOICE:
			case OrmPackage.ATTRIBUTE__HAS_SERIALIZATION_CONTROL_ATTRIBUTE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE:
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
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 OrmFactory.eINSTANCE.createFeatureReference()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createTimeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createCurrentTime()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createCurrentUser()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createConstantReference()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 BaseFactory.eINSTANCE.createParameterReference()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createSizeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateBooleanVariable()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateInOperator()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ATTRIBUTE__ATTRIBUTE_DEFAULT_VALUE,
				 ExpressionFactory.eINSTANCE.createPredicateIsNull()));
	}

}
