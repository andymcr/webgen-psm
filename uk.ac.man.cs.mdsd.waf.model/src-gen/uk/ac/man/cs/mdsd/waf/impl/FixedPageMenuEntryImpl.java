/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.man.cs.mdsd.orm.NamedDisplayElement;
import uk.ac.man.cs.mdsd.orm.NamedElement;
import uk.ac.man.cs.mdsd.orm.OrmPackage;

import uk.ac.man.cs.mdsd.waf.FixedPageMenuEntry;
import uk.ac.man.cs.mdsd.waf.Page;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Page Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.FixedPageMenuEntryImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.FixedPageMenuEntryImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.FixedPageMenuEntryImpl#getPage <em>Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixedPageMenuEntryImpl extends MenuEntryImpl implements FixedPageMenuEntry
{
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
   * The cached value of the '{@link #getPage() <em>Page</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPage()
   * @generated
   * @ordered
   */
  protected Page page;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FixedPageMenuEntryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WafPackage.Literals.FIXED_PAGE_MENU_ENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.FIXED_PAGE_MENU_ENTRY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDisplayLabel()
  {
    return displayLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisplayLabel(String newDisplayLabel)
  {
    String oldDisplayLabel = displayLabel;
    displayLabel = newDisplayLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.FIXED_PAGE_MENU_ENTRY__DISPLAY_LABEL, oldDisplayLabel, displayLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page getPage()
  {
    if (page != null && page.eIsProxy())
    {
      InternalEObject oldPage = (InternalEObject)page;
      page = (Page)eResolveProxy(oldPage);
      if (page != oldPage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.FIXED_PAGE_MENU_ENTRY__PAGE, oldPage, page));
      }
    }
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page basicGetPage()
  {
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPage(Page newPage)
  {
    Page oldPage = page;
    page = newPage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.FIXED_PAGE_MENU_ENTRY__PAGE, oldPage, page));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WafPackage.FIXED_PAGE_MENU_ENTRY__NAME:
        return getName();
      case WafPackage.FIXED_PAGE_MENU_ENTRY__DISPLAY_LABEL:
        return getDisplayLabel();
      case WafPackage.FIXED_PAGE_MENU_ENTRY__PAGE:
        if (resolve) return getPage();
        return basicGetPage();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WafPackage.FIXED_PAGE_MENU_ENTRY__NAME:
        setName((String)newValue);
        return;
      case WafPackage.FIXED_PAGE_MENU_ENTRY__DISPLAY_LABEL:
        setDisplayLabel((String)newValue);
        return;
      case WafPackage.FIXED_PAGE_MENU_ENTRY__PAGE:
        setPage((Page)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WafPackage.FIXED_PAGE_MENU_ENTRY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WafPackage.FIXED_PAGE_MENU_ENTRY__DISPLAY_LABEL:
        setDisplayLabel(DISPLAY_LABEL_EDEFAULT);
        return;
      case WafPackage.FIXED_PAGE_MENU_ENTRY__PAGE:
        setPage((Page)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WafPackage.FIXED_PAGE_MENU_ENTRY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WafPackage.FIXED_PAGE_MENU_ENTRY__DISPLAY_LABEL:
        return DISPLAY_LABEL_EDEFAULT == null ? displayLabel != null : !DISPLAY_LABEL_EDEFAULT.equals(displayLabel);
      case WafPackage.FIXED_PAGE_MENU_ENTRY__PAGE:
        return page != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == NamedElement.class)
    {
      switch (derivedFeatureID)
      {
        case WafPackage.FIXED_PAGE_MENU_ENTRY__NAME: return OrmPackage.NAMED_ELEMENT__NAME;
        default: return -1;
      }
    }
    if (baseClass == NamedDisplayElement.class)
    {
      switch (derivedFeatureID)
      {
        case WafPackage.FIXED_PAGE_MENU_ENTRY__DISPLAY_LABEL: return OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;
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
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == NamedElement.class)
    {
      switch (baseFeatureID)
      {
        case OrmPackage.NAMED_ELEMENT__NAME: return WafPackage.FIXED_PAGE_MENU_ENTRY__NAME;
        default: return -1;
      }
    }
    if (baseClass == NamedDisplayElement.class)
    {
      switch (baseFeatureID)
      {
        case OrmPackage.NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL: return WafPackage.FIXED_PAGE_MENU_ENTRY__DISPLAY_LABEL;
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", displayLabel: ");
    result.append(displayLabel);
    result.append(')');
    return result.toString();
  }

} //FixedPageMenuEntryImpl
