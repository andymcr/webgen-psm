/**
 */
package work.andycarpenter.metamodel.orm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import work.andycarpenter.metamodel.base.BaseFactory;
import work.andycarpenter.metamodel.base.BasePackage;
import work.andycarpenter.metamodel.base.provider.NamedElementItemProvider;
import work.andycarpenter.metamodel.orm.OrmFactory;
import work.andycarpenter.metamodel.orm.OrmPackage;
import work.andycarpenter.metamodel.orm.Repository;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.metamodel.orm.Repository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RepositoryItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryItemProvider(AdapterFactory adapterFactory) {
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
			addServesPropertyDescriptor(object);
			addFindAllPropertyDescriptor(object);
			addFindOnePropertyDescriptor(object);
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
				 getString("_UI_Repository_partOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Repository_partOf_feature", "_UI_Repository_type"),
				 OrmPackage.Literals.REPOSITORY__PART_OF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Serves feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Repository_serves_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Repository_serves_feature", "_UI_Repository_type"),
				 OrmPackage.Literals.REPOSITORY__SERVES,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ModelPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Find All feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFindAllPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Repository_findAll_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Repository_findAll_feature", "_UI_Repository_type"),
				 OrmPackage.Literals.REPOSITORY__FIND_ALL,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_BusinessPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Find One feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFindOnePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Repository_findOne_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Repository_findOne_feature", "_UI_Repository_type"),
				 OrmPackage.Literals.REPOSITORY__FIND_ONE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_BusinessPropertyCategory"),
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
			childrenFeatures.add(BasePackage.Literals.CONSTANT_CONTAINER__CONSTANTS);
			childrenFeatures.add(OrmPackage.Literals.REPOSITORY__SELECTIONS);
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
	 * This returns Repository.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Repository"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Repository)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Repository_type") :
			getString("_UI_Repository_type") + " " + label;
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

		switch (notification.getFeatureID(Repository.class)) {
			case OrmPackage.REPOSITORY__CONSTANTS:
			case OrmPackage.REPOSITORY__SELECTIONS:
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
				(BasePackage.Literals.CONSTANT_CONTAINER__CONSTANTS,
				 BaseFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(OrmPackage.Literals.REPOSITORY__SELECTIONS,
				 OrmFactory.eINSTANCE.createSelection()));
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
