/**
 */
package work.andycarpenter.metamodel.waf.tests;

import junit.textui.TestRunner;
import work.andycarpenter.metamodel.waf.NumericFilter;
import work.andycarpenter.metamodel.waf.WafFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Numeric Filter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumericFilterTest extends CollectionFilterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NumericFilterTest.class);
	}

	/**
	 * Constructs a new Numeric Filter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericFilterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Numeric Filter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NumericFilter getFixture() {
		return (NumericFilter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WafFactory.eINSTANCE.createNumericFilter());
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

} //NumericFilterTest
