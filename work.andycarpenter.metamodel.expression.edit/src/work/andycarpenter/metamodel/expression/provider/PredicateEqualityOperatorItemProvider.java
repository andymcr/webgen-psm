/**
 */
package work.andycarpenter.metamodel.expression.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.metamodel.expression.ExpressionFactory;
import work.andycarpenter.metamodel.expression.ExpressionPackage;
import work.andycarpenter.metamodel.expression.PredicateEqualityOperator;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.expression.PredicateEqualityOperator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PredicateEqualityOperatorItemProvider extends PredicateItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateEqualityOperatorItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT);
			childrenFeatures.add(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT);
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
	 * This returns PredicateEqualityOperator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PredicateEqualityOperator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PredicateEqualityOperator predicateEqualityOperator = (PredicateEqualityOperator)object;
		return getString("_UI_PredicateEqualityOperator_type") + " " + predicateEqualityOperator.isNegated();
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

		switch (notification.getFeatureID(PredicateEqualityOperator.class)) {
			case ExpressionPackage.PREDICATE_EQUALITY_OPERATOR__LEFT:
			case ExpressionPackage.PREDICATE_EQUALITY_OPERATOR__RIGHT:
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
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
				 ExpressionFactory.eINSTANCE.createPredicateBooleanVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
				 ExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
				 ExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
				 ExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
				 ExpressionFactory.eINSTANCE.createPredicateInOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
				 ExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
				 ExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
				 ExpressionFactory.eINSTANCE.createPredicateIsNull()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
				 ExpressionFactory.eINSTANCE.createArithmeticOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
				 ExpressionFactory.eINSTANCE.createPredicateBooleanVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
				 ExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
				 ExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
				 ExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
				 ExpressionFactory.eINSTANCE.createPredicateInOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
				 ExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
				 ExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
				 ExpressionFactory.eINSTANCE.createPredicateIsNull()));

		newChildDescriptors.add
			(createChildParameter
				(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
				 ExpressionFactory.eINSTANCE.createArithmeticOperation()));
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
			childFeature == ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT ||
			childFeature == ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
