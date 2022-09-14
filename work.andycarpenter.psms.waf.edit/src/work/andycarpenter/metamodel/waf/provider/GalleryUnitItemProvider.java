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

import work.andycarpenter.metamodel.waf.GalleryUnit;
import work.andycarpenter.metamodel.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.waf.GalleryUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GalleryUnitItemProvider extends ImageUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GalleryUnitItemProvider(AdapterFactory adapterFactory) {
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

			addFullSizeFilterPropertyDescriptor(object);
			addShowTimePropertyDescriptor(object);
			addTransitionTimePropertyDescriptor(object);
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
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Full Size Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFullSizeFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GalleryUnit_fullSizeFilter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_fullSizeFilter_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_FullSizeFilter(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GalleryUnit_showTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_showTime_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_ShowTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transition Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitionTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GalleryUnit_transitionTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_transitionTime_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_TransitionTime(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_GalleryUnit_sectionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_sectionClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_SectionClass(),
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
				 getString("_UI_GalleryUnit_hasSectionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_hasSectionClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_HasSectionClass(),
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
				 getString("_UI_GalleryUnit_captionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_captionClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_CaptionClass(),
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
				 getString("_UI_GalleryUnit_hasCaptionClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_hasCaptionClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_HasCaptionClass(),
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
				 getString("_UI_GalleryUnit_contentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_contentClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_ContentClass(),
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
				 getString("_UI_GalleryUnit_hasContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_hasContentClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_HasContentClass(),
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
				 getString("_UI_GalleryUnit_fieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_fieldListClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_FieldListClass(),
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
				 getString("_UI_GalleryUnit_hasFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_hasFieldListClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_HasFieldListClass(),
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
				 getString("_UI_GalleryUnit_definitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_definitionFieldListClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_DefinitionFieldListClass(),
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
				 getString("_UI_GalleryUnit_hasDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_hasDefinitionFieldListClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_HasDefinitionFieldListClass(),
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
				 getString("_UI_GalleryUnit_fieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_fieldLabelClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_FieldLabelClass(),
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
				 getString("_UI_GalleryUnit_hasFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_hasFieldLabelClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_HasFieldLabelClass(),
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
				 getString("_UI_GalleryUnit_fieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_fieldValueClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_FieldValueClass(),
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
				 getString("_UI_GalleryUnit_hasFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_hasFieldValueClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_HasFieldValueClass(),
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
				 getString("_UI_GalleryUnit_controlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_controlClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_ControlClass(),
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
				 getString("_UI_GalleryUnit_hasControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_hasControlClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_HasControlClass(),
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
				 getString("_UI_GalleryUnit_anchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_anchorClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_AnchorClass(),
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
				 getString("_UI_GalleryUnit_hasAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_hasAnchorClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_HasAnchorClass(),
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
				 getString("_UI_GalleryUnit_instanceControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_instanceControlClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_InstanceControlClass(),
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
				 getString("_UI_GalleryUnit_hasInstanceControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_hasInstanceControlClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_HasInstanceControlClass(),
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
				 getString("_UI_GalleryUnit_instanceAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_instanceAnchorClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_InstanceAnchorClass(),
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
				 getString("_UI_GalleryUnit_hasInstanceAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_hasInstanceAnchorClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_HasInstanceAnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GalleryUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GalleryUnit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GalleryUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GalleryUnit_type") :
			getString("_UI_GalleryUnit_type") + " " + label;
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

		switch (notification.getFeatureID(GalleryUnit.class)) {
			case WafPackage.GALLERY_UNIT__SHOW_TIME:
			case WafPackage.GALLERY_UNIT__TRANSITION_TIME:
			case WafPackage.GALLERY_UNIT__SECTION_CLASS:
			case WafPackage.GALLERY_UNIT__HAS_SECTION_CLASS:
			case WafPackage.GALLERY_UNIT__CAPTION_CLASS:
			case WafPackage.GALLERY_UNIT__HAS_CAPTION_CLASS:
			case WafPackage.GALLERY_UNIT__CONTENT_CLASS:
			case WafPackage.GALLERY_UNIT__HAS_CONTENT_CLASS:
			case WafPackage.GALLERY_UNIT__FIELD_LIST_CLASS:
			case WafPackage.GALLERY_UNIT__HAS_FIELD_LIST_CLASS:
			case WafPackage.GALLERY_UNIT__DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.GALLERY_UNIT__HAS_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.GALLERY_UNIT__FIELD_LABEL_CLASS:
			case WafPackage.GALLERY_UNIT__HAS_FIELD_LABEL_CLASS:
			case WafPackage.GALLERY_UNIT__FIELD_VALUE_CLASS:
			case WafPackage.GALLERY_UNIT__HAS_FIELD_VALUE_CLASS:
			case WafPackage.GALLERY_UNIT__CONTROL_CLASS:
			case WafPackage.GALLERY_UNIT__HAS_CONTROL_CLASS:
			case WafPackage.GALLERY_UNIT__ANCHOR_CLASS:
			case WafPackage.GALLERY_UNIT__HAS_ANCHOR_CLASS:
			case WafPackage.GALLERY_UNIT__INSTANCE_CONTROL_CLASS:
			case WafPackage.GALLERY_UNIT__HAS_INSTANCE_CONTROL_CLASS:
			case WafPackage.GALLERY_UNIT__INSTANCE_ANCHOR_CLASS:
			case WafPackage.GALLERY_UNIT__HAS_INSTANCE_ANCHOR_CLASS:
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
			childFeature == WafPackage.eINSTANCE.getCollectionUnit_ElementTitle() ||
			childFeature == WafPackage.eINSTANCE.getImageUnit_ImagePathFeature();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
