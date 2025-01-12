/**
 */
package work.andycarpenter.metamodel.base.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import work.andycarpenter.metamodel.base.BaseFactory;

import work.andycarpenter.metamodel.base.util.BaseAdapterFactory;

import work.andycarpenter.metamodel.expression.ArithmeticOperation;
import work.andycarpenter.metamodel.expression.ExpressionPackage;
import work.andycarpenter.metamodel.expression.PredicateBooleanVariable;
import work.andycarpenter.metamodel.expression.PredicateComparisonOperator;
import work.andycarpenter.metamodel.expression.PredicateEqualityOperator;
import work.andycarpenter.metamodel.expression.PredicateInOperator;
import work.andycarpenter.metamodel.expression.PredicateIsEmpty;
import work.andycarpenter.metamodel.expression.PredicateIsNull;
import work.andycarpenter.metamodel.expression.PredicateLikeOperator;
import work.andycarpenter.metamodel.expression.util.ExpressionSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BaseItemProviderAdapterFactory extends BaseAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.base.BaseModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseModelItemProvider baseModelItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.base.BaseModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBaseModelAdapter() {
		if (baseModelItemProvider == null) {
			baseModelItemProvider = new BaseModelItemProvider(this);
		}

		return baseModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.base.NullLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NullLiteralItemProvider nullLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.base.NullLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNullLiteralAdapter() {
		if (nullLiteralItemProvider == null) {
			nullLiteralItemProvider = new NullLiteralItemProvider(this);
		}

		return nullLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.base.BooleanLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanLiteralItemProvider booleanLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.base.BooleanLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanLiteralAdapter() {
		if (booleanLiteralItemProvider == null) {
			booleanLiteralItemProvider = new BooleanLiteralItemProvider(this);
		}

		return booleanLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.base.IntegerLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerLiteralItemProvider integerLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.base.IntegerLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerLiteralAdapter() {
		if (integerLiteralItemProvider == null) {
			integerLiteralItemProvider = new IntegerLiteralItemProvider(this);
		}

		return integerLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.base.StringLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringLiteralItemProvider stringLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.base.StringLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringLiteralAdapter() {
		if (stringLiteralItemProvider == null) {
			stringLiteralItemProvider = new StringLiteralItemProvider(this);
		}

		return stringLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.base.TimeLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeLiteralItemProvider timeLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.base.TimeLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeLiteralAdapter() {
		if (timeLiteralItemProvider == null) {
			timeLiteralItemProvider = new TimeLiteralItemProvider(this);
		}

		return timeLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.base.CurrentTime} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentTimeItemProvider currentTimeItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.base.CurrentTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCurrentTimeAdapter() {
		if (currentTimeItemProvider == null) {
			currentTimeItemProvider = new CurrentTimeItemProvider(this);
		}

		return currentTimeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.base.CurrentUser} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentUserItemProvider currentUserItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.base.CurrentUser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCurrentUserAdapter() {
		if (currentUserItemProvider == null) {
			currentUserItemProvider = new CurrentUserItemProvider(this);
		}

		return currentUserItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.base.Constant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantItemProvider constantItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.base.Constant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstantAdapter() {
		if (constantItemProvider == null) {
			constantItemProvider = new ConstantItemProvider(this);
		}

		return constantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.base.ConstantReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantReferenceItemProvider constantReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.base.ConstantReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstantReferenceAdapter() {
		if (constantReferenceItemProvider == null) {
			constantReferenceItemProvider = new ConstantReferenceItemProvider(this);
		}

		return constantReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.base.DataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeItemProvider dataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.base.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataTypeAdapter() {
		if (dataTypeItemProvider == null) {
			dataTypeItemProvider = new DataTypeItemProvider(this);
		}

		return dataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.base.EnumerationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationTypeItemProvider enumerationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.base.EnumerationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationTypeAdapter() {
		if (enumerationTypeItemProvider == null) {
			enumerationTypeItemProvider = new EnumerationTypeItemProvider(this);
		}

		return enumerationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.base.EnumerationLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLiteralItemProvider enumerationLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.base.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationLiteralAdapter() {
		if (enumerationLiteralItemProvider == null) {
			enumerationLiteralItemProvider = new EnumerationLiteralItemProvider(this);
		}

		return enumerationLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.base.FormalParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalParameterItemProvider formalParameterItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.base.FormalParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFormalParameterAdapter() {
		if (formalParameterItemProvider == null) {
			formalParameterItemProvider = new FormalParameterItemProvider(this);
		}

		return formalParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.base.Callable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallableItemProvider callableItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.base.Callable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCallableAdapter() {
		if (callableItemProvider == null) {
			callableItemProvider = new CallableItemProvider(this);
		}

		return callableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.base.ReduceFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReduceFunctionItemProvider reduceFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.base.ReduceFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReduceFunctionAdapter() {
		if (reduceFunctionItemProvider == null) {
			reduceFunctionItemProvider = new ReduceFunctionItemProvider(this);
		}

		return reduceFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.base.SizeFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SizeFunctionItemProvider sizeFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.base.SizeFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSizeFunctionAdapter() {
		if (sizeFunctionItemProvider == null) {
			sizeFunctionItemProvider = new SizeFunctionItemProvider(this);
		}

		return sizeFunctionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (baseModelItemProvider != null) baseModelItemProvider.dispose();
		if (nullLiteralItemProvider != null) nullLiteralItemProvider.dispose();
		if (booleanLiteralItemProvider != null) booleanLiteralItemProvider.dispose();
		if (integerLiteralItemProvider != null) integerLiteralItemProvider.dispose();
		if (stringLiteralItemProvider != null) stringLiteralItemProvider.dispose();
		if (timeLiteralItemProvider != null) timeLiteralItemProvider.dispose();
		if (currentTimeItemProvider != null) currentTimeItemProvider.dispose();
		if (currentUserItemProvider != null) currentUserItemProvider.dispose();
		if (constantItemProvider != null) constantItemProvider.dispose();
		if (constantReferenceItemProvider != null) constantReferenceItemProvider.dispose();
		if (dataTypeItemProvider != null) dataTypeItemProvider.dispose();
		if (enumerationTypeItemProvider != null) enumerationTypeItemProvider.dispose();
		if (enumerationLiteralItemProvider != null) enumerationLiteralItemProvider.dispose();
		if (formalParameterItemProvider != null) formalParameterItemProvider.dispose();
		if (callableItemProvider != null) callableItemProvider.dispose();
		if (reduceFunctionItemProvider != null) reduceFunctionItemProvider.dispose();
		if (sizeFunctionItemProvider != null) sizeFunctionItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link ExpressionPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ExpressionChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ExpressionSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateBooleanVariable(PredicateBooleanVariable object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_BOOLEAN_VARIABLE__FEATURE,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_BOOLEAN_VARIABLE__FEATURE,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_BOOLEAN_VARIABLE__FEATURE,
						 BaseFactory.eINSTANCE.createConstantReference()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateEqualityOperator(PredicateEqualityOperator object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createNullLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createBooleanLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createIntegerLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createStringLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createTimeLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createConstantReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCallable()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createReduceFunction()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createSizeFunction()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createNullLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createBooleanLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createIntegerLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createStringLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createTimeLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createConstantReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCallable()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createReduceFunction()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createSizeFunction()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateComparisonOperator(PredicateComparisonOperator object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createNullLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createBooleanLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createIntegerLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createStringLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createTimeLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createConstantReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCallable()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createReduceFunction()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createSizeFunction()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createNullLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createBooleanLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createIntegerLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createStringLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createTimeLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createConstantReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCallable()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createReduceFunction()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createSizeFunction()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateInOperator(PredicateInOperator object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createNullLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createBooleanLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createIntegerLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createStringLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createTimeLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createConstantReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCallable()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createReduceFunction()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createSizeFunction()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createNullLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createBooleanLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createIntegerLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createStringLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createTimeLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createConstantReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCallable()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createReduceFunction()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createSizeFunction()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateLikeOperator(PredicateLikeOperator object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__LEFT,
						 BaseFactory.eINSTANCE.createConstantReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createNullLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createBooleanLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createIntegerLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createStringLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createTimeLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createConstantReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createCallable()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createReduceFunction()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 BaseFactory.eINSTANCE.createSizeFunction()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateIsEmpty(PredicateIsEmpty object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_EMPTY__VALUE,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_EMPTY__VALUE,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_EMPTY__VALUE,
						 BaseFactory.eINSTANCE.createConstantReference()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object casePredicateIsNull(PredicateIsNull object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_NULL__VALUE,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_NULL__VALUE,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IS_NULL__VALUE,
						 BaseFactory.eINSTANCE.createConstantReference()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseArithmeticOperation(ArithmeticOperation object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.ARITHMETIC_OPERATION__OPERANDS,
						 BaseFactory.eINSTANCE.createNullLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.ARITHMETIC_OPERATION__OPERANDS,
						 BaseFactory.eINSTANCE.createBooleanLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.ARITHMETIC_OPERATION__OPERANDS,
						 BaseFactory.eINSTANCE.createIntegerLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.ARITHMETIC_OPERATION__OPERANDS,
						 BaseFactory.eINSTANCE.createStringLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.ARITHMETIC_OPERATION__OPERANDS,
						 BaseFactory.eINSTANCE.createTimeLiteral()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.ARITHMETIC_OPERATION__OPERANDS,
						 BaseFactory.eINSTANCE.createCurrentTime()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.ARITHMETIC_OPERATION__OPERANDS,
						 BaseFactory.eINSTANCE.createCurrentUser()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.ARITHMETIC_OPERATION__OPERANDS,
						 BaseFactory.eINSTANCE.createConstantReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.ARITHMETIC_OPERATION__OPERANDS,
						 BaseFactory.eINSTANCE.createCallable()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.ARITHMETIC_OPERATION__OPERANDS,
						 BaseFactory.eINSTANCE.createReduceFunction()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.ARITHMETIC_OPERATION__OPERANDS,
						 BaseFactory.eINSTANCE.createSizeFunction()));

				return null;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return BaseEditPlugin.INSTANCE;
		}
	}

}