/**
 */
package work.andycarpenter.metamodel.waf.tests;

import junit.textui.TestRunner;

import work.andycarpenter.metamodel.waf.ContainerSelectAction;
import work.andycarpenter.metamodel.waf.WafFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Container Select Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.waf.ContainerSelectAction#isContainerAction() <em>Is Container Action</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ContainerSelectActionTest extends SelectActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContainerSelectActionTest.class);
	}

	/**
	 * Constructs a new Container Select Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerSelectActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Container Select Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContainerSelectAction getFixture() {
		return (ContainerSelectAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WafFactory.eINSTANCE.createContainerSelectAction());
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
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ContainerSelectAction#isContainerAction() <em>Is Container Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ContainerSelectAction#isContainerAction()
	 * @generated
	 */
	public void testIsContainerAction() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ContainerSelectActionTest
