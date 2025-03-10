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
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import work.andycarpenter.metamodel.waf.WafFactory;
import work.andycarpenter.metamodel.waf.WafModel;
import work.andycarpenter.metamodel.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.waf.WafModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WafModelItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WafModelItemProvider(AdapterFactory adapterFactory) {
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

			addPersistencePropertyDescriptor(object);
			addSecurityPropertyDescriptor(object);
			addBusinessPropertyDescriptor(object);
			addApiPropertyDescriptor(object);
			addDefaultSaveLabelPropertyDescriptor(object);
			addDefaultCancelLabelPropertyDescriptor(object);
			addEditUnitsPropertyDescriptor(object);
			addFormUnitsPropertyDescriptor(object);
			addImageUnitsPropertyDescriptor(object);
			addImageCardsUnitsPropertyDescriptor(object);
			addAutocompleteFieldsPropertyDescriptor(object);
			addFormFieldsPropertyDescriptor(object);
			addIsAuthenticatedPropertyDescriptor(object);
			addUseFormFloatingLabelsPropertyDescriptor(object);
			addDefaultPageClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Security feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_security_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_security_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_Security(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Persistence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersistencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_persistence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_persistence_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_Persistence(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Business feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusinessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_business_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_business_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_Business(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Api feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_api_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_api_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_Api(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Save Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSaveLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_defaultSaveLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_defaultSaveLabel_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_DefaultSaveLabel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Cancel Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultCancelLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_defaultCancelLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_defaultCancelLabel_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_DefaultCancelLabel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edit Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_editUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_editUnits_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_EditUnits(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Form Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_formUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_formUnits_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_FormUnits(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Image Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_imageUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_imageUnits_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_ImageUnits(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Image Cards Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageCardsUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_imageCardsUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_imageCardsUnits_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_ImageCardsUnits(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Autocomplete Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutocompleteFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_autocompleteFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_autocompleteFields_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_AutocompleteFields(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Form Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_formFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_formFields_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_FormFields(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Authenticated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAuthenticatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_isAuthenticated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_isAuthenticated_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_IsAuthenticated(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Form Floating Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseFormFloatingLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_useFormFloatingLabels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_useFormFloatingLabels_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_UseFormFloatingLabels(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Page Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPageClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_defaultPageClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_defaultPageClass_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_DefaultPageClass(),
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
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_SiteProperties());
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_ImageManipulations());
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_Navigation());
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_Controllers());
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_DefaultUnitStyles());
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_DefaultCardsStyles());
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_DefaultImageCardsStyles());
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_DefaultControlStyles());
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_DefaultDetailsStyles());
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_DefaultFormStyles());
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_DefaultGalleryStyles());
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_DefaultSliderStyles());
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_DefaultStaticStyles());
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_DefaultTabularStyles());
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
	 * This returns WafModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WafModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WafModel)object).getDefaultSaveLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_WafModel_type") :
			getString("_UI_WafModel_type") + " " + label;
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

		switch (notification.getFeatureID(WafModel.class)) {
			case WafPackage.WAF_MODEL__DEFAULT_SAVE_LABEL:
			case WafPackage.WAF_MODEL__DEFAULT_CANCEL_LABEL:
			case WafPackage.WAF_MODEL__IS_AUTHENTICATED:
			case WafPackage.WAF_MODEL__USE_FORM_FLOATING_LABELS:
			case WafPackage.WAF_MODEL__DEFAULT_PAGE_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.WAF_MODEL__SITE_PROPERTIES:
			case WafPackage.WAF_MODEL__IMAGE_MANIPULATIONS:
			case WafPackage.WAF_MODEL__NAVIGATION:
			case WafPackage.WAF_MODEL__CONTROLLERS:
			case WafPackage.WAF_MODEL__DEFAULT_UNIT_STYLES:
			case WafPackage.WAF_MODEL__DEFAULT_CARDS_STYLES:
			case WafPackage.WAF_MODEL__DEFAULT_IMAGE_CARDS_STYLES:
			case WafPackage.WAF_MODEL__DEFAULT_CONTROL_STYLES:
			case WafPackage.WAF_MODEL__DEFAULT_DETAILS_STYLES:
			case WafPackage.WAF_MODEL__DEFAULT_FORM_STYLES:
			case WafPackage.WAF_MODEL__DEFAULT_GALLERY_STYLES:
			case WafPackage.WAF_MODEL__DEFAULT_SLIDER_STYLES:
			case WafPackage.WAF_MODEL__DEFAULT_STATIC_STYLES:
			case WafPackage.WAF_MODEL__DEFAULT_TABULAR_STYLES:
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
				(WafPackage.eINSTANCE.getWafModel_SiteProperties(),
				 WafFactory.eINSTANCE.createSiteProperties()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_ImageManipulations(),
				 WafFactory.eINSTANCE.createImageManipulation()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_Navigation(),
				 WafFactory.eINSTANCE.createNavigation()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_Controllers(),
				 WafFactory.eINSTANCE.createSinglePageController()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_Controllers(),
				 WafFactory.eINSTANCE.createMultiPageController()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_DefaultUnitStyles(),
				 WafFactory.eINSTANCE.createDefaultUnitStyles()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_DefaultCardsStyles(),
				 WafFactory.eINSTANCE.createCardsUnitStyles()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_DefaultCardsStyles(),
				 WafFactory.eINSTANCE.createImageCardsUnitStyles()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_DefaultImageCardsStyles(),
				 WafFactory.eINSTANCE.createImageCardsUnitStyles()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_DefaultControlStyles(),
				 WafFactory.eINSTANCE.createControlUnitStyles()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_DefaultDetailsStyles(),
				 WafFactory.eINSTANCE.createDetailsUnitStyles()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_DefaultFormStyles(),
				 WafFactory.eINSTANCE.createFormUnitStyles()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_DefaultGalleryStyles(),
				 WafFactory.eINSTANCE.createGalleryUnitStyles()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_DefaultSliderStyles(),
				 WafFactory.eINSTANCE.createSliderUnitStyles()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_DefaultStaticStyles(),
				 WafFactory.eINSTANCE.createStaticUnitStyles()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_DefaultTabularStyles(),
				 WafFactory.eINSTANCE.createTabularUnitStyles()));
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
			childFeature == WafPackage.eINSTANCE.getWafModel_DefaultCardsStyles() ||
			childFeature == WafPackage.eINSTANCE.getWafModel_DefaultImageCardsStyles();

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
