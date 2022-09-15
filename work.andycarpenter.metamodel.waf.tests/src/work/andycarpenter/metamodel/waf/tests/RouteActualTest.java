/**
 */
package work.andycarpenter.metamodel.waf.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import work.andycarpenter.metamodel.waf.RouteActual;
import work.andycarpenter.metamodel.waf.WafFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Route Actual</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RouteActualTest extends TestCase {

	/**
	 * The fixture for this Route Actual test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteActual fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RouteActualTest.class);
	}

	/**
	 * Constructs a new Route Actual test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteActualTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Route Actual test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RouteActual fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Route Actual test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteActual getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WafFactory.eINSTANCE.createRouteActual());
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

} //RouteActualTest
