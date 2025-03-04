/**
 */
package work.andycarpenter.metamodel.waf.tests;

import junit.textui.TestRunner;

import work.andycarpenter.metamodel.waf.DeleteAction;
import work.andycarpenter.metamodel.waf.WafFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delete Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.waf.DeleteAction#authorisation() <em>Authorisation</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DeleteAction#isInstanceAction() <em>Is Instance Action</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DeleteActionTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeleteActionTest.class);
	}

	/**
	 * Constructs a new Delete Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Delete Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeleteAction getFixture() {
		return (DeleteAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WafFactory.eINSTANCE.createDeleteAction());
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
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DeleteAction#authorisation() <em>Authorisation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DeleteAction#authorisation()
	 * @generated
	 */
	public void testAuthorisation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DeleteAction#isInstanceAction() <em>Is Instance Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DeleteAction#isInstanceAction()
	 * @generated
	 */
	public void testIsInstanceAction() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DeleteActionTest
