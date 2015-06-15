/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitFeature#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getDisplayOption <em>Display Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getMaximumDisplaySize <em>Maximum Display Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitFeature#isAutofocus <em>Autofocus</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitFeature()
 * @model abstract="true"
 * @generated
 */
public interface UnitFeature extends NamedElement, IncludedFeature, UnitField, InlineActionContainer
{
  /**
   * Returns the value of the '<em><b>Only Display When Not Empty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Only Display When Not Empty</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Only Display When Not Empty</em>' attribute.
   * @see #setOnlyDisplayWhenNotEmpty(boolean)
   * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitFeature_OnlyDisplayWhenNotEmpty()
   * @model unique="false"
   * @generated
   */
  boolean isOnlyDisplayWhenNotEmpty();

  /**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Only Display When Not Empty</em>' attribute.
   * @see #isOnlyDisplayWhenNotEmpty()
   * @generated
   */
  void setOnlyDisplayWhenNotEmpty(boolean value);

  /**
   * Returns the value of the '<em><b>Display Option</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.waf.CollectionDisplayOptions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Display Option</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Display Option</em>' attribute.
   * @see uk.ac.man.cs.mdsd.waf.CollectionDisplayOptions
   * @see #setDisplayOption(CollectionDisplayOptions)
   * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitFeature_DisplayOption()
   * @model unique="false"
   * @generated
   */
  CollectionDisplayOptions getDisplayOption();

  /**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getDisplayOption <em>Display Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Display Option</em>' attribute.
   * @see uk.ac.man.cs.mdsd.waf.CollectionDisplayOptions
   * @see #getDisplayOption()
   * @generated
   */
  void setDisplayOption(CollectionDisplayOptions value);

  /**
   * Returns the value of the '<em><b>Maximum Display Size</b></em>' attribute.
   * The default value is <code>"-1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maximum Display Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maximum Display Size</em>' attribute.
   * @see #setMaximumDisplaySize(int)
   * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitFeature_MaximumDisplaySize()
   * @model default="-1" unique="false"
   * @generated
   */
  int getMaximumDisplaySize();

  /**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getMaximumDisplaySize <em>Maximum Display Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maximum Display Size</em>' attribute.
   * @see #getMaximumDisplaySize()
   * @generated
   */
  void setMaximumDisplaySize(int value);

  /**
   * Returns the value of the '<em><b>Autofocus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Autofocus</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Autofocus</em>' attribute.
   * @see #setAutofocus(boolean)
   * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitFeature_Autofocus()
   * @model unique="false"
   * @generated
   */
  boolean isAutofocus();

  /**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#isAutofocus <em>Autofocus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Autofocus</em>' attribute.
   * @see #isAutofocus()
   * @generated
   */
  void setAutofocus(boolean value);

} // UnitFeature
