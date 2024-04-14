/**
 */
package work.andycarpenter.metamodel.waf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.metamodel.waf.TabularUnit;
import work.andycarpenter.metamodel.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.waf.TabularUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TabularUnitItemProvider extends CollectionUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabularUnitItemProvider(AdapterFactory adapterFactory) {
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

			addTargettingSearchesPropertyDescriptor(object);
			addRowClassesPropertyDescriptor(object);
			addLocalHeaderClassPropertyDescriptor(object);
			addLocalFooterClassPropertyDescriptor(object);
			addSectionClassPropertyDescriptor(object);
			addHasSectionClassPropertyDescriptor(object);
			addCaptionClassPropertyDescriptor(object);
			addHasCaptionClassPropertyDescriptor(object);
			addContentClassPropertyDescriptor(object);
			addHasContentClassPropertyDescriptor(object);
			addHeaderClassPropertyDescriptor(object);
			addHasHeaderClassPropertyDescriptor(object);
			addFooterClassPropertyDescriptor(object);
			addHasFooterClassPropertyDescriptor(object);
			addFieldListClassPropertyDescriptor(object);
			addHasFieldListClassPropertyDescriptor(object);
			addDefinitionFieldListClassPropertyDescriptor(object);
			addHasDefinitionFieldListClassPropertyDescriptor(object);
			addFieldLabelClassPropertyDescriptor(object);
			addHasFieldLabelClassPropertyDescriptor(object);
			addFieldValueClassPropertyDescriptor(object);
			addHasFieldValueClassPropertyDescriptor(object);
			addControlClassPropertyDescriptor(object);
			addHasControlClassPropertyDescriptor(object);
			addAnchorClassPropertyDescriptor(object);
			addHasAnchorClassPropertyDescriptor(object);
			addInstanceControlClassPropertyDescriptor(object);
			addHasInstanceControlClassPropertyDescriptor(object);
			addInstanceActionClassPropertyDescriptor(object);
			addHasInstanceActionClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Targetting Searches feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargettingSearchesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_targettingSearches_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_targettingSearches_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_TargettingSearches(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Row Classes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRowClassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_rowClasses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_rowClasses_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_RowClasses(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Header Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalHeaderClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_localHeaderClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_localHeaderClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_LocalHeaderClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Footer Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalFooterClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_localFooterClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_localFooterClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_LocalFooterClass(),
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
				 getString("_UI_TabularUnit_sectionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_sectionClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_SectionClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Section Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasSectionClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_hasSectionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_hasSectionClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_HasSectionClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_TabularUnit_captionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_captionClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_CaptionClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Caption Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCaptionClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_hasCaptionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_hasCaptionClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_HasCaptionClass(),
				 false,
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
				 getString("_UI_TabularUnit_contentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_contentClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_ContentClass(),
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
				 getString("_UI_TabularUnit_hasContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_hasContentClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_HasContentClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_TabularUnit_headerClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_headerClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_HeaderClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Header Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasHeaderClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_hasHeaderClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_hasHeaderClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_HasHeaderClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_TabularUnit_footerClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_footerClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_FooterClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Footer Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasFooterClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_hasFooterClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_hasFooterClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_HasFooterClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_TabularUnit_fieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_fieldListClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_FieldListClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_hasFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_hasFieldListClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_HasFieldListClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_TabularUnit_definitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_definitionFieldListClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_DefinitionFieldListClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Definition Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasDefinitionFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_hasDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_hasDefinitionFieldListClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_HasDefinitionFieldListClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_TabularUnit_fieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_fieldLabelClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_FieldLabelClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Field Label Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasFieldLabelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_hasFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_hasFieldLabelClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_HasFieldLabelClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_TabularUnit_fieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_fieldValueClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_FieldValueClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Field Value Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasFieldValueClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_hasFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_hasFieldValueClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_HasFieldValueClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_TabularUnit_controlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_controlClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_ControlClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_hasControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_hasControlClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_HasControlClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_TabularUnit_anchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_anchorClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_AnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
				 getString("_UI_TabularUnit_hasAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_hasAnchorClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_HasAnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_instanceControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_instanceControlClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_InstanceControlClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Instance Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasInstanceControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_hasInstanceControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_hasInstanceControlClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_HasInstanceControlClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Action Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceActionClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_instanceActionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_instanceActionClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_InstanceActionClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Instance Action Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasInstanceActionClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabularUnit_hasInstanceActionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabularUnit_hasInstanceActionClass_feature", "_UI_TabularUnit_type"),
				 WafPackage.eINSTANCE.getTabularUnit_HasInstanceActionClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TabularUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TabularUnit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TabularUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TabularUnit_type") :
			getString("_UI_TabularUnit_type") + " " + label;
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

		switch (notification.getFeatureID(TabularUnit.class)) {
			case WafPackage.TABULAR_UNIT__ROW_CLASSES:
			case WafPackage.TABULAR_UNIT__LOCAL_HEADER_CLASS:
			case WafPackage.TABULAR_UNIT__LOCAL_FOOTER_CLASS:
			case WafPackage.TABULAR_UNIT__SECTION_CLASS:
			case WafPackage.TABULAR_UNIT__HAS_SECTION_CLASS:
			case WafPackage.TABULAR_UNIT__CAPTION_CLASS:
			case WafPackage.TABULAR_UNIT__HAS_CAPTION_CLASS:
			case WafPackage.TABULAR_UNIT__CONTENT_CLASS:
			case WafPackage.TABULAR_UNIT__HAS_CONTENT_CLASS:
			case WafPackage.TABULAR_UNIT__HEADER_CLASS:
			case WafPackage.TABULAR_UNIT__HAS_HEADER_CLASS:
			case WafPackage.TABULAR_UNIT__FOOTER_CLASS:
			case WafPackage.TABULAR_UNIT__HAS_FOOTER_CLASS:
			case WafPackage.TABULAR_UNIT__FIELD_LIST_CLASS:
			case WafPackage.TABULAR_UNIT__HAS_FIELD_LIST_CLASS:
			case WafPackage.TABULAR_UNIT__DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.TABULAR_UNIT__HAS_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.TABULAR_UNIT__FIELD_LABEL_CLASS:
			case WafPackage.TABULAR_UNIT__HAS_FIELD_LABEL_CLASS:
			case WafPackage.TABULAR_UNIT__FIELD_VALUE_CLASS:
			case WafPackage.TABULAR_UNIT__HAS_FIELD_VALUE_CLASS:
			case WafPackage.TABULAR_UNIT__CONTROL_CLASS:
			case WafPackage.TABULAR_UNIT__HAS_CONTROL_CLASS:
			case WafPackage.TABULAR_UNIT__ANCHOR_CLASS:
			case WafPackage.TABULAR_UNIT__HAS_ANCHOR_CLASS:
			case WafPackage.TABULAR_UNIT__INSTANCE_CONTROL_CLASS:
			case WafPackage.TABULAR_UNIT__HAS_INSTANCE_CONTROL_CLASS:
			case WafPackage.TABULAR_UNIT__INSTANCE_ACTION_CLASS:
			case WafPackage.TABULAR_UNIT__HAS_INSTANCE_ACTION_CLASS:
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
