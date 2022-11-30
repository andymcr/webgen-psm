/**
 */
package work.andycarpenter.metamodel.orm.provider;

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
import work.andycarpenter.metamodel.base.BasePackage;
import work.andycarpenter.metamodel.base.Constant;
import work.andycarpenter.metamodel.base.util.BaseSwitch;
import work.andycarpenter.metamodel.expression.ExpressionPackage;
import work.andycarpenter.metamodel.expression.FunctionCall;
import work.andycarpenter.metamodel.expression.PredicateBooleanVariable;
import work.andycarpenter.metamodel.expression.PredicateComparisonOperator;
import work.andycarpenter.metamodel.expression.PredicateEqualityOperator;
import work.andycarpenter.metamodel.expression.PredicateInOperator;
import work.andycarpenter.metamodel.expression.PredicateIsEmpty;
import work.andycarpenter.metamodel.expression.PredicateIsNull;
import work.andycarpenter.metamodel.expression.PredicateLikeOperator;
import work.andycarpenter.metamodel.expression.util.ExpressionSwitch;
import work.andycarpenter.metamodel.orm.OrmFactory;
import work.andycarpenter.metamodel.orm.util.OrmAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrmItemProviderAdapterFactory extends OrmAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public OrmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.OrmModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrmModelItemProvider ormModelItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.OrmModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrmModelAdapter() {
		if (ormModelItemProvider == null) {
			ormModelItemProvider = new OrmModelItemProvider(this);
		}

		return ormModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.CollectionType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionTypeItemProvider collectionTypeItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.CollectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCollectionTypeAdapter() {
		if (collectionTypeItemProvider == null) {
			collectionTypeItemProvider = new CollectionTypeItemProvider(this);
		}

		return collectionTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.SerializationGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerializationGroupItemProvider serializationGroupItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.SerializationGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSerializationGroupAdapter() {
		if (serializationGroupItemProvider == null) {
			serializationGroupItemProvider = new SerializationGroupItemProvider(this);
		}

		return serializationGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.Entity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityItemProvider entityItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityAdapter() {
		if (entityItemProvider == null) {
			entityItemProvider = new EntityItemProvider(this);
		}

		return entityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.ModelLabel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelLabelItemProvider modelLabelItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.ModelLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelLabelAdapter() {
		if (modelLabelItemProvider == null) {
			modelLabelItemProvider = new ModelLabelItemProvider(this);
		}

		return modelLabelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.ModelLabelAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelLabelAttributeItemProvider modelLabelAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.ModelLabelAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelLabelAttributeAdapter() {
		if (modelLabelAttributeItemProvider == null) {
			modelLabelAttributeItemProvider = new ModelLabelAttributeItemProvider(this);
		}

		return modelLabelAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.ModelLabelAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelLabelAssociationItemProvider modelLabelAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.ModelLabelAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelLabelAssociationAdapter() {
		if (modelLabelAssociationItemProvider == null) {
			modelLabelAssociationItemProvider = new ModelLabelAssociationItemProvider(this);
		}

		return modelLabelAssociationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.DataTypeAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeAttributeItemProvider dataTypeAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.DataTypeAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataTypeAttributeAdapter() {
		if (dataTypeAttributeItemProvider == null) {
			dataTypeAttributeItemProvider = new DataTypeAttributeItemProvider(this);
		}

		return dataTypeAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.DateAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateAttributeItemProvider dateAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.DateAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDateAttributeAdapter() {
		if (dateAttributeItemProvider == null) {
			dateAttributeItemProvider = new DateAttributeItemProvider(this);
		}

		return dateAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.SubDirectory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubDirectoryItemProvider subDirectoryItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.SubDirectory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubDirectoryAdapter() {
		if (subDirectoryItemProvider == null) {
			subDirectoryItemProvider = new SubDirectoryItemProvider(this);
		}

		return subDirectoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.PropertyDirectory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyDirectoryItemProvider propertyDirectoryItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.PropertyDirectory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyDirectoryAdapter() {
		if (propertyDirectoryItemProvider == null) {
			propertyDirectoryItemProvider = new PropertyDirectoryItemProvider(this);
		}

		return propertyDirectoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.DateTimeDirectory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateTimeDirectoryItemProvider dateTimeDirectoryItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.DateTimeDirectory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDateTimeDirectoryAdapter() {
		if (dateTimeDirectoryItemProvider == null) {
			dateTimeDirectoryItemProvider = new DateTimeDirectoryItemProvider(this);
		}

		return dateTimeDirectoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.UniqueIdNamer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniqueIdNamerItemProvider uniqueIdNamerItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.UniqueIdNamer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUniqueIdNamerAdapter() {
		if (uniqueIdNamerItemProvider == null) {
			uniqueIdNamerItemProvider = new UniqueIdNamerItemProvider(this);
		}

		return uniqueIdNamerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.OriginalNamer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OriginalNamerItemProvider originalNamerItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.OriginalNamer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOriginalNamerAdapter() {
		if (originalNamerItemProvider == null) {
			originalNamerItemProvider = new OriginalNamerItemProvider(this);
		}

		return originalNamerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.PropertyNamer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyNamerItemProvider propertyNamerItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.PropertyNamer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyNamerAdapter() {
		if (propertyNamerItemProvider == null) {
			propertyNamerItemProvider = new PropertyNamerItemProvider(this);
		}

		return propertyNamerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.HashNamer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HashNamerItemProvider hashNamerItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.HashNamer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHashNamerAdapter() {
		if (hashNamerItemProvider == null) {
			hashNamerItemProvider = new HashNamerItemProvider(this);
		}

		return hashNamerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.Base64Namer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Base64NamerItemProvider base64NamerItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.Base64Namer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBase64NamerAdapter() {
		if (base64NamerItemProvider == null) {
			base64NamerItemProvider = new Base64NamerItemProvider(this);
		}

		return base64NamerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.SmartUniqueNamer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartUniqueNamerItemProvider smartUniqueNamerItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.SmartUniqueNamer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSmartUniqueNamerAdapter() {
		if (smartUniqueNamerItemProvider == null) {
			smartUniqueNamerItemProvider = new SmartUniqueNamerItemProvider(this);
		}

		return smartUniqueNamerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.SlugNamer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlugNamerItemProvider slugNamerItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.SlugNamer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSlugNamerAdapter() {
		if (slugNamerItemProvider == null) {
			slugNamerItemProvider = new SlugNamerItemProvider(this);
		}

		return slugNamerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.FileResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileResourceItemProvider fileResourceItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.FileResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFileResourceAdapter() {
		if (fileResourceItemProvider == null) {
			fileResourceItemProvider = new FileResourceItemProvider(this);
		}

		return fileResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.ImageResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageResourceItemProvider imageResourceItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.ImageResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageResourceAdapter() {
		if (imageResourceItemProvider == null) {
			imageResourceItemProvider = new ImageResourceItemProvider(this);
		}

		return imageResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.LocationFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationFeatureItemProvider locationFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.LocationFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocationFeatureAdapter() {
		if (locationFeatureItemProvider == null) {
			locationFeatureItemProvider = new LocationFeatureItemProvider(this);
		}

		return locationFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.Association} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationItemProvider associationItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationAdapter() {
		if (associationItemProvider == null) {
			associationItemProvider = new AssociationItemProvider(this);
		}

		return associationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.SingletonAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingletonAssociationItemProvider singletonAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.SingletonAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSingletonAssociationAdapter() {
		if (singletonAssociationItemProvider == null) {
			singletonAssociationItemProvider = new SingletonAssociationItemProvider(this);
		}

		return singletonAssociationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.AssociationKey} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationKeyItemProvider associationKeyItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.AssociationKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationKeyAdapter() {
		if (associationKeyItemProvider == null) {
			associationKeyItemProvider = new AssociationKeyItemProvider(this);
		}

		return associationKeyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.Repository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryItemProvider repositoryItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepositoryAdapter() {
		if (repositoryItemProvider == null) {
			repositoryItemProvider = new RepositoryItemProvider(this);
		}

		return repositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.Selection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionItemProvider selectionItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.Selection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectionAdapter() {
		if (selectionItemProvider == null) {
			selectionItemProvider = new SelectionItemProvider(this);
		}

		return selectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.FeatureReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureReferenceItemProvider featureReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.FeatureReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureReferenceAdapter() {
		if (featureReferenceItemProvider == null) {
			featureReferenceItemProvider = new FeatureReferenceItemProvider(this);
		}

		return featureReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.Asc} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AscItemProvider ascItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.Asc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAscAdapter() {
		if (ascItemProvider == null) {
			ascItemProvider = new AscItemProvider(this);
		}

		return ascItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.Desc} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescItemProvider descItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.Desc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDescAdapter() {
		if (descItemProvider == null) {
			descItemProvider = new DescItemProvider(this);
		}

		return descItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link work.andycarpenter.metamodel.orm.Filter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterItemProvider filterItemProvider;

	/**
	 * This creates an adapter for a {@link work.andycarpenter.metamodel.orm.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilterAdapter() {
		if (filterItemProvider == null) {
			filterItemProvider = new FilterItemProvider(this);
		}

		return filterItemProvider;
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
		if (ormModelItemProvider != null) ormModelItemProvider.dispose();
		if (collectionTypeItemProvider != null) collectionTypeItemProvider.dispose();
		if (serializationGroupItemProvider != null) serializationGroupItemProvider.dispose();
		if (entityItemProvider != null) entityItemProvider.dispose();
		if (modelLabelItemProvider != null) modelLabelItemProvider.dispose();
		if (modelLabelAttributeItemProvider != null) modelLabelAttributeItemProvider.dispose();
		if (modelLabelAssociationItemProvider != null) modelLabelAssociationItemProvider.dispose();
		if (dataTypeAttributeItemProvider != null) dataTypeAttributeItemProvider.dispose();
		if (dateAttributeItemProvider != null) dateAttributeItemProvider.dispose();
		if (subDirectoryItemProvider != null) subDirectoryItemProvider.dispose();
		if (propertyDirectoryItemProvider != null) propertyDirectoryItemProvider.dispose();
		if (dateTimeDirectoryItemProvider != null) dateTimeDirectoryItemProvider.dispose();
		if (uniqueIdNamerItemProvider != null) uniqueIdNamerItemProvider.dispose();
		if (originalNamerItemProvider != null) originalNamerItemProvider.dispose();
		if (propertyNamerItemProvider != null) propertyNamerItemProvider.dispose();
		if (hashNamerItemProvider != null) hashNamerItemProvider.dispose();
		if (base64NamerItemProvider != null) base64NamerItemProvider.dispose();
		if (smartUniqueNamerItemProvider != null) smartUniqueNamerItemProvider.dispose();
		if (slugNamerItemProvider != null) slugNamerItemProvider.dispose();
		if (fileResourceItemProvider != null) fileResourceItemProvider.dispose();
		if (imageResourceItemProvider != null) imageResourceItemProvider.dispose();
		if (locationFeatureItemProvider != null) locationFeatureItemProvider.dispose();
		if (associationItemProvider != null) associationItemProvider.dispose();
		if (singletonAssociationItemProvider != null) singletonAssociationItemProvider.dispose();
		if (associationKeyItemProvider != null) associationKeyItemProvider.dispose();
		if (repositoryItemProvider != null) repositoryItemProvider.dispose();
		if (selectionItemProvider != null) selectionItemProvider.dispose();
		if (featureReferenceItemProvider != null) featureReferenceItemProvider.dispose();
		if (ascItemProvider != null) ascItemProvider.dispose();
		if (descItemProvider != null) descItemProvider.dispose();
		if (filterItemProvider != null) filterItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link BasePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class BaseChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends BaseSwitch<Object> {
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
			public Object caseConstant(Constant object) {
				newChildDescriptors.add
					(createChildParameter
						(BasePackage.Literals.CONSTANT__VALUE,
						 OrmFactory.eINSTANCE.createFeatureReference()));

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
			return OrmEditPlugin.INSTANCE;
		}
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
			public Object caseFunctionCall(FunctionCall object) {
				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.FUNCTION_CALL__ACTUALS,
						 OrmFactory.eINSTANCE.createFeatureReference()));

				return null;
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
						 OrmFactory.eINSTANCE.createFeatureReference()));

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
						 OrmFactory.eINSTANCE.createFeatureReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_EQUALITY_OPERATOR__RIGHT,
						 OrmFactory.eINSTANCE.createFeatureReference()));

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
						 OrmFactory.eINSTANCE.createFeatureReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_COMPARISON_OPERATOR__RIGHT,
						 OrmFactory.eINSTANCE.createFeatureReference()));

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
						 OrmFactory.eINSTANCE.createFeatureReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_IN_OPERATOR__RIGHT,
						 OrmFactory.eINSTANCE.createFeatureReference()));

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
						 OrmFactory.eINSTANCE.createFeatureReference()));

				newChildDescriptors.add
					(createChildParameter
						(ExpressionPackage.Literals.PREDICATE_LIKE_OPERATOR__RIGHT,
						 OrmFactory.eINSTANCE.createFeatureReference()));

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
						(ExpressionPackage.Literals.PREDICATE_IS_EMPTY__FEATURE,
						 OrmFactory.eINSTANCE.createFeatureReference()));

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
						(ExpressionPackage.Literals.PREDICATE_IS_NULL__FEATURE,
						 OrmFactory.eINSTANCE.createFeatureReference()));

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
			return OrmEditPlugin.INSTANCE;
		}
	}

}
