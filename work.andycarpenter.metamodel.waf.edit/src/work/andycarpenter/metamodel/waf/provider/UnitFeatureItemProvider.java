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
import work.andycarpenter.metamodel.base.BaseFactory;
import work.andycarpenter.metamodel.expression.ExpressionFactory;
import work.andycarpenter.metamodel.orm.OrmFactory;
import work.andycarpenter.metamodel.security.SecurityFactory;
import work.andycarpenter.metamodel.waf.UnitFeature;
import work.andycarpenter.metamodel.waf.WafFactory;
import work.andycarpenter.metamodel.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.waf.UnitFeature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitFeatureItemProvider extends DisplayElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitFeatureItemProvider(AdapterFactory adapterFactory) {
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

			addDisplayedOnPropertyDescriptor(object);
			addIsAuthorisedPropertyDescriptor(object);
			addHasCustomisedDisplayLabelPropertyDescriptor(object);
			addIsRepeatedPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addHasTitlePropertyDescriptor(object);
			addHasCustomisedTitlePropertyDescriptor(object);
			addHasSecondTitlePropertyDescriptor(object);
			addPlaceholderPropertyDescriptor(object);
			addHasPlaceholderPropertyDescriptor(object);
			addHasCustomisedPlaceholderPropertyDescriptor(object);
			addHasSecondPlaceholderPropertyDescriptor(object);
			addLocalHelpPropertyDescriptor(object);
			addHelpPropertyDescriptor(object);
			addHasHelpPropertyDescriptor(object);
			addHasSecondHelpPropertyDescriptor(object);
			addDefaultDisplayPropertyDescriptor(object);
			addEscapeHTMLPropertyDescriptor(object);
			addCollectionDisplayOptionPropertyDescriptor(object);
			addTruncatePropertyDescriptor(object);
			addDateFormatPropertyDescriptor(object);
			addDisabledInputPropertyDescriptor(object);
			addHeaderClassPropertyDescriptor(object);
			addLocalInputGroupClassPropertyDescriptor(object);
			addLocalFieldLabelClassPropertyDescriptor(object);
			addLocalFieldValueClassPropertyDescriptor(object);
			addContainerActionsPlacementPropertyDescriptor(object);
			addInstanceActionsPlacementPropertyDescriptor(object);
			addTitleOverridePropertyDescriptor(object);
			addPlaceholderOverridePropertyDescriptor(object);
			addCollectionUiAllowAddPropertyDescriptor(object);
			addCollectionUiAllowRemovePropertyDescriptor(object);
			addCollectionMaximumValuesPropertyDescriptor(object);
			addEmptyCollectionDisplayPropertyDescriptor(object);
			addAutofocusPropertyDescriptor(object);
			addFooterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Displayed On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayedOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_displayedOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_displayedOn_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_DisplayedOn(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Authorised feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAuthorisedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_isAuthorised_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_isAuthorised_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_IsAuthorised(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Customised Display Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCustomisedDisplayLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_hasCustomisedDisplayLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_hasCustomisedDisplayLabel_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_HasCustomisedDisplayLabel(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Repeated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsRepeatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_isRepeated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_isRepeated_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_IsRepeated(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Title Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitleOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_titleOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_titleOverride_feature", "_UI_UnitFeature_type"),
				 WafPackage.eINSTANCE.getUnitFeature_TitleOverride(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_title_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_Title(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_hasTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_hasTitle_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_HasTitle(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Customised Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCustomisedTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_hasCustomisedTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_hasCustomisedTitle_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_HasCustomisedTitle(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Second Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasSecondTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_hasSecondTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_hasSecondTitle_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_HasSecondTitle(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Placeholder Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlaceholderOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_placeholderOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_placeholderOverride_feature", "_UI_UnitFeature_type"),
				 WafPackage.eINSTANCE.getUnitFeature_PlaceholderOverride(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Placeholder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlaceholderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_placeholder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_placeholder_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_Placeholder(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Placeholder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasPlaceholderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_hasPlaceholder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_hasPlaceholder_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_HasPlaceholder(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Customised Placeholder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCustomisedPlaceholderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_hasCustomisedPlaceholder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_hasCustomisedPlaceholder_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_HasCustomisedPlaceholder(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Second Placeholder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasSecondPlaceholderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_hasSecondPlaceholder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_hasSecondPlaceholder_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_HasSecondPlaceholder(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Help feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalHelpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_localHelp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_localHelp_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_LocalHelp(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Help feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHelpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_help_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_help_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_Help(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Help feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasHelpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_hasHelp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_hasHelp_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_HasHelp(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Second Help feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasSecondHelpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_hasSecondHelp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_hasSecondHelp_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_HasSecondHelp(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Display feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultDisplayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_defaultDisplay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_defaultDisplay_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_DefaultDisplay(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Escape HTML feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEscapeHTMLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_escapeHTML_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_escapeHTML_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_EscapeHTML(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Collection Display Option feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionDisplayOptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_collectionDisplayOption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_collectionDisplayOption_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_CollectionDisplayOption(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Truncate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTruncatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_truncate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_truncate_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_Truncate(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_dateFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_dateFormat_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_DateFormat(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disabled Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisabledInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_disabledInput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_disabledInput_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_DisabledInput(),
				 true,
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
				 getString("_UI_UnitField_headerClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_headerClass_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_HeaderClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Input Group Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalInputGroupClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_localInputGroupClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_localInputGroupClass_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_LocalInputGroupClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Field Label Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalFieldLabelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_localFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_localFieldLabelClass_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_LocalFieldLabelClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Field Value Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalFieldValueClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_localFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_localFieldValueClass_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_LocalFieldValueClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StylePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Container Actions Placement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerActionsPlacementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_containerActionsPlacement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_containerActionsPlacement_feature", "_UI_ActionContainer_type"),
				 WafPackage.eINSTANCE.getActionContainer_ContainerActionsPlacement(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Actions Placement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceActionsPlacementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_instanceActionsPlacement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_instanceActionsPlacement_feature", "_UI_ActionContainer_type"),
				 WafPackage.eINSTANCE.getActionContainer_InstanceActionsPlacement(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_InterfacePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Collection Ui Allow Add feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionUiAllowAddPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_collectionUiAllowAdd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_collectionUiAllowAdd_feature", "_UI_UnitFeature_type"),
				 WafPackage.eINSTANCE.getUnitFeature_CollectionUiAllowAdd(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Collection Ui Allow Remove feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionUiAllowRemovePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_collectionUiAllowRemove_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_collectionUiAllowRemove_feature", "_UI_UnitFeature_type"),
				 WafPackage.eINSTANCE.getUnitFeature_CollectionUiAllowRemove(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Collection Maximum Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionMaximumValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_collectionMaximumValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_collectionMaximumValues_feature", "_UI_UnitFeature_type"),
				 WafPackage.eINSTANCE.getUnitFeature_CollectionMaximumValues(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Empty Collection Display feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmptyCollectionDisplayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_emptyCollectionDisplay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_emptyCollectionDisplay_feature", "_UI_UnitFeature_type"),
				 WafPackage.eINSTANCE.getUnitFeature_EmptyCollectionDisplay(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Autofocus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutofocusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_autofocus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_autofocus_feature", "_UI_UnitFeature_type"),
				 WafPackage.eINSTANCE.getUnitFeature_Autofocus(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Footer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFooterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitFeature_footer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitFeature_footer_feature", "_UI_UnitFeature_type"),
				 WafPackage.eINSTANCE.getUnitFeature_Footer(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(WafPackage.eINSTANCE.getUnitField_Authorisation());
			childrenFeatures.add(WafPackage.eINSTANCE.getUnitField_HideWhen());
			childrenFeatures.add(WafPackage.eINSTANCE.getUnitField_DisplayDefaultWhen());
			childrenFeatures.add(WafPackage.eINSTANCE.getActionContainer_AllActions());
			childrenFeatures.add(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue());
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
		String label = ((UnitFeature)object).getDisplayLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_UnitFeature_type") :
			getString("_UI_UnitFeature_type") + " " + label;
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

		switch (notification.getFeatureID(UnitFeature.class)) {
			case WafPackage.UNIT_FEATURE__IS_AUTHORISED:
			case WafPackage.UNIT_FEATURE__HAS_CUSTOMISED_DISPLAY_LABEL:
			case WafPackage.UNIT_FEATURE__IS_REPEATED:
			case WafPackage.UNIT_FEATURE__TITLE:
			case WafPackage.UNIT_FEATURE__HAS_TITLE:
			case WafPackage.UNIT_FEATURE__HAS_CUSTOMISED_TITLE:
			case WafPackage.UNIT_FEATURE__HAS_SECOND_TITLE:
			case WafPackage.UNIT_FEATURE__PLACEHOLDER:
			case WafPackage.UNIT_FEATURE__HAS_PLACEHOLDER:
			case WafPackage.UNIT_FEATURE__HAS_CUSTOMISED_PLACEHOLDER:
			case WafPackage.UNIT_FEATURE__HAS_SECOND_PLACEHOLDER:
			case WafPackage.UNIT_FEATURE__LOCAL_HELP:
			case WafPackage.UNIT_FEATURE__HELP:
			case WafPackage.UNIT_FEATURE__HAS_HELP:
			case WafPackage.UNIT_FEATURE__HAS_SECOND_HELP:
			case WafPackage.UNIT_FEATURE__DEFAULT_DISPLAY:
			case WafPackage.UNIT_FEATURE__ESCAPE_HTML:
			case WafPackage.UNIT_FEATURE__COLLECTION_DISPLAY_OPTION:
			case WafPackage.UNIT_FEATURE__TRUNCATE:
			case WafPackage.UNIT_FEATURE__DATE_FORMAT:
			case WafPackage.UNIT_FEATURE__DISABLED_INPUT:
			case WafPackage.UNIT_FEATURE__HEADER_CLASS:
			case WafPackage.UNIT_FEATURE__LOCAL_INPUT_GROUP_CLASS:
			case WafPackage.UNIT_FEATURE__LOCAL_FIELD_LABEL_CLASS:
			case WafPackage.UNIT_FEATURE__LOCAL_FIELD_VALUE_CLASS:
			case WafPackage.UNIT_FEATURE__CONTAINER_ACTIONS_PLACEMENT:
			case WafPackage.UNIT_FEATURE__INSTANCE_ACTIONS_PLACEMENT:
			case WafPackage.UNIT_FEATURE__TITLE_OVERRIDE:
			case WafPackage.UNIT_FEATURE__PLACEHOLDER_OVERRIDE:
			case WafPackage.UNIT_FEATURE__COLLECTION_UI_ALLOW_ADD:
			case WafPackage.UNIT_FEATURE__COLLECTION_UI_ALLOW_REMOVE:
			case WafPackage.UNIT_FEATURE__COLLECTION_MAXIMUM_VALUES:
			case WafPackage.UNIT_FEATURE__EMPTY_COLLECTION_DISPLAY:
			case WafPackage.UNIT_FEATURE__AUTOFOCUS:
			case WafPackage.UNIT_FEATURE__FOOTER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.UNIT_FEATURE__AUTHORISATION:
			case WafPackage.UNIT_FEATURE__HIDE_WHEN:
			case WafPackage.UNIT_FEATURE__DISPLAY_DEFAULT_WHEN:
			case WafPackage.UNIT_FEATURE__ALL_ACTIONS:
			case WafPackage.UNIT_FEATURE__FEATURE_FORCED_VALUE:
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
				(WafPackage.eINSTANCE.getUnitField_Authorisation(),
				 SecurityFactory.eINSTANCE.createIsGrantedRole()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitField_HideWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateBooleanVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitField_HideWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitField_HideWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitField_HideWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitField_HideWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateInOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitField_HideWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitField_HideWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitField_HideWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateIsNull()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitField_DisplayDefaultWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateBooleanVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitField_DisplayDefaultWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitField_DisplayDefaultWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitField_DisplayDefaultWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitField_DisplayDefaultWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateInOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitField_DisplayDefaultWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitField_DisplayDefaultWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitField_DisplayDefaultWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateIsNull()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getActionContainer_AllActions(),
				 WafFactory.eINSTANCE.createDeleteAction()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getActionContainer_AllActions(),
				 WafFactory.eINSTANCE.createContainerSelectAction()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getActionContainer_AllActions(),
				 WafFactory.eINSTANCE.createInstanceSelectAction()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getActionContainer_AllActions(),
				 WafFactory.eINSTANCE.createTargetAction()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getActionContainer_AllActions(),
				 WafFactory.eINSTANCE.createInstanceOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getActionContainer_AllActions(),
				 WafFactory.eINSTANCE.createContainerOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getActionContainer_AllActions(),
				 WafFactory.eINSTANCE.createGeneralOperationAction()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 OrmFactory.eINSTANCE.createAssociationVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 OrmFactory.eINSTANCE.createAttributeVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 OrmFactory.eINSTANCE.createResourceVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 OrmFactory.eINSTANCE.createParameterVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 BaseFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 BaseFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 BaseFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 BaseFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 BaseFactory.eINSTANCE.createTimeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 BaseFactory.eINSTANCE.createCurrentTime()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 BaseFactory.eINSTANCE.createCurrentUser()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 BaseFactory.eINSTANCE.createConstantReference()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 BaseFactory.eINSTANCE.createCallable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 BaseFactory.eINSTANCE.createReduceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 BaseFactory.eINSTANCE.createSizeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 ExpressionFactory.eINSTANCE.createPredicateBooleanVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 ExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 ExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 ExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 ExpressionFactory.eINSTANCE.createPredicateInOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 ExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 ExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 ExpressionFactory.eINSTANCE.createPredicateIsNull()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue(),
				 ExpressionFactory.eINSTANCE.createArithmeticOperation()));
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
			childFeature == WafPackage.eINSTANCE.getUnitField_HideWhen() ||
			childFeature == WafPackage.eINSTANCE.getUnitField_DisplayDefaultWhen() ||
			childFeature == WafPackage.eINSTANCE.getUnitFeature_FeatureForcedValue();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
