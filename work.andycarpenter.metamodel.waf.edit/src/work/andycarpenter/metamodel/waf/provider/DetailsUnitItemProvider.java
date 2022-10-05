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

import work.andycarpenter.metamodel.waf.DetailsUnit;
import work.andycarpenter.metamodel.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.waf.DetailsUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DetailsUnitItemProvider extends SingletonUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailsUnitItemProvider(AdapterFactory adapterFactory) {
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

			addSelectorsPropertyDescriptor(object);
			addSelectionPropertyDescriptor(object);
			addOmitFieldLabelsPropertyDescriptor(object);
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
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Selectors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SelectableUnit_selectors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SelectableUnit_selectors_feature", "_UI_SelectableUnit_type"),
				 WafPackage.eINSTANCE.getSelectableUnit_Selectors(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DetailsUnit_selection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_selection_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_Selection(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Omit Field Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOmitFieldLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DetailsUnit_omitFieldLabels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_omitFieldLabels_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_OmitFieldLabels(),
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
				 getString("_UI_DetailsUnit_sectionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_sectionClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_SectionClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_DetailsUnit_hasSectionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_hasSectionClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_HasSectionClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_DetailsUnit_captionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_captionClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_CaptionClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_DetailsUnit_hasCaptionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_hasCaptionClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_HasCaptionClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_DetailsUnit_contentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_contentClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_ContentClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_DetailsUnit_hasContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_hasContentClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_HasContentClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_DetailsUnit_fieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_fieldListClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_FieldListClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_DetailsUnit_hasFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_hasFieldListClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_HasFieldListClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_DetailsUnit_definitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_definitionFieldListClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_DefinitionFieldListClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_DetailsUnit_hasDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_hasDefinitionFieldListClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_HasDefinitionFieldListClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_DetailsUnit_fieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_fieldLabelClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_FieldLabelClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_DetailsUnit_hasFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_hasFieldLabelClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_HasFieldLabelClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_DetailsUnit_fieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_fieldValueClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_FieldValueClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_DetailsUnit_hasFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_hasFieldValueClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_HasFieldValueClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_DetailsUnit_controlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_controlClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_ControlClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_DetailsUnit_hasControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_hasControlClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_HasControlClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_DetailsUnit_anchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_anchorClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_AnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_DetailsUnit_hasAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DetailsUnit_hasAnchorClass_feature", "_UI_DetailsUnit_type"),
				 WafPackage.eINSTANCE.getDetailsUnit_HasAnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This returns DetailsUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DetailsUnit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DetailsUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DetailsUnit_type") :
			getString("_UI_DetailsUnit_type") + " " + label;
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

		switch (notification.getFeatureID(DetailsUnit.class)) {
			case WafPackage.DETAILS_UNIT__OMIT_FIELD_LABELS:
			case WafPackage.DETAILS_UNIT__SECTION_CLASS:
			case WafPackage.DETAILS_UNIT__HAS_SECTION_CLASS:
			case WafPackage.DETAILS_UNIT__CAPTION_CLASS:
			case WafPackage.DETAILS_UNIT__HAS_CAPTION_CLASS:
			case WafPackage.DETAILS_UNIT__CONTENT_CLASS:
			case WafPackage.DETAILS_UNIT__HAS_CONTENT_CLASS:
			case WafPackage.DETAILS_UNIT__FIELD_LIST_CLASS:
			case WafPackage.DETAILS_UNIT__HAS_FIELD_LIST_CLASS:
			case WafPackage.DETAILS_UNIT__DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.DETAILS_UNIT__HAS_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.DETAILS_UNIT__FIELD_LABEL_CLASS:
			case WafPackage.DETAILS_UNIT__HAS_FIELD_LABEL_CLASS:
			case WafPackage.DETAILS_UNIT__FIELD_VALUE_CLASS:
			case WafPackage.DETAILS_UNIT__HAS_FIELD_VALUE_CLASS:
			case WafPackage.DETAILS_UNIT__CONTROL_CLASS:
			case WafPackage.DETAILS_UNIT__HAS_CONTROL_CLASS:
			case WafPackage.DETAILS_UNIT__ANCHOR_CLASS:
			case WafPackage.DETAILS_UNIT__HAS_ANCHOR_CLASS:
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
