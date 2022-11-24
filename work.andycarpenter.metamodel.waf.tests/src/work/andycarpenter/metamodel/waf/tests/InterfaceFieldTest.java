/**
 */
package work.andycarpenter.metamodel.waf.tests;

import junit.framework.TestCase;

import work.andycarpenter.metamodel.waf.InterfaceField;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interface Field</b></em>'.
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
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsRequired() <em>Is Required</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsSingleton() <em>Is Singleton</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsAssociationField() <em>Is Association Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsAttributeField() <em>Is Attribute Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsBooleanField() <em>Is Boolean Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsDataTypeField() <em>Is Data Type Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#getDataType() <em>Data Type</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsDateField() <em>Is Date Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#getDateDetails() <em>Date Details</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsEmailField() <em>Is Email Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsEncryptedField() <em>Is Encrypted Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsEnumerationField() <em>Is Enumeration Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#getEnumerationType() <em>Enumeration Type</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsFeatureField() <em>Is Feature Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsInterfaceField() <em>Is Interface Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsIntegerField() <em>Is Integer Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsLocationField() <em>Is Location Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsObfuscatedFeature() <em>Is Obfuscated Feature</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsObfuscatedField() <em>Is Obfuscated Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsResourceField() <em>Is Resource Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsStringField() <em>Is String Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsTextareaField() <em>Is Textarea Field</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.UnitField#isIsUrlField() <em>Is Url Field</em>}</li>
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
 * @generated
 */
public abstract class InterfaceFieldTest extends TestCase {

	/**
	 * The fixture for this Interface Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceField fixture = null;

	/**
	 * Constructs a new Interface Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceFieldTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Interface Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InterfaceField fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Interface Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceField getFixture() {
		return fixture;
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
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsRequired() <em>Is Required</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsRequired()
	 * @generated
	 */
	public void testIsIsRequired() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsSingleton() <em>Is Singleton</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsSingleton()
	 * @generated
	 */
	public void testIsIsSingleton() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsAssociationField() <em>Is Association Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsAssociationField()
	 * @generated
	 */
	public void testIsIsAssociationField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsAttributeField() <em>Is Attribute Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsAttributeField()
	 * @generated
	 */
	public void testIsIsAttributeField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsBooleanField() <em>Is Boolean Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsBooleanField()
	 * @generated
	 */
	public void testIsIsBooleanField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsDataTypeField() <em>Is Data Type Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsDataTypeField()
	 * @generated
	 */
	public void testIsIsDataTypeField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#getDataType() <em>Data Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#getDataType()
	 * @generated
	 */
	public void testGetDataType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsDateField() <em>Is Date Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsDateField()
	 * @generated
	 */
	public void testIsIsDateField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#getDateDetails() <em>Date Details</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#getDateDetails()
	 * @generated
	 */
	public void testGetDateDetails() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsEmailField() <em>Is Email Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsEmailField()
	 * @generated
	 */
	public void testIsIsEmailField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsEncryptedField() <em>Is Encrypted Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsEncryptedField()
	 * @generated
	 */
	public void testIsIsEncryptedField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsEnumerationField() <em>Is Enumeration Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsEnumerationField()
	 * @generated
	 */
	public void testIsIsEnumerationField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#getEnumerationType() <em>Enumeration Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#getEnumerationType()
	 * @generated
	 */
	public void testGetEnumerationType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsFeatureField() <em>Is Feature Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsFeatureField()
	 * @generated
	 */
	public void testIsIsFeatureField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsInterfaceField() <em>Is Interface Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsInterfaceField()
	 * @generated
	 */
	public void testIsIsInterfaceField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsIntegerField() <em>Is Integer Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsIntegerField()
	 * @generated
	 */
	public void testIsIsIntegerField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsLocationField() <em>Is Location Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsLocationField()
	 * @generated
	 */
	public void testIsIsLocationField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsObfuscatedFeature() <em>Is Obfuscated Feature</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsObfuscatedFeature()
	 * @generated
	 */
	public void testIsIsObfuscatedFeature() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsObfuscatedField() <em>Is Obfuscated Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsObfuscatedField()
	 * @generated
	 */
	public void testIsIsObfuscatedField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsResourceField() <em>Is Resource Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsResourceField()
	 * @generated
	 */
	public void testIsIsResourceField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsStringField() <em>Is String Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsStringField()
	 * @generated
	 */
	public void testIsIsStringField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsTextareaField() <em>Is Textarea Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsTextareaField()
	 * @generated
	 */
	public void testIsIsTextareaField() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.UnitField#isIsUrlField() <em>Is Url Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.UnitField#isIsUrlField()
	 * @generated
	 */
	public void testIsIsUrlField() {
		// TODO: implement this feature getter test method
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

} //InterfaceFieldTest
