/**
 */
package work.andycarpenter.psms.waf.provider;


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

import work.andycarpenter.psms.waf.WafFactory;
import work.andycarpenter.psms.waf.WafModel;
import work.andycarpenter.psms.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.psms.waf.WafModel} object.
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
			addBusinessPropertyDescriptor(object);
			addApiPropertyDescriptor(object);
			addSiteNamePropertyDescriptor(object);
			addSiteTitlePropertyDescriptor(object);
			addWebmasterEmailPropertyDescriptor(object);
			addCopyrightTextPropertyDescriptor(object);
			addMetaDescriptionPropertyDescriptor(object);
			addLogoImagePropertyDescriptor(object);
			addLogoFiltersPropertyDescriptor(object);
			addFrameworkTechnologyPropertyDescriptor(object);
			addUseDbSessionStoragePropertyDescriptor(object);
			addInputTechnologyPropertyDescriptor(object);
			addAjaxTechnologyPropertyDescriptor(object);
			addDefaultSaveLabelPropertyDescriptor(object);
			addDefaultCancelLabelPropertyDescriptor(object);
			addTextEditorURLPropertyDescriptor(object);
			addTopNavigationIdPropertyDescriptor(object);
			addSideMenuPropertyDescriptor(object);
			addSiteTemplatePropertyDescriptor(object);
			addStaticUnitsEditablePropertyDescriptor(object);
			addHasAPIPropertyDescriptor(object);
			addEditUnitsPropertyDescriptor(object);
			addHasEditUnitsPropertyDescriptor(object);
			addFormUnitsPropertyDescriptor(object);
			addHasFormUnitsPropertyDescriptor(object);
			addImageUnitsPropertyDescriptor(object);
			addHasImageUnitsPropertyDescriptor(object);
			addImageCardsUnitsPropertyDescriptor(object);
			addHasImageCardsUnitsPropertyDescriptor(object);
			addHasAutocompleteFieldsPropertyDescriptor(object);
			addFormFieldsPropertyDescriptor(object);
			addHasFormFieldsPropertyDescriptor(object);
			addHasFormAssociationsPropertyDescriptor(object);
			addHasResourceFieldsPropertyDescriptor(object);
			addIsAuthenticatedPropertyDescriptor(object);
			addIsCasAuthenticatedPropertyDescriptor(object);
			addCasAuthenticationPropertyDescriptor(object);
			addIsLocallyAuthenticatedPropertyDescriptor(object);
			addLocalAuthenticationPropertyDescriptor(object);
			addGenModelPropertyDescriptor(object);
			addUiModelPropertyDescriptor(object);
			addSecurityModelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_WafModel_siteName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_siteName_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_SiteName(),
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
				 getString("_UI_WafModel_siteTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_siteTitle_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_SiteTitle(),
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
				 getString("_UI_WafModel_webmasterEmail_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_webmasterEmail_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_WebmasterEmail(),
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
				 getString("_UI_WafModel_copyrightText_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_copyrightText_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_CopyrightText(),
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
				 getString("_UI_WafModel_metaDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_metaDescription_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_MetaDescription(),
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
				 getString("_UI_WafModel_logoImage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_logoImage_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_LogoImage(),
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
				 getString("_UI_WafModel_logoFilters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_logoFilters_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_LogoFilters(),
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
				 getString("_UI_WafModel_frameworkTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_frameworkTechnology_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_FrameworkTechnology(),
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
				 getString("_UI_WafModel_useDbSessionStorage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_useDbSessionStorage_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_UseDbSessionStorage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_inputTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_inputTechnology_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_InputTechnology(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ajax Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAjaxTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_ajaxTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_ajaxTechnology_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_AjaxTechnology(),
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
				 getString("_UI_WafModel_textEditorURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_textEditorURL_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_TextEditorURL(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Top Navigation Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopNavigationIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_topNavigationId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_topNavigationId_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_TopNavigationId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Side Menu feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSideMenuPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_sideMenu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_sideMenu_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_SideMenu(),
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_WafModel_siteTemplate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_siteTemplate_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_SiteTemplate(),
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
				 getString("_UI_WafModel_staticUnitsEditable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_staticUnitsEditable_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_StaticUnitsEditable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has API feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAPIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_hasAPI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_hasAPI_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_HasAPI(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Edit Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasEditUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_hasEditUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_hasEditUnits_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_HasEditUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Form Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasFormUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_hasFormUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_hasFormUnits_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_HasFormUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Image Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasImageUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_hasImageUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_hasImageUnits_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_HasImageUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Image Cards Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasImageCardsUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_hasImageCardsUnits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_hasImageCardsUnits_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_HasImageCardsUnits(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Autocomplete Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAutocompleteFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_hasAutocompleteFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_hasAutocompleteFields_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_HasAutocompleteFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Form Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasFormFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_hasFormFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_hasFormFields_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_HasFormFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Form Associations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasFormAssociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_hasFormAssociations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_hasFormAssociations_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_HasFormAssociations(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Resource Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasResourceFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_hasResourceFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_hasResourceFields_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_HasResourceFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Cas Authenticated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCasAuthenticatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_isCasAuthenticated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_isCasAuthenticated_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_IsCasAuthenticated(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cas Authentication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCasAuthenticationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_casAuthentication_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_casAuthentication_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_CasAuthentication(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Locally Authenticated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsLocallyAuthenticatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_isLocallyAuthenticated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_isLocallyAuthenticated_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_IsLocallyAuthenticated(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Authentication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalAuthenticationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_localAuthentication_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_localAuthentication_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_LocalAuthentication(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gen Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_genModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_genModel_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_GenModel(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ui Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUiModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_uiModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_uiModel_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_UiModel(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafModel_securityModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafModel_securityModel_feature", "_UI_WafModel_type"),
				 WafPackage.eINSTANCE.getWafModel_SecurityModel(),
				 false,
				 false,
				 false,
				 null,
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
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_ImageManipulations());
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_Pages());
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_Menus());
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_Authentication());
			childrenFeatures.add(WafPackage.eINSTANCE.getWafModel_DefaultStyles());
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
		String label = ((WafModel)object).getSiteName();
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
			case WafPackage.WAF_MODEL__SITE_NAME:
			case WafPackage.WAF_MODEL__SITE_TITLE:
			case WafPackage.WAF_MODEL__WEBMASTER_EMAIL:
			case WafPackage.WAF_MODEL__COPYRIGHT_TEXT:
			case WafPackage.WAF_MODEL__META_DESCRIPTION:
			case WafPackage.WAF_MODEL__LOGO_IMAGE:
			case WafPackage.WAF_MODEL__FRAMEWORK_TECHNOLOGY:
			case WafPackage.WAF_MODEL__USE_DB_SESSION_STORAGE:
			case WafPackage.WAF_MODEL__INPUT_TECHNOLOGY:
			case WafPackage.WAF_MODEL__AJAX_TECHNOLOGY:
			case WafPackage.WAF_MODEL__DEFAULT_SAVE_LABEL:
			case WafPackage.WAF_MODEL__DEFAULT_CANCEL_LABEL:
			case WafPackage.WAF_MODEL__TEXT_EDITOR_URL:
			case WafPackage.WAF_MODEL__TOP_NAVIGATION_ID:
			case WafPackage.WAF_MODEL__SITE_TEMPLATE:
			case WafPackage.WAF_MODEL__STATIC_UNITS_EDITABLE:
			case WafPackage.WAF_MODEL__HAS_API:
			case WafPackage.WAF_MODEL__HAS_EDIT_UNITS:
			case WafPackage.WAF_MODEL__HAS_FORM_UNITS:
			case WafPackage.WAF_MODEL__HAS_IMAGE_UNITS:
			case WafPackage.WAF_MODEL__HAS_IMAGE_CARDS_UNITS:
			case WafPackage.WAF_MODEL__HAS_AUTOCOMPLETE_FIELDS:
			case WafPackage.WAF_MODEL__HAS_FORM_FIELDS:
			case WafPackage.WAF_MODEL__HAS_FORM_ASSOCIATIONS:
			case WafPackage.WAF_MODEL__HAS_RESOURCE_FIELDS:
			case WafPackage.WAF_MODEL__IS_AUTHENTICATED:
			case WafPackage.WAF_MODEL__IS_CAS_AUTHENTICATED:
			case WafPackage.WAF_MODEL__IS_LOCALLY_AUTHENTICATED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.WAF_MODEL__IMAGE_MANIPULATIONS:
			case WafPackage.WAF_MODEL__PAGES:
			case WafPackage.WAF_MODEL__MENUS:
			case WafPackage.WAF_MODEL__AUTHENTICATION:
			case WafPackage.WAF_MODEL__DEFAULT_STYLES:
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
				(WafPackage.eINSTANCE.getWafModel_ImageManipulations(),
				 WafFactory.eINSTANCE.createImageManipulation()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_Pages(),
				 WafFactory.eINSTANCE.createPage()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_Menus(),
				 WafFactory.eINSTANCE.createMenu()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_Menus(),
				 WafFactory.eINSTANCE.createSubmenuEntry()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_Authentication(),
				 WafFactory.eINSTANCE.createLocalAuthenticationSystem()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_Authentication(),
				 WafFactory.eINSTANCE.createCasAuthentication()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getWafModel_DefaultStyles(),
				 WafFactory.eINSTANCE.createWafStyle()));
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
