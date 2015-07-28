/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.SelectTarget#getTargettingActions <em>Targetting Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelectTarget()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SelectTarget extends EObject
{
  /**
   * Returns the value of the '<em><b>Targetting Actions</b></em>' reference list.
   * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.SelectAction}.
   * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.SelectAction#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Targetting Actions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Targetting Actions</em>' reference list.
   * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelectTarget_TargettingActions()
   * @see uk.ac.man.cs.mdsd.waf.SelectAction#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<SelectAction> getTargettingActions();

} // SelectTarget