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
import work.andycarpenter.metamodel.expression.ExpressionFactory;
import work.andycarpenter.metamodel.security.SecurityFactory;
import work.andycarpenter.metamodel.waf.UnitLabel;
import work.andycarpenter.metamodel.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.waf.UnitLabel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitLabelItemProvider extends DisplayElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitLabelItemProvider(AdapterFactory adapterFactory) {
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
			addFieldNamePropertyDescriptor(object);
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
			addIsContainsPropertyDescriptor(object);
			addIsDisabledPropertyDescriptor(object);
			addDefaultDisplayPropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addHasDefaultValuePropertyDescriptor(object);
			addHasForcedValuePropertyDescriptor(object);
			addEscapeHTMLPropertyDescriptor(object);
			addCollectionDisplayOptionPropertyDescriptor(object);
			addTruncatePropertyDescriptor(object);
			addDateFormatPropertyDescriptor(object);
			addDisabledInputPropertyDescriptor(object);
			addHeaderClassPropertyDescriptor(object);
			addInputGroupClassOverridePropertyDescriptor(object);
			addInputGroupClassPropertyDescriptor(object);
			addHasInputGroupClassPropertyDescriptor(object);
			addFieldLabelClassOverridePropertyDescriptor(object);
			addFieldLabelClassPropertyDescriptor(object);
			addHasFieldLabelClassPropertyDescriptor(object);
			addFieldValueClassOverridePropertyDescriptor(object);
			addFieldValueClassPropertyDescriptor(object);
			addHasFieldValueClassPropertyDescriptor(object);
			addFooterClassPropertyDescriptor(object);
			addGenModelPropertyDescriptor(object);
			addUiModelPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
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
	 * This adds a property descriptor for the Field Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFieldNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_fieldName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_fieldName_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_FieldName(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
	 * This adds a property descriptor for the Is Contains feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsContainsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_isContains_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_isContains_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_IsContains(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Disabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDisabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_isDisabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_isDisabled_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_IsDisabled(),
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
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_defaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_defaultValue_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_DefaultValue(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_hasDefaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_hasDefaultValue_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_HasDefaultValue(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Forced Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasForcedValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_hasForcedValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_hasForcedValue_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_HasForcedValue(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
	 * This adds a property descriptor for the Input Group Class Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputGroupClassOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_inputGroupClassOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_inputGroupClassOverride_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_InputGroupClassOverride(),
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
				 getString("_UI_UnitField_inputGroupClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_inputGroupClass_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_InputGroupClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Input Group Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasInputGroupClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_hasInputGroupClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_hasInputGroupClass_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_HasInputGroupClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Field Label Class Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFieldLabelClassOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_fieldLabelClassOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_fieldLabelClassOverride_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_FieldLabelClassOverride(),
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
				 getString("_UI_UnitField_fieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_fieldLabelClass_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_FieldLabelClass(),
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
				 getString("_UI_UnitField_hasFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_hasFieldLabelClass_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_HasFieldLabelClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Field Value Class Override feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFieldValueClassOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitField_fieldValueClassOverride_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_fieldValueClassOverride_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_FieldValueClassOverride(),
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
				 getString("_UI_UnitField_fieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_fieldValueClass_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_FieldValueClass(),
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
				 getString("_UI_UnitField_hasFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_hasFieldValueClass_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_HasFieldValueClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_UnitField_footerClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_footerClass_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_FooterClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_UnitField_genModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_genModel_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_GenModel(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
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
				 getString("_UI_UnitField_uiModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitField_uiModel_feature", "_UI_UnitField_type"),
				 WafPackage.eINSTANCE.getUnitField_UiModel(),
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitLabel_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitLabel_label_feature", "_UI_UnitLabel_type"),
				 WafPackage.eINSTANCE.getUnitLabel_Label(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitLabel_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitLabel_name_feature", "_UI_UnitLabel_type"),
				 WafPackage.eINSTANCE.getUnitLabel_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
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
	 * This returns UnitLabel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnitLabel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UnitLabel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UnitLabel_type") :
			getString("_UI_UnitLabel_type") + " " + label;
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

		switch (notification.getFeatureID(UnitLabel.class)) {
			case WafPackage.UNIT_LABEL__FIELD_NAME:
			case WafPackage.UNIT_LABEL__IS_AUTHORISED:
			case WafPackage.UNIT_LABEL__HAS_CUSTOMISED_DISPLAY_LABEL:
			case WafPackage.UNIT_LABEL__IS_REPEATED:
			case WafPackage.UNIT_LABEL__TITLE:
			case WafPackage.UNIT_LABEL__HAS_TITLE:
			case WafPackage.UNIT_LABEL__HAS_CUSTOMISED_TITLE:
			case WafPackage.UNIT_LABEL__HAS_SECOND_TITLE:
			case WafPackage.UNIT_LABEL__PLACEHOLDER:
			case WafPackage.UNIT_LABEL__HAS_PLACEHOLDER:
			case WafPackage.UNIT_LABEL__HAS_CUSTOMISED_PLACEHOLDER:
			case WafPackage.UNIT_LABEL__HAS_SECOND_PLACEHOLDER:
			case WafPackage.UNIT_LABEL__LOCAL_HELP:
			case WafPackage.UNIT_LABEL__HELP:
			case WafPackage.UNIT_LABEL__HAS_HELP:
			case WafPackage.UNIT_LABEL__HAS_SECOND_HELP:
			case WafPackage.UNIT_LABEL__IS_CONTAINS:
			case WafPackage.UNIT_LABEL__IS_DISABLED:
			case WafPackage.UNIT_LABEL__DEFAULT_DISPLAY:
			case WafPackage.UNIT_LABEL__HAS_DEFAULT_VALUE:
			case WafPackage.UNIT_LABEL__HAS_FORCED_VALUE:
			case WafPackage.UNIT_LABEL__ESCAPE_HTML:
			case WafPackage.UNIT_LABEL__COLLECTION_DISPLAY_OPTION:
			case WafPackage.UNIT_LABEL__TRUNCATE:
			case WafPackage.UNIT_LABEL__DATE_FORMAT:
			case WafPackage.UNIT_LABEL__DISABLED_INPUT:
			case WafPackage.UNIT_LABEL__HEADER_CLASS:
			case WafPackage.UNIT_LABEL__INPUT_GROUP_CLASS_OVERRIDE:
			case WafPackage.UNIT_LABEL__INPUT_GROUP_CLASS:
			case WafPackage.UNIT_LABEL__HAS_INPUT_GROUP_CLASS:
			case WafPackage.UNIT_LABEL__FIELD_LABEL_CLASS_OVERRIDE:
			case WafPackage.UNIT_LABEL__FIELD_LABEL_CLASS:
			case WafPackage.UNIT_LABEL__HAS_FIELD_LABEL_CLASS:
			case WafPackage.UNIT_LABEL__FIELD_VALUE_CLASS_OVERRIDE:
			case WafPackage.UNIT_LABEL__FIELD_VALUE_CLASS:
			case WafPackage.UNIT_LABEL__HAS_FIELD_VALUE_CLASS:
			case WafPackage.UNIT_LABEL__FOOTER_CLASS:
			case WafPackage.UNIT_LABEL__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.UNIT_LABEL__AUTHORISATION:
			case WafPackage.UNIT_LABEL__HIDE_WHEN:
			case WafPackage.UNIT_LABEL__DISPLAY_DEFAULT_WHEN:
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
			childFeature == WafPackage.eINSTANCE.getUnitField_DisplayDefaultWhen();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
