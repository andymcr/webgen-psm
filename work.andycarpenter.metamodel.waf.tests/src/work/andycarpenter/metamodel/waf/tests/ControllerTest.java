/**
 */
package work.andycarpenter.metamodel.waf.tests;

import junit.framework.TestCase;

import work.andycarpenter.metamodel.waf.Controller;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isIsSinglePage() <em>Is Single Page</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isIsMultiPage() <em>Is Multi Page</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getCollectionUnits() <em>Collection Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasCollectionUnits() <em>Has Collection Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getServicesUsed() <em>Services Used</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasPagination() <em>Has Pagination</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getAssociationFields() <em>Association Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getAutocompleteFields() <em>Autocomplete Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasAutocompleteFields() <em>Has Autocomplete Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getFormFields() <em>Form Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getActionsWithoutTarget() <em>Actions Without Target</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getFileActions() <em>File Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasFileActions() <em>Has File Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getPageClass() <em>Page Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasPageClass() <em>Has Page Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getGenModel() <em>Gen Model</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getUiModel() <em>Ui Model</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getRootController() <em>Root Controller</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasUnits() <em>Has Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#commonAuthorisation() <em>Common Authorisation</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isAuthorised() <em>Is Authorised</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasAuthorisation() <em>Has Authorisation</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasCommonUnitAuthorisation() <em>Has Common Unit Authorisation</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasChangableCollections() <em>Has Changable Collections</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasCaptchaUnits() <em>Has Captcha Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#dynamicUnits() <em>Dynamic Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasDynamicUnits() <em>Has Dynamic Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#editUnits() <em>Edit Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasEditUnits() <em>Has Edit Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#formUnits() <em>Form Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasFormUnits() <em>Has Form Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasFilters() <em>Has Filters</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#galleryUnits() <em>Gallery Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasGalleryUnits() <em>Has Gallery Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#tabularUnits() <em>Tabular Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasTabularUnits() <em>Has Tabular Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#imageUnits() <em>Image Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasImageUnits() <em>Has Image Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#imageCardsUnits() <em>Image Cards Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasImageCardsUnits() <em>Has Image Cards Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#mapUnits() <em>Map Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasMapUnits() <em>Has Map Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#sliderUnits() <em>Slider Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasSliderUnits() <em>Has Slider Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasImageFields() <em>Has Image Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasInterfaceFields() <em>Has Interface Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasRequiredInterfaceFields() <em>Has Required Interface Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasResourceFields() <em>Has Resource Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasActionsWithDisabledMessage() <em>Has Actions With Disabled Message</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasSuccessMessages() <em>Has Success Messages</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#hasMessages() <em>Has Messages</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class ControllerTest extends TestCase {

	/**
	 * The fixture for this Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Controller fixture = null;

	/**
	 * Constructs a new Controller test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Controller fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Controller getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isIsSinglePage() <em>Is Single Page</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isIsSinglePage()
	 * @generated
	 */
	public void testIsIsSinglePage() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isIsMultiPage() <em>Is Multi Page</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isIsMultiPage()
	 * @generated
	 */
	public void testIsIsMultiPage() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getCollectionUnits() <em>Collection Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getCollectionUnits()
	 * @generated
	 */
	public void testGetCollectionUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetCollectionUnits() <em>isSetCollectionUnits()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetCollectionUnits()
	 * @generated
	 */
	public void testIsSetCollectionUnits() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasCollectionUnits() <em>Has Collection Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasCollectionUnits()
	 * @generated
	 */
	public void testIsHasCollectionUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getServicesUsed() <em>Services Used</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getServicesUsed()
	 * @generated
	 */
	public void testGetServicesUsed() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetServicesUsed() <em>isSetServicesUsed()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetServicesUsed()
	 * @generated
	 */
	public void testIsSetServicesUsed() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasPagination() <em>Has Pagination</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasPagination()
	 * @generated
	 */
	public void testIsHasPagination() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetHasPagination() <em>isSetHasPagination()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetHasPagination()
	 * @generated
	 */
	public void testIsSetHasPagination() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getAssociationFields() <em>Association Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getAssociationFields()
	 * @generated
	 */
	public void testGetAssociationFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetAssociationFields() <em>isSetAssociationFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetAssociationFields()
	 * @generated
	 */
	public void testIsSetAssociationFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getAutocompleteFields() <em>Autocomplete Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getAutocompleteFields()
	 * @generated
	 */
	public void testGetAutocompleteFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetAutocompleteFields() <em>isSetAutocompleteFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetAutocompleteFields()
	 * @generated
	 */
	public void testIsSetAutocompleteFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasAutocompleteFields() <em>Has Autocomplete Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasAutocompleteFields()
	 * @generated
	 */
	public void testIsHasAutocompleteFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetHasAutocompleteFields() <em>isSetHasAutocompleteFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetHasAutocompleteFields()
	 * @generated
	 */
	public void testIsSetHasAutocompleteFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getFormFields() <em>Form Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getFormFields()
	 * @generated
	 */
	public void testGetFormFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetFormFields() <em>isSetFormFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetFormFields()
	 * @generated
	 */
	public void testIsSetFormFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getActionsWithoutTarget() <em>Actions Without Target</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getActionsWithoutTarget()
	 * @generated
	 */
	public void testGetActionsWithoutTarget() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetActionsWithoutTarget() <em>isSetActionsWithoutTarget()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetActionsWithoutTarget()
	 * @generated
	 */
	public void testIsSetActionsWithoutTarget() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getFileActions() <em>File Actions</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getFileActions()
	 * @generated
	 */
	public void testGetFileActions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetFileActions() <em>isSetFileActions()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetFileActions()
	 * @generated
	 */
	public void testIsSetFileActions() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasFileActions() <em>Has File Actions</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasFileActions()
	 * @generated
	 */
	public void testIsHasFileActions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetHasFileActions() <em>isSetHasFileActions()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetHasFileActions()
	 * @generated
	 */
	public void testIsSetHasFileActions() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getPageClass() <em>Page Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getPageClass()
	 * @generated
	 */
	public void testGetPageClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasPageClass() <em>Has Page Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasPageClass()
	 * @generated
	 */
	public void testIsHasPageClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getGenModel() <em>Gen Model</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getGenModel()
	 * @generated
	 */
	public void testGetGenModel() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetGenModel() <em>isSetGenModel()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetGenModel()
	 * @generated
	 */
	public void testIsSetGenModel() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getUiModel() <em>Ui Model</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getUiModel()
	 * @generated
	 */
	public void testGetUiModel() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetUiModel() <em>isSetUiModel()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetUiModel()
	 * @generated
	 */
	public void testIsSetUiModel() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getRootController() <em>Root Controller</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getRootController()
	 * @generated
	 */
	public void testGetRootController() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetRootController() <em>isSetRootController()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetRootController()
	 * @generated
	 */
	public void testIsSetRootController() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasUnits() <em>Has Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasUnits()
	 * @generated
	 */
	public void testHasUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#commonAuthorisation() <em>Common Authorisation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#commonAuthorisation()
	 * @generated
	 */
	public void testCommonAuthorisation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isAuthorised() <em>Is Authorised</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isAuthorised()
	 * @generated
	 */
	public void testIsAuthorised() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasAuthorisation() <em>Has Authorisation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasAuthorisation()
	 * @generated
	 */
	public void testHasAuthorisation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasCommonUnitAuthorisation() <em>Has Common Unit Authorisation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasCommonUnitAuthorisation()
	 * @generated
	 */
	public void testHasCommonUnitAuthorisation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasChangableCollections() <em>Has Changable Collections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasChangableCollections()
	 * @generated
	 */
	public void testHasChangableCollections() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasCaptchaUnits() <em>Has Captcha Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasCaptchaUnits()
	 * @generated
	 */
	public void testHasCaptchaUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#dynamicUnits() <em>Dynamic Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#dynamicUnits()
	 * @generated
	 */
	public void testDynamicUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasDynamicUnits() <em>Has Dynamic Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasDynamicUnits()
	 * @generated
	 */
	public void testHasDynamicUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#editUnits() <em>Edit Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#editUnits()
	 * @generated
	 */
	public void testEditUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasEditUnits() <em>Has Edit Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasEditUnits()
	 * @generated
	 */
	public void testHasEditUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#formUnits() <em>Form Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#formUnits()
	 * @generated
	 */
	public void testFormUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasFormUnits() <em>Has Form Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasFormUnits()
	 * @generated
	 */
	public void testHasFormUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasFilters() <em>Has Filters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasFilters()
	 * @generated
	 */
	public void testHasFilters() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#galleryUnits() <em>Gallery Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#galleryUnits()
	 * @generated
	 */
	public void testGalleryUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasGalleryUnits() <em>Has Gallery Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasGalleryUnits()
	 * @generated
	 */
	public void testHasGalleryUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#tabularUnits() <em>Tabular Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#tabularUnits()
	 * @generated
	 */
	public void testTabularUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasTabularUnits() <em>Has Tabular Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasTabularUnits()
	 * @generated
	 */
	public void testHasTabularUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#imageUnits() <em>Image Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#imageUnits()
	 * @generated
	 */
	public void testImageUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasImageUnits() <em>Has Image Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasImageUnits()
	 * @generated
	 */
	public void testHasImageUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#imageCardsUnits() <em>Image Cards Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#imageCardsUnits()
	 * @generated
	 */
	public void testImageCardsUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasImageCardsUnits() <em>Has Image Cards Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasImageCardsUnits()
	 * @generated
	 */
	public void testHasImageCardsUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#mapUnits() <em>Map Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#mapUnits()
	 * @generated
	 */
	public void testMapUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasMapUnits() <em>Has Map Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasMapUnits()
	 * @generated
	 */
	public void testHasMapUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#sliderUnits() <em>Slider Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#sliderUnits()
	 * @generated
	 */
	public void testSliderUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasSliderUnits() <em>Has Slider Units</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasSliderUnits()
	 * @generated
	 */
	public void testHasSliderUnits() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasImageFields() <em>Has Image Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasImageFields()
	 * @generated
	 */
	public void testHasImageFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasInterfaceFields() <em>Has Interface Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasInterfaceFields()
	 * @generated
	 */
	public void testHasInterfaceFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasRequiredInterfaceFields() <em>Has Required Interface Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasRequiredInterfaceFields()
	 * @generated
	 */
	public void testHasRequiredInterfaceFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasResourceFields() <em>Has Resource Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasResourceFields()
	 * @generated
	 */
	public void testHasResourceFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasActionsWithDisabledMessage() <em>Has Actions With Disabled Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasActionsWithDisabledMessage()
	 * @generated
	 */
	public void testHasActionsWithDisabledMessage() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasSuccessMessages() <em>Has Success Messages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasSuccessMessages()
	 * @generated
	 */
	public void testHasSuccessMessages() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#hasMessages() <em>Has Messages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#hasMessages()
	 * @generated
	 */
	public void testHasMessages() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ControllerTest
