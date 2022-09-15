/**
 */
package work.andycarpenter.metamodel.waf.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import work.andycarpenter.metamodel.waf.SiteProperties;
import work.andycarpenter.metamodel.waf.WafFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Site Properties</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SitePropertiesTest extends TestCase {

	/**
	 * The fixture for this Site Properties test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteProperties fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SitePropertiesTest.class);
	}

	/**
	 * Constructs a new Site Properties test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SitePropertiesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Site Properties test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SiteProperties fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Site Properties test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteProperties getFixture() {
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
		setFixture(WafFactory.eINSTANCE.createSiteProperties());
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

} //SitePropertiesTest
