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
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getCommonRole() <em>Common Role</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isIsAuthorised() <em>Is Authorised</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasCommonUnitAuthentication() <em>Has Common Unit Authentication</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasUnits() <em>Has Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasChangableCollections() <em>Has Changable Collections</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasCaptchaUnits() <em>Has Captcha Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getCollectionUnits() <em>Collection Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasCollectionUnits() <em>Has Collection Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getDynamicUnits() <em>Dynamic Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasDynamicUnits() <em>Has Dynamic Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getEditUnits() <em>Edit Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasEditUnits() <em>Has Edit Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getFormUnits() <em>Form Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasFormUnits() <em>Has Form Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasFilters() <em>Has Filters</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getGalleryUnits() <em>Gallery Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasGalleryUnits() <em>Has Gallery Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getTabularUnits() <em>Tabular Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasTabularUnits() <em>Has Tabular Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getImageUnits() <em>Image Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasImageUnits() <em>Has Image Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getImageCardsUnits() <em>Image Cards Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasImageCardsUnits() <em>Has Image Cards Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getMapUnits() <em>Map Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasMapUnits() <em>Has Map Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getSliderUnits() <em>Slider Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasSliderUnits() <em>Has Slider Units</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getServicesUsed() <em>Services Used</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasServicesUsed() <em>Has Services Used</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasPagination() <em>Has Pagination</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getAssociationFields() <em>Association Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getAutocompleteFields() <em>Autocomplete Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasAutocompleteFields() <em>Has Autocomplete Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getFormFields() <em>Form Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasInterfaceFields() <em>Has Interface Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasRequiredInterfaceFields() <em>Has Required Interface Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasResourceFields() <em>Has Resource Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getActionsWithoutTarget() <em>Actions Without Target</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getFileActions() <em>File Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasFileActions() <em>Has File Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasSuccessMessages() <em>Has Success Messages</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasMessages() <em>Has Messages</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getPageClass() <em>Page Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#isHasPageClass() <em>Has Page Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getGenModel() <em>Gen Model</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getUiModel() <em>Ui Model</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.Controller#getRootController() <em>Root Controller</em>}</li>
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
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getCommonRole() <em>Common Role</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getCommonRole()
	 * @generated
	 */
	public void testGetCommonRole() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isIsAuthorised() <em>Is Authorised</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isIsAuthorised()
	 * @generated
	 */
	public void testIsIsAuthorised() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasCommonUnitAuthentication() <em>Has Common Unit Authentication</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasCommonUnitAuthentication()
	 * @generated
	 */
	public void testIsHasCommonUnitAuthentication() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasUnits() <em>Has Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasUnits()
	 * @generated
	 */
	public void testIsHasUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasChangableCollections() <em>Has Changable Collections</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasChangableCollections()
	 * @generated
	 */
	public void testIsHasChangableCollections() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasCaptchaUnits() <em>Has Captcha Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasCaptchaUnits()
	 * @generated
	 */
	public void testIsHasCaptchaUnits() {
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
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getDynamicUnits() <em>Dynamic Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getDynamicUnits()
	 * @generated
	 */
	public void testGetDynamicUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetDynamicUnits() <em>isSetDynamicUnits()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetDynamicUnits()
	 * @generated
	 */
	public void testIsSetDynamicUnits() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasDynamicUnits() <em>Has Dynamic Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasDynamicUnits()
	 * @generated
	 */
	public void testIsHasDynamicUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getEditUnits() <em>Edit Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getEditUnits()
	 * @generated
	 */
	public void testGetEditUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetEditUnits() <em>isSetEditUnits()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetEditUnits()
	 * @generated
	 */
	public void testIsSetEditUnits() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasEditUnits() <em>Has Edit Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasEditUnits()
	 * @generated
	 */
	public void testIsHasEditUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getFormUnits() <em>Form Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getFormUnits()
	 * @generated
	 */
	public void testGetFormUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetFormUnits() <em>isSetFormUnits()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetFormUnits()
	 * @generated
	 */
	public void testIsSetFormUnits() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasFormUnits() <em>Has Form Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasFormUnits()
	 * @generated
	 */
	public void testIsHasFormUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasFilters() <em>Has Filters</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasFilters()
	 * @generated
	 */
	public void testIsHasFilters() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getGalleryUnits() <em>Gallery Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getGalleryUnits()
	 * @generated
	 */
	public void testGetGalleryUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetGalleryUnits() <em>isSetGalleryUnits()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetGalleryUnits()
	 * @generated
	 */
	public void testIsSetGalleryUnits() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasGalleryUnits() <em>Has Gallery Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasGalleryUnits()
	 * @generated
	 */
	public void testIsHasGalleryUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getTabularUnits() <em>Tabular Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getTabularUnits()
	 * @generated
	 */
	public void testGetTabularUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetTabularUnits() <em>isSetTabularUnits()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetTabularUnits()
	 * @generated
	 */
	public void testIsSetTabularUnits() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasTabularUnits() <em>Has Tabular Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasTabularUnits()
	 * @generated
	 */
	public void testIsHasTabularUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getImageUnits() <em>Image Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getImageUnits()
	 * @generated
	 */
	public void testGetImageUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetImageUnits() <em>isSetImageUnits()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetImageUnits()
	 * @generated
	 */
	public void testIsSetImageUnits() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasImageUnits() <em>Has Image Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasImageUnits()
	 * @generated
	 */
	public void testIsHasImageUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getImageCardsUnits() <em>Image Cards Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getImageCardsUnits()
	 * @generated
	 */
	public void testGetImageCardsUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetImageCardsUnits() <em>isSetImageCardsUnits()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetImageCardsUnits()
	 * @generated
	 */
	public void testIsSetImageCardsUnits() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasImageCardsUnits() <em>Has Image Cards Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasImageCardsUnits()
	 * @generated
	 */
	public void testIsHasImageCardsUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getMapUnits() <em>Map Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getMapUnits()
	 * @generated
	 */
	public void testGetMapUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetMapUnits() <em>isSetMapUnits()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetMapUnits()
	 * @generated
	 */
	public void testIsSetMapUnits() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasMapUnits() <em>Has Map Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasMapUnits()
	 * @generated
	 */
	public void testIsHasMapUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#getSliderUnits() <em>Slider Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#getSliderUnits()
	 * @generated
	 */
	public void testGetSliderUnits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetSliderUnits() <em>isSetSliderUnits()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetSliderUnits()
	 * @generated
	 */
	public void testIsSetSliderUnits() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasSliderUnits() <em>Has Slider Units</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasSliderUnits()
	 * @generated
	 */
	public void testIsHasSliderUnits() {
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
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasServicesUsed() <em>Has Services Used</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasServicesUsed()
	 * @generated
	 */
	public void testIsHasServicesUsed() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetHasServicesUsed() <em>isSetHasServicesUsed()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetHasServicesUsed()
	 * @generated
	 */
	public void testIsSetHasServicesUsed() {
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
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasInterfaceFields() <em>Has Interface Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasInterfaceFields()
	 * @generated
	 */
	public void testIsHasInterfaceFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetHasInterfaceFields() <em>isSetHasInterfaceFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetHasInterfaceFields()
	 * @generated
	 */
	public void testIsSetHasInterfaceFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasRequiredInterfaceFields() <em>Has Required Interface Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasRequiredInterfaceFields()
	 * @generated
	 */
	public void testIsHasRequiredInterfaceFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetHasRequiredInterfaceFields() <em>isSetHasRequiredInterfaceFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetHasRequiredInterfaceFields()
	 * @generated
	 */
	public void testIsSetHasRequiredInterfaceFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasResourceFields() <em>Has Resource Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasResourceFields()
	 * @generated
	 */
	public void testIsHasResourceFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetHasResourceFields() <em>isSetHasResourceFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetHasResourceFields()
	 * @generated
	 */
	public void testIsSetHasResourceFields() {
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
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasSuccessMessages() <em>Has Success Messages</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasSuccessMessages()
	 * @generated
	 */
	public void testIsHasSuccessMessages() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetHasSuccessMessages() <em>isSetHasSuccessMessages()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetHasSuccessMessages()
	 * @generated
	 */
	public void testIsSetHasSuccessMessages() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isHasMessages() <em>Has Messages</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isHasMessages()
	 * @generated
	 */
	public void testIsHasMessages() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.Controller#isSetHasMessages() <em>isSetHasMessages()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.Controller#isSetHasMessages()
	 * @generated
	 */
	public void testIsSetHasMessages() {
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

} //ControllerTest
