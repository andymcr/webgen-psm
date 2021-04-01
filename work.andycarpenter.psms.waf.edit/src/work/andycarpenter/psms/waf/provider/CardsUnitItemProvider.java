/**
 */
package work.andycarpenter.psms.waf.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import work.andycarpenter.psms.waf.CardsUnit;
import work.andycarpenter.psms.waf.WafFactory;
import work.andycarpenter.psms.waf.WafPackage;

/**
 * This is the item provider adapter for a {@link work.andycarpenter.psms.waf.CardsUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CardsUnitItemProvider extends CollectionUnitItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardsUnitItemProvider(AdapterFactory adapterFactory) {
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

			addOverlaySingleSelectActionPropertyDescriptor(object);
			addContentClassPropertyDescriptor(object);
			addHasContentClassPropertyDescriptor(object);
			addCardsFieldListClassPropertyDescriptor(object);
			addCardsDefinitionFieldListClassPropertyDescriptor(object);
			addCardsFieldLabelClassPropertyDescriptor(object);
			addCardsFieldValueClassPropertyDescriptor(object);
			addLocalRowClassPropertyDescriptor(object);
			addRowClassPropertyDescriptor(object);
			addHasRowClassPropertyDescriptor(object);
			addLocalColumnClassPropertyDescriptor(object);
			addColumnClassPropertyDescriptor(object);
			addHasColumnClassPropertyDescriptor(object);
			addLocalCardClassPropertyDescriptor(object);
			addCardClassPropertyDescriptor(object);
			addHasCardClassPropertyDescriptor(object);
			addLocalCardHeaderClassPropertyDescriptor(object);
			addCardHeaderClassPropertyDescriptor(object);
			addHasCardHeaderClassPropertyDescriptor(object);
			addLocalCardBodyClassPropertyDescriptor(object);
			addCardBodyClassPropertyDescriptor(object);
			addHasCardBodyClassPropertyDescriptor(object);
			addLocalCardFooterClassPropertyDescriptor(object);
			addCardFooterClassPropertyDescriptor(object);
			addHasCardFooterClassPropertyDescriptor(object);
			addCardsControlClassPropertyDescriptor(object);
			addCardsInstanceControlClassPropertyDescriptor(object);
			addCardsAnchorClassPropertyDescriptor(object);
			addCardsInstanceAnchorClassPropertyDescriptor(object);
			addLocalBadgeClassPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Overlay Single Select Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverlaySingleSelectActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_overlaySingleSelectAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_overlaySingleSelectAction_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_OverlaySingleSelectAction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Row Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRowClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_rowClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_rowClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_RowClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Row Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasRowClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_hasRowClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasRowClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasRowClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Column Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalColumnClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_localColumnClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_localColumnClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_LocalColumnClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Column Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_columnClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_columnClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_ColumnClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Column Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasColumnClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_hasColumnClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasColumnClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasColumnClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Card Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalCardClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_localCardClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_localCardClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_LocalCardClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Card Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_cardClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_cardClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_CardClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Card Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCardClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_hasCardClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasCardClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasCardClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Card Header Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalCardHeaderClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_localCardHeaderClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_localCardHeaderClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_LocalCardHeaderClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Card Header Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardHeaderClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_cardHeaderClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_cardHeaderClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_CardHeaderClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Card Header Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCardHeaderClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_hasCardHeaderClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasCardHeaderClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasCardHeaderClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Card Body Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalCardBodyClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_localCardBodyClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_localCardBodyClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_LocalCardBodyClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Card Body Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardBodyClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_cardBodyClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_cardBodyClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_CardBodyClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Card Body Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCardBodyClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_hasCardBodyClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasCardBodyClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasCardBodyClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Card Footer Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalCardFooterClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_localCardFooterClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_localCardFooterClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_LocalCardFooterClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Card Footer Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardFooterClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_cardFooterClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_cardFooterClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_CardFooterClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Card Footer Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasCardFooterClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_hasCardFooterClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasCardFooterClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasCardFooterClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Badge Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalBadgeClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_localBadgeClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_localBadgeClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_LocalBadgeClass(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cards Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardsControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_cardsControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_cardsControlClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_CardsControlClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cards Instance Control Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardsInstanceControlClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_cardsInstanceControlClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_cardsInstanceControlClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_CardsInstanceControlClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cards Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardsAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_cardsAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_cardsAnchorClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_CardsAnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cards Instance Anchor Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardsInstanceAnchorClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_cardsInstanceAnchorClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_cardsInstanceAnchorClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_CardsInstanceAnchorClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_contentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_contentClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_ContentClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Has Content Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasContentClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_hasContentClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_hasContentClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_HasContentClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cards Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardsFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_cardsFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_cardsFieldListClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_CardsFieldListClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cards Definition Field List Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardsDefinitionFieldListClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_cardsDefinitionFieldListClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_cardsDefinitionFieldListClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_CardsDefinitionFieldListClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cards Field Label Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardsFieldLabelClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_cardsFieldLabelClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_cardsFieldLabelClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_CardsFieldLabelClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cards Field Value Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardsFieldValueClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_cardsFieldValueClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_cardsFieldValueClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_CardsFieldValueClass(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Row Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalRowClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CardsUnit_localRowClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CardsUnit_localRowClass_feature", "_UI_CardsUnit_type"),
				 WafPackage.eINSTANCE.getCardsUnit_LocalRowClass(),
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
			childrenFeatures.add(WafPackage.eINSTANCE.getCardsUnit_Badges());
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
		String label = ((CardsUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CardsUnit_type") :
			getString("_UI_CardsUnit_type") + " " + label;
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

		switch (notification.getFeatureID(CardsUnit.class)) {
			case WafPackage.CARDS_UNIT__OVERLAY_SINGLE_SELECT_ACTION:
			case WafPackage.CARDS_UNIT__CONTENT_CLASS:
			case WafPackage.CARDS_UNIT__HAS_CONTENT_CLASS:
			case WafPackage.CARDS_UNIT__CARDS_FIELD_LIST_CLASS:
			case WafPackage.CARDS_UNIT__CARDS_DEFINITION_FIELD_LIST_CLASS:
			case WafPackage.CARDS_UNIT__CARDS_FIELD_LABEL_CLASS:
			case WafPackage.CARDS_UNIT__CARDS_FIELD_VALUE_CLASS:
			case WafPackage.CARDS_UNIT__LOCAL_ROW_CLASS:
			case WafPackage.CARDS_UNIT__ROW_CLASS:
			case WafPackage.CARDS_UNIT__HAS_ROW_CLASS:
			case WafPackage.CARDS_UNIT__LOCAL_COLUMN_CLASS:
			case WafPackage.CARDS_UNIT__COLUMN_CLASS:
			case WafPackage.CARDS_UNIT__HAS_COLUMN_CLASS:
			case WafPackage.CARDS_UNIT__LOCAL_CARD_CLASS:
			case WafPackage.CARDS_UNIT__CARD_CLASS:
			case WafPackage.CARDS_UNIT__HAS_CARD_CLASS:
			case WafPackage.CARDS_UNIT__LOCAL_CARD_HEADER_CLASS:
			case WafPackage.CARDS_UNIT__CARD_HEADER_CLASS:
			case WafPackage.CARDS_UNIT__HAS_CARD_HEADER_CLASS:
			case WafPackage.CARDS_UNIT__LOCAL_CARD_BODY_CLASS:
			case WafPackage.CARDS_UNIT__CARD_BODY_CLASS:
			case WafPackage.CARDS_UNIT__HAS_CARD_BODY_CLASS:
			case WafPackage.CARDS_UNIT__LOCAL_CARD_FOOTER_CLASS:
			case WafPackage.CARDS_UNIT__CARD_FOOTER_CLASS:
			case WafPackage.CARDS_UNIT__HAS_CARD_FOOTER_CLASS:
			case WafPackage.CARDS_UNIT__CARDS_CONTROL_CLASS:
			case WafPackage.CARDS_UNIT__CARDS_INSTANCE_CONTROL_CLASS:
			case WafPackage.CARDS_UNIT__CARDS_ANCHOR_CLASS:
			case WafPackage.CARDS_UNIT__CARDS_INSTANCE_ANCHOR_CLASS:
			case WafPackage.CARDS_UNIT__LOCAL_BADGE_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WafPackage.CARDS_UNIT__BADGES:
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
				(WafPackage.eINSTANCE.getCardsUnit_Badges(),
				 WafFactory.eINSTANCE.createBadge()));
	}

}
