/**
 */
package work.andycarpenter.metamodel.waf.tests;

import work.andycarpenter.metamodel.waf.UnitField;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unit Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#getFieldName() <em>Field Name</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsAuthorised() <em>Is Authorised</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isHasCustomisedDisplayLabel() <em>Has Customised Display Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsRepeated() <em>Is Repeated</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#getTitle() <em>Title</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isHasTitle() <em>Has Title</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isHasCustomisedTitle() <em>Has Customised Title</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isHasSecondTitle() <em>Has Second Title</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#getPlaceholder() <em>Placeholder</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isHasPlaceholder() <em>Has Placeholder</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isHasCustomisedPlaceholder() <em>Has Customised Placeholder</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isHasSecondPlaceholder() <em>Has Second Placeholder</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#getHelp() <em>Help</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isHasHelp() <em>Has Help</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isHasSecondHelp() <em>Has Second Help</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsContains() <em>Is Contains</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsDisabled() <em>Is Disabled</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#getDefaultValue() <em>Default Value</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isHasDefaultValue() <em>Has Default Value</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isHasForcedValue() <em>Has Forced Value</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#getInputGroupClass() <em>Input Group Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isHasInputGroupClass() <em>Has Input Group Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#getFieldLabelClass() <em>Field Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isHasFieldLabelClass() <em>Has Field Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#getFieldValueClass() <em>Field Value Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isHasFieldValueClass() <em>Has Field Value Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#getGenModel() <em>Gen Model</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#getUiModel() <em>Ui Model</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isAssociationField() <em>Is Association Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isAttributeField() <em>Is Attribute Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isBooleanField() <em>Is Boolean Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isDataTypeField() <em>Is Data Type Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isDateField() <em>Is Date Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isEmailField() <em>Is Email Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isEncryptedField() <em>Is Encrypted Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isEnumerationField() <em>Is Enumeration Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isFeatureField() <em>Is Feature Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isInterfaceField() <em>Is Interface Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIntegerField() <em>Is Integer Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isLabelField() <em>Is Label Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isLocationField() <em>Is Location Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isObfuscatedField() <em>Is Obfuscated Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isResourceField() <em>Is Resource Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isRequiredField() <em>Is Required Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isSingletonField() <em>Is Singleton Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isStringField() <em>Is String Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isTextareaField() <em>Is Textarea Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isUrlField() <em>Is Url Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#hasDefaultDisplay() <em>Has Default Display</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#hasDisplayDefaultWhen() <em>Has Display Default When</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#hasDefaultValue() <em>Has Default Value</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#hasEmptyCollectionDisplay() <em>Has Empty Collection Display</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#actions() <em>Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#dataType() <em>Data Type</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#dateDetails() <em>Date Details</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#defaultValue() <em>Default Value</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#enumerationType() <em>Enumeration Type</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class UnitFieldTest extends DisplayElementTest {

	/**
	 * Constructs a new Unit Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitFieldTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unit Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnitField getFixture() {
		return (UnitField)fixture;
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#getFieldName() <em>Field Name</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#getFieldName()
	 * @generated
	 */
	public void testGetFieldName() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetFieldName() <em>isSetFieldName()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetFieldName()
	 * @generated
	 */
	public void testIsSetFieldName() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsAuthorised() <em>Is Authorised</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsAuthorised()
	 * @generated
	 */
	public void testIsIsAuthorised() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetIsAuthorised() <em>isSetIsAuthorised()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetIsAuthorised()
	 * @generated
	 */
	public void testIsSetIsAuthorised() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isHasCustomisedDisplayLabel() <em>Has Customised Display Label</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isHasCustomisedDisplayLabel()
	 * @generated
	 */
	public void testIsHasCustomisedDisplayLabel() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetHasCustomisedDisplayLabel() <em>isSetHasCustomisedDisplayLabel()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetHasCustomisedDisplayLabel()
	 * @generated
	 */
	public void testIsSetHasCustomisedDisplayLabel() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsRepeated() <em>Is Repeated</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsRepeated()
	 * @generated
	 */
	public void testIsIsRepeated() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetIsRepeated() <em>isSetIsRepeated()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetIsRepeated()
	 * @generated
	 */
	public void testIsSetIsRepeated() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#getTitle() <em>Title</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#getTitle()
	 * @generated
	 */
	public void testGetTitle() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetTitle() <em>isSetTitle()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetTitle()
	 * @generated
	 */
	public void testIsSetTitle() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isHasTitle() <em>Has Title</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isHasTitle()
	 * @generated
	 */
	public void testIsHasTitle() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetHasTitle() <em>isSetHasTitle()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetHasTitle()
	 * @generated
	 */
	public void testIsSetHasTitle() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isHasCustomisedTitle() <em>Has Customised Title</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isHasCustomisedTitle()
	 * @generated
	 */
	public void testIsHasCustomisedTitle() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetHasCustomisedTitle() <em>isSetHasCustomisedTitle()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetHasCustomisedTitle()
	 * @generated
	 */
	public void testIsSetHasCustomisedTitle() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isHasSecondTitle() <em>Has Second Title</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isHasSecondTitle()
	 * @generated
	 */
	public void testIsHasSecondTitle() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetHasSecondTitle() <em>isSetHasSecondTitle()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetHasSecondTitle()
	 * @generated
	 */
	public void testIsSetHasSecondTitle() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#getPlaceholder() <em>Placeholder</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#getPlaceholder()
	 * @generated
	 */
	public void testGetPlaceholder() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetPlaceholder() <em>isSetPlaceholder()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetPlaceholder()
	 * @generated
	 */
	public void testIsSetPlaceholder() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isHasPlaceholder() <em>Has Placeholder</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isHasPlaceholder()
	 * @generated
	 */
	public void testIsHasPlaceholder() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetHasPlaceholder() <em>isSetHasPlaceholder()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetHasPlaceholder()
	 * @generated
	 */
	public void testIsSetHasPlaceholder() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isHasCustomisedPlaceholder() <em>Has Customised Placeholder</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isHasCustomisedPlaceholder()
	 * @generated
	 */
	public void testIsHasCustomisedPlaceholder() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetHasCustomisedPlaceholder() <em>isSetHasCustomisedPlaceholder()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetHasCustomisedPlaceholder()
	 * @generated
	 */
	public void testIsSetHasCustomisedPlaceholder() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isHasSecondPlaceholder() <em>Has Second Placeholder</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isHasSecondPlaceholder()
	 * @generated
	 */
	public void testIsHasSecondPlaceholder() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetHasSecondPlaceholder() <em>isSetHasSecondPlaceholder()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetHasSecondPlaceholder()
	 * @generated
	 */
	public void testIsSetHasSecondPlaceholder() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#getHelp() <em>Help</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#getHelp()
	 * @generated
	 */
	public void testGetHelp() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetHelp() <em>isSetHelp()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetHelp()
	 * @generated
	 */
	public void testIsSetHelp() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isHasHelp() <em>Has Help</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isHasHelp()
	 * @generated
	 */
	public void testIsHasHelp() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetHasHelp() <em>isSetHasHelp()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetHasHelp()
	 * @generated
	 */
	public void testIsSetHasHelp() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isHasSecondHelp() <em>Has Second Help</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isHasSecondHelp()
	 * @generated
	 */
	public void testIsHasSecondHelp() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetHasSecondHelp() <em>isSetHasSecondHelp()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetHasSecondHelp()
	 * @generated
	 */
	public void testIsSetHasSecondHelp() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsContains() <em>Is Contains</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsContains()
	 * @generated
	 */
	public void testIsIsContains() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetIsContains() <em>isSetIsContains()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetIsContains()
	 * @generated
	 */
	public void testIsSetIsContains() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsDisabled() <em>Is Disabled</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsDisabled()
	 * @generated
	 */
	public void testIsIsDisabled() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetIsDisabled() <em>isSetIsDisabled()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetIsDisabled()
	 * @generated
	 */
	public void testIsSetIsDisabled() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#getDefaultValue() <em>Default Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#getDefaultValue()
	 * @generated
	 */
	public void testGetDefaultValue() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isHasDefaultValue() <em>Has Default Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isHasDefaultValue()
	 * @generated
	 */
	public void testIsHasDefaultValue() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isHasForcedValue() <em>Has Forced Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isHasForcedValue()
	 * @generated
	 */
	public void testIsHasForcedValue() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#getInputGroupClass() <em>Input Group Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#getInputGroupClass()
	 * @generated
	 */
	public void testGetInputGroupClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isHasInputGroupClass() <em>Has Input Group Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isHasInputGroupClass()
	 * @generated
	 */
	public void testIsHasInputGroupClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#getFieldLabelClass() <em>Field Label Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#getFieldLabelClass()
	 * @generated
	 */
	public void testGetFieldLabelClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isHasFieldLabelClass() <em>Has Field Label Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isHasFieldLabelClass()
	 * @generated
	 */
	public void testIsHasFieldLabelClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#getFieldValueClass() <em>Field Value Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#getFieldValueClass()
	 * @generated
	 */
	public void testGetFieldValueClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isHasFieldValueClass() <em>Has Field Value Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isHasFieldValueClass()
	 * @generated
	 */
	public void testIsHasFieldValueClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#getGenModel() <em>Gen Model</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#getGenModel()
	 * @generated
	 */
	public void testGetGenModel() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetGenModel() <em>isSetGenModel()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetGenModel()
	 * @generated
	 */
	public void testIsSetGenModel() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#getUiModel() <em>Ui Model</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#getUiModel()
	 * @generated
	 */
	public void testGetUiModel() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSetUiModel() <em>isSetUiModel()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSetUiModel()
	 * @generated
	 */
	public void testIsSetUiModel() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isAssociationField() <em>Is Association Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isAssociationField()
	 * @generated
	 */
	public void testIsAssociationField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isAttributeField() <em>Is Attribute Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isAttributeField()
	 * @generated
	 */
	public void testIsAttributeField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isBooleanField() <em>Is Boolean Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isBooleanField()
	 * @generated
	 */
	public void testIsBooleanField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isDataTypeField() <em>Is Data Type Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isDataTypeField()
	 * @generated
	 */
	public void testIsDataTypeField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isDateField() <em>Is Date Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isDateField()
	 * @generated
	 */
	public void testIsDateField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isEmailField() <em>Is Email Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isEmailField()
	 * @generated
	 */
	public void testIsEmailField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isEncryptedField() <em>Is Encrypted Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isEncryptedField()
	 * @generated
	 */
	public void testIsEncryptedField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isEnumerationField() <em>Is Enumeration Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isEnumerationField()
	 * @generated
	 */
	public void testIsEnumerationField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isFeatureField() <em>Is Feature Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isFeatureField()
	 * @generated
	 */
	public void testIsFeatureField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isInterfaceField() <em>Is Interface Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isInterfaceField()
	 * @generated
	 */
	public void testIsInterfaceField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIntegerField() <em>Is Integer Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIntegerField()
	 * @generated
	 */
	public void testIsIntegerField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isLabelField() <em>Is Label Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isLabelField()
	 * @generated
	 */
	public void testIsLabelField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isLocationField() <em>Is Location Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isLocationField()
	 * @generated
	 */
	public void testIsLocationField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isObfuscatedField() <em>Is Obfuscated Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isObfuscatedField()
	 * @generated
	 */
	public void testIsObfuscatedField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isResourceField() <em>Is Resource Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isResourceField()
	 * @generated
	 */
	public void testIsResourceField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isRequiredField() <em>Is Required Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isRequiredField()
	 * @generated
	 */
	public void testIsRequiredField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isSingletonField() <em>Is Singleton Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isSingletonField()
	 * @generated
	 */
	public void testIsSingletonField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isStringField() <em>Is String Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isStringField()
	 * @generated
	 */
	public void testIsStringField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isTextareaField() <em>Is Textarea Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isTextareaField()
	 * @generated
	 */
	public void testIsTextareaField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isUrlField() <em>Is Url Field</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isUrlField()
	 * @generated
	 */
	public void testIsUrlField() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#hasDefaultDisplay() <em>Has Default Display</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#hasDefaultDisplay()
	 * @generated
	 */
	public void testHasDefaultDisplay() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#hasDisplayDefaultWhen() <em>Has Display Default When</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#hasDisplayDefaultWhen()
	 * @generated
	 */
	public void testHasDisplayDefaultWhen() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#hasDefaultValue() <em>Has Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#hasDefaultValue()
	 * @generated
	 */
	public void testHasDefaultValue() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#hasEmptyCollectionDisplay() <em>Has Empty Collection Display</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#hasEmptyCollectionDisplay()
	 * @generated
	 */
	public void testHasEmptyCollectionDisplay() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#actions() <em>Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#actions()
	 * @generated
	 */
	public void testActions() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#dataType() <em>Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#dataType()
	 * @generated
	 */
	public void testDataType() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#dateDetails() <em>Date Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#dateDetails()
	 * @generated
	 */
	public void testDateDetails() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#defaultValue() <em>Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#defaultValue()
	 * @generated
	 */
	public void testDefaultValue() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#enumerationType() <em>Enumeration Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#enumerationType()
	 * @generated
	 */
	public void testEnumerationType() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //UnitFieldTest
