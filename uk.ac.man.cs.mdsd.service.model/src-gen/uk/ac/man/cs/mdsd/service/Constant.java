/**
 */
package uk.ac.man.cs.mdsd.service;

import uk.ac.man.cs.mdsd.expression.Variable;

import uk.ac.man.cs.mdsd.orm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.service.Constant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.service.ServicePackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends NamedElement, Variable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see uk.ac.man.cs.mdsd.service.ServicePackage#getConstant_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.service.Constant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Constant
