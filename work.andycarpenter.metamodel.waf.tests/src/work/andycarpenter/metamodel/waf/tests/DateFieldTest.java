/**
 */
package work.andycarpenter.metamodel.waf.tests;

import junit.textui.TestRunner;

import work.andycarpenter.metamodel.waf.DateField;
import work.andycarpenter.metamodel.waf.WafFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Date Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.waf.DateField#isDateField() <em>Is Date Field</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DateFieldTest extends InterfaceFieldTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DateFieldTest.class);
	}

	/**
	 * Constructs a new Date Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateFieldTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Date Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DateField getFixture() {
		return (DateField)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WafFactory.eINSTANCE.createDateField());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DateField#isDateField() <em>Is Date Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DateField#isDateField()
	 * @generated
	 */
	public void testIsDateField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DateFieldTest
