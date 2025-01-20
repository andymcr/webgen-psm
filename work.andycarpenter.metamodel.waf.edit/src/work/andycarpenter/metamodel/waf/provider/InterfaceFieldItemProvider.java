/**
 */
package work.andycarpenter.metamodel.waf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import work.andycarpenter.metamodel.base.BaseFactory;
import work.andycarpenter.metamodel.base.provider.NamedElementItemProvider;
import work.andycarpenter.metamodel.expression.ExpressionFactory;
import work.andycarpenter.metamodel.orm.OrmFactory;
import work.andycarpenter.metamodel.security.SecurityFactory;
import work.andycarpenter.metamodel.waf.InterfaceField;
import work.andycarpenter.metamodel.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.waf.InterfaceField} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfaceFieldItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceFieldItemProvider(AdapterFactory adapterFactory) {
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

			addDisplayLabelPropertyDescriptor(object);
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
			addFieldTitlePropertyDescriptor(object);
			addFieldPlaceholderPropertyDescriptor(object);
			addFieldRequiredPropertyDescriptor(object);
			addInterfaceTypePropertyDescriptor(object);
			addValidationPatternPropertyDescriptor(object);
			addRepeatedFieldPropertyDescriptor(object);
			addSecondDisplayLabelPropertyDescriptor(object);
			addSecondTitlePropertyDescriptor(object);
			addSecondPlaceholderPropertyDescriptor(object);
			addSecondHelpPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Display Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DisplayElement_displayLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DisplayElement_displayLabel_feature", "_UI_DisplayElement_type"),
				 WafPackage.eINSTANCE.getDisplayElement_DisplayLabel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
	 * This adds a property descriptor for the Field Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFieldTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfaceField_fieldTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfaceField_fieldTitle_feature", "_UI_InterfaceField_type"),
				 WafPackage.eINSTANCE.getInterfaceField_FieldTitle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Field Placeholder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFieldPlaceholderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfaceField_fieldPlaceholder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfaceField_fieldPlaceholder_feature", "_UI_InterfaceField_type"),
				 WafPackage.eINSTANCE.getInterfaceField_FieldPlaceholder(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Field Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFieldRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfaceField_fieldRequired_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfaceField_fieldRequired_feature", "_UI_InterfaceField_type"),
				 WafPackage.eINSTANCE.getInterfaceField_FieldRequired(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfaceField_interfaceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfaceField_interfaceType_feature", "_UI_InterfaceField_type"),
				 WafPackage.eINSTANCE.getInterfaceField_InterfaceType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validation Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidationPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfaceField_validationPattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfaceField_validationPattern_feature", "_UI_InterfaceField_type"),
				 WafPackage.eINSTANCE.getInterfaceField_ValidationPattern(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Repeated Field feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepeatedFieldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfaceField_repeatedField_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfaceField_repeatedField_feature", "_UI_InterfaceField_type"),
				 WafPackage.eINSTANCE.getInterfaceField_RepeatedField(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Second Display Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondDisplayLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfaceField_secondDisplayLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfaceField_secondDisplayLabel_feature", "_UI_InterfaceField_type"),
				 WafPackage.eINSTANCE.getInterfaceField_SecondDisplayLabel(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Second Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfaceField_secondTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfaceField_secondTitle_feature", "_UI_InterfaceField_type"),
				 WafPackage.eINSTANCE.getInterfaceField_SecondTitle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Second Placeholder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondPlaceholderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfaceField_secondPlaceholder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfaceField_secondPlaceholder_feature", "_UI_InterfaceField_type"),
				 WafPackage.eINSTANCE.getInterfaceField_SecondPlaceholder(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Second Help feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondHelpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InterfaceField_secondHelp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InterfaceField_secondHelp_feature", "_UI_InterfaceField_type"),
				 WafPackage.eINSTANCE.getInterfaceField_SecondHelp(),
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
			childrenFeatures.add(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue());
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
		String label = ((InterfaceField)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_InterfaceField_type") :
			getString("_UI_InterfaceField_type") + " " + label;
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

		switch (notification.getFeatureID(InterfaceField.class)) {
			case WafPackage.INTERFACE_FIELD__DISPLAY_LABEL:
			case WafPackage.INTERFACE_FIELD__FIELD_NAME:
			case WafPackage.INTERFACE_FIELD__IS_AUTHORISED:
			case WafPackage.INTERFACE_FIELD__HAS_CUSTOMISED_DISPLAY_LABEL:
			case WafPackage.INTERFACE_FIELD__IS_REPEATED:
			case WafPackage.INTERFACE_FIELD__TITLE:
			case WafPackage.INTERFACE_FIELD__HAS_TITLE:
			case WafPackage.INTERFACE_FIELD__HAS_CUSTOMISED_TITLE:
			case WafPackage.INTERFACE_FIELD__HAS_SECOND_TITLE:
			case WafPackage.INTERFACE_FIELD__PLACEHOLDER:
			case WafPackage.INTERFACE_FIELD__HAS_PLACEHOLDER:
			case WafPackage.INTERFACE_FIELD__HAS_CUSTOMISED_PLACEHOLDER:
			case WafPackage.INTERFACE_FIELD__HAS_SECOND_PLACEHOLDER:
			case WafPackage.INTERFACE_FIELD__LOCAL_HELP:
			case WafPackage.INTERFACE_FIELD__HELP:
			case WafPackage.INTERFACE_FIELD__HAS_HELP:
			case WafPackage.INTERFACE_FIELD__HAS_SECOND_HELP:
			case WafPackage.INTERFACE_FIELD__IS_CONTAINS:
			case WafPackage.INTERFACE_FIELD__IS_DISABLED:
			case WafPackage.INTERFACE_FIELD__DEFAULT_DISPLAY:
			case WafPackage.INTERFACE_FIELD__HAS_DEFAULT_VALUE:
			case WafPackage.INTERFACE_FIELD__HAS_FORCED_VALUE:
			case WafPackage.INTERFACE_FIELD__ESCAPE_HTML:
			case WafPackage.INTERFACE_FIELD__COLLECTION_DISPLAY_OPTION:
			case WafPackage.INTERFACE_FIELD__TRUNCATE:
			case WafPackage.INTERFACE_FIELD__DATE_FORMAT:
			case WafPackage.INTERFACE_FIELD__DISABLED_INPUT:
			case WafPackage.INTERFACE_FIELD__HEADER_CLASS:
			case WafPackage.INTERFACE_FIELD__INPUT_GROUP_CLASS_OVERRIDE:
			case WafPackage.INTERFACE_FIELD__INPUT_GROUP_CLASS:
			case WafPackage.INTERFACE_FIELD__HAS_INPUT_GROUP_CLASS:
			case WafPackage.INTERFACE_FIELD__FIELD_LABEL_CLASS_OVERRIDE:
			case WafPackage.INTERFACE_FIELD__FIELD_LABEL_CLASS:
			case WafPackage.INTERFACE_FIELD__HAS_FIELD_LABEL_CLASS:
			case WafPackage.INTERFACE_FIELD__FIELD_VALUE_CLASS_OVERRIDE:
			case WafPackage.INTERFACE_FIELD__FIELD_VALUE_CLASS:
			case WafPackage.INTERFACE_FIELD__HAS_FIELD_VALUE_CLASS:
			case WafPackage.INTERFACE_FIELD__FOOTER_CLASS:
			case WafPackage.INTERFACE_FIELD__FIELD_TITLE:
			case WafPackage.INTERFACE_FIELD__FIELD_PLACEHOLDER:
			case WafPackage.INTERFACE_FIELD__FIELD_REQUIRED:
			case WafPackage.INTERFACE_FIELD__INTERFACE_TYPE:
			case WafPackage.INTERFACE_FIELD__VALIDATION_PATTERN:
			case WafPackage.INTERFACE_FIELD__REPEATED_FIELD:
			case WafPackage.INTERFACE_FIELD__SECOND_DISPLAY_LABEL:
			case WafPackage.INTERFACE_FIELD__SECOND_TITLE:
			case WafPackage.INTERFACE_FIELD__SECOND_PLACEHOLDER:
			case WafPackage.INTERFACE_FIELD__SECOND_HELP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.INTERFACE_FIELD__AUTHORISATION:
			case WafPackage.INTERFACE_FIELD__HIDE_WHEN:
			case WafPackage.INTERFACE_FIELD__DISPLAY_DEFAULT_WHEN:
			case WafPackage.INTERFACE_FIELD__FIELD_DEFAULT_VALUE:
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
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 OrmFactory.eINSTANCE.createAssociationVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 OrmFactory.eINSTANCE.createAttributeVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 OrmFactory.eINSTANCE.createResourceVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 OrmFactory.eINSTANCE.createParameterVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 BaseFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 BaseFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 BaseFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 BaseFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 BaseFactory.eINSTANCE.createTimeLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 BaseFactory.eINSTANCE.createCurrentTime()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 BaseFactory.eINSTANCE.createCurrentUser()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 BaseFactory.eINSTANCE.createConstantReference()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 BaseFactory.eINSTANCE.createCallable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 BaseFactory.eINSTANCE.createReduceFunction()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 BaseFactory.eINSTANCE.createSizeFunction()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 ExpressionFactory.eINSTANCE.createPredicateBooleanVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 ExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 ExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 ExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 ExpressionFactory.eINSTANCE.createPredicateInOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 ExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 ExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
				 ExpressionFactory.eINSTANCE.createPredicateIsNull()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue(),
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
			childFeature == WafPackage.eINSTANCE.getInterfaceField_FieldDefaultValue();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
