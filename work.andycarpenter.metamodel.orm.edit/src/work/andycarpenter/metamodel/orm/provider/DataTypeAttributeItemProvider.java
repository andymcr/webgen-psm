/**
 */
package work.andycarpenter.metamodel.orm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.metamodel.orm.DataTypeAttribute;
import work.andycarpenter.metamodel.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.orm.DataTypeAttribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypeAttributeItemProvider extends AttributeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeAttributeItemProvider(AdapterFactory adapterFactory) {
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

			addAttributeDataTypePropertyDescriptor(object);
			addObfuscateFormFieldsPropertyDescriptor(object);
			addCaseInsensitivePropertyDescriptor(object);
			addEncryptPropertyDescriptor(object);
			addUniquePropertyDescriptor(object);
			addContainerUniquePropertyDescriptor(object);
			addValidationPatternPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Attribute Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributeDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataTypeAttribute_attributeDataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataTypeAttribute_attributeDataType_feature", "_UI_DataTypeAttribute_type"),
				 OrmPackage.Literals.DATA_TYPE_ATTRIBUTE__ATTRIBUTE_DATA_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Obfuscate Form Fields feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObfuscateFormFieldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataTypeAttribute_obfuscateFormFields_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataTypeAttribute_obfuscateFormFields_feature", "_UI_DataTypeAttribute_type"),
				 OrmPackage.Literals.DATA_TYPE_ATTRIBUTE__OBFUSCATE_FORM_FIELDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Case Insensitive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCaseInsensitivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataTypeAttribute_caseInsensitive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataTypeAttribute_caseInsensitive_feature", "_UI_DataTypeAttribute_type"),
				 OrmPackage.Literals.DATA_TYPE_ATTRIBUTE__CASE_INSENSITIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Encrypt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncryptPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataTypeAttribute_encrypt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataTypeAttribute_encrypt_feature", "_UI_DataTypeAttribute_type"),
				 OrmPackage.Literals.DATA_TYPE_ATTRIBUTE__ENCRYPT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_DataTypeAttribute_unique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataTypeAttribute_unique_feature", "_UI_DataTypeAttribute_type"),
				 OrmPackage.Literals.DATA_TYPE_ATTRIBUTE__UNIQUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_DataTypeAttribute_containerUnique_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataTypeAttribute_containerUnique_feature", "_UI_DataTypeAttribute_type"),
				 OrmPackage.Literals.DATA_TYPE_ATTRIBUTE__CONTAINER_UNIQUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_DataTypeAttribute_validationPattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataTypeAttribute_validationPattern_feature", "_UI_DataTypeAttribute_type"),
				 OrmPackage.Literals.DATA_TYPE_ATTRIBUTE__VALIDATION_PATTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DataTypeAttribute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataTypeAttribute"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataTypeAttribute)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataTypeAttribute_type") :
			getString("_UI_DataTypeAttribute_type") + " " + label;
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

		switch (notification.getFeatureID(DataTypeAttribute.class)) {
			case OrmPackage.DATA_TYPE_ATTRIBUTE__OBFUSCATE_FORM_FIELDS:
			case OrmPackage.DATA_TYPE_ATTRIBUTE__CASE_INSENSITIVE:
			case OrmPackage.DATA_TYPE_ATTRIBUTE__ENCRYPT:
			case OrmPackage.DATA_TYPE_ATTRIBUTE__UNIQUE:
			case OrmPackage.DATA_TYPE_ATTRIBUTE__CONTAINER_UNIQUE:
			case OrmPackage.DATA_TYPE_ATTRIBUTE__VALIDATION_PATTERN:
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
