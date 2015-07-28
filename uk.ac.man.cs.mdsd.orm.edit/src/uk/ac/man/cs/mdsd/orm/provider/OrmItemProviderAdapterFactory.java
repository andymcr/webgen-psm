/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmItemProviderAdapterFactory.java,v 1.10 2014/06/27 07:51:59 andy Exp $
 */
package uk.ac.man.cs.mdsd.orm.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import uk.ac.man.cs.mdsd.orm.util.OrmAdapterFactory;

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
   * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.orm.OrmModel} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected OrmModelItemProvider ormModelItemProvider;

	/**
   * This creates an adapter for a {@link uk.ac.man.cs.mdsd.orm.OrmModel}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createOrmModelAdapter() {
    if (ormModelItemProvider == null)
    {
      ormModelItemProvider = new OrmModelItemProvider(this);
    }

    return ormModelItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.orm.CollectionType} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CollectionTypeItemProvider collectionTypeItemProvider;

	/**
   * This creates an adapter for a {@link uk.ac.man.cs.mdsd.orm.CollectionType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createCollectionTypeAdapter() {
    if (collectionTypeItemProvider == null)
    {
      collectionTypeItemProvider = new CollectionTypeItemProvider(this);
    }

    return collectionTypeItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.orm.DataType} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DataTypeItemProvider dataTypeItemProvider;

	/**
   * This creates an adapter for a {@link uk.ac.man.cs.mdsd.orm.DataType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createDataTypeAdapter() {
    if (dataTypeItemProvider == null)
    {
      dataTypeItemProvider = new DataTypeItemProvider(this);
    }

    return dataTypeItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.orm.EnumerationType} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EnumerationTypeItemProvider enumerationTypeItemProvider;

	/**
   * This creates an adapter for a {@link uk.ac.man.cs.mdsd.orm.EnumerationType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createEnumerationTypeAdapter() {
    if (enumerationTypeItemProvider == null)
    {
      enumerationTypeItemProvider = new EnumerationTypeItemProvider(this);
    }

    return enumerationTypeItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.orm.EnumerationLiteral} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EnumerationLiteralItemProvider enumerationLiteralItemProvider;

	/**
   * This creates an adapter for a {@link uk.ac.man.cs.mdsd.orm.EnumerationLiteral}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createEnumerationLiteralAdapter() {
    if (enumerationLiteralItemProvider == null)
    {
      enumerationLiteralItemProvider = new EnumerationLiteralItemProvider(this);
    }

    return enumerationLiteralItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.orm.Entity} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EntityItemProvider entityItemProvider;

	/**
   * This creates an adapter for a {@link uk.ac.man.cs.mdsd.orm.Entity}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createEntityAdapter() {
    if (entityItemProvider == null)
    {
      entityItemProvider = new EntityItemProvider(this);
    }

    return entityItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.orm.SingletonElement} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SingletonElementItemProvider singletonElementItemProvider;

	/**
   * This creates an adapter for a {@link uk.ac.man.cs.mdsd.orm.SingletonElement}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createSingletonElementAdapter() {
    if (singletonElementItemProvider == null)
    {
      singletonElementItemProvider = new SingletonElementItemProvider(this);
    }

    return singletonElementItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.orm.CollectionElement} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CollectionElementItemProvider collectionElementItemProvider;

	/**
   * This creates an adapter for a {@link uk.ac.man.cs.mdsd.orm.CollectionElement}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createCollectionElementAdapter() {
    if (collectionElementItemProvider == null)
    {
      collectionElementItemProvider = new CollectionElementItemProvider(this);
    }

    return collectionElementItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.orm.SingletonDate} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SingletonDateItemProvider singletonDateItemProvider;

	/**
   * This creates an adapter for a {@link uk.ac.man.cs.mdsd.orm.SingletonDate}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createSingletonDateAdapter() {
    if (singletonDateItemProvider == null)
    {
      singletonDateItemProvider = new SingletonDateItemProvider(this);
    }

    return singletonDateItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.orm.CollectionDate} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CollectionDateItemProvider collectionDateItemProvider;

	/**
   * This creates an adapter for a {@link uk.ac.man.cs.mdsd.orm.CollectionDate}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createCollectionDateAdapter() {
    if (collectionDateItemProvider == null)
    {
      collectionDateItemProvider = new CollectionDateItemProvider(this);
    }

    return collectionDateItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.orm.SingletonFile} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SingletonFileItemProvider singletonFileItemProvider;

	/**
   * This creates an adapter for a {@link uk.ac.man.cs.mdsd.orm.SingletonFile}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createSingletonFileAdapter() {
    if (singletonFileItemProvider == null)
    {
      singletonFileItemProvider = new SingletonFileItemProvider(this);
    }

    return singletonFileItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.orm.SingletonImage} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SingletonImageItemProvider singletonImageItemProvider;

	/**
   * This creates an adapter for a {@link uk.ac.man.cs.mdsd.orm.SingletonImage}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createSingletonImageAdapter() {
    if (singletonImageItemProvider == null)
    {
      singletonImageItemProvider = new SingletonImageItemProvider(this);
    }

    return singletonImageItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.orm.SingletonLocation} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SingletonLocationItemProvider singletonLocationItemProvider;

	/**
   * This creates an adapter for a {@link uk.ac.man.cs.mdsd.orm.SingletonLocation}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createSingletonLocationAdapter() {
    if (singletonLocationItemProvider == null)
    {
      singletonLocationItemProvider = new SingletonLocationItemProvider(this);
    }

    return singletonLocationItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.orm.SingletonAssociation} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SingletonAssociationItemProvider singletonAssociationItemProvider;

	/**
   * This creates an adapter for a {@link uk.ac.man.cs.mdsd.orm.SingletonAssociation}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createSingletonAssociationAdapter() {
    if (singletonAssociationItemProvider == null)
    {
      singletonAssociationItemProvider = new SingletonAssociationItemProvider(this);
    }

    return singletonAssociationItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link uk.ac.man.cs.mdsd.orm.CollectionAssociation} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CollectionAssociationItemProvider collectionAssociationItemProvider;

	/**
   * This creates an adapter for a {@link uk.ac.man.cs.mdsd.orm.CollectionAssociation}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createCollectionAssociationAdapter() {
    if (collectionAssociationItemProvider == null)
    {
      collectionAssociationItemProvider = new CollectionAssociationItemProvider(this);
    }

    return collectionAssociationItemProvider;
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
    if (isFactoryForType(type))
    {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
      {
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

    if (parentAdapterFactory != null)
    {
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
    if (ormModelItemProvider != null) ormModelItemProvider.dispose();
    if (collectionTypeItemProvider != null) collectionTypeItemProvider.dispose();
    if (dataTypeItemProvider != null) dataTypeItemProvider.dispose();
    if (enumerationTypeItemProvider != null) enumerationTypeItemProvider.dispose();
    if (enumerationLiteralItemProvider != null) enumerationLiteralItemProvider.dispose();
    if (entityItemProvider != null) entityItemProvider.dispose();
    if (singletonElementItemProvider != null) singletonElementItemProvider.dispose();
    if (collectionElementItemProvider != null) collectionElementItemProvider.dispose();
    if (singletonDateItemProvider != null) singletonDateItemProvider.dispose();
    if (collectionDateItemProvider != null) collectionDateItemProvider.dispose();
    if (singletonFileItemProvider != null) singletonFileItemProvider.dispose();
    if (singletonImageItemProvider != null) singletonImageItemProvider.dispose();
    if (singletonLocationItemProvider != null) singletonLocationItemProvider.dispose();
    if (singletonAssociationItemProvider != null) singletonAssociationItemProvider.dispose();
    if (collectionAssociationItemProvider != null) collectionAssociationItemProvider.dispose();
  }

}