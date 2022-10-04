/**
 */
package work.andycarpenter.metamodel.security.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.metamodel.security.ForgottenPasswordElement;
import work.andycarpenter.metamodel.security.SecurityPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.security.ForgottenPasswordElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ForgottenPasswordElementItemProvider extends AuthenticationElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForgottenPasswordElementItemProvider(AdapterFactory adapterFactory) {
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

			addAuthenticationPropertyDescriptor(object);
			addInvokeLabelPropertyDescriptor(object);
			addRequestLabelPropertyDescriptor(object);
			addResetLabelPropertyDescriptor(object);
			addUriElementPropertyDescriptor(object);
			addUriEmailSentPropertyDescriptor(object);
			addUriResetPasswordPropertyDescriptor(object);
			addEmailHelpPropertyDescriptor(object);
			addPasswordLabelPropertyDescriptor(object);
			addPasswordPlaceholderPropertyDescriptor(object);
			addPasswordTitlePropertyDescriptor(object);
			addPasswordConfirmationLabelPropertyDescriptor(object);
			addPasswordConfirmationPlaceholderPropertyDescriptor(object);
			addPasswordConfirmationTitlePropertyDescriptor(object);
			addPasswordMessageRequiredPropertyDescriptor(object);
			addPasswordMessageValueMismatchPropertyDescriptor(object);
			addEmailCheckSubjectPropertyDescriptor(object);
			addEmailCheckMessagePropertyDescriptor(object);
			addEmailCheckSentCaptionPropertyDescriptor(object);
			addEmailCheckSentMessagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Authentication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthenticationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_authentication_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_authentication_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__AUTHENTICATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Invoke Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvokeLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_invokeLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_invokeLabel_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__INVOKE_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Request Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_requestLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_requestLabel_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__REQUEST_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reset Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResetLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_resetLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_resetLabel_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__RESET_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uri Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_uriElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_uriElement_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__URI_ELEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uri Email Sent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriEmailSentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_uriEmailSent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_uriEmailSent_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uri Reset Password feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriResetPasswordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_uriResetPassword_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_uriResetPassword_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__URI_RESET_PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Email Help feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailHelpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_emailHelp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_emailHelp_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_HELP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_passwordLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_passwordLabel_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password Placeholder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordPlaceholderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_passwordPlaceholder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_passwordPlaceholder_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_PLACEHOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_passwordTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_passwordTitle_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password Confirmation Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordConfirmationLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_passwordConfirmationLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_passwordConfirmationLabel_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password Confirmation Placeholder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordConfirmationPlaceholderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_passwordConfirmationPlaceholder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_passwordConfirmationPlaceholder_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_PLACEHOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password Confirmation Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordConfirmationTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_passwordConfirmationTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_passwordConfirmationTitle_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password Message Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordMessageRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_passwordMessageRequired_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_passwordMessageRequired_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_REQUIRED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password Message Value Mismatch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordMessageValueMismatchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_passwordMessageValueMismatch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_passwordMessageValueMismatch_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_VALUE_MISMATCH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Email Check Subject feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailCheckSubjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_emailCheckSubject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_emailCheckSubject_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SUBJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Email Check Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailCheckMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_emailCheckMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_emailCheckMessage_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Email Check Sent Caption feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailCheckSentCaptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_emailCheckSentCaption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_emailCheckSentCaption_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_CAPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Email Check Sent Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailCheckSentMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_emailCheckSentMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_emailCheckSentMessage_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ForgottenPasswordElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ForgottenPasswordElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ForgottenPasswordElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ForgottenPasswordElement_type") :
			getString("_UI_ForgottenPasswordElement_type") + " " + label;
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

		switch (notification.getFeatureID(ForgottenPasswordElement.class)) {
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__INVOKE_LABEL:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__REQUEST_LABEL:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__RESET_LABEL:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_ELEMENT:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_RESET_PASSWORD:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_HELP:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_LABEL:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_PLACEHOLDER:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_TITLE:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_LABEL:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_PLACEHOLDER:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_CONFIRMATION_TITLE:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_REQUIRED:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__PASSWORD_MESSAGE_VALUE_MISMATCH:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SUBJECT:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_MESSAGE:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_CAPTION:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_CHECK_SENT_MESSAGE:
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
