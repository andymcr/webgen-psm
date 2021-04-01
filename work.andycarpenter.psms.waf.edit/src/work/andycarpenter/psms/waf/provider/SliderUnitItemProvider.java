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

import work.andycarpenter.psms.waf.SliderUnit;
import work.andycarpenter.psms.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.psms.waf.SliderUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SliderUnitItemProvider extends ImageUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SliderUnitItemProvider(AdapterFactory adapterFactory) {
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

			addShowTimePropertyDescriptor(object);
			addTransitionTimePropertyDescriptor(object);
			addContentClassPropertyDescriptor(object);
			addHasContentClassPropertyDescriptor(object);
			addSliderFieldListClassPropertyDescriptor(object);
			addSliderDefinitionFieldListClassPropertyDescriptor(object);
			addSliderFieldLabelClassPropertyDescriptor(object);
			addSliderFieldValueClassPropertyDescriptor(object);
			addSliderControlClassPropertyDescriptor(object);
			addSliderInstanceControlClassPropertyDescriptor(object);
			addSliderAnchorClassPropertyDescriptor(object);
			addSliderInstanceAnchorClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_SliderUnit_showTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SliderUnit_showTime_feature", "_UI_SliderUnit_type"),
				 WafPackage.eINSTANCE.getSliderUnit_ShowTime(),
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
				 getString("_UI_SliderUnit_transitionTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SliderUnit_transitionTime_feature", "_UI_SliderUnit_type"),
				 WafPackage.eINSTANCE.getSliderUnit_TransitionTime(),
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
				 getString("_UI_SliderUnit_contentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SliderUnit_contentClass_feature", "_UI_SliderUnit_type"),
				 WafPackage.eINSTANCE.getSliderUnit_ContentClass(),
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
				 getString("_UI_SliderUnit_hasContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SliderUnit_hasContentClass_feature", "_UI_SliderUnit_type"),
				 WafPackage.eINSTANCE.getSliderUnit_HasContentClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_SliderUnit_sliderFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SliderUnit_sliderFieldListClass_feature", "_UI_SliderUnit_type"),
				 WafPackage.eINSTANCE.getSliderUnit_SliderFieldListClass(),
				 false,
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
				 getString("_UI_SliderUnit_sliderDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SliderUnit_sliderDefinitionFieldListClass_feature", "_UI_SliderUnit_type"),
				 WafPackage.eINSTANCE.getSliderUnit_SliderDefinitionFieldListClass(),
				 false,
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
				 getString("_UI_SliderUnit_sliderFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SliderUnit_sliderFieldLabelClass_feature", "_UI_SliderUnit_type"),
				 WafPackage.eINSTANCE.getSliderUnit_SliderFieldLabelClass(),
				 false,
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
				 getString("_UI_SliderUnit_sliderFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SliderUnit_sliderFieldValueClass_feature", "_UI_SliderUnit_type"),
				 WafPackage.eINSTANCE.getSliderUnit_SliderFieldValueClass(),
				 false,
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
				 getString("_UI_SliderUnit_sliderControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SliderUnit_sliderControlClass_feature", "_UI_SliderUnit_type"),
				 WafPackage.eINSTANCE.getSliderUnit_SliderControlClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slider Instance Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSliderInstanceControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SliderUnit_sliderInstanceControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SliderUnit_sliderInstanceControlClass_feature", "_UI_SliderUnit_type"),
				 WafPackage.eINSTANCE.getSliderUnit_SliderInstanceControlClass(),
				 false,
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
				 getString("_UI_SliderUnit_sliderAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SliderUnit_sliderAnchorClass_feature", "_UI_SliderUnit_type"),
				 WafPackage.eINSTANCE.getSliderUnit_SliderAnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slider Instance Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSliderInstanceAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SliderUnit_sliderInstanceAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SliderUnit_sliderInstanceAnchorClass_feature", "_UI_SliderUnit_type"),
				 WafPackage.eINSTANCE.getSliderUnit_SliderInstanceAnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SliderUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SliderUnit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SliderUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SliderUnit_type") :
			getString("_UI_SliderUnit_type") + " " + label;
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

		switch (notification.getFeatureID(SliderUnit.class)) {
			case WafPackage.SLIDER_UNIT__SHOW_TIME:
			case WafPackage.SLIDER_UNIT__TRANSITION_TIME:
			case WafPackage.SLIDER_UNIT__CONTENT_CLASS:
			case WafPackage.SLIDER_UNIT__HAS_CONTENT_CLASS:
			case WafPackage.SLIDER_UNIT__SLIDER_FIELD_LIST_CLASS:
			case WafPackage.SLIDER_UNIT__SLIDER_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.SLIDER_UNIT__SLIDER_FIELD_LABEL_CLASS:
			case WafPackage.SLIDER_UNIT__SLIDER_FIELD_VALUE_CLASS:
			case WafPackage.SLIDER_UNIT__SLIDER_CONTROL_CLASS:
			case WafPackage.SLIDER_UNIT__SLIDER_INSTANCE_CONTROL_CLASS:
			case WafPackage.SLIDER_UNIT__SLIDER_ANCHOR_CLASS:
			case WafPackage.SLIDER_UNIT__SLIDER_INSTANCE_ANCHOR_CLASS:
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
