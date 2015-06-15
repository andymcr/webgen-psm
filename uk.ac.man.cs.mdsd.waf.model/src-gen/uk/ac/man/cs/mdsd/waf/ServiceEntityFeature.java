/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Entity Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceEntityFeature#getViewColumnName <em>View Column Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceEntityFeature()
 * @model abstract="true"
 * @generated
 */
public interface ServiceEntityFeature extends ServiceFeature, NamedElement, IncludedFeature
{
  /**
   * Returns the value of the '<em><b>View Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View Column Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View Column Name</em>' attribute.
   * @see #setViewColumnName(String)
   * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceEntityFeature_ViewColumnName()
   * @model unique="false"
   * @generated
   */
  String getViewColumnName();

  /**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceEntityFeature#getViewColumnName <em>View Column Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View Column Name</em>' attribute.
   * @see #getViewColumnName()
   * @generated
   */
  void setViewColumnName(String value);

} // ServiceEntityFeature
