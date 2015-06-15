/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitElement#getServiceFeature <em>Service Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitElement#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitElement#getValidationPattern <em>Validation Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitElement()
 * @model
 * @generated
 */
public interface UnitElement extends UnitFeature, IncludedElement
{
  /**
   * Returns the value of the '<em><b>Service Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Feature</em>' reference.
   * @see #setServiceFeature(ServiceEntityElement)
   * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitElement_ServiceFeature()
   * @model required="true"
   * @generated
   */
  ServiceEntityElement getServiceFeature();

  /**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitElement#getServiceFeature <em>Service Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service Feature</em>' reference.
   * @see #getServiceFeature()
   * @generated
   */
  void setServiceFeature(ServiceEntityElement value);

  /**
   * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Placeholder</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Placeholder</em>' attribute.
   * @see #setPlaceholder(String)
   * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitElement_Placeholder()
   * @model unique="false"
   * @generated
   */
  String getPlaceholder();

  /**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitElement#getPlaceholder <em>Placeholder</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Placeholder</em>' attribute.
   * @see #getPlaceholder()
   * @generated
   */
  void setPlaceholder(String value);

  /**
   * Returns the value of the '<em><b>Validation Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validation Pattern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validation Pattern</em>' attribute.
   * @see #setValidationPattern(String)
   * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitElement_ValidationPattern()
   * @model unique="false"
   * @generated
   */
  String getValidationPattern();

  /**
   * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitElement#getValidationPattern <em>Validation Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validation Pattern</em>' attribute.
   * @see #getValidationPattern()
   * @generated
   */
  void setValidationPattern(String value);

} // UnitElement
