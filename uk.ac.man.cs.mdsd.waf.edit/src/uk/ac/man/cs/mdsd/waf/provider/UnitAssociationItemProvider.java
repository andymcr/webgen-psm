/**
 */
package uk.ac.man.cs.mdsd.waf.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import uk.ac.man.cs.mdsd.waf.UnitAssociation;
import uk.ac.man.cs.mdsd.waf.WafFactory;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link uk.ac.man.cs.mdsd.waf.UnitAssociation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitAssociationItemProvider
  extends UnitFeatureItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UnitAssociationItemProvider(AdapterFactory adapterFactory)
  {
		super(adapterFactory);
	}

  /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAssociationPropertyDescriptor(object);
			addServiceFeaturePropertyDescriptor(object);
			addSelectionPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addFiltersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IncludedAssociation_association_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IncludedAssociation_association_feature", "_UI_IncludedAssociation_type"),
				 WafPackage.Literals.INCLUDED_ASSOCIATION__ASSOCIATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Service Feature feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addServiceFeaturePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitAssociation_serviceFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_serviceFeature_feature", "_UI_UnitAssociation_type"),
				 WafPackage.Literals.UNIT_ASSOCIATION__SERVICE_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Selection feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addSelectionPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitAssociation_selection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_selection_feature", "_UI_UnitAssociation_type"),
				 WafPackage.Literals.UNIT_ASSOCIATION__SELECTION,
				 true,
				 false,
				 true,
				 null,
				 null,
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
				 getString("_UI_UnitAssociation_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_label_feature", "_UI_UnitAssociation_type"),
				 WafPackage.Literals.UNIT_ASSOCIATION__LABEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Filters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFiltersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnitAssociation_filters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnitAssociation_filters_feature", "_UI_UnitAssociation_type"),
				 WafPackage.Literals.UNIT_ASSOCIATION__FILTERS,
				 true,
				 false,
				 true,
				 null,
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
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WafPackage.Literals.UNIT_CONTAINER__UNITS);
			childrenFeatures.add(WafPackage.Literals.UNIT_ASSOCIATION__CHILD_FEATURE);
		}
		return childrenFeatures;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

  /**
	 * This returns UnitAssociation.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnitAssociation"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object)
  {
		String label = ((UnitAssociation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UnitAssociation_type") :
			getString("_UI_UnitAssociation_type") + " " + label;
	}

  /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void notifyChanged(Notification notification)
  {
		updateChildren(notification);

		switch (notification.getFeatureID(UnitAssociation.class)) {
			case WafPackage.UNIT_ASSOCIATION__UNITS:
			case WafPackage.UNIT_ASSOCIATION__CHILD_FEATURE:
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
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.UNIT_CONTAINER__UNITS,
				 WafFactory.eINSTANCE.createStaticUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.UNIT_CONTAINER__UNITS,
				 WafFactory.eINSTANCE.createCommandUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.UNIT_CONTAINER__UNITS,
				 WafFactory.eINSTANCE.createCreateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.UNIT_CONTAINER__UNITS,
				 WafFactory.eINSTANCE.createCreateUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.UNIT_CONTAINER__UNITS,
				 WafFactory.eINSTANCE.createMapUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.UNIT_CONTAINER__UNITS,
				 WafFactory.eINSTANCE.createUpdateUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.UNIT_CONTAINER__UNITS,
				 WafFactory.eINSTANCE.createDetailsUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.UNIT_CONTAINER__UNITS,
				 WafFactory.eINSTANCE.createIndexGridUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.UNIT_CONTAINER__UNITS,
				 WafFactory.eINSTANCE.createIndexPageDirectionUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.UNIT_CONTAINER__UNITS,
				 WafFactory.eINSTANCE.createIndexLineDirectionUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.UNIT_CONTAINER__UNITS,
				 WafFactory.eINSTANCE.createSearchUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.UNIT_CONTAINER__UNITS,
				 WafFactory.eINSTANCE.createActionUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.UNIT_CONTAINER__UNITS,
				 WafFactory.eINSTANCE.createRegistrationUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.UNIT_CONTAINER__UNITS,
				 WafFactory.eINSTANCE.createLoginUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.UNIT_CONTAINER__UNITS,
				 WafFactory.eINSTANCE.createForgottenPasswordUnit()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.UNIT_ASSOCIATION__CHILD_FEATURE,
				 WafFactory.eINSTANCE.createUnitChildElement()));

		newChildDescriptors.add
			(createChildParameter
				(WafPackage.Literals.UNIT_ASSOCIATION__CHILD_FEATURE,
				 WafFactory.eINSTANCE.createUnitChildAssociation()));
	}

}
