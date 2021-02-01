/**
 */
package work.andycarpenter.psms.base;

import work.andycarpenter.psms.expression.Literal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.psms.base.TimeLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.psms.base.BasePackage#getTimeLiteral()
 * @model
 * @generated
 */
public interface TimeLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see work.andycarpenter.psms.base.BasePackage#getTimeLiteral_Value()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.psms.base.TimeLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // TimeLiteral