/**
 */
package work.andycarpenter.psms.orm.provider;


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

import work.andycarpenter.psms.base.provider.ClassifierItemProvider;

import work.andycarpenter.psms.orm.Entity;
import work.andycarpenter.psms.orm.OrmFactory;
import work.andycarpenter.psms.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.psms.orm.Entity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityItemProvider extends ClassifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityItemProvider(AdapterFactory adapterFactory) {
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

			addPartOfPropertyDescriptor(object);
			addSingletonNamePropertyDescriptor(object);
			addPluralisedNamePropertyDescriptor(object);
			addRepositoryPropertyDescriptor(object);
			addKeysPropertyDescriptor(object);
			addFeaturesPropertyDescriptor(object);
			addPrimaryKeysPropertyDescriptor(object);
			addHasPrimaryKeysPropertyDescriptor(object);
			addFeaturesWithDefaultValuePropertyDescriptor(object);
			addHasFeaturesWithDefaultValuePropertyDescriptor(object);
			addAttributesPropertyDescriptor(object);
			addHasAttributesPropertyDescriptor(object);
			addAttributeKeysPropertyDescriptor(object);
			addHasAttributeKeysPropertyDescriptor(object);
			addResourceFeaturesPropertyDescriptor(object);
			addHasResourceAttributesPropertyDescriptor(object);
			addUniqueAttributesPropertyDescriptor(object);
			addHasUniqueAttributesPropertyDescriptor(object);
			addContainerUniqueAttributesPropertyDescriptor(object);
			addAssociationsPropertyDescriptor(object);
			addHasAssociationsPropertyDescriptor(object);
			addAssociationKeysPropertyDescriptor(object);
			addHasAssociationKeysPropertyDescriptor(object);
			addContainingAssociationPropertyDescriptor(object);
			addContainingTypePropertyDescriptor(object);
			addIsContainedPropertyDescriptor(object);
			addCollectionAssociationsPropertyDescriptor(object);
			addHasCollectionAssociationsPropertyDescriptor(object);
			addSlugAttributesPropertyDescriptor(object);
			addHasSlugAttributesPropertyDescriptor(object);
			addValidatedFeaturesPropertyDescriptor(object);
			addHasValidatedFeaturesPropertyDescriptor(object);
			addTableColumnsPropertyDescriptor(object);
			addTableNamePropertyDescriptor(object);
			addAutoKeyNamePropertyDescriptor(object);
			addAutoKeyPersistentTypePropertyDescriptor(object);
			addAutoKeyGenerationStrategyPropertyDescriptor(object);
			addUniquePropertyDescriptor(object);
			addContainerUniquePropertyDescriptor(object);
			addHasDefaultLabelPropertyDescriptor(object);
			addImplementsUserInterfacePropertyDescriptor(object);
			addImplementsForumUserPropertyDescriptor(object);
			addImplementsResetPasswordInterfacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Part Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPartOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_partOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_partOf_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__PART_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Singleton Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSingletonNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_singletonName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_singletonName_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__SINGLETON_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pluralised Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPluralisedNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_pluralisedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_pluralisedName_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__PLURALISED_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Repository feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepositoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_repository_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_repository_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__REPOSITORY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Keys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_keys_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_keys_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__KEYS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_features_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_features_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__FEATURES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary Keys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryKeysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_primaryKeys_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_primaryKeys_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__PRIMARY_KEYS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Primary Keys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasPrimaryKeysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_hasPrimaryKeys_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_hasPrimaryKeys_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__HAS_PRIMARY_KEYS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Features With Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturesWithDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_featuresWithDefaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_featuresWithDefaultValue_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__FEATURES_WITH_DEFAULT_VALUE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Features With Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasFeaturesWithDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_hasFeaturesWithDefaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_hasFeaturesWithDefaultValue_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__HAS_FEATURES_WITH_DEFAULT_VALUE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_attributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_attributes_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__ATTRIBUTES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_hasAttributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_hasAttributes_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__HAS_ATTRIBUTES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attribute Keys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributeKeysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_attributeKeys_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_attributeKeys_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__ATTRIBUTE_KEYS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Attribute Keys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAttributeKeysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_hasAttributeKeys_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_hasAttributeKeys_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__HAS_ATTRIBUTE_KEYS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_resourceFeatures_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_resourceFeatures_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__RESOURCE_FEATURES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Resource Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasResourceAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_hasResourceAttributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_hasResourceAttributes_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__HAS_RESOURCE_ATTRIBUTES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unique Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUniqueAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_uniqueAttributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_uniqueAttributes_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__UNIQUE_ATTRIBUTES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Unique Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasUniqueAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_hasUniqueAttributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_hasUniqueAttributes_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__HAS_UNIQUE_ATTRIBUTES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Container Unique Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerUniqueAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_containerUniqueAttributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_containerUniqueAttributes_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__CONTAINER_UNIQUE_ATTRIBUTES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Associations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_associations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_associations_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__ASSOCIATIONS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Associations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAssociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_hasAssociations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_hasAssociations_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__HAS_ASSOCIATIONS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Association Keys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationKeysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_associationKeys_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_associationKeys_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__ASSOCIATION_KEYS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Association Keys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAssociationKeysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_hasAssociationKeys_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_hasAssociationKeys_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__HAS_ASSOCIATION_KEYS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_Entity_containingAssociation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_containingAssociation_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__CONTAINING_ASSOCIATION,
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
				 getString("_UI_Entity_containingType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_containingType_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__CONTAINING_TYPE,
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
				 getString("_UI_Entity_isContained_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_isContained_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__IS_CONTAINED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Collection Associations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionAssociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_collectionAssociations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_collectionAssociations_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__COLLECTION_ASSOCIATIONS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Collection Associations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCollectionAssociationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_hasCollectionAssociations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_hasCollectionAssociations_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__HAS_COLLECTION_ASSOCIATIONS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slug Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlugAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_slugAttributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_slugAttributes_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__SLUG_ATTRIBUTES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Slug Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasSlugAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_hasSlugAttributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_hasSlugAttributes_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__HAS_SLUG_ATTRIBUTES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Validated Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidatedFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_validatedFeatures_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_validatedFeatures_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__VALIDATED_FEATURES,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Validated Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasValidatedFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_hasValidatedFeatures_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_hasValidatedFeatures_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__HAS_VALIDATED_FEATURES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Table Columns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTableColumnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_tableColumns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_tableColumns_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__TABLE_COLUMNS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Table Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTableNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_tableName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_tableName_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__TABLE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Key Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoKeyNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_autoKeyName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_autoKeyName_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__AUTO_KEY_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Key Persistent Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoKeyPersistentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_autoKeyPersistentType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_autoKeyPersistentType_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__AUTO_KEY_PERSISTENT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Key Generation Strategy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoKeyGenerationStrategyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_autoKeyGenerationStrategy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_autoKeyGenerationStrategy_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__AUTO_KEY_GENERATION_STRATEGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_unique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_unique_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__UNIQUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Container Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_containerUnique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_containerUnique_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__CONTAINER_UNIQUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Default Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasDefaultLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_hasDefaultLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_hasDefaultLabel_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__HAS_DEFAULT_LABEL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Implements User Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementsUserInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_implementsUserInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_implementsUserInterface_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__IMPLEMENTS_USER_INTERFACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Implements Forum User feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementsForumUserPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_implementsForumUser_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_implementsForumUser_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__IMPLEMENTS_FORUM_USER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Implements Reset Password Interface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementsResetPasswordInterfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_implementsResetPasswordInterface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_implementsResetPasswordInterface_feature", "_UI_Entity_type"),
				 OrmPackage.Literals.ENTITY__IMPLEMENTS_RESET_PASSWORD_INTERFACE,
				 true,
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
			childrenFeatures.add(OrmPackage.Literals.ENTITY__ALL_FEATURES);
			childrenFeatures.add(OrmPackage.Literals.ENTITY__LABELS);
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
	 * This returns Entity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Entity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Entity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Entity_type") :
			getString("_UI_Entity_type") + " " + label;
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

		switch (notification.getFeatureID(Entity.class)) {
			case OrmPackage.ENTITY__SINGLETON_NAME:
			case OrmPackage.ENTITY__PLURALISED_NAME:
			case OrmPackage.ENTITY__HAS_PRIMARY_KEYS:
			case OrmPackage.ENTITY__HAS_FEATURES_WITH_DEFAULT_VALUE:
			case OrmPackage.ENTITY__HAS_ATTRIBUTES:
			case OrmPackage.ENTITY__HAS_ATTRIBUTE_KEYS:
			case OrmPackage.ENTITY__HAS_RESOURCE_ATTRIBUTES:
			case OrmPackage.ENTITY__HAS_UNIQUE_ATTRIBUTES:
			case OrmPackage.ENTITY__HAS_ASSOCIATIONS:
			case OrmPackage.ENTITY__HAS_ASSOCIATION_KEYS:
			case OrmPackage.ENTITY__IS_CONTAINED:
			case OrmPackage.ENTITY__HAS_COLLECTION_ASSOCIATIONS:
			case OrmPackage.ENTITY__HAS_SLUG_ATTRIBUTES:
			case OrmPackage.ENTITY__HAS_VALIDATED_FEATURES:
			case OrmPackage.ENTITY__TABLE_NAME:
			case OrmPackage.ENTITY__AUTO_KEY_NAME:
			case OrmPackage.ENTITY__AUTO_KEY_PERSISTENT_TYPE:
			case OrmPackage.ENTITY__AUTO_KEY_GENERATION_STRATEGY:
			case OrmPackage.ENTITY__HAS_DEFAULT_LABEL:
			case OrmPackage.ENTITY__IMPLEMENTS_USER_INTERFACE:
			case OrmPackage.ENTITY__IMPLEMENTS_FORUM_USER:
			case OrmPackage.ENTITY__IMPLEMENTS_RESET_PASSWORD_INTERFACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.ENTITY__ALL_FEATURES:
			case OrmPackage.ENTITY__LABELS:
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
				(OrmPackage.Literals.ENTITY__ALL_FEATURES,
				 OrmFactory.eINSTANCE.createDataTypeAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY__ALL_FEATURES,
				 OrmFactory.eINSTANCE.createDateAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY__ALL_FEATURES,
				 OrmFactory.eINSTANCE.createFileResource()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY__ALL_FEATURES,
				 OrmFactory.eINSTANCE.createImageResource()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY__ALL_FEATURES,
				 OrmFactory.eINSTANCE.createLocationFeature()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY__ALL_FEATURES,
				 OrmFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY__ALL_FEATURES,
				 OrmFactory.eINSTANCE.createSingletonAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ENTITY__LABELS,
				 OrmFactory.eINSTANCE.createModelLabel()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OrmEditPlugin.INSTANCE;
	}

}
