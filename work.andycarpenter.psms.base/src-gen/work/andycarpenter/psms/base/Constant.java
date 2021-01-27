/**
 */
package work.andycarpenter.psms.base;

import work.andycarpenter.psms.expression.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.psms.base.Constant#getDefinedBy <em>Defined By</em>}</li>
 *   <li>{@link work.andycarpenter.psms.base.Constant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.psms.base.BasePackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Defined By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.psms.base.ConstantContainer#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined By</em>' container reference.
	 * @see #setDefinedBy(ConstantContainer)
	 * @see work.andycarpenter.psms.base.BasePackage#getConstant_DefinedBy()
	 * @see work.andycarpenter.psms.base.ConstantContainer#getConstants
	 * @model opposite="constants" transient="false"
	 * @generated
	 */
	ConstantContainer getDefinedBy();

	/**
	 * Sets the value of the '{@link work.andycarpenter.psms.base.Constant#getDefinedBy <em>Defined By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defined By</em>' container reference.
	 * @see #getDefinedBy()
	 * @generated
	 */
	void setDefinedBy(ConstantContainer value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see work.andycarpenter.psms.base.BasePackage#getConstant_Value()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.psms.base.Constant#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // Constant
