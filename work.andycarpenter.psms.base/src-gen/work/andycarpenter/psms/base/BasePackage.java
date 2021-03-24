/**
 */
package work.andycarpenter.psms.base;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import work.andycarpenter.psms.expression.ExpressionPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see work.andycarpenter.psms.base.BaseFactory
 * @model kind="package"
 * @generated
 */
public interface BasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://andycarpenter.work/psm/Base";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "base";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasePackage eINSTANCE = work.andycarpenter.psms.base.impl.BasePackageImpl.init();

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.impl.NullLiteralImpl <em>Null Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.impl.NullLiteralImpl
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getNullLiteral()
	 * @generated
	 */
	int NULL_LITERAL = 0;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL__SUFFIXES = ExpressionPackage.LITERAL__SUFFIXES;

	/**
	 * The number of structural features of the '<em>Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_FEATURE_COUNT = ExpressionPackage.LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_OPERATION_COUNT = ExpressionPackage.LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.impl.BooleanLiteralImpl
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 1;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__SUFFIXES = ExpressionPackage.LITERAL__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = ExpressionPackage.LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = ExpressionPackage.LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_OPERATION_COUNT = ExpressionPackage.LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.impl.IntegerLiteralImpl
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__SUFFIXES = ExpressionPackage.LITERAL__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = ExpressionPackage.LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = ExpressionPackage.LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_OPERATION_COUNT = ExpressionPackage.LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.impl.StringLiteralImpl
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__SUFFIXES = ExpressionPackage.LITERAL__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = ExpressionPackage.LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = ExpressionPackage.LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = ExpressionPackage.LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.impl.TimeLiteralImpl <em>Time Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.impl.TimeLiteralImpl
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getTimeLiteral()
	 * @generated
	 */
	int TIME_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL__SUFFIXES = ExpressionPackage.LITERAL__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL__VALUE = ExpressionPackage.LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL_FEATURE_COUNT = ExpressionPackage.LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_LITERAL_OPERATION_COUNT = ExpressionPackage.LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.impl.CurrentTimeImpl <em>Current Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.impl.CurrentTimeImpl
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getCurrentTime()
	 * @generated
	 */
	int CURRENT_TIME = 5;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME__SUFFIXES = ExpressionPackage.VARIABLE__SUFFIXES;

	/**
	 * The number of structural features of the '<em>Current Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_FEATURE_COUNT = ExpressionPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Current Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_TIME_OPERATION_COUNT = ExpressionPackage.VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.impl.CurrentUserImpl <em>Current User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.impl.CurrentUserImpl
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getCurrentUser()
	 * @generated
	 */
	int CURRENT_USER = 6;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER__SUFFIXES = ExpressionPackage.VARIABLE__SUFFIXES;

	/**
	 * The number of structural features of the '<em>Current User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER_FEATURE_COUNT = ExpressionPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Current User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER_OPERATION_COUNT = ExpressionPackage.VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.impl.NamedElementImpl
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.impl.NamedDisplayElementImpl <em>Named Display Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.impl.NamedDisplayElementImpl
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getNamedDisplayElement()
	 * @generated
	 */
	int NAMED_DISPLAY_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DISPLAY_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Display Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DISPLAY_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Display Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DISPLAY_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.ConstantContainer <em>Constant Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.ConstantContainer
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getConstantContainer()
	 * @generated
	 */
	int CONSTANT_CONTAINER = 9;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_CONTAINER__CONSTANTS = 0;

	/**
	 * The number of structural features of the '<em>Constant Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constant Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.impl.ConstantImpl
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Defined By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__DEFINED_BY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.impl.ConstantReferenceImpl <em>Constant Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.impl.ConstantReferenceImpl
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getConstantReference()
	 * @generated
	 */
	int CONSTANT_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_REFERENCE__SUFFIXES = ExpressionPackage.VARIABLE__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_REFERENCE__VALUE = ExpressionPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_REFERENCE_FEATURE_COUNT = ExpressionPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constant Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_REFERENCE_OPERATION_COUNT = ExpressionPackage.VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.impl.ClassifierImpl
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__DISPLAY_LABEL = NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Is Boolean Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_BOOLEAN_CLASSIFIER = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Email Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_EMAIL_CLASSIFIER = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Enumeration Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_ENUMERATION_CLASSIFIER = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Integer Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_INTEGER_CLASSIFIER = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is String Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_STRING_CLASSIFIER = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Textarea Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_TEXTAREA_CLASSIFIER = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.impl.DataTypeImpl
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DISPLAY_LABEL = CLASSIFIER__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Is Boolean Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_BOOLEAN_CLASSIFIER = CLASSIFIER__IS_BOOLEAN_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Email Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_EMAIL_CLASSIFIER = CLASSIFIER__IS_EMAIL_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Enumeration Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_ENUMERATION_CLASSIFIER = CLASSIFIER__IS_ENUMERATION_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Integer Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_INTEGER_CLASSIFIER = CLASSIFIER__IS_INTEGER_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is String Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_STRING_CLASSIFIER = CLASSIFIER__IS_STRING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Textarea Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_TEXTAREA_CLASSIFIER = CLASSIFIER__IS_TEXTAREA_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Boolean Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_BOOLEAN_DATA_TYPE = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Email Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_EMAIL_DATA_TYPE = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Enumeration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_ENUMERATION_TYPE = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Integer Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_INTEGER_DATA_TYPE = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is String Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_STRING_DATA_TYPE = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Textarea Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_TEXTAREA_DATA_TYPE = CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.impl.EnumerationTypeImpl
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getEnumerationType()
	 * @generated
	 */
	int ENUMERATION_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__DISPLAY_LABEL = DATA_TYPE__DISPLAY_LABEL;

	/**
	 * The feature id for the '<em><b>Is Boolean Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__IS_BOOLEAN_CLASSIFIER = DATA_TYPE__IS_BOOLEAN_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Email Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__IS_EMAIL_CLASSIFIER = DATA_TYPE__IS_EMAIL_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Enumeration Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__IS_ENUMERATION_CLASSIFIER = DATA_TYPE__IS_ENUMERATION_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Integer Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__IS_INTEGER_CLASSIFIER = DATA_TYPE__IS_INTEGER_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is String Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__IS_STRING_CLASSIFIER = DATA_TYPE__IS_STRING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Textarea Classifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__IS_TEXTAREA_CLASSIFIER = DATA_TYPE__IS_TEXTAREA_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Boolean Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__IS_BOOLEAN_DATA_TYPE = DATA_TYPE__IS_BOOLEAN_DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Is Email Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__IS_EMAIL_DATA_TYPE = DATA_TYPE__IS_EMAIL_DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Is Enumeration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__IS_ENUMERATION_TYPE = DATA_TYPE__IS_ENUMERATION_TYPE;

	/**
	 * The feature id for the '<em><b>Is Integer Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__IS_INTEGER_DATA_TYPE = DATA_TYPE__IS_INTEGER_DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Is String Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__IS_STRING_DATA_TYPE = DATA_TYPE__IS_STRING_DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Is Textarea Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__IS_TEXTAREA_DATA_TYPE = DATA_TYPE__IS_TEXTAREA_DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__ENUMERATIONS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.impl.EnumerationLiteralImpl
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = NAMED_DISPLAY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Display Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__DISPLAY_LABEL = NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = NAMED_DISPLAY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_OPERATION_COUNT = NAMED_DISPLAY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.FormalParameterList <em>Formal Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.FormalParameterList
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getFormalParameterList()
	 * @generated
	 */
	int FORMAL_PARAMETER_LIST = 16;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_LIST__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Formal Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Formal Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.impl.FormalParameterImpl
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getFormalParameter()
	 * @generated
	 */
	int FORMAL_PARAMETER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__DATA_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__DEFAULT_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__PLACEHOLDER = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Formal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Formal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link work.andycarpenter.psms.base.impl.ParameterReferenceImpl <em>Parameter Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.psms.base.impl.ParameterReferenceImpl
	 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getParameterReference()
	 * @generated
	 */
	int PARAMETER_REFERENCE = 18;

	/**
	 * The feature id for the '<em><b>Suffixes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE__SUFFIXES = ExpressionPackage.VARIABLE__SUFFIXES;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE__PARAMETER = ExpressionPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE_FEATURE_COUNT = ExpressionPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE_OPERATION_COUNT = ExpressionPackage.VARIABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Literal</em>'.
	 * @see work.andycarpenter.psms.base.NullLiteral
	 * @generated
	 */
	EClass getNullLiteral();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see work.andycarpenter.psms.base.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.BooleanLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see work.andycarpenter.psms.base.BooleanLiteral#getValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see work.andycarpenter.psms.base.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see work.andycarpenter.psms.base.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see work.andycarpenter.psms.base.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see work.andycarpenter.psms.base.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.TimeLiteral <em>Time Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Literal</em>'.
	 * @see work.andycarpenter.psms.base.TimeLiteral
	 * @generated
	 */
	EClass getTimeLiteral();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.TimeLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see work.andycarpenter.psms.base.TimeLiteral#getValue()
	 * @see #getTimeLiteral()
	 * @generated
	 */
	EAttribute getTimeLiteral_Value();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.CurrentTime <em>Current Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Time</em>'.
	 * @see work.andycarpenter.psms.base.CurrentTime
	 * @generated
	 */
	EClass getCurrentTime();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.CurrentUser <em>Current User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current User</em>'.
	 * @see work.andycarpenter.psms.base.CurrentUser
	 * @generated
	 */
	EClass getCurrentUser();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see work.andycarpenter.psms.base.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see work.andycarpenter.psms.base.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.NamedDisplayElement <em>Named Display Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Display Element</em>'.
	 * @see work.andycarpenter.psms.base.NamedDisplayElement
	 * @generated
	 */
	EClass getNamedDisplayElement();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.NamedDisplayElement#getDisplayLabel <em>Display Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Label</em>'.
	 * @see work.andycarpenter.psms.base.NamedDisplayElement#getDisplayLabel()
	 * @see #getNamedDisplayElement()
	 * @generated
	 */
	EAttribute getNamedDisplayElement_DisplayLabel();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.ConstantContainer <em>Constant Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Container</em>'.
	 * @see work.andycarpenter.psms.base.ConstantContainer
	 * @generated
	 */
	EClass getConstantContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.psms.base.ConstantContainer#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constants</em>'.
	 * @see work.andycarpenter.psms.base.ConstantContainer#getConstants()
	 * @see #getConstantContainer()
	 * @generated
	 */
	EReference getConstantContainer_Constants();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see work.andycarpenter.psms.base.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the container reference '{@link work.andycarpenter.psms.base.Constant#getDefinedBy <em>Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Defined By</em>'.
	 * @see work.andycarpenter.psms.base.Constant#getDefinedBy()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_DefinedBy();

	/**
	 * Returns the meta object for the containment reference '{@link work.andycarpenter.psms.base.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see work.andycarpenter.psms.base.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Value();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.ConstantReference <em>Constant Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Reference</em>'.
	 * @see work.andycarpenter.psms.base.ConstantReference
	 * @generated
	 */
	EClass getConstantReference();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.psms.base.ConstantReference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see work.andycarpenter.psms.base.ConstantReference#getValue()
	 * @see #getConstantReference()
	 * @generated
	 */
	EReference getConstantReference_Value();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see work.andycarpenter.psms.base.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.Classifier#isIsBooleanClassifier <em>Is Boolean Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Boolean Classifier</em>'.
	 * @see work.andycarpenter.psms.base.Classifier#isIsBooleanClassifier()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_IsBooleanClassifier();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.Classifier#isIsEmailClassifier <em>Is Email Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Email Classifier</em>'.
	 * @see work.andycarpenter.psms.base.Classifier#isIsEmailClassifier()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_IsEmailClassifier();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.Classifier#isIsEnumerationClassifier <em>Is Enumeration Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Enumeration Classifier</em>'.
	 * @see work.andycarpenter.psms.base.Classifier#isIsEnumerationClassifier()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_IsEnumerationClassifier();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.Classifier#isIsIntegerClassifier <em>Is Integer Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Integer Classifier</em>'.
	 * @see work.andycarpenter.psms.base.Classifier#isIsIntegerClassifier()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_IsIntegerClassifier();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.Classifier#isIsStringClassifier <em>Is String Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is String Classifier</em>'.
	 * @see work.andycarpenter.psms.base.Classifier#isIsStringClassifier()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_IsStringClassifier();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.Classifier#isIsTextareaClassifier <em>Is Textarea Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Textarea Classifier</em>'.
	 * @see work.andycarpenter.psms.base.Classifier#isIsTextareaClassifier()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_IsTextareaClassifier();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see work.andycarpenter.psms.base.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.DataType#isIsBooleanDataType <em>Is Boolean Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Boolean Data Type</em>'.
	 * @see work.andycarpenter.psms.base.DataType#isIsBooleanDataType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_IsBooleanDataType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.DataType#isIsEmailDataType <em>Is Email Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Email Data Type</em>'.
	 * @see work.andycarpenter.psms.base.DataType#isIsEmailDataType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_IsEmailDataType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.DataType#isIsEnumerationType <em>Is Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Enumeration Type</em>'.
	 * @see work.andycarpenter.psms.base.DataType#isIsEnumerationType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_IsEnumerationType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.DataType#isIsIntegerDataType <em>Is Integer Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Integer Data Type</em>'.
	 * @see work.andycarpenter.psms.base.DataType#isIsIntegerDataType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_IsIntegerDataType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.DataType#isIsStringDataType <em>Is String Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is String Data Type</em>'.
	 * @see work.andycarpenter.psms.base.DataType#isIsStringDataType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_IsStringDataType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.DataType#isIsTextareaDataType <em>Is Textarea Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Textarea Data Type</em>'.
	 * @see work.andycarpenter.psms.base.DataType#isIsTextareaDataType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_IsTextareaDataType();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type</em>'.
	 * @see work.andycarpenter.psms.base.EnumerationType
	 * @generated
	 */
	EClass getEnumerationType();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.psms.base.EnumerationType#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerations</em>'.
	 * @see work.andycarpenter.psms.base.EnumerationType#getEnumerations()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EReference getEnumerationType_Enumerations();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see work.andycarpenter.psms.base.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.FormalParameterList <em>Formal Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Parameter List</em>'.
	 * @see work.andycarpenter.psms.base.FormalParameterList
	 * @generated
	 */
	EClass getFormalParameterList();

	/**
	 * Returns the meta object for the containment reference list '{@link work.andycarpenter.psms.base.FormalParameterList#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see work.andycarpenter.psms.base.FormalParameterList#getParameters()
	 * @see #getFormalParameterList()
	 * @generated
	 */
	EReference getFormalParameterList_Parameters();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.FormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Parameter</em>'.
	 * @see work.andycarpenter.psms.base.FormalParameter
	 * @generated
	 */
	EClass getFormalParameter();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.psms.base.FormalParameter#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see work.andycarpenter.psms.base.FormalParameter#getDataType()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EReference getFormalParameter_DataType();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.FormalParameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see work.andycarpenter.psms.base.FormalParameter#getDefaultValue()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EAttribute getFormalParameter_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.FormalParameter#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see work.andycarpenter.psms.base.FormalParameter#getPlaceholder()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EAttribute getFormalParameter_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link work.andycarpenter.psms.base.FormalParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see work.andycarpenter.psms.base.FormalParameter#getDescription()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EAttribute getFormalParameter_Description();

	/**
	 * Returns the meta object for class '{@link work.andycarpenter.psms.base.ParameterReference <em>Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Reference</em>'.
	 * @see work.andycarpenter.psms.base.ParameterReference
	 * @generated
	 */
	EClass getParameterReference();

	/**
	 * Returns the meta object for the reference '{@link work.andycarpenter.psms.base.ParameterReference#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see work.andycarpenter.psms.base.ParameterReference#getParameter()
	 * @see #getParameterReference()
	 * @generated
	 */
	EReference getParameterReference_Parameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BaseFactory getBaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.impl.NullLiteralImpl <em>Null Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.impl.NullLiteralImpl
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getNullLiteral()
		 * @generated
		 */
		EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.impl.BooleanLiteralImpl
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.impl.IntegerLiteralImpl
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.impl.StringLiteralImpl
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.impl.TimeLiteralImpl <em>Time Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.impl.TimeLiteralImpl
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getTimeLiteral()
		 * @generated
		 */
		EClass TIME_LITERAL = eINSTANCE.getTimeLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_LITERAL__VALUE = eINSTANCE.getTimeLiteral_Value();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.impl.CurrentTimeImpl <em>Current Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.impl.CurrentTimeImpl
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getCurrentTime()
		 * @generated
		 */
		EClass CURRENT_TIME = eINSTANCE.getCurrentTime();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.impl.CurrentUserImpl <em>Current User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.impl.CurrentUserImpl
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getCurrentUser()
		 * @generated
		 */
		EClass CURRENT_USER = eINSTANCE.getCurrentUser();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.impl.NamedElementImpl
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.impl.NamedDisplayElementImpl <em>Named Display Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.impl.NamedDisplayElementImpl
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getNamedDisplayElement()
		 * @generated
		 */
		EClass NAMED_DISPLAY_ELEMENT = eINSTANCE.getNamedDisplayElement();

		/**
		 * The meta object literal for the '<em><b>Display Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL = eINSTANCE.getNamedDisplayElement_DisplayLabel();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.ConstantContainer <em>Constant Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.ConstantContainer
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getConstantContainer()
		 * @generated
		 */
		EClass CONSTANT_CONTAINER = eINSTANCE.getConstantContainer();

		/**
		 * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_CONTAINER__CONSTANTS = eINSTANCE.getConstantContainer_Constants();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.impl.ConstantImpl
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Defined By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__DEFINED_BY = eINSTANCE.getConstant_DefinedBy();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.impl.ConstantReferenceImpl <em>Constant Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.impl.ConstantReferenceImpl
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getConstantReference()
		 * @generated
		 */
		EClass CONSTANT_REFERENCE = eINSTANCE.getConstantReference();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_REFERENCE__VALUE = eINSTANCE.getConstantReference_Value();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.impl.ClassifierImpl
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Is Boolean Classifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__IS_BOOLEAN_CLASSIFIER = eINSTANCE.getClassifier_IsBooleanClassifier();

		/**
		 * The meta object literal for the '<em><b>Is Email Classifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__IS_EMAIL_CLASSIFIER = eINSTANCE.getClassifier_IsEmailClassifier();

		/**
		 * The meta object literal for the '<em><b>Is Enumeration Classifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__IS_ENUMERATION_CLASSIFIER = eINSTANCE.getClassifier_IsEnumerationClassifier();

		/**
		 * The meta object literal for the '<em><b>Is Integer Classifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__IS_INTEGER_CLASSIFIER = eINSTANCE.getClassifier_IsIntegerClassifier();

		/**
		 * The meta object literal for the '<em><b>Is String Classifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__IS_STRING_CLASSIFIER = eINSTANCE.getClassifier_IsStringClassifier();

		/**
		 * The meta object literal for the '<em><b>Is Textarea Classifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__IS_TEXTAREA_CLASSIFIER = eINSTANCE.getClassifier_IsTextareaClassifier();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.impl.DataTypeImpl
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Is Boolean Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__IS_BOOLEAN_DATA_TYPE = eINSTANCE.getDataType_IsBooleanDataType();

		/**
		 * The meta object literal for the '<em><b>Is Email Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__IS_EMAIL_DATA_TYPE = eINSTANCE.getDataType_IsEmailDataType();

		/**
		 * The meta object literal for the '<em><b>Is Enumeration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__IS_ENUMERATION_TYPE = eINSTANCE.getDataType_IsEnumerationType();

		/**
		 * The meta object literal for the '<em><b>Is Integer Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__IS_INTEGER_DATA_TYPE = eINSTANCE.getDataType_IsIntegerDataType();

		/**
		 * The meta object literal for the '<em><b>Is String Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__IS_STRING_DATA_TYPE = eINSTANCE.getDataType_IsStringDataType();

		/**
		 * The meta object literal for the '<em><b>Is Textarea Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__IS_TEXTAREA_DATA_TYPE = eINSTANCE.getDataType_IsTextareaDataType();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.impl.EnumerationTypeImpl
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getEnumerationType()
		 * @generated
		 */
		EClass ENUMERATION_TYPE = eINSTANCE.getEnumerationType();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_TYPE__ENUMERATIONS = eINSTANCE.getEnumerationType_Enumerations();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.impl.EnumerationLiteralImpl
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.FormalParameterList <em>Formal Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.FormalParameterList
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getFormalParameterList()
		 * @generated
		 */
		EClass FORMAL_PARAMETER_LIST = eINSTANCE.getFormalParameterList();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_PARAMETER_LIST__PARAMETERS = eINSTANCE.getFormalParameterList_Parameters();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.impl.FormalParameterImpl
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getFormalParameter()
		 * @generated
		 */
		EClass FORMAL_PARAMETER = eINSTANCE.getFormalParameter();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_PARAMETER__DATA_TYPE = eINSTANCE.getFormalParameter_DataType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_PARAMETER__DEFAULT_VALUE = eINSTANCE.getFormalParameter_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_PARAMETER__PLACEHOLDER = eINSTANCE.getFormalParameter_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_PARAMETER__DESCRIPTION = eINSTANCE.getFormalParameter_Description();

		/**
		 * The meta object literal for the '{@link work.andycarpenter.psms.base.impl.ParameterReferenceImpl <em>Parameter Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see work.andycarpenter.psms.base.impl.ParameterReferenceImpl
		 * @see work.andycarpenter.psms.base.impl.BasePackageImpl#getParameterReference()
		 * @generated
		 */
		EClass PARAMETER_REFERENCE = eINSTANCE.getParameterReference();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_REFERENCE__PARAMETER = eINSTANCE.getParameterReference_Parameter();

	}

} //BasePackage
