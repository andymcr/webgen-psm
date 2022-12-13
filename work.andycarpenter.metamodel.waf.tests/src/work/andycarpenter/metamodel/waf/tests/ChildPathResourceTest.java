/**
 */
package work.andycarpenter.metamodel.waf.tests;

import junit.textui.TestRunner;

import work.andycarpenter.metamodel.waf.ChildPathResource;
import work.andycarpenter.metamodel.waf.WafFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Child Path Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChildPathResourceTest extends PathResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChildPathResourceTest.class);
	}

	/**
	 * Constructs a new Child Path Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildPathResourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Child Path Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChildPathResource getFixture() {
		return (ChildPathResource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WafFactory.eINSTANCE.createChildPathResource());
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

} //ChildPathResourceTest
