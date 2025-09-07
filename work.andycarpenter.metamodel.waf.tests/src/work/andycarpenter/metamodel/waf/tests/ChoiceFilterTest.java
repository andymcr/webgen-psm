/**
 */
package work.andycarpenter.metamodel.waf.tests;

import junit.textui.TestRunner;
import work.andycarpenter.metamodel.waf.ChoiceFilter;
import work.andycarpenter.metamodel.waf.WafFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Choice Filter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChoiceFilterTest extends CollectionFilterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChoiceFilterTest.class);
	}

	/**
	 * Constructs a new Choice Filter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceFilterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Choice Filter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ChoiceFilter getFixture() {
		return (ChoiceFilter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WafFactory.eINSTANCE.createChoiceFilter());
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

} //ChoiceFilterTest
