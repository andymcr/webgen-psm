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
import work.andycarpenter.psms.waf.WafStyles;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.psms.waf.WafStyles} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WafStylesItemProvider 
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
	public WafStylesItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_WafStyles_styleClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_styleClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_StyleClass(),
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
				 getString("_UI_WafStyles_sectionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_sectionClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_SectionClass(),
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
				 getString("_UI_WafStyles_captionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_captionClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_CaptionClass(),
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
				 getString("_UI_WafStyles_contentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_contentClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_ContentClass(),
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
				 getString("_UI_WafStyles_cardsContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_cardsContentClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_CardsContentClass(),
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
				 getString("_UI_WafStyles_detailsContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_detailsContentClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_DetailsContentClass(),
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
				 getString("_UI_WafStyles_formContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_formContentClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_FormContentClass(),
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
				 getString("_UI_WafStyles_galleryContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_galleryContentClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_GalleryContentClass(),
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
				 getString("_UI_WafStyles_sliderContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_sliderContentClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_SliderContentClass(),
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
				 getString("_UI_WafStyles_staticContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_staticContentClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_StaticContentClass(),
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
				 getString("_UI_WafStyles_tabularContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_tabularContentClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_TabularContentClass(),
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
				 getString("_UI_WafStyles_fieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_fieldListClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_FieldListClass(),
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
				 getString("_UI_WafStyles_cardsFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_cardsFieldListClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_CardsFieldListClass(),
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
				 getString("_UI_WafStyles_detailsFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_detailsFieldListClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_DetailsFieldListClass(),
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
				 getString("_UI_WafStyles_formFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_formFieldListClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_FormFieldListClass(),
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
				 getString("_UI_WafStyles_galleryFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_galleryFieldListClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_GalleryFieldListClass(),
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
				 getString("_UI_WafStyles_sliderFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_sliderFieldListClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_SliderFieldListClass(),
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
				 getString("_UI_WafStyles_tabularFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_tabularFieldListClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_TabularFieldListClass(),
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
				 getString("_UI_WafStyles_definitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_definitionFieldListClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_DefinitionFieldListClass(),
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
				 getString("_UI_WafStyles_cardsDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_cardsDefinitionFieldListClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_CardsDefinitionFieldListClass(),
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
				 getString("_UI_WafStyles_detailsDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_detailsDefinitionFieldListClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_DetailsDefinitionFieldListClass(),
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
				 getString("_UI_WafStyles_formDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_formDefinitionFieldListClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_FormDefinitionFieldListClass(),
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
				 getString("_UI_WafStyles_galleryDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_galleryDefinitionFieldListClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_GalleryDefinitionFieldListClass(),
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
				 getString("_UI_WafStyles_sliderDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_sliderDefinitionFieldListClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_SliderDefinitionFieldListClass(),
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
				 getString("_UI_WafStyles_tabularDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_tabularDefinitionFieldListClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_TabularDefinitionFieldListClass(),
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
				 getString("_UI_WafStyles_rowClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_rowClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_RowClass(),
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
				 getString("_UI_WafStyles_columnClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_columnClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_ColumnClass(),
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
				 getString("_UI_WafStyles_cardClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_cardClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_CardClass(),
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
				 getString("_UI_WafStyles_cardHeaderClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_cardHeaderClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_CardHeaderClass(),
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
				 getString("_UI_WafStyles_cardBodyClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_cardBodyClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_CardBodyClass(),
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
				 getString("_UI_WafStyles_cardFooterClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_cardFooterClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_CardFooterClass(),
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
				 getString("_UI_WafStyles_badgeClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_badgeClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_BadgeClass(),
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
				 getString("_UI_WafStyles_controlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_controlClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_ControlClass(),
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
				 getString("_UI_WafStyles_cardsControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_cardsControlClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_CardsControlClass(),
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
				 getString("_UI_WafStyles_detailsControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_detailsControlClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_DetailsControlClass(),
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
				 getString("_UI_WafStyles_formControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_formControlClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_FormControlClass(),
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
				 getString("_UI_WafStyles_galleryControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_galleryControlClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_GalleryControlClass(),
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
				 getString("_UI_WafStyles_sliderControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_sliderControlClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_SliderControlClass(),
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
				 getString("_UI_WafStyles_tabularControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_tabularControlClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_TabularControlClass(),
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
				 getString("_UI_WafStyles_inputGroupClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_inputGroupClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_InputGroupClass(),
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
				 getString("_UI_WafStyles_fieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_fieldLabelClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_FieldLabelClass(),
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
				 getString("_UI_WafStyles_cardsFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_cardsFieldLabelClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_CardsFieldLabelClass(),
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
				 getString("_UI_WafStyles_detailsFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_detailsFieldLabelClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_DetailsFieldLabelClass(),
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
				 getString("_UI_WafStyles_formFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_formFieldLabelClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_FormFieldLabelClass(),
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
				 getString("_UI_WafStyles_galleryFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_galleryFieldLabelClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_GalleryFieldLabelClass(),
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
				 getString("_UI_WafStyles_sliderFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_sliderFieldLabelClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_SliderFieldLabelClass(),
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
				 getString("_UI_WafStyles_tabularFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_tabularFieldLabelClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_TabularFieldLabelClass(),
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
				 getString("_UI_WafStyles_fieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_fieldValueClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_FieldValueClass(),
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
				 getString("_UI_WafStyles_cardsFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_cardsFieldValueClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_CardsFieldValueClass(),
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
				 getString("_UI_WafStyles_detailsFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_detailsFieldValueClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_DetailsFieldValueClass(),
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
				 getString("_UI_WafStyles_formFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_formFieldValueClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_FormFieldValueClass(),
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
				 getString("_UI_WafStyles_galleryFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_galleryFieldValueClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_GalleryFieldValueClass(),
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
				 getString("_UI_WafStyles_sliderFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_sliderFieldValueClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_SliderFieldValueClass(),
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
				 getString("_UI_WafStyles_tabularFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_tabularFieldValueClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_TabularFieldValueClass(),
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
				 getString("_UI_WafStyles_actionNavigationClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_actionNavigationClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_ActionNavigationClass(),
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
				 getString("_UI_WafStyles_anchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_anchorClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_AnchorClass(),
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
				 getString("_UI_WafStyles_cardsAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_cardsAnchorClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_CardsAnchorClass(),
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
				 getString("_UI_WafStyles_detailsAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_detailsAnchorClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_DetailsAnchorClass(),
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
				 getString("_UI_WafStyles_formAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_formAnchorClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_FormAnchorClass(),
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
				 getString("_UI_WafStyles_galleryAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_galleryAnchorClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_GalleryAnchorClass(),
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
				 getString("_UI_WafStyles_sliderAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_sliderAnchorClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_SliderAnchorClass(),
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
				 getString("_UI_WafStyles_tabularAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WafStyles_tabularAnchorClass_feature", "_UI_WafStyles_type"),
				 WafPackage.eINSTANCE.getWafStyles_TabularAnchorClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns WafStyles.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WafStyles"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WafStyles)object).getStyleClass();
		return label == null || label.length() == 0 ?
			getString("_UI_WafStyles_type") :
			getString("_UI_WafStyles_type") + " " + label;
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

		switch (notification.getFeatureID(WafStyles.class)) {
			case WafPackage.WAF_STYLES__STYLE_CLASS:
			case WafPackage.WAF_STYLES__SECTION_CLASS:
			case WafPackage.WAF_STYLES__CAPTION_CLASS:
			case WafPackage.WAF_STYLES__CONTENT_CLASS:
			case WafPackage.WAF_STYLES__CARDS_CONTENT_CLASS:
			case WafPackage.WAF_STYLES__DETAILS_CONTENT_CLASS:
			case WafPackage.WAF_STYLES__FORM_CONTENT_CLASS:
			case WafPackage.WAF_STYLES__GALLERY_CONTENT_CLASS:
			case WafPackage.WAF_STYLES__SLIDER_CONTENT_CLASS:
			case WafPackage.WAF_STYLES__STATIC_CONTENT_CLASS:
			case WafPackage.WAF_STYLES__TABULAR_CONTENT_CLASS:
			case WafPackage.WAF_STYLES__FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLES__CARDS_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLES__DETAILS_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLES__FORM_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLES__GALLERY_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLES__SLIDER_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLES__TABULAR_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLES__DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLES__CARDS_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLES__DETAILS_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLES__FORM_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLES__GALLERY_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLES__SLIDER_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLES__TABULAR_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.WAF_STYLES__ROW_CLASS:
			case WafPackage.WAF_STYLES__COLUMN_CLASS:
			case WafPackage.WAF_STYLES__CARD_CLASS:
			case WafPackage.WAF_STYLES__CARD_HEADER_CLASS:
			case WafPackage.WAF_STYLES__CARD_BODY_CLASS:
			case WafPackage.WAF_STYLES__CARD_FOOTER_CLASS:
			case WafPackage.WAF_STYLES__BADGE_CLASS:
			case WafPackage.WAF_STYLES__CONTROL_CLASS:
			case WafPackage.WAF_STYLES__CARDS_CONTROL_CLASS:
			case WafPackage.WAF_STYLES__DETAILS_CONTROL_CLASS:
			case WafPackage.WAF_STYLES__FORM_CONTROL_CLASS:
			case WafPackage.WAF_STYLES__GALLERY_CONTROL_CLASS:
			case WafPackage.WAF_STYLES__SLIDER_CONTROL_CLASS:
			case WafPackage.WAF_STYLES__TABULAR_CONTROL_CLASS:
			case WafPackage.WAF_STYLES__INPUT_GROUP_CLASS:
			case WafPackage.WAF_STYLES__FIELD_LABEL_CLASS:
			case WafPackage.WAF_STYLES__CARDS_FIELD_LABEL_CLASS:
			case WafPackage.WAF_STYLES__DETAILS_FIELD_LABEL_CLASS:
			case WafPackage.WAF_STYLES__FORM_FIELD_LABEL_CLASS:
			case WafPackage.WAF_STYLES__GALLERY_FIELD_LABEL_CLASS:
			case WafPackage.WAF_STYLES__SLIDER_FIELD_LABEL_CLASS:
			case WafPackage.WAF_STYLES__TABULAR_FIELD_LABEL_CLASS:
			case WafPackage.WAF_STYLES__FIELD_VALUE_CLASS:
			case WafPackage.WAF_STYLES__CARDS_FIELD_VALUE_CLASS:
			case WafPackage.WAF_STYLES__DETAILS_FIELD_VALUE_CLASS:
			case WafPackage.WAF_STYLES__FORM_FIELD_VALUE_CLASS:
			case WafPackage.WAF_STYLES__GALLERY_FIELD_VALUE_CLASS:
			case WafPackage.WAF_STYLES__SLIDER_FIELD_VALUE_CLASS:
			case WafPackage.WAF_STYLES__TABULAR_FIELD_VALUE_CLASS:
			case WafPackage.WAF_STYLES__ACTION_NAVIGATION_CLASS:
			case WafPackage.WAF_STYLES__ANCHOR_CLASS:
			case WafPackage.WAF_STYLES__CARDS_ANCHOR_CLASS:
			case WafPackage.WAF_STYLES__DETAILS_ANCHOR_CLASS:
			case WafPackage.WAF_STYLES__FORM_ANCHOR_CLASS:
			case WafPackage.WAF_STYLES__GALLERY_ANCHOR_CLASS:
			case WafPackage.WAF_STYLES__SLIDER_ANCHOR_CLASS:
			case WafPackage.WAF_STYLES__TABULAR_ANCHOR_CLASS:
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
