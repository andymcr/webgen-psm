/**
 */
package work.andycarpenter.metamodel.waf.provider;


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
import work.andycarpenter.metamodel.base.provider.NamedDisplayElementItemProvider;
import work.andycarpenter.metamodel.expression.ExpressionFactory;
import work.andycarpenter.metamodel.waf.Action;
import work.andycarpenter.metamodel.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.waf.Action} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionItemProvider extends NamedDisplayElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionItemProvider(AdapterFactory adapterFactory) {
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

			addUsedByPropertyDescriptor(object);
			addParentUnitPropertyDescriptor(object);
			addAuthorisationRolesPropertyDescriptor(object);
			addIsAuthorisedPropertyDescriptor(object);
			addHasCustomisedAuthorisationPropertyDescriptor(object);
			addIsContainerActionPropertyDescriptor(object);
			addIsGeneralActionPropertyDescriptor(object);
			addIsInstanceActionPropertyDescriptor(object);
			addIsTargetActionPropertyDescriptor(object);
			addIconNamePropertyDescriptor(object);
			addDisablePropertyDescriptor(object);
			addConfirmMessagePropertyDescriptor(object);
			addHasConfirmMessagePropertyDescriptor(object);
			addSuccessMessagePropertyDescriptor(object);
			addHasSuccessMessagePropertyDescriptor(object);
			addFailureMessagePropertyDescriptor(object);
			addHasFailureMessagePropertyDescriptor(object);
			addDisabledMessagePropertyDescriptor(object);
			addHasDisabledMessagePropertyDescriptor(object);
			addHasMessagesPropertyDescriptor(object);
			addLocalAnchorClassPropertyDescriptor(object);
			addAnchorClassPropertyDescriptor(object);
			addHasAnchorClassPropertyDescriptor(object);
			addHeaderClassPropertyDescriptor(object);
			addFooterClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Used By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_usedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_usedBy_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_UsedBy(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_parentUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_parentUnit_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_ParentUnit(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Authorisation Roles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorisationRolesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_authorisationRoles_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_authorisationRoles_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_AuthorisationRoles(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_Action_isAuthorised_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_isAuthorised_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_IsAuthorised(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Customised Authorisation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCustomisedAuthorisationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_hasCustomisedAuthorisation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_hasCustomisedAuthorisation_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_HasCustomisedAuthorisation(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Container Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsContainerActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_isContainerAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_isContainerAction_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_IsContainerAction(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Is General Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsGeneralActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_isGeneralAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_isGeneralAction_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_IsGeneralAction(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Instance Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsInstanceActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_isInstanceAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_isInstanceAction_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_IsInstanceAction(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Target Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsTargetActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_isTargetAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_isTargetAction_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_IsTargetAction(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Icon Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIconNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_iconName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_iconName_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_IconName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Disable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_disable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_disable_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_Disable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_BusinessPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Confirm Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfirmMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_confirmMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_confirmMessage_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_ConfirmMessage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
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
				 getString("_UI_Action_hasConfirmMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_hasConfirmMessage_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_HasConfirmMessage(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Success Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuccessMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_successMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_successMessage_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_SuccessMessage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
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
				 getString("_UI_Action_hasSuccessMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_hasSuccessMessage_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_HasSuccessMessage(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Failure Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFailureMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_failureMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_failureMessage_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_FailureMessage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Failure Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasFailureMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_hasFailureMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_hasFailureMessage_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_HasFailureMessage(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Disabled Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisabledMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_disabledMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_disabledMessage_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_DisabledMessage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Disabled Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasDisabledMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_hasDisabledMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_hasDisabledMessage_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_HasDisabledMessage(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Messages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasMessagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_hasMessages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_hasMessages_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_HasMessages(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_localAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_localAnchorClass_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_LocalAnchorClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_anchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_anchorClass_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_AnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_hasAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_hasAnchorClass_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_HasAnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Header Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeaderClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_headerClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_headerClass_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_HeaderClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Footer Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFooterClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_footerClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_footerClass_feature", "_UI_Action_type"),
				 WafPackage.eINSTANCE.getAction_FooterClass(),
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
			childrenFeatures.add(WafPackage.eINSTANCE.getAction_DisplayWhen());
			childrenFeatures.add(WafPackage.eINSTANCE.getAction_EnableWhen());
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
		String label = ((Action)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Action_type") :
			getString("_UI_Action_type") + " " + label;
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

		switch (notification.getFeatureID(Action.class)) {
			case WafPackage.ACTION__AUTHORISATION_ROLES:
			case WafPackage.ACTION__IS_AUTHORISED:
			case WafPackage.ACTION__HAS_CUSTOMISED_AUTHORISATION:
			case WafPackage.ACTION__IS_CONTAINER_ACTION:
			case WafPackage.ACTION__IS_GENERAL_ACTION:
			case WafPackage.ACTION__IS_INSTANCE_ACTION:
			case WafPackage.ACTION__IS_TARGET_ACTION:
			case WafPackage.ACTION__ICON_NAME:
			case WafPackage.ACTION__DISABLE:
			case WafPackage.ACTION__CONFIRM_MESSAGE:
			case WafPackage.ACTION__HAS_CONFIRM_MESSAGE:
			case WafPackage.ACTION__SUCCESS_MESSAGE:
			case WafPackage.ACTION__HAS_SUCCESS_MESSAGE:
			case WafPackage.ACTION__FAILURE_MESSAGE:
			case WafPackage.ACTION__HAS_FAILURE_MESSAGE:
			case WafPackage.ACTION__DISABLED_MESSAGE:
			case WafPackage.ACTION__HAS_DISABLED_MESSAGE:
			case WafPackage.ACTION__HAS_MESSAGES:
			case WafPackage.ACTION__LOCAL_ANCHOR_CLASS:
			case WafPackage.ACTION__ANCHOR_CLASS:
			case WafPackage.ACTION__HAS_ANCHOR_CLASS:
			case WafPackage.ACTION__HEADER_CLASS:
			case WafPackage.ACTION__FOOTER_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.ACTION__DISPLAY_WHEN:
			case WafPackage.ACTION__ENABLE_WHEN:
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
				(WafPackage.eINSTANCE.getAction_DisplayWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateBooleanVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getAction_DisplayWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getAction_DisplayWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getAction_DisplayWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getAction_DisplayWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateInOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getAction_DisplayWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getAction_DisplayWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getAction_DisplayWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateIsNull()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getAction_EnableWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateBooleanVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getAction_EnableWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getAction_EnableWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getAction_EnableWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getAction_EnableWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateInOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getAction_EnableWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getAction_EnableWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getAction_EnableWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateIsNull()));
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
			childFeature == WafPackage.eINSTANCE.getAction_DisplayWhen() ||
			childFeature == WafPackage.eINSTANCE.getAction_EnableWhen();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
