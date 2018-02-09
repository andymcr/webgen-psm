/**
 */
package uk.ac.man.cs.mdsd.expression;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.man.cs.mdsd.expression.ExpressionPackage
 * @generated
 */
public interface ExpressionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionFactory eINSTANCE = uk.ac.man.cs.mdsd.expression.impl.ExpressionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Null Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Literal</em>'.
	 * @generated
	 */
	NullLiteral createNullLiteral();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns a new object of class '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Literal</em>'.
	 * @generated
	 */
	IntegerLiteral createIntegerLiteral();

	/**
	 * Returns a new object of class '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal</em>'.
	 * @generated
	 */
	StringLiteral createStringLiteral();

	/**
	 * Returns a new object of class '<em>Time Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Literal</em>'.
	 * @generated
	 */
	TimeLiteral createTimeLiteral();

	/**
	 * Returns a new object of class '<em>Current Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Time</em>'.
	 * @generated
	 */
	CurrentTime createCurrentTime();

	/**
	 * Returns a new object of class '<em>Current User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current User</em>'.
	 * @generated
	 */
	CurrentUser createCurrentUser();

	/**
	 * Returns a new object of class '<em>Predicate Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Boolean Operator</em>'.
	 * @generated
	 */
	PredicateBooleanOperator createPredicateBooleanOperator();

	/**
	 * Returns a new object of class '<em>Predicate Equality Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Equality Operator</em>'.
	 * @generated
	 */
	PredicateEqualityOperator createPredicateEqualityOperator();

	/**
	 * Returns a new object of class '<em>Predicate Comparison Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Comparison Operator</em>'.
	 * @generated
	 */
	PredicateComparisonOperator createPredicateComparisonOperator();

	/**
	 * Returns a new object of class '<em>Predicate In Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate In Operator</em>'.
	 * @generated
	 */
	PredicateInOperator createPredicateInOperator();

	/**
	 * Returns a new object of class '<em>Predicate Is Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Is Operator</em>'.
	 * @generated
	 */
	PredicateIsOperator createPredicateIsOperator();

	/**
	 * Returns a new object of class '<em>Predicate Like Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Like Operator</em>'.
	 * @generated
	 */
	PredicateLikeOperator createPredicateLikeOperator();

	/**
	 * Returns a new object of class '<em>Predicate Is Empty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Is Empty</em>'.
	 * @generated
	 */
	PredicateIsEmpty createPredicateIsEmpty();

	/**
	 * Returns a new object of class '<em>Predicate Is Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Is Null</em>'.
	 * @generated
	 */
	PredicateIsNull createPredicateIsNull();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExpressionPackage getExpressionPackage();

} //ExpressionFactory
