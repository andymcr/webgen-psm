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
			addUriEmailSentPropertyDescriptor(object);
			addEmailSubjectPropertyDescriptor(object);
			addEmailMessagePropertyDescriptor(object);
			addEmailSentCaptionPropertyDescriptor(object);
			addEmailSentMessagePropertyDescriptor(object);
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
	 * This adds a property descriptor for the Email Subject feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailSubjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_emailSubject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_emailSubject_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SUBJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Email Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_emailMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_emailMessage_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Email Sent Caption feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailSentCaptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_emailSentCaption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_emailSentCaption_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_CAPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Email Sent Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailSentMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ForgottenPasswordElement_emailSentMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ForgottenPasswordElement_emailSentMessage_feature", "_UI_ForgottenPasswordElement_type"),
				 SecurityPackage.Literals.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_MESSAGE,
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
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__URI_EMAIL_SENT:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SUBJECT:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_MESSAGE:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_CAPTION:
			case SecurityPackage.FORGOTTEN_PASSWORD_ELEMENT__EMAIL_SENT_MESSAGE:
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
