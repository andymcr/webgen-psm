/**
 */
package work.andycarpenter.metamodel.waf.tests;

import junit.textui.TestRunner;

import work.andycarpenter.metamodel.waf.ChildPathAssociation;
import work.andycarpenter.metamodel.waf.WafFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Child Path Association</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChildPathAssociationTest extends PathAssociationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChildPathAssociationTest.class);
	}

	/**
	 * Constructs a new Child Path Association test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChildPathAssociationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Child Path Association test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChildPathAssociation getFixture() {
		return (ChildPathAssociation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WafFactory.eINSTANCE.createChildPathAssociation());
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

} //ChildPathAssociationTest
