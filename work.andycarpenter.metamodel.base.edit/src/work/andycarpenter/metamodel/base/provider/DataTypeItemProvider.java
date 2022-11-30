/**
 */
package work.andycarpenter.metamodel.base.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import work.andycarpenter.metamodel.base.BasePackage;
import work.andycarpenter.metamodel.base.DataType;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.base.DataType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypeItemProvider extends ClassifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeItemProvider(AdapterFactory adapterFactory) {
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

			addPersistentTypePropertyDescriptor(object);
			addOrmTypePropertyDescriptor(object);
			addWafTypePropertyDescriptor(object);
			addInterfaceTypePropertyDescriptor(object);
			addValidationPatternPropertyDescriptor(object);
			addIsBooleanDataTypePropertyDescriptor(object);
			addIsEmailDataTypePropertyDescriptor(object);
			addIsEnumerationTypePropertyDescriptor(object);
			addIsFloatDataTypePropertyDescriptor(object);
			addIsIntegerDataTypePropertyDescriptor(object);
			addIsStringDataTypePropertyDescriptor(object);
			addIsTextareaDataTypePropertyDescriptor(object);
			addIsUrlDataTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Persistent Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersistentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataType_persistentType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataType_persistentType_feature", "_UI_DataType_type"),
				 BasePackage.Literals.DATA_TYPE__PERSISTENT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Orm Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrmTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataType_ormType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataType_ormType_feature", "_UI_DataType_type"),
				 BasePackage.Literals.DATA_TYPE__ORM_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Waf Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWafTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataType_wafType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataType_wafType_feature", "_UI_DataType_type"),
				 BasePackage.Literals.DATA_TYPE__WAF_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_DataType_interfaceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataType_interfaceType_feature", "_UI_DataType_type"),
				 BasePackage.Literals.DATA_TYPE__INTERFACE_TYPE,
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
				 getString("_UI_DataType_validationPattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataType_validationPattern_feature", "_UI_DataType_type"),
				 BasePackage.Literals.DATA_TYPE__VALIDATION_PATTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Boolean Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsBooleanDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataType_isBooleanDataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataType_isBooleanDataType_feature", "_UI_DataType_type"),
				 BasePackage.Literals.DATA_TYPE__IS_BOOLEAN_DATA_TYPE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Email Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEmailDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataType_isEmailDataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataType_isEmailDataType_feature", "_UI_DataType_type"),
				 BasePackage.Literals.DATA_TYPE__IS_EMAIL_DATA_TYPE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Enumeration Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEnumerationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataType_isEnumerationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataType_isEnumerationType_feature", "_UI_DataType_type"),
				 BasePackage.Literals.DATA_TYPE__IS_ENUMERATION_TYPE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Float Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsFloatDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataType_isFloatDataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataType_isFloatDataType_feature", "_UI_DataType_type"),
				 BasePackage.Literals.DATA_TYPE__IS_FLOAT_DATA_TYPE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Integer Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsIntegerDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataType_isIntegerDataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataType_isIntegerDataType_feature", "_UI_DataType_type"),
				 BasePackage.Literals.DATA_TYPE__IS_INTEGER_DATA_TYPE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Is String Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsStringDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataType_isStringDataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataType_isStringDataType_feature", "_UI_DataType_type"),
				 BasePackage.Literals.DATA_TYPE__IS_STRING_DATA_TYPE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Textarea Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsTextareaDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataType_isTextareaDataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataType_isTextareaDataType_feature", "_UI_DataType_type"),
				 BasePackage.Literals.DATA_TYPE__IS_TEXTAREA_DATA_TYPE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Url Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsUrlDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataType_isUrlDataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataType_isUrlDataType_feature", "_UI_DataType_type"),
				 BasePackage.Literals.DATA_TYPE__IS_URL_DATA_TYPE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_DebugPropertyCategory"),
				 null));
	}

	/**
	 * This returns DataType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataType_type") :
			getString("_UI_DataType_type") + " " + label;
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

		switch (notification.getFeatureID(DataType.class)) {
			case BasePackage.DATA_TYPE__PERSISTENT_TYPE:
			case BasePackage.DATA_TYPE__ORM_TYPE:
			case BasePackage.DATA_TYPE__WAF_TYPE:
			case BasePackage.DATA_TYPE__INTERFACE_TYPE:
			case BasePackage.DATA_TYPE__VALIDATION_PATTERN:
			case BasePackage.DATA_TYPE__IS_BOOLEAN_DATA_TYPE:
			case BasePackage.DATA_TYPE__IS_EMAIL_DATA_TYPE:
			case BasePackage.DATA_TYPE__IS_ENUMERATION_TYPE:
			case BasePackage.DATA_TYPE__IS_FLOAT_DATA_TYPE:
			case BasePackage.DATA_TYPE__IS_INTEGER_DATA_TYPE:
			case BasePackage.DATA_TYPE__IS_STRING_DATA_TYPE:
			case BasePackage.DATA_TYPE__IS_TEXTAREA_DATA_TYPE:
			case BasePackage.DATA_TYPE__IS_URL_DATA_TYPE:
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
