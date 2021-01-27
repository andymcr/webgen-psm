/**
 */
package work.andycarpenter.psms.base;

import work.andycarpenter.psms.expression.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.psms.base.ConstantReference#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.psms.base.BasePackage#getConstantReference()
 * @model
 * @generated
 */
public interface ConstantReference extends Variable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Constant)
	 * @see work.andycarpenter.psms.base.BasePackage#getConstantReference_Value()
	 * @model required="true"
	 * @generated
	 */
	Constant getValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.psms.base.ConstantReference#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Constant value);

} // ConstantReference
