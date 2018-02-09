/**
 */
package uk.ac.man.cs.mdsd.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Is Empty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.expression.PredicateIsEmpty#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.expression.ExpressionPackage#getPredicateIsEmpty()
 * @model
 * @generated
 */
public interface PredicateIsEmpty extends Predicate {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(Variable)
	 * @see uk.ac.man.cs.mdsd.expression.ExpressionPackage#getPredicateIsEmpty_Feature()
	 * @model containment="true"
	 * @generated
	 */
	Variable getFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.expression.PredicateIsEmpty#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Variable value);

} // PredicateIsEmpty
