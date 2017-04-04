/**
 */
package uk.ac.man.cs.mdsd.service;

import uk.ac.man.cs.mdsd.expression.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.service.ParameterReference#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.service.ServicePackage#getParameterReference()
 * @model
 * @generated
 */
public interface ParameterReference extends Variable {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(SelectionParameter)
	 * @see uk.ac.man.cs.mdsd.service.ServicePackage#getParameterReference_Parameter()
	 * @model required="true"
	 * @generated
	 */
	SelectionParameter getParameter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.service.ParameterReference#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(SelectionParameter value);

} // ParameterReference
