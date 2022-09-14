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
import work.andycarpenter.metamodel.waf.DynamicUnit;
import work.andycarpenter.metamodel.waf.WafFactory;
import work.andycarpenter.metamodel.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.waf.DynamicUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicUnitItemProvider extends ContentUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicUnitItemProvider(AdapterFactory adapterFactory) {
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

			addContainerActionsPlacementPropertyDescriptor(object);
			addInstanceActionsPlacementPropertyDescriptor(object);
			addActionsPropertyDescriptor(object);
			addHasActionsPropertyDescriptor(object);
			addActionsWithMessagesPropertyDescriptor(object);
			addHasActionsMessagesPropertyDescriptor(object);
			addActionsWithoutTargetPropertyDescriptor(object);
			addContainerActionsPropertyDescriptor(object);
			addHasContainerActionsPropertyDescriptor(object);
			addFileActionsPropertyDescriptor(object);
			addHasFileActionsPropertyDescriptor(object);
			addInstanceActionsPropertyDescriptor(object);
			addHasInstanceActionsPropertyDescriptor(object);
			addOperationActionsPropertyDescriptor(object);
			addHasOperationActionsPropertyDescriptor(object);
			addGenModelRefPropertyDescriptor(object);
			addUiModelRefPropertyDescriptor(object);
			addContentTypePropertyDescriptor(object);
			addContentRepositoryPropertyDescriptor(object);
			addContainingAssociationPropertyDescriptor(object);
			addContainingTypePropertyDescriptor(object);
			addIsContainedPropertyDescriptor(object);
			addContainerRepositoryPropertyDescriptor(object);
			addHasExplicitlyEditedContainerPropertyDescriptor(object);
			addRepositoriesUsedPropertyDescriptor(object);
			addServicesUsedPropertyDescriptor(object);
			addHasWhenFieldsEmptyAddImplicitFieldsPropertyDescriptor(object);
			addIsConditionallyDisplayedPropertyDescriptor(object);
			addMessageWhenHiddenPropertyDescriptor(object);
			addHasHiddenMessagePropertyDescriptor(object);
			addHeaderPropertyDescriptor(object);
			addFooterPropertyDescriptor(object);
			addAssociationFieldsPropertyDescriptor(object);
			addHasAssociationFieldsPropertyDescriptor(object);
			addAutocompleteFieldsPropertyDescriptor(object);
			addHasAutocompleteFieldsPropertyDescriptor(object);
			addAutocompleteThresholdPropertyDescriptor(object);
			addHasBooleanFieldsPropertyDescriptor(object);
			addHasCaptchaPropertyDescriptor(object);
			addHasChangableCollectionsPropertyDescriptor(object);
			addCollectionFieldsPropertyDescriptor(object);
			addCollectionFeaturesPropertyDescriptor(object);
			addDataTypeFieldsPropertyDescriptor(object);
			addDateFieldsPropertyDescriptor(object);
			addDefaultValueFieldsPropertyDescriptor(object);
			addHasDefaultValueFieldsPropertyDescriptor(object);
			addHasDisabledFieldsPropertyDescriptor(object);
			addHasEmailFieldsPropertyDescriptor(object);
			addEncryptedFieldsPropertyDescriptor(object);
			addHasEncryptedFieldsPropertyDescriptor(object);
			addEnumerationFieldsPropertyDescriptor(object);
			addHasEnumerationFieldsPropertyDescriptor(object);
			addFeatureFieldsPropertyDescriptor(object);
			addHasFeatureFieldsPropertyDescriptor(object);
			addForcedValueFieldsPropertyDescriptor(object);
			addHasForcedValueFieldsPropertyDescriptor(object);
			addFormFieldsPropertyDescriptor(object);
			addHasIntegerFieldsPropertyDescriptor(object);
			addInterfaceFieldsPropertyDescriptor(object);
			addHasInterfaceFieldsPropertyDescriptor(object);
			addHasRequiredInterfaceFieldsPropertyDescriptor(object);
			addHasObfuscatedFieldsPropertyDescriptor(object);
			addHasRepeatedFieldsPropertyDescriptor(object);
			addHasResourceFieldsPropertyDescriptor(object);
			addHasStringFieldsPropertyDescriptor(object);
			addHasTextareaFieldsPropertyDescriptor(object);
			addHasUrlFieldsPropertyDescriptor(object);
			addLocalFieldListClassPropertyDescriptor(object);
			addLocalDefinitionFieldListClassPropertyDescriptor(object);
			addLocalFieldLabelClassPropertyDescriptor(object);
			addLocalFieldValueClassPropertyDescriptor(object);
			addLocalControlClassPropertyDescriptor(object);
			addLocalAnchorClassPropertyDescriptor(object);
			addCommonFieldListClassPropertyDescriptor(object);
			addHasCommonFieldListClassPropertyDescriptor(object);
			addCommonDefinitionFieldListClassPropertyDescriptor(object);
			addHasCommonDefinitionFieldListClassPropertyDescriptor(object);
			addCommonFieldLabelClassPropertyDescriptor(object);
			addHasCommonFieldLabelClassPropertyDescriptor(object);
			addCommonFieldValueClassPropertyDescriptor(object);
			addHasCommonFieldValueClassPropertyDescriptor(object);
			addCommonAnchorClassPropertyDescriptor(object);
			addHasCommonAnchorClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 null,
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
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_actions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_actions_feature", "_UI_ActionContainer_type"),
				 WafPackage.eINSTANCE.getActionContainer_Actions(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_hasActions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_hasActions_feature", "_UI_ActionContainer_type"),
				 WafPackage.eINSTANCE.getActionContainer_HasActions(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actions With Messages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionsWithMessagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_actionsWithMessages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_actionsWithMessages_feature", "_UI_ActionContainer_type"),
				 WafPackage.eINSTANCE.getActionContainer_ActionsWithMessages(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Actions Messages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasActionsMessagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_hasActionsMessages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_hasActionsMessages_feature", "_UI_ActionContainer_type"),
				 WafPackage.eINSTANCE.getActionContainer_HasActionsMessages(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actions Without Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionsWithoutTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_actionsWithoutTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_actionsWithoutTarget_feature", "_UI_ActionContainer_type"),
				 WafPackage.eINSTANCE.getActionContainer_ActionsWithoutTarget(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Container Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_containerActions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_containerActions_feature", "_UI_ActionContainer_type"),
				 WafPackage.eINSTANCE.getActionContainer_ContainerActions(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Container Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasContainerActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_hasContainerActions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_hasContainerActions_feature", "_UI_ActionContainer_type"),
				 WafPackage.eINSTANCE.getActionContainer_HasContainerActions(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_fileActions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_fileActions_feature", "_UI_ActionContainer_type"),
				 WafPackage.eINSTANCE.getActionContainer_FileActions(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has File Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasFileActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_hasFileActions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_hasFileActions_feature", "_UI_ActionContainer_type"),
				 WafPackage.eINSTANCE.getActionContainer_HasFileActions(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_instanceActions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_instanceActions_feature", "_UI_ActionContainer_type"),
				 WafPackage.eINSTANCE.getActionContainer_InstanceActions(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Instance Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasInstanceActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_hasInstanceActions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_hasInstanceActions_feature", "_UI_ActionContainer_type"),
				 WafPackage.eINSTANCE.getActionContainer_HasInstanceActions(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operation Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_operationActions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_operationActions_feature", "_UI_ActionContainer_type"),
				 WafPackage.eINSTANCE.getActionContainer_OperationActions(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Operation Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasOperationActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_hasOperationActions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_hasOperationActions_feature", "_UI_ActionContainer_type"),
				 WafPackage.eINSTANCE.getActionContainer_HasOperationActions(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gen Model Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenModelRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_genModelRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_genModelRef_feature", "_UI_ActionContainer_type"),
				 WafPackage.eINSTANCE.getActionContainer_GenModelRef(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ui Model Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUiModelRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ActionContainer_uiModelRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ActionContainer_uiModelRef_feature", "_UI_ActionContainer_type"),
				 WafPackage.eINSTANCE.getActionContainer_UiModelRef(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_contentType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_contentType_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_ContentType(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Repository feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentRepositoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_contentRepository_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_contentRepository_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_ContentRepository(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Containing Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainingAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_containingAssociation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_containingAssociation_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_ContainingAssociation(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Containing Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainingTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_containingType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_containingType_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_ContainingType(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Contained feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsContainedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_isContained_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_isContained_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_IsContained(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Container Repository feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerRepositoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_containerRepository_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_containerRepository_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_ContainerRepository(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Explicitly Edited Container feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasExplicitlyEditedContainerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasExplicitlyEditedContainer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasExplicitlyEditedContainer_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasExplicitlyEditedContainer(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Repositories Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepositoriesUsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_repositoriesUsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_repositoriesUsed_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_RepositoriesUsed(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Services Used feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicesUsedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_servicesUsed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_servicesUsed_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_ServicesUsed(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has When Fields Empty Add Implicit Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasWhenFieldsEmptyAddImplicitFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasWhenFieldsEmptyAddImplicitFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasWhenFieldsEmptyAddImplicitFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasWhenFieldsEmptyAddImplicitFields(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Conditionally Displayed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsConditionallyDisplayedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_isConditionallyDisplayed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_isConditionallyDisplayed_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_IsConditionallyDisplayed(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message When Hidden feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageWhenHiddenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_messageWhenHidden_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_messageWhenHidden_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_MessageWhenHidden(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Hidden Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasHiddenMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasHiddenMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasHiddenMessage_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasHiddenMessage(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Header feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeaderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_header_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_header_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_Header(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_DynamicUnit_footer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_footer_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_Footer(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Association Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_associationFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_associationFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_AssociationFields(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Association Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAssociationFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasAssociationFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasAssociationFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasAssociationFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Autocomplete Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutocompleteFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_autocompleteFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_autocompleteFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_AutocompleteFields(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Autocomplete Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAutocompleteFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasAutocompleteFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasAutocompleteFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasAutocompleteFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Autocomplete Threshold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutocompleteThresholdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_autocompleteThreshold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_autocompleteThreshold_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_AutocompleteThreshold(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Boolean Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasBooleanFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasBooleanFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasBooleanFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasBooleanFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Captcha feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCaptchaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasCaptcha_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasCaptcha_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasCaptcha(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Changable Collections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasChangableCollectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasChangableCollections_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasChangableCollections_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasChangableCollections(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Collection Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_collectionFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_collectionFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_CollectionFields(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Collection Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_collectionFeatures_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_collectionFeatures_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_CollectionFeatures(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Type Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataTypeFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_dataTypeFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_dataTypeFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_DataTypeFields(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_dateFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_dateFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_DateFields(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValueFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_defaultValueFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_defaultValueFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_DefaultValueFields(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Default Value Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasDefaultValueFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasDefaultValueFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasDefaultValueFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasDefaultValueFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Disabled Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasDisabledFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasDisabledFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasDisabledFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasDisabledFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Email Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasEmailFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasEmailFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasEmailFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasEmailFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Encrypted Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncryptedFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_encryptedFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_encryptedFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_EncryptedFields(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Encrypted Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasEncryptedFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasEncryptedFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasEncryptedFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasEncryptedFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enumeration Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnumerationFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_enumerationFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_enumerationFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_EnumerationFields(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Enumeration Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasEnumerationFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasEnumerationFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasEnumerationFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasEnumerationFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Feature Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeatureFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_featureFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_featureFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_FeatureFields(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Feature Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasFeatureFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasFeatureFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasFeatureFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasFeatureFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Forced Value Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForcedValueFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_forcedValueFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_forcedValueFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_ForcedValueFields(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Forced Value Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasForcedValueFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasForcedValueFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasForcedValueFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasForcedValueFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Form Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_formFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_formFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_FormFields(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Integer Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasIntegerFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasIntegerFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasIntegerFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasIntegerFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_interfaceFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_interfaceFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_InterfaceFields(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Interface Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasInterfaceFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasInterfaceFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasInterfaceFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasInterfaceFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Required Interface Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasRequiredInterfaceFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasRequiredInterfaceFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasRequiredInterfaceFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasRequiredInterfaceFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Obfuscated Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasObfuscatedFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasObfuscatedFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasObfuscatedFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasObfuscatedFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Repeated Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasRepeatedFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasRepeatedFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasRepeatedFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasRepeatedFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Resource Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasResourceFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasResourceFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasResourceFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasResourceFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has String Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasStringFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasStringFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasStringFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasStringFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Textarea Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasTextareaFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasTextareaFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasTextareaFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasTextareaFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Url Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasUrlFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasUrlFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasUrlFields_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasUrlFields(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_localFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_localFieldListClass_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_LocalFieldListClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Definition Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalDefinitionFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_localDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_localDefinitionFieldListClass_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_LocalDefinitionFieldListClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
				 getString("_UI_DynamicUnit_localFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_localFieldLabelClass_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_LocalFieldLabelClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
				 getString("_UI_DynamicUnit_localFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_localFieldValueClass_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_LocalFieldValueClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_localControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_localControlClass_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_LocalControlClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_localAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_localAnchorClass_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_LocalAnchorClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Common Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommonFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_commonFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_commonFieldListClass_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_CommonFieldListClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Common Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCommonFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasCommonFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasCommonFieldListClass_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasCommonFieldListClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Common Definition Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommonDefinitionFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_commonDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_commonDefinitionFieldListClass_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_CommonDefinitionFieldListClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Common Definition Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCommonDefinitionFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasCommonDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasCommonDefinitionFieldListClass_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasCommonDefinitionFieldListClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Common Field Label Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommonFieldLabelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_commonFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_commonFieldLabelClass_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_CommonFieldLabelClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Common Field Label Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCommonFieldLabelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasCommonFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasCommonFieldLabelClass_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasCommonFieldLabelClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Common Field Value Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommonFieldValueClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_commonFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_commonFieldValueClass_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_CommonFieldValueClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Common Field Value Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCommonFieldValueClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasCommonFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasCommonFieldValueClass_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasCommonFieldValueClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Common Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommonAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_commonAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_commonAnchorClass_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_CommonAnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Common Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCommonAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DynamicUnit_hasCommonAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DynamicUnit_hasCommonAnchorClass_feature", "_UI_DynamicUnit_type"),
				 WafPackage.eINSTANCE.getDynamicUnit_HasCommonAnchorClass(),
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
			childrenFeatures.add(WafPackage.eINSTANCE.getActionContainer_AllActions());
			childrenFeatures.add(WafPackage.eINSTANCE.getDynamicUnit_RouteActuals());
			childrenFeatures.add(WafPackage.eINSTANCE.getDynamicUnit_DisplayFields());
			childrenFeatures.add(WafPackage.eINSTANCE.getDynamicUnit_HideWhen());
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
		String label = ((DynamicUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DynamicUnit_type") :
			getString("_UI_DynamicUnit_type") + " " + label;
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

		switch (notification.getFeatureID(DynamicUnit.class)) {
			case WafPackage.DYNAMIC_UNIT__CONTAINER_ACTIONS_PLACEMENT:
			case WafPackage.DYNAMIC_UNIT__INSTANCE_ACTIONS_PLACEMENT:
			case WafPackage.DYNAMIC_UNIT__HAS_ACTIONS:
			case WafPackage.DYNAMIC_UNIT__HAS_ACTIONS_MESSAGES:
			case WafPackage.DYNAMIC_UNIT__HAS_CONTAINER_ACTIONS:
			case WafPackage.DYNAMIC_UNIT__HAS_FILE_ACTIONS:
			case WafPackage.DYNAMIC_UNIT__HAS_INSTANCE_ACTIONS:
			case WafPackage.DYNAMIC_UNIT__HAS_OPERATION_ACTIONS:
			case WafPackage.DYNAMIC_UNIT__IS_CONTAINED:
			case WafPackage.DYNAMIC_UNIT__HAS_EXPLICITLY_EDITED_CONTAINER:
			case WafPackage.DYNAMIC_UNIT__HAS_WHEN_FIELDS_EMPTY_ADD_IMPLICIT_FIELDS:
			case WafPackage.DYNAMIC_UNIT__IS_CONDITIONALLY_DISPLAYED:
			case WafPackage.DYNAMIC_UNIT__MESSAGE_WHEN_HIDDEN:
			case WafPackage.DYNAMIC_UNIT__HAS_HIDDEN_MESSAGE:
			case WafPackage.DYNAMIC_UNIT__HEADER:
			case WafPackage.DYNAMIC_UNIT__FOOTER:
			case WafPackage.DYNAMIC_UNIT__HAS_ASSOCIATION_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HAS_AUTOCOMPLETE_FIELDS:
			case WafPackage.DYNAMIC_UNIT__AUTOCOMPLETE_THRESHOLD:
			case WafPackage.DYNAMIC_UNIT__HAS_BOOLEAN_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HAS_CAPTCHA:
			case WafPackage.DYNAMIC_UNIT__HAS_CHANGABLE_COLLECTIONS:
			case WafPackage.DYNAMIC_UNIT__HAS_DEFAULT_VALUE_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HAS_DISABLED_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HAS_EMAIL_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HAS_ENCRYPTED_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HAS_ENUMERATION_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HAS_FEATURE_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HAS_FORCED_VALUE_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HAS_INTEGER_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HAS_INTERFACE_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HAS_REQUIRED_INTERFACE_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HAS_OBFUSCATED_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HAS_REPEATED_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HAS_RESOURCE_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HAS_STRING_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HAS_TEXTAREA_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HAS_URL_FIELDS:
			case WafPackage.DYNAMIC_UNIT__LOCAL_FIELD_LIST_CLASS:
			case WafPackage.DYNAMIC_UNIT__LOCAL_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.DYNAMIC_UNIT__LOCAL_FIELD_LABEL_CLASS:
			case WafPackage.DYNAMIC_UNIT__LOCAL_FIELD_VALUE_CLASS:
			case WafPackage.DYNAMIC_UNIT__LOCAL_CONTROL_CLASS:
			case WafPackage.DYNAMIC_UNIT__LOCAL_ANCHOR_CLASS:
			case WafPackage.DYNAMIC_UNIT__COMMON_FIELD_LIST_CLASS:
			case WafPackage.DYNAMIC_UNIT__HAS_COMMON_FIELD_LIST_CLASS:
			case WafPackage.DYNAMIC_UNIT__COMMON_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.DYNAMIC_UNIT__HAS_COMMON_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.DYNAMIC_UNIT__COMMON_FIELD_LABEL_CLASS:
			case WafPackage.DYNAMIC_UNIT__HAS_COMMON_FIELD_LABEL_CLASS:
			case WafPackage.DYNAMIC_UNIT__COMMON_FIELD_VALUE_CLASS:
			case WafPackage.DYNAMIC_UNIT__HAS_COMMON_FIELD_VALUE_CLASS:
			case WafPackage.DYNAMIC_UNIT__COMMON_ANCHOR_CLASS:
			case WafPackage.DYNAMIC_UNIT__HAS_COMMON_ANCHOR_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.DYNAMIC_UNIT__ALL_ACTIONS:
			case WafPackage.DYNAMIC_UNIT__ROUTE_ACTUALS:
			case WafPackage.DYNAMIC_UNIT__DISPLAY_FIELDS:
			case WafPackage.DYNAMIC_UNIT__HIDE_WHEN:
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
				(WafPackage.eINSTANCE.getActionContainer_AllActions(),
				 WafFactory.eINSTANCE.createSecurityAction()));

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
				(WafPackage.eINSTANCE.getDynamicUnit_RouteActuals(),
				 WafFactory.eINSTANCE.createRouteActual()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getDynamicUnit_DisplayFields(),
				 WafFactory.eINSTANCE.createUnitAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getDynamicUnit_DisplayFields(),
				 WafFactory.eINSTANCE.createUnitAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getDynamicUnit_DisplayFields(),
				 WafFactory.eINSTANCE.createUnitLabel()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getDynamicUnit_DisplayFields(),
				 WafFactory.eINSTANCE.createDataTypeField()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getDynamicUnit_DisplayFields(),
				 WafFactory.eINSTANCE.createDateField()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getDynamicUnit_HideWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateBooleanVariable()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getDynamicUnit_HideWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateBooleanOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getDynamicUnit_HideWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateEqualityOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getDynamicUnit_HideWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateComparisonOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getDynamicUnit_HideWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateInOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getDynamicUnit_HideWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateLikeOperator()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getDynamicUnit_HideWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateIsEmpty()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.eINSTANCE.getDynamicUnit_HideWhen(),
				 ExpressionFactory.eINSTANCE.createPredicateIsNull()));
	}

}
