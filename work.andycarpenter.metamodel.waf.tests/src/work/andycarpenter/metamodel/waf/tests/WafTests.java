/**
 */
package work.andycarpenter.metamodel.waf.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>waf</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class WafTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new WafTests("waf Tests");
		suite.addTestSuite(WafModelTest.class);
		suite.addTestSuite(NavigationTest.class);
		suite.addTestSuite(SubmenuEntryTest.class);
		suite.addTestSuite(PageTest.class);
		suite.addTestSuite(StaticUnitTest.class);
		suite.addTestSuite(UnitAttributeTest.class);
		suite.addTestSuite(UnitAssociationTest.class);
		suite.addTestSuite(FeaturePathAttributeTest.class);
		suite.addTestSuite(FeaturePathAssociationTest.class);
		suite.addTestSuite(FeaturePathLabelTest.class);
		suite.addTestSuite(ChildPathAttributeTest.class);
		suite.addTestSuite(ChildPathAssociationTest.class);
		suite.addTestSuite(UnitLabelTest.class);
		suite.addTestSuite(DataTypeFieldTest.class);
		suite.addTestSuite(DateFieldTest.class);
		suite.addTestSuite(SingletonUnitTest.class);
		suite.addTestSuite(CreateUnitTest.class);
		suite.addTestSuite(UpdateUnitTest.class);
		suite.addTestSuite(CreateUpdateUnitTest.class);
		suite.addTestSuite(MapUnitTest.class);
		suite.addTestSuite(DetailsUnitTest.class);
		suite.addTestSuite(TabularUnitTest.class);
		suite.addTestSuite(BadgeTest.class);
		suite.addTestSuite(TextCardsUnitTest.class);
		suite.addTestSuite(DateCardsUnitTest.class);
		suite.addTestSuite(ImageCardsUnitTest.class);
		suite.addTestSuite(SliderUnitTest.class);
		suite.addTestSuite(GalleryUnitTest.class);
		suite.addTestSuite(SearchUnitTest.class);
		suite.addTestSuite(DeleteActionTest.class);
		suite.addTestSuite(ContainerSelectActionTest.class);
		suite.addTestSuite(InstanceSelectActionTest.class);
		suite.addTestSuite(InstanceOperationActionTest.class);
		suite.addTestSuite(ContainerOperationActionTest.class);
		suite.addTestSuite(GeneralOperationActionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WafTests(String name) {
		super(name);
	}

} //WafTests
