/**
 */
package work.andycarpenter.metamodel.waf.tests;

import junit.textui.TestRunner;
import work.andycarpenter.metamodel.waf.DateTimeFilter;
import work.andycarpenter.metamodel.waf.WafFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Date Time Filter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DateTimeFilterTest extends CollectionFilterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DateTimeFilterTest.class);
	}

	/**
	 * Constructs a new Date Time Filter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeFilterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Date Time Filter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DateTimeFilter getFixture() {
		return (DateTimeFilter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WafFactory.eINSTANCE.createDateTimeFilter());
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

} //DateTimeFilterTest
