/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ActionUnit#isOmitFieldLabels <em>Omit Field Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getActionUnit()
 * @model
 * @generated
 */
public interface ActionUnit extends ControlUnit
{
  /**
   * Returns the value of the '<em><b>Omit Field Labels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Omit Field Labels</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Omit Field Labels</em>' attribute.
   * @see #setOmitFieldLabels(boolean)
   * @see uk.ac.man.cs.mdsd.waf.WafPackage#getActionUnit_OmitFieldLabels()
   * @model unique="false"
   * @generated
   */
  boolean isOmitFieldLabels();

  /**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ActionUnit#isOmitFieldLabels <em>Omit Field Labels</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Omit Field Labels</em>' attribute.
   * @see #isOmitFieldLabels()
   * @generated
   */
  void setOmitFieldLabels(boolean value);

} // ActionUnit