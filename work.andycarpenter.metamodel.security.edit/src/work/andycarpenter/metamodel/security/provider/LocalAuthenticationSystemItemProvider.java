/**
 */
package work.andycarpenter.metamodel.security.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.metamodel.security.AuthenticationKeyTypes;
import work.andycarpenter.metamodel.security.LocalAuthenticationSystem;
import work.andycarpenter.metamodel.security.SecurityFactory;
import work.andycarpenter.metamodel.security.SecurityPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.security.LocalAuthenticationSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalAuthenticationSystemItemProvider extends AuthenticationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalAuthenticationSystemItemProvider(AdapterFactory adapterFactory) {
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

			addAuthenticationModelPropertyDescriptor(object);
			addIdentifierFeturePropertyDescriptor(object);
			addPasswordFeaturePropertyDescriptor(object);
			addAuthenticationKeyPropertyDescriptor(object);
			addResetPasswordRequestModelPropertyDescriptor(object);
			addHasRegistrationElementPropertyDescriptor(object);
			addCaptchaPropertyDescriptor(object);
			addAllowRememberMePropertyDescriptor(object);
			addAllowSelfRegistrationPropertyDescriptor(object);
			addUseEmailActivationPropertyDescriptor(object);
			addSendWelcomeEmailPropertyDescriptor(object);
			addSectionClassPropertyDescriptor(object);
			addCaptionClassPropertyDescriptor(object);
			addContentClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Authentication Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthenticationModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_authenticationModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_authenticationModel_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Identifier Feture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentifierFeturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_identifierFeture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_identifierFeture_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__IDENTIFIER_FETURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_passwordFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_passwordFeature_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__PASSWORD_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Authentication Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthenticationKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_authenticationKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_authenticationKey_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reset Password Request Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResetPasswordRequestModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_resetPasswordRequestModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_resetPasswordRequestModel_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_REQUEST_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Registration Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasRegistrationElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_hasRegistrationElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_hasRegistrationElement_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__HAS_REGISTRATION_ELEMENT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Captcha feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCaptchaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_captcha_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_captcha_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Remember Me feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowRememberMePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_allowRememberMe_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_allowRememberMe_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Allow Self Registration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowSelfRegistrationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_allowSelfRegistration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_allowSelfRegistration_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Email Activation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseEmailActivationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_useEmailActivation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_useEmailActivation_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Send Welcome Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSendWelcomeEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_sendWelcomeEmail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_sendWelcomeEmail_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Section Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSectionClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_sectionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_sectionClass_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__SECTION_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Caption Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCaptionClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LocalAuthenticationSystem_captionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_captionClass_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__CAPTION_CLASS,
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
				 getString("_UI_LocalAuthenticationSystem_contentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LocalAuthenticationSystem_contentClass_feature", "_UI_LocalAuthenticationSystem_type"),
				 SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__CONTENT_CLASS,
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
			childrenFeatures.add(SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT);
			childrenFeatures.add(SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ELEMENT);
			childrenFeatures.add(SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_ELEMENT);
			childrenFeatures.add(SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT);
			childrenFeatures.add(SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_ELEMENT);
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
	 * This returns LocalAuthenticationSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LocalAuthenticationSystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AuthenticationKeyTypes labelValue = ((LocalAuthenticationSystem)object).getAuthenticationKey();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_LocalAuthenticationSystem_type") :
			getString("_UI_LocalAuthenticationSystem_type") + " " + label;
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

		switch (notification.getFeatureID(LocalAuthenticationSystem.class)) {
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__HAS_REGISTRATION_ELEMENT:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CAPTCHA:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__SECTION_CLASS:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CAPTION_CLASS:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__CONTENT_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ELEMENT:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_ELEMENT:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT:
			case SecurityPackage.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_ELEMENT:
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
				(SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_ELEMENT,
				 SecurityFactory.eINSTANCE.createRegistrationElement()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__LOGIN_ELEMENT,
				 SecurityFactory.eINSTANCE.createLoginElement()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__LOGOUT_ELEMENT,
				 SecurityFactory.eINSTANCE.createLogoutElement()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_ELEMENT,
				 SecurityFactory.eINSTANCE.createForgottenPasswordElement()));

		newChildDescriptors.add
			(createChildParameter
				(SecurityPackage.Literals.LOCAL_AUTHENTICATION_SYSTEM__RESET_PASSWORD_ELEMENT,
				 SecurityFactory.eINSTANCE.createResetPasswordElement()));
	}

}
