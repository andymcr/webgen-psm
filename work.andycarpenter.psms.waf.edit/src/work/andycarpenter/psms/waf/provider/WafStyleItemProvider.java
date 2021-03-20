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

import work.andycarpenter.psms.waf.WafPackage;
import work.andycarpenter.psms.waf.WafStyle;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.psms.waf.WafStyle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WafStyleItemProvider 
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
	public WafStyleItemProvider(AdapterFactory adapterFactory) {
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

			addStyleClassPropertyDescriptor(object);
			addSectionClassPropertyDescriptor(object);
			addCaptionClassPropertyDescriptor(object);
			addContentClassPropertyDescriptor(object);
			addCardsContentClassPropertyDescriptor(object);
			addDetailsContentClassPropertyDescriptor(object);
			addFormContentClassPropertyDescriptor(object);
			addGalleryContentClassPropertyDescriptor(object);
			addSliderContentClassPropertyDescriptor(object);
			addStaticContentClassPropertyDescriptor(object);
			addTabularContentClassPropertyDescriptor(object);
			addFieldListClassPropertyDescriptor(object);
			addCardsFieldListClassPropertyDescriptor(object);
			addDetailsFieldListClassPropertyDescriptor(object);
			addFormFieldListClassPropertyDescriptor(object);
			addGalleryFieldListClassPropertyDescriptor(object);
			addSliderFieldListClassPropertyDescriptor(object);
			addTabularFieldListClassPropertyDescriptor(object);
			addDefinitionFieldListClassPropertyDescriptor(object);
			addCardsDefinitionFieldListClassPropertyDescriptor(object);
			addDetailsDefinitionFieldListClassPropertyDescriptor(object);
			addFormDefinitionFieldListClassPropertyDescriptor(object);
			addGalleryDefinitionFieldListClassPropertyDescriptor(object);
			addSliderDefinitionFieldListClassPropertyDescriptor(object);
			addTabularDefinitionFieldListClassPropertyDescriptor(object);
			addRowClassPropertyDescriptor(object);
			addColumnClassPropertyDescriptor(object);
			addCardClassPropertyDescriptor(object);
			addCardHeaderClassPropertyDescriptor(object);
			addCardBodyClassPropertyDescriptor(object);
			addCardFooterClassPropertyDescriptor(object);
			addBadgeClassPropertyDescriptor(object);
			addControlClassPropertyDescriptor(object);
			addCardsControlClassPropertyDescriptor(object);
			addDetailsControlClassPropertyDescriptor(object);
			addFormControlClassPropertyDescriptor(object);
			addGalleryControlClassPropertyDescriptor(object);
			addSliderControlClassPropertyDescriptor(object);
			addTabularControlClassPropertyDescriptor(object);
			addInputGroupClassPropertyDescriptor(object);
			addFieldLabelClassPropertyDescriptor(object);
			addCardsFieldLabelClassPropertyDescriptor(object);
			addDetailsFieldLabelClassPropertyDescriptor(object);
			addFormFieldLabelClassPropertyDescriptor(object);
			addGalleryFieldLabelClassPropertyDescriptor(object);
			addSliderFieldLabelClassPropertyDescriptor(object);
			addTabularFieldLabelClassPropertyDescriptor(object);
			addFieldValueClassPropertyDescriptor(object);
			addCardsFieldValueClassPropertyDescriptor(object);
			addDetailsFieldValueClassPropertyDescriptor(object);
			addFormFieldValueClassPropertyDescriptor(object);
			addGalleryFieldValueClassPropertyDescriptor(object);
			addSliderFieldValueClassPropertyDescriptor(object);
			addTabularFieldValueClassPropertyDescriptor(object);
			addActionNavigationClassPropertyDescriptor(object);
			addAnchorClassPropertyDescriptor(object);
			addCardsAnchorClassPropertyDescriptor(object);
			addDetailsAnchorClassPropertyDescriptor(object);
			addFormAnchorClassPropertyDescriptor(object);
			addGalleryAnchorClassPropertyDescriptor(object);
			addSliderAnchorClassPropertyDescriptor(object);
			addTabularAnchorClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Style Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStyleClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_styleClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_styleClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_StyleClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WafStyle_sectionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_sectionClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_SectionClass(),
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
				 getString("_UI_WafStyle_captionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_captionClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_CaptionClass(),
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
				 getString("_UI_WafStyle_contentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_contentClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_ContentClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cards Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardsContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_cardsContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_cardsContentClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_CardsContentClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Details Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDetailsContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_detailsContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_detailsContentClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_DetailsContentClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Form Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_formContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_formContentClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_FormContentClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gallery Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGalleryContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_galleryContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_galleryContentClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_GalleryContentClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slider Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSliderContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_sliderContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_sliderContentClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_SliderContentClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Static Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStaticContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_staticContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_staticContentClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_StaticContentClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabular Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabularContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_tabularContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_tabularContentClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_TabularContentClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_fieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_fieldListClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_FieldListClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cards Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardsFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_cardsFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_cardsFieldListClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_CardsFieldListClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Details Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDetailsFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_detailsFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_detailsFieldListClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_DetailsFieldListClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WafStyle_formFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_formFieldListClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_FormFieldListClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gallery Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGalleryFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_galleryFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_galleryFieldListClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_GalleryFieldListClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slider Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSliderFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_sliderFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_sliderFieldListClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_SliderFieldListClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabular Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabularFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_tabularFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_tabularFieldListClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_TabularFieldListClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Definition Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefinitionFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_definitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_definitionFieldListClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_DefinitionFieldListClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cards Definition Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardsDefinitionFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_cardsDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_cardsDefinitionFieldListClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_CardsDefinitionFieldListClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Details Definition Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDetailsDefinitionFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_detailsDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_detailsDefinitionFieldListClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_DetailsDefinitionFieldListClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Form Definition Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormDefinitionFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_formDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_formDefinitionFieldListClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_FormDefinitionFieldListClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gallery Definition Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGalleryDefinitionFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_galleryDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_galleryDefinitionFieldListClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_GalleryDefinitionFieldListClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slider Definition Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSliderDefinitionFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_sliderDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_sliderDefinitionFieldListClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_SliderDefinitionFieldListClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabular Definition Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabularDefinitionFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_tabularDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_tabularDefinitionFieldListClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_TabularDefinitionFieldListClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Row Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRowClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_rowClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_rowClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_RowClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Column Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_columnClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_columnClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_ColumnClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Card Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_cardClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_cardClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_CardClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Card Header Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardHeaderClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_cardHeaderClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_cardHeaderClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_CardHeaderClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Card Body Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardBodyClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_cardBodyClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_cardBodyClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_CardBodyClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Card Footer Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardFooterClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_cardFooterClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_cardFooterClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_CardFooterClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Badge Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBadgeClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_badgeClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_badgeClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_BadgeClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_controlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_controlClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_ControlClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cards Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardsControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_cardsControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_cardsControlClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_CardsControlClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Details Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDetailsControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_detailsControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_detailsControlClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_DetailsControlClass(),
				 true,
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
				 getString("_UI_WafStyle_formControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_formControlClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_FormControlClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gallery Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGalleryControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_galleryControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_galleryControlClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_GalleryControlClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slider Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSliderControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_sliderControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_sliderControlClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_SliderControlClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabular Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabularControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_tabularControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_tabularControlClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_TabularControlClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Group Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputGroupClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_inputGroupClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_inputGroupClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_InputGroupClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Field Label Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFieldLabelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_fieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_fieldLabelClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_FieldLabelClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cards Field Label Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardsFieldLabelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_cardsFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_cardsFieldLabelClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_CardsFieldLabelClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Details Field Label Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDetailsFieldLabelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_detailsFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_detailsFieldLabelClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_DetailsFieldLabelClass(),
				 true,
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
				 getString("_UI_WafStyle_formFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_formFieldLabelClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_FormFieldLabelClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gallery Field Label Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGalleryFieldLabelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_galleryFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_galleryFieldLabelClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_GalleryFieldLabelClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slider Field Label Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSliderFieldLabelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_sliderFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_sliderFieldLabelClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_SliderFieldLabelClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabular Field Label Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabularFieldLabelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_tabularFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_tabularFieldLabelClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_TabularFieldLabelClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Field Value Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFieldValueClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_fieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_fieldValueClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_FieldValueClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cards Field Value Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardsFieldValueClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_cardsFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_cardsFieldValueClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_CardsFieldValueClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Details Field Value Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDetailsFieldValueClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_detailsFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_detailsFieldValueClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_DetailsFieldValueClass(),
				 true,
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
				 getString("_UI_WafStyle_formFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_formFieldValueClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_FormFieldValueClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gallery Field Value Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGalleryFieldValueClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_galleryFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_galleryFieldValueClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_GalleryFieldValueClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slider Field Value Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSliderFieldValueClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_sliderFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_sliderFieldValueClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_SliderFieldValueClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabular Field Value Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabularFieldValueClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_tabularFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_tabularFieldValueClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_TabularFieldValueClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Action Navigation Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionNavigationClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_actionNavigationClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_actionNavigationClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_ActionNavigationClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
				 getString("_UI_WafStyle_anchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_anchorClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_AnchorClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cards Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardsAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_cardsAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_cardsAnchorClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_CardsAnchorClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Details Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDetailsAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_detailsAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_detailsAnchorClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_DetailsAnchorClass(),
				 true,
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
				 getString("_UI_WafStyle_formAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_formAnchorClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_FormAnchorClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gallery Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGalleryAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_galleryAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_galleryAnchorClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_GalleryAnchorClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slider Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSliderAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_sliderAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_sliderAnchorClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_SliderAnchorClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabular Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabularAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WafStyle_tabularAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyle_tabularAnchorClass_feature", "_UI_WafStyle_type"),
				 WafPackage.eINSTANCE.getWafStyle_TabularAnchorClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns WafStyle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WafStyle"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WafStyle)object).getStyleClass();
		return label == null || label.length() == 0 ?
			getString("_UI_WafStyle_type") :
			getString("_UI_WafStyle_type") + " " + label;
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

		switch (notification.getFeatureID(WafStyle.class)) {
			case WafPackage.WAF_STYLE__STYLE_CLASS:
			case WafPackage.WAF_STYLE__SECTION_CLASS:
			case WafPackage.WAF_STYLE__CAPTION_CLASS:
			case WafPackage.WAF_STYLE__CONTENT_CLASS:
			case WafPackage.WAF_STYLE__CARDS_CONTENT_CLASS:
			case WafPackage.WAF_STYLE__DETAILS_CONTENT_CLASS:
			case WafPackage.WAF_STYLE__FORM_CONTENT_CLASS:
			case WafPackage.WAF_STYLE__GALLERY_CONTENT_CLASS:
			case WafPackage.WAF_STYLE__SLIDER_CONTENT_CLASS:
			case WafPackage.WAF_STYLE__STATIC_CONTENT_CLASS:
			case WafPackage.WAF_STYLE__TABULAR_CONTENT_CLASS:
			case WafPackage.WAF_STYLE__FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLE__CARDS_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLE__DETAILS_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLE__FORM_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLE__GALLERY_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLE__SLIDER_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLE__TABULAR_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLE__DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLE__CARDS_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLE__DETAILS_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLE__FORM_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLE__GALLERY_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLE__SLIDER_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLE__TABULAR_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLE__ROW_CLASS:
			case WafPackage.WAF_STYLE__COLUMN_CLASS:
			case WafPackage.WAF_STYLE__CARD_CLASS:
			case WafPackage.WAF_STYLE__CARD_HEADER_CLASS:
			case WafPackage.WAF_STYLE__CARD_BODY_CLASS:
			case WafPackage.WAF_STYLE__CARD_FOOTER_CLASS:
			case WafPackage.WAF_STYLE__BADGE_CLASS:
			case WafPackage.WAF_STYLE__CONTROL_CLASS:
			case WafPackage.WAF_STYLE__CARDS_CONTROL_CLASS:
			case WafPackage.WAF_STYLE__DETAILS_CONTROL_CLASS:
			case WafPackage.WAF_STYLE__FORM_CONTROL_CLASS:
			case WafPackage.WAF_STYLE__GALLERY_CONTROL_CLASS:
			case WafPackage.WAF_STYLE__SLIDER_CONTROL_CLASS:
			case WafPackage.WAF_STYLE__TABULAR_CONTROL_CLASS:
			case WafPackage.WAF_STYLE__INPUT_GROUP_CLASS:
			case WafPackage.WAF_STYLE__FIELD_LABEL_CLASS:
			case WafPackage.WAF_STYLE__CARDS_FIELD_LABEL_CLASS:
			case WafPackage.WAF_STYLE__DETAILS_FIELD_LABEL_CLASS:
			case WafPackage.WAF_STYLE__FORM_FIELD_LABEL_CLASS:
			case WafPackage.WAF_STYLE__GALLERY_FIELD_LABEL_CLASS:
			case WafPackage.WAF_STYLE__SLIDER_FIELD_LABEL_CLASS:
			case WafPackage.WAF_STYLE__TABULAR_FIELD_LABEL_CLASS:
			case WafPackage.WAF_STYLE__FIELD_VALUE_CLASS:
			case WafPackage.WAF_STYLE__CARDS_FIELD_VALUE_CLASS:
			case WafPackage.WAF_STYLE__DETAILS_FIELD_VALUE_CLASS:
			case WafPackage.WAF_STYLE__FORM_FIELD_VALUE_CLASS:
			case WafPackage.WAF_STYLE__GALLERY_FIELD_VALUE_CLASS:
			case WafPackage.WAF_STYLE__SLIDER_FIELD_VALUE_CLASS:
			case WafPackage.WAF_STYLE__TABULAR_FIELD_VALUE_CLASS:
			case WafPackage.WAF_STYLE__ACTION_NAVIGATION_CLASS:
			case WafPackage.WAF_STYLE__ANCHOR_CLASS:
			case WafPackage.WAF_STYLE__CARDS_ANCHOR_CLASS:
			case WafPackage.WAF_STYLE__DETAILS_ANCHOR_CLASS:
			case WafPackage.WAF_STYLE__FORM_ANCHOR_CLASS:
			case WafPackage.WAF_STYLE__GALLERY_ANCHOR_CLASS:
			case WafPackage.WAF_STYLE__SLIDER_ANCHOR_CLASS:
			case WafPackage.WAF_STYLE__TABULAR_ANCHOR_CLASS:
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
