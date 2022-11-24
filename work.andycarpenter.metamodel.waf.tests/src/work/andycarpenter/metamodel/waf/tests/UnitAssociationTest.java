/**
 */
package work.andycarpenter.metamodel.waf.tests;

import junit.textui.TestRunner;
import work.andycarpenter.metamodel.orm.OrmFactory;
import work.andycarpenter.metamodel.orm.Association;
import work.andycarpenter.metamodel.waf.UnitAssociation;
import work.andycarpenter.metamodel.waf.WafFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unit Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.waf.Path#isHasChild() <em>Has Child</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Path#getLeafFeature() <em>Leaf Feature</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Path#getContainingType() <em>Containing Type</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.PathAssociation#getName() <em>Name</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.PathAssociation#getTargetEntity() <em>Target Entity</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class UnitAssociationTest extends UnitFeatureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnitAssociationTest.class);
	}

	/**
	 * Constructs a new Unit Association test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitAssociationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unit Association test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnitAssociation getFixture() {
		return (UnitAssociation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WafFactory.eINSTANCE.createUnitAssociation());
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
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Path#getLeafFeature() <em>Leaf Feature</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Path#getLeafFeature()
	 * @generated
	 */
	public void testGetLeafFeature() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Path#getContainingType() <em>Containing Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Path#getContainingType()
	 * @generated
	 */
	public void testGetContainingType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Path#isHasChild() <em>Has Child</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Path#isHasChild()
	 * @generated
	 */
	public void testIsHasChild() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.orm.AssociationReference#getName() <em>Name</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.orm.AssociationReference#getName()
	 * @generated NOT
	 */
	public void testGetName() {
		UnitAssociation unitAssociation = getFixture();
		assertEquals("", unitAssociation.getName());

		String name = "jhw3lwip5";
		Association association = OrmFactory.eINSTANCE.createAssociation();
		unitAssociation.setAssociation(association);
		association.setName(name);
		assertEquals(name, unitAssociation.getName());
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.PathAssociation#setName(java.lang.String) <em>Name</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.PathAssociation#setName(java.lang.String)
	 * @generated
	 */
	public void testSetName() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.PathAssociation#getTargetEntity() <em>Target Entity</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.PathAssociation#getTargetEntity()
	 * @generated
	 */
	public void testGetTargetEntity() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //UnitAssociationTest
