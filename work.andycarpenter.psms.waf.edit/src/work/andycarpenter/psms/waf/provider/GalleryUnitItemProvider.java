/**
 */
package work.andycarpenter.psms.waf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.psms.waf.GalleryUnit;
import work.andycarpenter.psms.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.psms.waf.GalleryUnit} object.
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
			addContentClassPropertyDescriptor(object);
			addHasContentClassPropertyDescriptor(object);
			addGalleryFieldListClassPropertyDescriptor(object);
			addGalleryDefinitionFieldListClassPropertyDescriptor(object);
			addGalleryFieldLabelClassPropertyDescriptor(object);
			addGalleryFieldValueClassPropertyDescriptor(object);
			addGalleryControlClassPropertyDescriptor(object);
			addGalleryInstanceControlClassPropertyDescriptor(object);
			addGalleryAnchorClassPropertyDescriptor(object);
			addGalleryInstanceAnchorClassPropertyDescriptor(object);
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
				 getString("_UI_GalleryUnit_galleryFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_galleryFieldListClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_GalleryFieldListClass(),
				 false,
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
				 getString("_UI_GalleryUnit_galleryDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_galleryDefinitionFieldListClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_GalleryDefinitionFieldListClass(),
				 false,
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
				 getString("_UI_GalleryUnit_galleryFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_galleryFieldLabelClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_GalleryFieldLabelClass(),
				 false,
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
				 getString("_UI_GalleryUnit_galleryFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_galleryFieldValueClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_GalleryFieldValueClass(),
				 false,
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
				 getString("_UI_GalleryUnit_galleryControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_galleryControlClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_GalleryControlClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gallery Instance Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGalleryInstanceControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GalleryUnit_galleryInstanceControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_galleryInstanceControlClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_GalleryInstanceControlClass(),
				 false,
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
				 getString("_UI_GalleryUnit_galleryAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_galleryAnchorClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_GalleryAnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gallery Instance Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGalleryInstanceAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GalleryUnit_galleryInstanceAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GalleryUnit_galleryInstanceAnchorClass_feature", "_UI_GalleryUnit_type"),
				 WafPackage.eINSTANCE.getGalleryUnit_GalleryInstanceAnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			case WafPackage.GALLERY_UNIT__CONTENT_CLASS:
			case WafPackage.GALLERY_UNIT__HAS_CONTENT_CLASS:
			case WafPackage.GALLERY_UNIT__GALLERY_FIELD_LIST_CLASS:
			case WafPackage.GALLERY_UNIT__GALLERY_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.GALLERY_UNIT__GALLERY_FIELD_LABEL_CLASS:
			case WafPackage.GALLERY_UNIT__GALLERY_FIELD_VALUE_CLASS:
			case WafPackage.GALLERY_UNIT__GALLERY_CONTROL_CLASS:
			case WafPackage.GALLERY_UNIT__GALLERY_INSTANCE_CONTROL_CLASS:
			case WafPackage.GALLERY_UNIT__GALLERY_ANCHOR_CLASS:
			case WafPackage.GALLERY_UNIT__GALLERY_INSTANCE_ANCHOR_CLASS:
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
