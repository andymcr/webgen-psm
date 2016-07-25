/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;
import uk.ac.man.cs.mdsd.orm.NamedElement;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

import uk.ac.man.cs.mdsd.waf.EditStaticTextMenuEntry;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edit Static Text Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.EditStaticTextMenuEntryImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.EditStaticTextMenuEntryImpl#getSingletonName <em>Singleton Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.EditStaticTextMenuEntryImpl#getPluralisedName <em>Pluralised Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.EditStaticTextMenuEntryImpl#getDisplayLabel <em>Display Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EditStaticTextMenuEntryImpl extends MenuEntryImpl implements EditStaticTextMenuEntry {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSingletonName() <em>Singleton Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingletonName()
	 * @generated
	 * @ordered
	 */
	protected static final String SINGLETON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSingletonName() <em>Singleton Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingletonName()
	 * @generated
	 * @ordered
	 */
	protected String singletonName = SINGLETON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPluralisedName() <em>Pluralised Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluralisedName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLURALISED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluralisedName() <em>Pluralised Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluralisedName()
	 * @generated
	 * @ordered
	 */
	protected String pluralisedName = PLURALISED_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayLabel() <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayLabel() <em>Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected String displayLabel = DISPLAY_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditStaticTextMenuEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.EDIT_STATIC_TEXT_MENU_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSingletonName() {
		return singletonName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingletonName(String newSingletonName) {
		String oldSingletonName = singletonName;
		singletonName = newSingletonName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__SINGLETON_NAME, oldSingletonName, singletonName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluralisedName() {
		return pluralisedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluralisedName(String newPluralisedName) {
		String oldPluralisedName = pluralisedName;
		pluralisedName = newPluralisedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__PLURALISED_NAME, oldPluralisedName, pluralisedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayLabel() {
		return displayLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayLabel(String newDisplayLabel) {
		String oldDisplayLabel = displayLabel;
		displayLabel = newDisplayLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL, oldDisplayLabel, displayLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__NAME:
				return getName();
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__SINGLETON_NAME:
				return getSingletonName();
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__PLURALISED_NAME:
				return getPluralisedName();
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL:
				return getDisplayLabel();
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
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__NAME:
				setName((String)newValue);
				return;
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__SINGLETON_NAME:
				setSingletonName((String)newValue);
				return;
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__PLURALISED_NAME:
				setPluralisedName((String)newValue);
				return;
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL:
				setDisplayLabel((String)newValue);
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
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__SINGLETON_NAME:
				setSingletonName(SINGLETON_NAME_EDEFAULT);
				return;
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__PLURALISED_NAME:
				setPluralisedName(PLURALISED_NAME_EDEFAULT);
				return;
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL:
				setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
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
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__SINGLETON_NAME:
				return SINGLETON_NAME_EDEFAULT == null ? singletonName != null : !SINGLETON_NAME_EDEFAULT.equals(singletonName);
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__PLURALISED_NAME:
				return PLURALISED_NAME_EDEFAULT == null ? pluralisedName != null : !PLURALISED_NAME_EDEFAULT.equals(pluralisedName);
			case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL:
				return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__NAME: return OrmPackage.NAMED_ELEMENT__NAME;
				case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__SINGLETON_NAME: return OrmPackage.NAMED_ELEMENT__SINGLETON_NAME;
				case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__PLURALISED_NAME: return OrmPackage.NAMED_ELEMENT__PLURALISED_NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedDisplayElement.class) {
			switch (derivedFeatureID) {
				case WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL: return OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case OrmPackage.NAMED_ELEMENT__NAME: return WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__NAME;
				case OrmPackage.NAMED_ELEMENT__SINGLETON_NAME: return WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__SINGLETON_NAME;
				case OrmPackage.NAMED_ELEMENT__PLURALISED_NAME: return WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__PLURALISED_NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedDisplayElement.class) {
			switch (baseFeatureID) {
				case OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL: return WafPackage.EDIT_STATIC_TEXT_MENU_ENTRY__DISPLAY_LABEL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", singletonName: ");
		result.append(singletonName);
		result.append(", pluralisedName: ");
		result.append(pluralisedName);
		result.append(", displayLabel: ");
		result.append(displayLabel);
		result.append(')');
		return result.toString();
	}

} //EditStaticTextMenuEntryImpl
