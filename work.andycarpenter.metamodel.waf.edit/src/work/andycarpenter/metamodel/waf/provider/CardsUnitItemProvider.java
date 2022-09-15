/**
 */
package work.andycarpenter.metamodel.waf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.metamodel.waf.CardsUnit;
import work.andycarpenter.metamodel.waf.WafFactory;
import work.andycarpenter.metamodel.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.waf.CardsUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CardsUnitItemProvider extends CollectionUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardsUnitItemProvider(AdapterFactory adapterFactory) {
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

			addOverlaySingleSelectActionPropertyDescriptor(object);
			addLocalRowClassPropertyDescriptor(object);
			addLocalColumnClassPropertyDescriptor(object);
			addLocalCardClassPropertyDescriptor(object);
			addLocalCardHeaderClassPropertyDescriptor(object);
			addLocalCardBodyClassPropertyDescriptor(object);
			addLocalCardFooterClassPropertyDescriptor(object);
			addLocalBadgeClassPropertyDescriptor(object);
			addSectionClassPropertyDescriptor(object);
			addHasSectionClassPropertyDescriptor(object);
			addCaptionClassPropertyDescriptor(object);
			addHasCaptionClassPropertyDescriptor(object);
			addContentClassPropertyDescriptor(object);
			addHasContentClassPropertyDescriptor(object);
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
			addInstanceAnchorClassPropertyDescriptor(object);
			addHasInstanceAnchorClassPropertyDescriptor(object);
			addRowClassPropertyDescriptor(object);
			addHasRowClassPropertyDescriptor(object);
			addColumnClassPropertyDescriptor(object);
			addHasColumnClassPropertyDescriptor(object);
			addCardClassPropertyDescriptor(object);
			addHasCardClassPropertyDescriptor(object);
			addCardHeaderClassPropertyDescriptor(object);
			addHasCardHeaderClassPropertyDescriptor(object);
			addCardBodyClassPropertyDescriptor(object);
			addHasCardBodyClassPropertyDescriptor(object);
			addCardFooterClassPropertyDescriptor(object);
			addHasCardFooterClassPropertyDescriptor(object);
			addBadgeClassPropertyDescriptor(object);
			addHasBadgeClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Overlay Single Select Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverlaySingleSelectActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_overlaySingleSelectAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_overlaySingleSelectAction_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_OverlaySingleSelectAction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Row Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalRowClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_localRowClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_localRowClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_LocalRowClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Column Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalColumnClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_localColumnClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_localColumnClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_LocalColumnClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Card Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalCardClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_localCardClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_localCardClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_LocalCardClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Card Header Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalCardHeaderClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_localCardHeaderClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_localCardHeaderClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_LocalCardHeaderClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Card Body Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalCardBodyClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_localCardBodyClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_localCardBodyClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_LocalCardBodyClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Card Footer Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalCardFooterClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_localCardFooterClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_localCardFooterClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_LocalCardFooterClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Badge Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalBadgeClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_localBadgeClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_localBadgeClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_LocalBadgeClass(),
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
				 getString("_UI_CardsUnit_sectionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_sectionClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_SectionClass(),
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
				 getString("_UI_CardsUnit_hasSectionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasSectionClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasSectionClass(),
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
				 getString("_UI_CardsUnit_captionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_captionClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_CaptionClass(),
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
				 getString("_UI_CardsUnit_hasCaptionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasCaptionClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasCaptionClass(),
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
				 getString("_UI_CardsUnit_contentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_contentClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_ContentClass(),
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
				 getString("_UI_CardsUnit_hasContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasContentClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasContentClass(),
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
				 getString("_UI_CardsUnit_fieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_fieldListClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_FieldListClass(),
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
				 getString("_UI_CardsUnit_hasFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasFieldListClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasFieldListClass(),
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
				 getString("_UI_CardsUnit_definitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_definitionFieldListClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_DefinitionFieldListClass(),
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
				 getString("_UI_CardsUnit_hasDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasDefinitionFieldListClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasDefinitionFieldListClass(),
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
				 getString("_UI_CardsUnit_fieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_fieldLabelClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_FieldLabelClass(),
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
				 getString("_UI_CardsUnit_hasFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasFieldLabelClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasFieldLabelClass(),
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
				 getString("_UI_CardsUnit_fieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_fieldValueClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_FieldValueClass(),
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
				 getString("_UI_CardsUnit_hasFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasFieldValueClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasFieldValueClass(),
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
				 getString("_UI_CardsUnit_controlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_controlClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_ControlClass(),
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
				 getString("_UI_CardsUnit_hasControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasControlClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasControlClass(),
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
				 getString("_UI_CardsUnit_anchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_anchorClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_AnchorClass(),
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
				 getString("_UI_CardsUnit_hasAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasAnchorClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasAnchorClass(),
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
				 getString("_UI_CardsUnit_instanceControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_instanceControlClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_InstanceControlClass(),
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
				 getString("_UI_CardsUnit_hasInstanceControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasInstanceControlClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasInstanceControlClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_instanceAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_instanceAnchorClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_InstanceAnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Instance Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasInstanceAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_hasInstanceAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasInstanceAnchorClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasInstanceAnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_CardsUnit_rowClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_rowClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_RowClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Row Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasRowClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_hasRowClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasRowClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasRowClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_CardsUnit_columnClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_columnClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_ColumnClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Column Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasColumnClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_hasColumnClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasColumnClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasColumnClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_CardsUnit_cardClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_cardClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_CardClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Card Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCardClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_hasCardClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasCardClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasCardClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_CardsUnit_cardHeaderClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_cardHeaderClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_CardHeaderClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Card Header Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCardHeaderClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_hasCardHeaderClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasCardHeaderClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasCardHeaderClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_CardsUnit_cardBodyClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_cardBodyClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_CardBodyClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Card Body Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCardBodyClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_hasCardBodyClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasCardBodyClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasCardBodyClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_CardsUnit_cardFooterClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_cardFooterClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_CardFooterClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Card Footer Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCardFooterClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_hasCardFooterClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasCardFooterClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasCardFooterClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_CardsUnit_badgeClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_badgeClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_BadgeClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Badge Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasBadgeClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_hasBadgeClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasBadgeClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasBadgeClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(WafPackage.eINSTANCE.getCardsUnit_Badges());
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
		String label = ((CardsUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CardsUnit_type") :
			getString("_UI_CardsUnit_type") + " " + label;
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

		switch (notification.getFeatureID(CardsUnit.class)) {
			case WafPackage.CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
			case WafPackage.CARDS_UNIT__LOCAL_ROW_CLASS:
			case WafPackage.CARDS_UNIT__LOCAL_COLUMN_CLASS:
			case WafPackage.CARDS_UNIT__LOCAL_CARD_CLASS:
			case WafPackage.CARDS_UNIT__LOCAL_CARD_HEADER_CLASS:
			case WafPackage.CARDS_UNIT__LOCAL_CARD_BODY_CLASS:
			case WafPackage.CARDS_UNIT__LOCAL_CARD_FOOTER_CLASS:
			case WafPackage.CARDS_UNIT__LOCAL_BADGE_CLASS:
			case WafPackage.CARDS_UNIT__SECTION_CLASS:
			case WafPackage.CARDS_UNIT__HAS_SECTION_CLASS:
			case WafPackage.CARDS_UNIT__CAPTION_CLASS:
			case WafPackage.CARDS_UNIT__HAS_CAPTION_CLASS:
			case WafPackage.CARDS_UNIT__CONTENT_CLASS:
			case WafPackage.CARDS_UNIT__HAS_CONTENT_CLASS:
			case WafPackage.CARDS_UNIT__FIELD_LIST_CLASS:
			case WafPackage.CARDS_UNIT__HAS_FIELD_LIST_CLASS:
			case WafPackage.CARDS_UNIT__DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.CARDS_UNIT__HAS_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.CARDS_UNIT__FIELD_LABEL_CLASS:
			case WafPackage.CARDS_UNIT__HAS_FIELD_LABEL_CLASS:
			case WafPackage.CARDS_UNIT__FIELD_VALUE_CLASS:
			case WafPackage.CARDS_UNIT__HAS_FIELD_VALUE_CLASS:
			case WafPackage.CARDS_UNIT__CONTROL_CLASS:
			case WafPackage.CARDS_UNIT__HAS_CONTROL_CLASS:
			case WafPackage.CARDS_UNIT__ANCHOR_CLASS:
			case WafPackage.CARDS_UNIT__HAS_ANCHOR_CLASS:
			case WafPackage.CARDS_UNIT__INSTANCE_CONTROL_CLASS:
			case WafPackage.CARDS_UNIT__HAS_INSTANCE_CONTROL_CLASS:
			case WafPackage.CARDS_UNIT__INSTANCE_ANCHOR_CLASS:
			case WafPackage.CARDS_UNIT__HAS_INSTANCE_ANCHOR_CLASS:
			case WafPackage.CARDS_UNIT__ROW_CLASS:
			case WafPackage.CARDS_UNIT__HAS_ROW_CLASS:
			case WafPackage.CARDS_UNIT__COLUMN_CLASS:
			case WafPackage.CARDS_UNIT__HAS_COLUMN_CLASS:
			case WafPackage.CARDS_UNIT__CARD_CLASS:
			case WafPackage.CARDS_UNIT__HAS_CARD_CLASS:
			case WafPackage.CARDS_UNIT__CARD_HEADER_CLASS:
			case WafPackage.CARDS_UNIT__HAS_CARD_HEADER_CLASS:
			case WafPackage.CARDS_UNIT__CARD_BODY_CLASS:
			case WafPackage.CARDS_UNIT__HAS_CARD_BODY_CLASS:
			case WafPackage.CARDS_UNIT__CARD_FOOTER_CLASS:
			case WafPackage.CARDS_UNIT__HAS_CARD_FOOTER_CLASS:
			case WafPackage.CARDS_UNIT__BADGE_CLASS:
			case WafPackage.CARDS_UNIT__HAS_BADGE_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.CARDS_UNIT__BADGES:
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
				(WafPackage.eINSTANCE.getCardsUnit_Badges(),
				 WafFactory.eINSTANCE.createBadge()));
	}

}
