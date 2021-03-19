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

import work.andycarpenter.psms.expression.ExpressionFactory;

import work.andycarpenter.psms.waf.EditUnit;
import work.andycarpenter.psms.waf.WafFactory;
import work.andycarpenter.psms.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.psms.waf.EditUnit} object.
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

			addOnSaveContinueEditingPropertyDescriptor(object);
			addConfirmDestinationPropertyDescriptor(object);
			addConfirmLabelPropertyDescriptor(object);
			addHasCustomConfirmLabelPropertyDescriptor(object);
			addHasConfirmMessagePropertyDescriptor(object);
			addHasSuccessMessagePropertyDescriptor(object);
			addCancelDestinationPropertyDescriptor(object);
			addCancelLabelPropertyDescriptor(object);
			addHasCustomCancelLabelPropertyDescriptor(object);
			addContentClassPropertyDescriptor(object);
			addHasContentClassPropertyDescriptor(object);
			addFormFieldListClassPropertyDescriptor(object);
			addFormInputGroupClassPropertyDescriptor(object);
			addFormFieldLabelClassPropertyDescriptor(object);
			addFormFieldValueClassPropertyDescriptor(object);
			addFormControlClassPropertyDescriptor(object);
			addFormAnchorClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 null,
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
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Confirm Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfirmLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_confirmLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_confirmLabel_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_ConfirmLabel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Custom Confirm Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCustomConfirmLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_hasCustomConfirmLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_hasCustomConfirmLabel_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_HasCustomConfirmLabel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Confirm Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasConfirmMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_hasConfirmMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_hasConfirmMessage_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_HasConfirmMessage(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Success Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasSuccessMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_hasSuccessMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_hasSuccessMessage_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_HasSuccessMessage(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cancel Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCancelLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_cancelLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_cancelLabel_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_CancelLabel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Custom Cancel Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCustomCancelLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_hasCustomCancelLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_hasCustomCancelLabel_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_HasCustomCancelLabel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_EditUnit_contentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_contentClass_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_ContentClass(),
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
				 getString("_UI_EditUnit_hasContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_hasContentClass_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_HasContentClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Form Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_formFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_formFieldListClass_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_FormFieldListClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Form Input Group Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormInputGroupClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_formInputGroupClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_formInputGroupClass_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_FormInputGroupClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Form Field Label Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormFieldLabelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_formFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_formFieldLabelClass_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_FormFieldLabelClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Form Field Value Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormFieldValueClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_formFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_formFieldValueClass_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_FormFieldValueClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Form Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_formControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_formControlClass_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_FormControlClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Form Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EditUnit_formAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditUnit_formAnchorClass_feature", "_UI_EditUnit_type"),
				 WafPackage.eINSTANCE.getEditUnit_FormAnchorClass(),
				 false,
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
			case WafPackage.EDIT_UNIT__ON_SAVE_CONTINUE_EDITING:
			case WafPackage.EDIT_UNIT__CONFIRM_LABEL:
			case WafPackage.EDIT_UNIT__HAS_CUSTOM_CONFIRM_LABEL:
			case WafPackage.EDIT_UNIT__HAS_CONFIRM_MESSAGE:
			case WafPackage.EDIT_UNIT__HAS_SUCCESS_MESSAGE:
			case WafPackage.EDIT_UNIT__CANCEL_LABEL:
			case WafPackage.EDIT_UNIT__HAS_CUSTOM_CANCEL_LABEL:
			case WafPackage.EDIT_UNIT__CONTENT_CLASS:
			case WafPackage.EDIT_UNIT__HAS_CONTENT_CLASS:
			case WafPackage.EDIT_UNIT__FORM_FIELD_LIST_CLASS:
			case WafPackage.EDIT_UNIT__FORM_INPUT_GROUP_CLASS:
			case WafPackage.EDIT_UNIT__FORM_FIELD_LABEL_CLASS:
			case WafPackage.EDIT_UNIT__FORM_FIELD_VALUE_CLASS:
			case WafPackage.EDIT_UNIT__FORM_CONTROL_CLASS:
			case WafPackage.EDIT_UNIT__FORM_ANCHOR_CLASS:
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
				 ExpressionFactory.eINSTANCE.createPredicateIsOperator()));

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
