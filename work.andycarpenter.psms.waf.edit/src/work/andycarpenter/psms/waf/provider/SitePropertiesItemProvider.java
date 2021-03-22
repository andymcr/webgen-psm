/**
 */
package work.andycarpenter.psms.waf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import work.andycarpenter.psms.waf.SiteProperties;
import work.andycarpenter.psms.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.psms.waf.SiteProperties} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SitePropertiesItemProvider 
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
	public SitePropertiesItemProvider(AdapterFactory adapterFactory) {
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

			addSiteNamePropertyDescriptor(object);
			addSiteTitlePropertyDescriptor(object);
			addLocalePropertyDescriptor(object);
			addWebmasterEmailPropertyDescriptor(object);
			addCopyrightTextPropertyDescriptor(object);
			addMetaDescriptionPropertyDescriptor(object);
			addLogoImagePropertyDescriptor(object);
			addLogoFiltersPropertyDescriptor(object);
			addFrameworkTechnologyPropertyDescriptor(object);
			addUseDbSessionStoragePropertyDescriptor(object);
			addTextEditorURLPropertyDescriptor(object);
			addSiteTemplatePropertyDescriptor(object);
			addStaticUnitsEditablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Site Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSiteNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SiteProperties_siteName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SiteProperties_siteName_feature", "_UI_SiteProperties_type"),
				 WafPackage.eINSTANCE.getSiteProperties_SiteName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Site Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSiteTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SiteProperties_siteTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SiteProperties_siteTitle_feature", "_UI_SiteProperties_type"),
				 WafPackage.eINSTANCE.getSiteProperties_SiteTitle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Locale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SiteProperties_locale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SiteProperties_locale_feature", "_UI_SiteProperties_type"),
				 WafPackage.eINSTANCE.getSiteProperties_Locale(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Webmaster Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWebmasterEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SiteProperties_webmasterEmail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SiteProperties_webmasterEmail_feature", "_UI_SiteProperties_type"),
				 WafPackage.eINSTANCE.getSiteProperties_WebmasterEmail(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Copyright Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCopyrightTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SiteProperties_copyrightText_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SiteProperties_copyrightText_feature", "_UI_SiteProperties_type"),
				 WafPackage.eINSTANCE.getSiteProperties_CopyrightText(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Meta Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetaDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SiteProperties_metaDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SiteProperties_metaDescription_feature", "_UI_SiteProperties_type"),
				 WafPackage.eINSTANCE.getSiteProperties_MetaDescription(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Logo Image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogoImagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SiteProperties_logoImage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SiteProperties_logoImage_feature", "_UI_SiteProperties_type"),
				 WafPackage.eINSTANCE.getSiteProperties_LogoImage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Logo Filters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogoFiltersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SiteProperties_logoFilters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SiteProperties_logoFilters_feature", "_UI_SiteProperties_type"),
				 WafPackage.eINSTANCE.getSiteProperties_LogoFilters(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Framework Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrameworkTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SiteProperties_frameworkTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SiteProperties_frameworkTechnology_feature", "_UI_SiteProperties_type"),
				 WafPackage.eINSTANCE.getSiteProperties_FrameworkTechnology(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Db Session Storage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseDbSessionStoragePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SiteProperties_useDbSessionStorage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SiteProperties_useDbSessionStorage_feature", "_UI_SiteProperties_type"),
				 WafPackage.eINSTANCE.getSiteProperties_UseDbSessionStorage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Editor URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextEditorURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SiteProperties_textEditorURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SiteProperties_textEditorURL_feature", "_UI_SiteProperties_type"),
				 WafPackage.eINSTANCE.getSiteProperties_TextEditorURL(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Site Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSiteTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SiteProperties_siteTemplate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SiteProperties_siteTemplate_feature", "_UI_SiteProperties_type"),
				 WafPackage.eINSTANCE.getSiteProperties_SiteTemplate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Static Units Editable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStaticUnitsEditablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SiteProperties_staticUnitsEditable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SiteProperties_staticUnitsEditable_feature", "_UI_SiteProperties_type"),
				 WafPackage.eINSTANCE.getSiteProperties_StaticUnitsEditable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SiteProperties.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SiteProperties"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SiteProperties)object).getSiteName();
		return label == null || label.length() == 0 ?
			getString("_UI_SiteProperties_type") :
			getString("_UI_SiteProperties_type") + " " + label;
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

		switch (notification.getFeatureID(SiteProperties.class)) {
			case WafPackage.SITE_PROPERTIES__SITE_NAME:
			case WafPackage.SITE_PROPERTIES__SITE_TITLE:
			case WafPackage.SITE_PROPERTIES__LOCALE:
			case WafPackage.SITE_PROPERTIES__WEBMASTER_EMAIL:
			case WafPackage.SITE_PROPERTIES__COPYRIGHT_TEXT:
			case WafPackage.SITE_PROPERTIES__META_DESCRIPTION:
			case WafPackage.SITE_PROPERTIES__LOGO_IMAGE:
			case WafPackage.SITE_PROPERTIES__FRAMEWORK_TECHNOLOGY:
			case WafPackage.SITE_PROPERTIES__USE_DB_SESSION_STORAGE:
			case WafPackage.SITE_PROPERTIES__TEXT_EDITOR_URL:
			case WafPackage.SITE_PROPERTIES__SITE_TEMPLATE:
			case WafPackage.SITE_PROPERTIES__STATIC_UNITS_EDITABLE:
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
