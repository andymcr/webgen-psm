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
import work.andycarpenter.metamodel.expression.ExpressionFactory;
import work.andycarpenter.metamodel.waf.EditUnit;
import work.andycarpenter.metamodel.waf.WafFactory;
import work.andycarpenter.metamodel.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.waf.EditUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EditUnitItemProvider extends SingletonUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditUnitItemProvider(AdapterFactory adapterFactory) {
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

			addUseCaptchaPropertyDescriptor(object);
			addOnSaveContinueEditingPropertyDescriptor(object);
			addConfirmDestinationPropertyDescriptor(object);
			addCancelDestinationPropertyDescriptor(object);
			addCancelLabelOverridePropertyDescriptor(object);
			addCancelIconOverridePropertyDescriptor(object);
			addSaveLabelOverridePropertyDescriptor(object);
			addSaveIconOverridePropertyDescriptor(object);
			addLocalInputGroupClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Use Captcha feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseCaptchaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_useCaptcha_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_useCaptcha_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_UseCaptcha(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_BusinessPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the On Save Continue Editing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnSaveContinueEditingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_onSaveContinueEditing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_onSaveContinueEditing_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_OnSaveContinueEditing(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Confirm Destination feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfirmDestinationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_confirmDestination_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_confirmDestination_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_ConfirmDestination(),
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Cancel Destination feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCancelDestinationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_cancelDestination_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_cancelDestination_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_CancelDestination(),
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Save Label Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSaveLabelOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_saveLabelOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_saveLabelOverride_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_SaveLabelOverride(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Save Icon Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSaveIconOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_saveIconOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_saveIconOverride_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_SaveIconOverride(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Cancel Label Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCancelLabelOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_cancelLabelOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_cancelLabelOverride_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_CancelLabelOverride(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Cancel Icon Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCancelIconOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_cancelIconOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_cancelIconOverride_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_CancelIconOverride(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Input Group Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalInputGroupClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_localInputGroupClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_localInputGroupClass_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_LocalInputGroupClass(),
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
			childrenFeatures.add(WafPackage.eINSTANCE.getEditUnit_DisableWhen());
			childrenFeatures.add(WafPackage.eINSTANCE.getEditUnit_ConfirmMessage());
			childrenFeatures.add(WafPackage.eINSTANCE.getEditUnit_SuccessMessage());
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
		String label = ((EditUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EditUnit_type") :
			getString("_UI_EditUnit_type") + " " + label;
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

		switch (notification.getFeatureID(EditUnit.class)) {
			case WafPackage.EDIT_UNIT__USE_CAPTCHA:
			case WafPackage.EDIT_UNIT__ON_SAVE_CONTINUE_EDITING:
			case WafPackage.EDIT_UNIT__CANCEL_LABEL_OVERRIDE:
			case WafPackage.EDIT_UNIT__CANCEL_ICON_OVERRIDE:
			case WafPackage.EDIT_UNIT__SAVE_LABEL_OVERRIDE:
			case WafPackage.EDIT_UNIT__SAVE_ICON_OVERRIDE:
			case WafPackage.EDIT_UNIT__LOCAL_INPUT_GROUP_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.EDIT_UNIT__DISABLE_WHEN:
			case WafPackage.EDIT_UNIT__CONFIRM_MESSAGE:
			case WafPackage.EDIT_UNIT__SUCCESS_MESSAGE:
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
				(WafPackage.eINSTANCE.getEditUnit_DisableWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateBooleanVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getEditUnit_DisableWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getEditUnit_DisableWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getEditUnit_DisableWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getEditUnit_DisableWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateInOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getEditUnit_DisableWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getEditUnit_DisableWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getEditUnit_DisableWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateIsNull()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getEditUnit_ConfirmMessage(),
				 WafFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getEditUnit_SuccessMessage(),
				 WafFactory.eINSTANCE.createMessage()));
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
			childFeature == WafPackage.eINSTANCE.getDynamicUnit_HideWhen() ||
			childFeature == WafPackage.eINSTANCE.getEditUnit_DisableWhen() ||
			childFeature == WafPackage.eINSTANCE.getEditUnit_ConfirmMessage() ||
			childFeature == WafPackage.eINSTANCE.getEditUnit_SuccessMessage();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
