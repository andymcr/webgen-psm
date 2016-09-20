/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uk.ac.man.cs.mdsd.criteria.Expression;

import uk.ac.man.cs.mdsd.waf.ChildPathReference;
import uk.ac.man.cs.mdsd.waf.PathReferenceElement;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Path Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ChildPathReferenceImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ChildPathReferenceImpl#getChildReference <em>Child Reference</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ChildPathReferenceImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChildPathReferenceImpl extends MinimalEObjectImpl.Container implements ChildPathReference {
	/**
	 * The cached value of the '{@link #getActual() <em>Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual()
	 * @generated
	 * @ordered
	 */
	protected Expression actual;

	/**
	 * The cached value of the '{@link #getChildReference() <em>Child Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildReference()
	 * @generated
	 * @ordered
	 */
	protected ChildPathReference childReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildPathReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.CHILD_PATH_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getActual() {
		return actual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActual(Expression newActual, NotificationChain msgs) {
		Expression oldActual = actual;
		actual = newActual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.CHILD_PATH_REFERENCE__ACTUAL, oldActual, newActual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActual(Expression newActual) {
		if (newActual != actual) {
			NotificationChain msgs = null;
			if (actual != null)
				msgs = ((InternalEObject)actual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WafPackage.CHILD_PATH_REFERENCE__ACTUAL, null, msgs);
			if (newActual != null)
				msgs = ((InternalEObject)newActual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WafPackage.CHILD_PATH_REFERENCE__ACTUAL, null, msgs);
			msgs = basicSetActual(newActual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.CHILD_PATH_REFERENCE__ACTUAL, newActual, newActual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildPathReference getChildReference() {
		return childReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildReference(ChildPathReference newChildReference, NotificationChain msgs) {
		ChildPathReference oldChildReference = childReference;
		childReference = newChildReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE, oldChildReference, newChildReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildReference(ChildPathReference newChildReference) {
		if (newChildReference != childReference) {
			NotificationChain msgs = null;
			if (childReference != null)
				msgs = ((InternalEObject)childReference).eInverseRemove(this, WafPackage.CHILD_PATH_REFERENCE__PARENT, ChildPathReference.class, msgs);
			if (newChildReference != null)
				msgs = ((InternalEObject)newChildReference).eInverseAdd(this, WafPackage.CHILD_PATH_REFERENCE__PARENT, ChildPathReference.class, msgs);
			msgs = basicSetChildReference(newChildReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE, newChildReference, newChildReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathReferenceElement getParent() {
		if (eContainerFeatureID() != WafPackage.CHILD_PATH_REFERENCE__PARENT) return null;
		return (PathReferenceElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathReferenceElement basicGetParent() {
		if (eContainerFeatureID() != WafPackage.CHILD_PATH_REFERENCE__PARENT) return null;
		return (PathReferenceElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(PathReferenceElement newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, WafPackage.CHILD_PATH_REFERENCE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(PathReferenceElement newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != WafPackage.CHILD_PATH_REFERENCE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, WafPackage.PATH_REFERENCE_ELEMENT__CHILD_REFERENCE, PathReferenceElement.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.CHILD_PATH_REFERENCE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE:
				if (childReference != null)
					msgs = ((InternalEObject)childReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WafPackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE, null, msgs);
				return basicSetChildReference((ChildPathReference)otherEnd, msgs);
			case WafPackage.CHILD_PATH_REFERENCE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((PathReferenceElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.CHILD_PATH_REFERENCE__ACTUAL:
				return basicSetActual(null, msgs);
			case WafPackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE:
				return basicSetChildReference(null, msgs);
			case WafPackage.CHILD_PATH_REFERENCE__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case WafPackage.CHILD_PATH_REFERENCE__PARENT:
				return eInternalContainer().eInverseRemove(this, WafPackage.PATH_REFERENCE_ELEMENT__CHILD_REFERENCE, PathReferenceElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WafPackage.CHILD_PATH_REFERENCE__ACTUAL:
				return getActual();
			case WafPackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE:
				return getChildReference();
			case WafPackage.CHILD_PATH_REFERENCE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WafPackage.CHILD_PATH_REFERENCE__ACTUAL:
				setActual((Expression)newValue);
				return;
			case WafPackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE:
				setChildReference((ChildPathReference)newValue);
				return;
			case WafPackage.CHILD_PATH_REFERENCE__PARENT:
				setParent((PathReferenceElement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WafPackage.CHILD_PATH_REFERENCE__ACTUAL:
				setActual((Expression)null);
				return;
			case WafPackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE:
				setChildReference((ChildPathReference)null);
				return;
			case WafPackage.CHILD_PATH_REFERENCE__PARENT:
				setParent((PathReferenceElement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WafPackage.CHILD_PATH_REFERENCE__ACTUAL:
				return actual != null;
			case WafPackage.CHILD_PATH_REFERENCE__CHILD_REFERENCE:
				return childReference != null;
			case WafPackage.CHILD_PATH_REFERENCE__PARENT:
				return basicGetParent() != null;
		}
		return super.eIsSet(featureID);
	}

} //ChildPathReferenceImpl
