/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmModelItemProvider.java,v 1.5 2013/06/08 06:31:38 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import uk.ac.man.cs.mdsd.orm.DatabaseTechnologies;
import uk.ac.man.cs.mdsd.orm.OrmFactory;
import uk.ac.man.cs.mdsd.orm.OrmModel;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.orm.OrmModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrmModelItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmModelItemProvider(AdapterFactory adapterFactory) {
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

			addDatabaseTechnologyPropertyDescriptor(object);
			addOrmTechnologyPropertyDescriptor(object);
			addTimestampCreationPropertyDescriptor(object);
			addTimestampUpdatesPropertyDescriptor(object);
			addHasCustomOrmTypesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Database Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatabaseTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrmModel_databaseTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrmModel_databaseTechnology_feature", "_UI_OrmModel_type"),
				 OrmPackage.Literals.ORM_MODEL__DATABASE_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Orm Technology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrmTechnologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrmModel_ormTechnology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrmModel_ormTechnology_feature", "_UI_OrmModel_type"),
				 OrmPackage.Literals.ORM_MODEL__ORM_TECHNOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timestamp Creation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimestampCreationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrmModel_timestampCreation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrmModel_timestampCreation_feature", "_UI_OrmModel_type"),
				 OrmPackage.Literals.ORM_MODEL__TIMESTAMP_CREATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timestamp Updates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimestampUpdatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrmModel_timestampUpdates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrmModel_timestampUpdates_feature", "_UI_OrmModel_type"),
				 OrmPackage.Literals.ORM_MODEL__TIMESTAMP_UPDATES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Custom Orm Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCustomOrmTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrmModel_hasCustomOrmTypes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrmModel_hasCustomOrmTypes_feature", "_UI_OrmModel_type"),
				 OrmPackage.Literals.ORM_MODEL__HAS_CUSTOM_ORM_TYPES,
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
			childrenFeatures.add(OrmPackage.Literals.ORM_MODEL__SERIALIZATION_GROUPS);
			childrenFeatures.add(OrmPackage.Literals.ORM_MODEL__DATA_TYPES);
			childrenFeatures.add(OrmPackage.Literals.ORM_MODEL__ENTITIES_AND_VIEWS);
			childrenFeatures.add(OrmPackage.Literals.ORM_MODEL__COLLECTION_TYPES);
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
	 * This returns OrmModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OrmModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		DatabaseTechnologies labelValue = ((OrmModel)object).getDatabaseTechnology();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_OrmModel_type") :
			getString("_UI_OrmModel_type") + " " + label;
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

		switch (notification.getFeatureID(OrmModel.class)) {
			case OrmPackage.ORM_MODEL__DATABASE_TECHNOLOGY:
			case OrmPackage.ORM_MODEL__ORM_TECHNOLOGY:
			case OrmPackage.ORM_MODEL__TIMESTAMP_CREATION:
			case OrmPackage.ORM_MODEL__TIMESTAMP_UPDATES:
			case OrmPackage.ORM_MODEL__HAS_CUSTOM_ORM_TYPES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OrmPackage.ORM_MODEL__SERIALIZATION_GROUPS:
			case OrmPackage.ORM_MODEL__DATA_TYPES:
			case OrmPackage.ORM_MODEL__ENTITIES_AND_VIEWS:
			case OrmPackage.ORM_MODEL__COLLECTION_TYPES:
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
				(OrmPackage.Literals.ORM_MODEL__SERIALIZATION_GROUPS,
				 OrmFactory.eINSTANCE.createSerializationGroup()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ORM_MODEL__DATA_TYPES,
				 OrmFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ORM_MODEL__DATA_TYPES,
				 OrmFactory.eINSTANCE.createEnumerationType()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ORM_MODEL__ENTITIES_AND_VIEWS,
				 OrmFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ORM_MODEL__ENTITIES_AND_VIEWS,
				 OrmFactory.eINSTANCE.createView()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.ORM_MODEL__COLLECTION_TYPES,
				 OrmFactory.eINSTANCE.createCollectionType()));
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
