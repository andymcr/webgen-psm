/**
 */
package work.andycarpenter.psms.base;

import work.andycarpenter.psms.expression.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.psms.base.ParameterReference#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.psms.base.BasePackage#getParameterReference()
 * @model
 * @generated
 */
public interface ParameterReference extends Variable {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(FormalParameter)
	 * @see work.andycarpenter.psms.base.BasePackage#getParameterReference_Parameter()
	 * @model required="true"
	 * @generated
	 */
	FormalParameter getParameter();

	/**
	 * Sets the value of the '{@link work.andycarpenter.psms.base.ParameterReference#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(FormalParameter value);

} // ParameterReference
