/**
 */
package work.andycarpenter.psms.expression.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
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

import work.andycarpenter.psms.expression.ExpressionPackage;

import work.andycarpenter.psms.expression.util.ExpressionAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionItemProviderAdapterFactory extends ExpressionAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {
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
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(ExpressionEditPlugin.INSTANCE, ExpressionPackage.eNS_URI);

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
	public ExpressionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.psms.expression.FunctionCall} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallItemProvider functionCallItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.psms.expression.FunctionCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionCallAdapter() {
		if (functionCallItemProvider == null) {
			functionCallItemProvider = new FunctionCallItemProvider(this);
		}

		return functionCallItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.psms.expression.PredicateBooleanVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateBooleanVariableItemProvider predicateBooleanVariableItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.psms.expression.PredicateBooleanVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredicateBooleanVariableAdapter() {
		if (predicateBooleanVariableItemProvider == null) {
			predicateBooleanVariableItemProvider = new PredicateBooleanVariableItemProvider(this);
		}

		return predicateBooleanVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.psms.expression.PredicateBooleanOperator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateBooleanOperatorItemProvider predicateBooleanOperatorItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.psms.expression.PredicateBooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredicateBooleanOperatorAdapter() {
		if (predicateBooleanOperatorItemProvider == null) {
			predicateBooleanOperatorItemProvider = new PredicateBooleanOperatorItemProvider(this);
		}

		return predicateBooleanOperatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.psms.expression.PredicateEqualityOperator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateEqualityOperatorItemProvider predicateEqualityOperatorItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.psms.expression.PredicateEqualityOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredicateEqualityOperatorAdapter() {
		if (predicateEqualityOperatorItemProvider == null) {
			predicateEqualityOperatorItemProvider = new PredicateEqualityOperatorItemProvider(this);
		}

		return predicateEqualityOperatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.psms.expression.PredicateComparisonOperator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateComparisonOperatorItemProvider predicateComparisonOperatorItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.psms.expression.PredicateComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredicateComparisonOperatorAdapter() {
		if (predicateComparisonOperatorItemProvider == null) {
			predicateComparisonOperatorItemProvider = new PredicateComparisonOperatorItemProvider(this);
		}

		return predicateComparisonOperatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.psms.expression.PredicateInOperator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateInOperatorItemProvider predicateInOperatorItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.psms.expression.PredicateInOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredicateInOperatorAdapter() {
		if (predicateInOperatorItemProvider == null) {
			predicateInOperatorItemProvider = new PredicateInOperatorItemProvider(this);
		}

		return predicateInOperatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.psms.expression.PredicateIsOperator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateIsOperatorItemProvider predicateIsOperatorItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.psms.expression.PredicateIsOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredicateIsOperatorAdapter() {
		if (predicateIsOperatorItemProvider == null) {
			predicateIsOperatorItemProvider = new PredicateIsOperatorItemProvider(this);
		}

		return predicateIsOperatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.psms.expression.PredicateLikeOperator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateLikeOperatorItemProvider predicateLikeOperatorItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.psms.expression.PredicateLikeOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredicateLikeOperatorAdapter() {
		if (predicateLikeOperatorItemProvider == null) {
			predicateLikeOperatorItemProvider = new PredicateLikeOperatorItemProvider(this);
		}

		return predicateLikeOperatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.psms.expression.PredicateIsEmpty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateIsEmptyItemProvider predicateIsEmptyItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.psms.expression.PredicateIsEmpty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredicateIsEmptyAdapter() {
		if (predicateIsEmptyItemProvider == null) {
			predicateIsEmptyItemProvider = new PredicateIsEmptyItemProvider(this);
		}

		return predicateIsEmptyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.psms.expression.PredicateIsNull} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateIsNullItemProvider predicateIsNullItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.psms.expression.PredicateIsNull}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPredicateIsNullAdapter() {
		if (predicateIsNullItemProvider == null) {
			predicateIsNullItemProvider = new PredicateIsNullItemProvider(this);
		}

		return predicateIsNullItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public void dispose() {
		if (functionCallItemProvider != null) functionCallItemProvider.dispose();
		if (predicateBooleanVariableItemProvider != null) predicateBooleanVariableItemProvider.dispose();
		if (predicateBooleanOperatorItemProvider != null) predicateBooleanOperatorItemProvider.dispose();
		if (predicateEqualityOperatorItemProvider != null) predicateEqualityOperatorItemProvider.dispose();
		if (predicateComparisonOperatorItemProvider != null) predicateComparisonOperatorItemProvider.dispose();
		if (predicateInOperatorItemProvider != null) predicateInOperatorItemProvider.dispose();
		if (predicateIsOperatorItemProvider != null) predicateIsOperatorItemProvider.dispose();
		if (predicateLikeOperatorItemProvider != null) predicateLikeOperatorItemProvider.dispose();
		if (predicateIsEmptyItemProvider != null) predicateIsEmptyItemProvider.dispose();
		if (predicateIsNullItemProvider != null) predicateIsNullItemProvider.dispose();
	}

}
