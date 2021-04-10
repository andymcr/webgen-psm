/**
 */
package work.andycarpenter.metamodel.orm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.metamodel.base.provider.NamedDisplayElementItemProvider;

import work.andycarpenter.metamodel.orm.Feature;
import work.andycarpenter.metamodel.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.orm.Feature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureItemProvider extends NamedDisplayElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureItemProvider(AdapterFactory adapterFactory) {
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
			addCardinalityPropertyDescriptor(object);
			addCollectionTypePropertyDescriptor(object);
			addIsPrimaryKeyPropertyDescriptor(object);
			addIsDerivedPropertyDescriptor(object);
			addCustomiseSetPropertyDescriptor(object);
			addSingletonNamePropertyDescriptor(object);
			addPluralisedNamePropertyDescriptor(object);
			addBooleanIsHasChoicePropertyDescriptor(object);
			addColumnNamePropertyDescriptor(object);
			addEncodeUriKeyPropertyDescriptor(object);
			addCollectionOrmAllowAddPropertyDescriptor(object);
			addCollectionOrmAllowRemovePropertyDescriptor(object);
			addSerializationGroupsPropertyDescriptor(object);
			addIsBooleanFeaturePropertyDescriptor(object);
			addIsDataTypeFeaturePropertyDescriptor(object);
			addDataTypePropertyDescriptor(object);
			addIsDateFeaturePropertyDescriptor(object);
			addDateDetailsPropertyDescriptor(object);
			addIsEmailFeaturePropertyDescriptor(object);
			addIsEnumerationFeaturePropertyDescriptor(object);
			addEnumerationTypePropertyDescriptor(object);
			addIsIntegerFeaturePropertyDescriptor(object);
			addIsLocationFeaturePropertyDescriptor(object);
			addIsObfuscatedFeaturePropertyDescriptor(object);
			addIsResourceFeaturePropertyDescriptor(object);
			addIsStringFeaturePropertyDescriptor(object);
			addIsTextareaFeaturePropertyDescriptor(object);
			addIsUrlFeaturePropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addHasDefaultValuePropertyDescriptor(object);
			addHasHtml5AttributesPropertyDescriptor(object);
			addHasColumnPropertyDescriptor(object);
			addIsOwningEndPropertyDescriptor(object);
			addHasSlugFieldsPropertyDescriptor(object);
			addHasValidationPatternPropertyDescriptor(object);
			addIsCaseInsensitivePropertyDescriptor(object);
			addIsContainerPropertyDescriptor(object);
			addIsContainerUniquePropertyDescriptor(object);
			addIsContainsPropertyDescriptor(object);
			addIsEncryptedPropertyDescriptor(object);
			addIsRequiredPropertyDescriptor(object);
			addIsSingletonPropertyDescriptor(object);
			addIsUniquePropertyDescriptor(object);
			addIsValidatedPropertyDescriptor(object);
			addIsVisiblePropertyDescriptor(object);
			addHasSerializationControlPropertyDescriptor(object);
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
				 getString("_UI_Feature_partOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_partOf_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__PART_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_cardinality_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_cardinality_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__CARDINALITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Collection Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_collectionType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_collectionType_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__COLLECTION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Primary Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPrimaryKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isPrimaryKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isPrimaryKey_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_PRIMARY_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Derived feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDerivedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isDerived_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isDerived_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_DERIVED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Customise Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomiseSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_customiseSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_customiseSet_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__CUSTOMISE_SET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_Feature_singletonName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_singletonName_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__SINGLETON_NAME,
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
				 getString("_UI_Feature_pluralisedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_pluralisedName_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__PLURALISED_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Boolean Is Has Choice feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBooleanIsHasChoicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_booleanIsHasChoice_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_booleanIsHasChoice_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__BOOLEAN_IS_HAS_CHOICE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Column Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_columnName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_columnName_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__COLUMN_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Encode Uri Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncodeUriKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_encodeUriKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_encodeUriKey_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__ENCODE_URI_KEY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Collection Orm Allow Add feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionOrmAllowAddPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_collectionOrmAllowAdd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_collectionOrmAllowAdd_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__COLLECTION_ORM_ALLOW_ADD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Collection Orm Allow Remove feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCollectionOrmAllowRemovePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_collectionOrmAllowRemove_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_collectionOrmAllowRemove_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__COLLECTION_ORM_ALLOW_REMOVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Serialization Groups feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSerializationGroupsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_serializationGroups_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_serializationGroups_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__SERIALIZATION_GROUPS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Boolean Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsBooleanFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isBooleanFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isBooleanFeature_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_BOOLEAN_FEATURE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Data Type Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDataTypeFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isDataTypeFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isDataTypeFeature_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_DATA_TYPE_FEATURE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_dataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_dataType_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__DATA_TYPE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Date Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDateFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isDateFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isDateFeature_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_DATE_FEATURE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Details feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateDetailsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_dateDetails_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_dateDetails_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__DATE_DETAILS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Email Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEmailFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isEmailFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isEmailFeature_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_EMAIL_FEATURE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Enumeration Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEnumerationFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isEnumerationFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isEnumerationFeature_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_ENUMERATION_FEATURE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enumeration Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnumerationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_enumerationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_enumerationType_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__ENUMERATION_TYPE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Integer Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsIntegerFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isIntegerFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isIntegerFeature_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_INTEGER_FEATURE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Location Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsLocationFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isLocationFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isLocationFeature_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_LOCATION_FEATURE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Obfuscated Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsObfuscatedFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isObfuscatedFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isObfuscatedFeature_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_OBFUSCATED_FEATURE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Resource Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsResourceFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isResourceFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isResourceFeature_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_RESOURCE_FEATURE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is String Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsStringFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isStringFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isStringFeature_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_STRING_FEATURE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Textarea Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsTextareaFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isTextareaFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isTextareaFeature_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_TEXTAREA_FEATURE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Url Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsUrlFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isUrlFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isUrlFeature_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_URL_FEATURE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_Feature_defaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_defaultValue_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__DEFAULT_VALUE,
				 false,
				 false,
				 false,
				 null,
				 null,
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
				 getString("_UI_Feature_hasDefaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_hasDefaultValue_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__HAS_DEFAULT_VALUE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Html5 Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasHtml5AttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_hasHtml5Attributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_hasHtml5Attributes_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__HAS_HTML5_ATTRIBUTES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Column feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasColumnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_hasColumn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_hasColumn_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__HAS_COLUMN,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Owning End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOwningEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isOwningEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isOwningEnd_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_OWNING_END,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Slug Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasSlugFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_hasSlugFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_hasSlugFields_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__HAS_SLUG_FIELDS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Validation Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasValidationPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_hasValidationPattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_hasValidationPattern_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__HAS_VALIDATION_PATTERN,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Case Insensitive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCaseInsensitivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isCaseInsensitive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isCaseInsensitive_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_CASE_INSENSITIVE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Container feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsContainerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isContainer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isContainer_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_CONTAINER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Container Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsContainerUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isContainerUnique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isContainerUnique_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_CONTAINER_UNIQUE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
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
				 getString("_UI_Feature_isContains_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isContains_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_CONTAINS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Encrypted feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEncryptedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isEncrypted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isEncrypted_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_ENCRYPTED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isRequired_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isRequired_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_REQUIRED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Singleton feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSingletonPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isSingleton_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isSingleton_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_SINGLETON,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isUnique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isUnique_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_UNIQUE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Validated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsValidatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isValidated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isValidated_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_VALIDATED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_isVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_isVisible_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__IS_VISIBLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Serialization Control feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasSerializationControlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_hasSerializationControl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_hasSerializationControl_feature", "_UI_Feature_type"),
				 OrmPackage.Literals.FEATURE__HAS_SERIALIZATION_CONTROL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Feature)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Feature_type") :
			getString("_UI_Feature_type") + " " + label;
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

		switch (notification.getFeatureID(Feature.class)) {
			case OrmPackage.FEATURE__CARDINALITY:
			case OrmPackage.FEATURE__COLLECTION_TYPE:
			case OrmPackage.FEATURE__IS_PRIMARY_KEY:
			case OrmPackage.FEATURE__IS_DERIVED:
			case OrmPackage.FEATURE__CUSTOMISE_SET:
			case OrmPackage.FEATURE__SINGLETON_NAME:
			case OrmPackage.FEATURE__PLURALISED_NAME:
			case OrmPackage.FEATURE__BOOLEAN_IS_HAS_CHOICE:
			case OrmPackage.FEATURE__COLUMN_NAME:
			case OrmPackage.FEATURE__ENCODE_URI_KEY:
			case OrmPackage.FEATURE__COLLECTION_ORM_ALLOW_ADD:
			case OrmPackage.FEATURE__COLLECTION_ORM_ALLOW_REMOVE:
			case OrmPackage.FEATURE__IS_BOOLEAN_FEATURE:
			case OrmPackage.FEATURE__IS_DATA_TYPE_FEATURE:
			case OrmPackage.FEATURE__IS_DATE_FEATURE:
			case OrmPackage.FEATURE__DATE_DETAILS:
			case OrmPackage.FEATURE__IS_EMAIL_FEATURE:
			case OrmPackage.FEATURE__IS_ENUMERATION_FEATURE:
			case OrmPackage.FEATURE__IS_INTEGER_FEATURE:
			case OrmPackage.FEATURE__IS_LOCATION_FEATURE:
			case OrmPackage.FEATURE__IS_OBFUSCATED_FEATURE:
			case OrmPackage.FEATURE__IS_RESOURCE_FEATURE:
			case OrmPackage.FEATURE__IS_STRING_FEATURE:
			case OrmPackage.FEATURE__IS_TEXTAREA_FEATURE:
			case OrmPackage.FEATURE__IS_URL_FEATURE:
			case OrmPackage.FEATURE__HAS_DEFAULT_VALUE:
			case OrmPackage.FEATURE__HAS_HTML5_ATTRIBUTES:
			case OrmPackage.FEATURE__HAS_COLUMN:
			case OrmPackage.FEATURE__IS_OWNING_END:
			case OrmPackage.FEATURE__HAS_SLUG_FIELDS:
			case OrmPackage.FEATURE__HAS_VALIDATION_PATTERN:
			case OrmPackage.FEATURE__IS_CASE_INSENSITIVE:
			case OrmPackage.FEATURE__IS_CONTAINER:
			case OrmPackage.FEATURE__IS_CONTAINER_UNIQUE:
			case OrmPackage.FEATURE__IS_CONTAINS:
			case OrmPackage.FEATURE__IS_ENCRYPTED:
			case OrmPackage.FEATURE__IS_REQUIRED:
			case OrmPackage.FEATURE__IS_SINGLETON:
			case OrmPackage.FEATURE__IS_UNIQUE:
			case OrmPackage.FEATURE__IS_VALIDATED:
			case OrmPackage.FEATURE__IS_VISIBLE:
			case OrmPackage.FEATURE__HAS_SERIALIZATION_CONTROL:
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
