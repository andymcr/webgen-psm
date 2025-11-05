/**
 */
package work.andycarpenter.metamodel.waf.tests;

import work.andycarpenter.metamodel.waf.DynamicUnit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dynamic Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getContainingAssociation() <em>Containing Association</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasExplicitlyEditedContainer() <em>Has Explicitly Edited Container</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getServicesUsed() <em>Services Used</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasServicesUsed() <em>Has Services Used</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getFormFields() <em>Form Fields</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasAuthorisation() <em>Has Authorisation</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#containingType() <em>Containing Type</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isContained() <em>Is Contained</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#referencableTypes() <em>Referencable Types</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isConditionallyDisplayed() <em>Is Conditionally Displayed</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasHiddenMessage() <em>Has Hidden Message</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#associationFields() <em>Association Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasAssociationFields() <em>Has Association Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#autocompleteFields() <em>Autocomplete Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasAutocompleteFields() <em>Has Autocomplete Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasBooleanFields() <em>Has Boolean Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasCaptcha() <em>Has Captcha</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasChangableCollections() <em>Has Changable Collections</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#collectionFields() <em>Collection Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#collectionFeatures() <em>Collection Features</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#dataTypeFields() <em>Data Type Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#dateFields() <em>Date Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#defaultValueFields() <em>Default Value Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasDefaultValueFields() <em>Has Default Value Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasDisabledFields() <em>Has Disabled Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasEmailFields() <em>Has Email Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#encryptedFields() <em>Encrypted Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasEncryptedFields() <em>Has Encrypted Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#enumerationFields() <em>Enumeration Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasEnumerationFields() <em>Has Enumeration Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#featureFields() <em>Feature Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasFeatureFields() <em>Has Feature Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#fileFields() <em>File Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasFileFields() <em>Has File Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#forcedValueFields() <em>Forced Value Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasForcedValueFields() <em>Has Forced Value Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#imageFields() <em>Image Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasImageFields() <em>Has Image Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasIntegerFields() <em>Has Integer Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#interfaceFields() <em>Interface Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasInterfaceFields() <em>Has Interface Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasRequiredInterfaceFields() <em>Has Required Interface Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasObfuscatedFields() <em>Has Obfuscated Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasRepeatedFields() <em>Has Repeated Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#resourceFields() <em>Resource Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasResourceFields() <em>Has Resource Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasStringFields() <em>Has String Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasTextareaFields() <em>Has Textarea Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasUrlFields() <em>Has Url Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#fieldListClass() <em>Field List Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasFieldListClass() <em>Has Field List Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#definitionFieldListClass() <em>Definition Field List Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasDefinitionFieldListClass() <em>Has Definition Field List Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#fieldLabelClass() <em>Field Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasFieldLabelClass() <em>Has Field Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#fieldValueClass() <em>Field Value Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasFieldValueClass() <em>Has Field Value Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#controlClass() <em>Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasControlClass() <em>Has Control Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#actionClass() <em>Action Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasActionClass() <em>Has Action Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#actions() <em>Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#hasActions() <em>Has Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#hasActionsWithDisabledMessage() <em>Has Actions With Disabled Message</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#hasActionsWithSuccessMessage() <em>Has Actions With Success Message</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#hasActionsWithMessages() <em>Has Actions With Messages</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#actionsWithoutTarget() <em>Actions Without Target</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#containerActions() <em>Container Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#hasContainerActions() <em>Has Container Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#fileActions() <em>File Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#hasFileActions() <em>Has File Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#generalActions() <em>General Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#hasGeneralActions() <em>Has General Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#targetActions() <em>Target Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#hasTargetActions() <em>Has Target Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#instanceActions() <em>Instance Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#hasInstanceActions() <em>Has Instance Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#operationActions() <em>Operation Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#hasOperationActions() <em>Has Operation Actions</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class DynamicUnitTest extends ContentUnitTest {

	/**
	 * Constructs a new Dynamic Unit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicUnitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dynamic Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DynamicUnit getFixture() {
		return (DynamicUnit)fixture;
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getContainingAssociation() <em>Containing Association</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getContainingAssociation()
	 * @generated
	 */
	public void testGetContainingAssociation() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetContainingAssociation() <em>isSetContainingAssociation()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetContainingAssociation()
	 * @generated
	 */
	public void testIsSetContainingAssociation() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasExplicitlyEditedContainer() <em>Has Explicitly Edited Container</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasExplicitlyEditedContainer()
	 * @generated
	 */
	public void testIsHasExplicitlyEditedContainer() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasExplicitlyEditedContainer() <em>isSetHasExplicitlyEditedContainer()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasExplicitlyEditedContainer()
	 * @generated
	 */
	public void testIsSetHasExplicitlyEditedContainer() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getServicesUsed() <em>Services Used</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getServicesUsed()
	 * @generated
	 */
	public void testGetServicesUsed() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetServicesUsed() <em>isSetServicesUsed()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetServicesUsed()
	 * @generated
	 */
	public void testIsSetServicesUsed() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasServicesUsed() <em>Has Services Used</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasServicesUsed()
	 * @generated
	 */
	public void testIsHasServicesUsed() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasServicesUsed() <em>isSetHasServicesUsed()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasServicesUsed()
	 * @generated
	 */
	public void testIsSetHasServicesUsed() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getFormFields() <em>Form Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getFormFields()
	 * @generated
	 */
	public void testGetFormFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetFormFields() <em>isSetFormFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetFormFields()
	 * @generated
	 */
	public void testIsSetFormFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasAuthorisation() <em>Has Authorisation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasAuthorisation()
	 * @generated
	 */
	public void testHasAuthorisation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#containingType() <em>Containing Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#containingType()
	 * @generated
	 */
	public void testContainingType() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isContained() <em>Is Contained</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isContained()
	 * @generated
	 */
	public void testIsContained() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#referencableTypes() <em>Referencable Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#referencableTypes()
	 * @generated
	 */
	public void testReferencableTypes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isConditionallyDisplayed() <em>Is Conditionally Displayed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isConditionallyDisplayed()
	 * @generated
	 */
	public void testIsConditionallyDisplayed() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasHiddenMessage() <em>Has Hidden Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasHiddenMessage()
	 * @generated
	 */
	public void testHasHiddenMessage() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#associationFields() <em>Association Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#associationFields()
	 * @generated
	 */
	public void testAssociationFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasAssociationFields() <em>Has Association Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasAssociationFields()
	 * @generated
	 */
	public void testHasAssociationFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#autocompleteFields() <em>Autocomplete Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#autocompleteFields()
	 * @generated
	 */
	public void testAutocompleteFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasAutocompleteFields() <em>Has Autocomplete Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasAutocompleteFields()
	 * @generated
	 */
	public void testHasAutocompleteFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasBooleanFields() <em>Has Boolean Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasBooleanFields()
	 * @generated
	 */
	public void testHasBooleanFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasCaptcha() <em>Has Captcha</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasCaptcha()
	 * @generated
	 */
	public void testHasCaptcha() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasChangableCollections() <em>Has Changable Collections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasChangableCollections()
	 * @generated
	 */
	public void testHasChangableCollections() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#collectionFields() <em>Collection Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#collectionFields()
	 * @generated
	 */
	public void testCollectionFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#collectionFeatures() <em>Collection Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#collectionFeatures()
	 * @generated
	 */
	public void testCollectionFeatures() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#dataTypeFields() <em>Data Type Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#dataTypeFields()
	 * @generated
	 */
	public void testDataTypeFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#dateFields() <em>Date Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#dateFields()
	 * @generated
	 */
	public void testDateFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#defaultValueFields() <em>Default Value Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#defaultValueFields()
	 * @generated
	 */
	public void testDefaultValueFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasDefaultValueFields() <em>Has Default Value Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasDefaultValueFields()
	 * @generated
	 */
	public void testHasDefaultValueFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasDisabledFields() <em>Has Disabled Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasDisabledFields()
	 * @generated
	 */
	public void testHasDisabledFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasEmailFields() <em>Has Email Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasEmailFields()
	 * @generated
	 */
	public void testHasEmailFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#encryptedFields() <em>Encrypted Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#encryptedFields()
	 * @generated
	 */
	public void testEncryptedFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasEncryptedFields() <em>Has Encrypted Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasEncryptedFields()
	 * @generated
	 */
	public void testHasEncryptedFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#enumerationFields() <em>Enumeration Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#enumerationFields()
	 * @generated
	 */
	public void testEnumerationFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasEnumerationFields() <em>Has Enumeration Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasEnumerationFields()
	 * @generated
	 */
	public void testHasEnumerationFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#featureFields() <em>Feature Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#featureFields()
	 * @generated
	 */
	public void testFeatureFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasFeatureFields() <em>Has Feature Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasFeatureFields()
	 * @generated
	 */
	public void testHasFeatureFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#fileFields() <em>File Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#fileFields()
	 * @generated
	 */
	public void testFileFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasFileFields() <em>Has File Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasFileFields()
	 * @generated
	 */
	public void testHasFileFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#forcedValueFields() <em>Forced Value Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#forcedValueFields()
	 * @generated
	 */
	public void testForcedValueFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasForcedValueFields() <em>Has Forced Value Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasForcedValueFields()
	 * @generated
	 */
	public void testHasForcedValueFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#imageFields() <em>Image Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#imageFields()
	 * @generated
	 */
	public void testImageFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasImageFields() <em>Has Image Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasImageFields()
	 * @generated
	 */
	public void testHasImageFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasIntegerFields() <em>Has Integer Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasIntegerFields()
	 * @generated
	 */
	public void testHasIntegerFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#interfaceFields() <em>Interface Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#interfaceFields()
	 * @generated
	 */
	public void testInterfaceFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasInterfaceFields() <em>Has Interface Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasInterfaceFields()
	 * @generated
	 */
	public void testHasInterfaceFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasRequiredInterfaceFields() <em>Has Required Interface Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasRequiredInterfaceFields()
	 * @generated
	 */
	public void testHasRequiredInterfaceFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasObfuscatedFields() <em>Has Obfuscated Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasObfuscatedFields()
	 * @generated
	 */
	public void testHasObfuscatedFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasRepeatedFields() <em>Has Repeated Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasRepeatedFields()
	 * @generated
	 */
	public void testHasRepeatedFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#resourceFields() <em>Resource Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#resourceFields()
	 * @generated
	 */
	public void testResourceFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasResourceFields() <em>Has Resource Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasResourceFields()
	 * @generated
	 */
	public void testHasResourceFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasStringFields() <em>Has String Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasStringFields()
	 * @generated
	 */
	public void testHasStringFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasTextareaFields() <em>Has Textarea Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasTextareaFields()
	 * @generated
	 */
	public void testHasTextareaFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasUrlFields() <em>Has Url Fields</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasUrlFields()
	 * @generated
	 */
	public void testHasUrlFields() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#fieldListClass() <em>Field List Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#fieldListClass()
	 * @generated
	 */
	public void testFieldListClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasFieldListClass() <em>Has Field List Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasFieldListClass()
	 * @generated
	 */
	public void testHasFieldListClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#definitionFieldListClass() <em>Definition Field List Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#definitionFieldListClass()
	 * @generated
	 */
	public void testDefinitionFieldListClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasDefinitionFieldListClass() <em>Has Definition Field List Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasDefinitionFieldListClass()
	 * @generated
	 */
	public void testHasDefinitionFieldListClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#fieldLabelClass() <em>Field Label Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#fieldLabelClass()
	 * @generated
	 */
	public void testFieldLabelClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasFieldLabelClass() <em>Has Field Label Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasFieldLabelClass()
	 * @generated
	 */
	public void testHasFieldLabelClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#fieldValueClass() <em>Field Value Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#fieldValueClass()
	 * @generated
	 */
	public void testFieldValueClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasFieldValueClass() <em>Has Field Value Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasFieldValueClass()
	 * @generated
	 */
	public void testHasFieldValueClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#controlClass() <em>Control Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#controlClass()
	 * @generated
	 */
	public void testControlClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasControlClass() <em>Has Control Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasControlClass()
	 * @generated
	 */
	public void testHasControlClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#actionClass() <em>Action Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#actionClass()
	 * @generated
	 */
	public void testActionClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#hasActionClass() <em>Has Action Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#hasActionClass()
	 * @generated
	 */
	public void testHasActionClass() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#actions() <em>Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#actions()
	 * @generated
	 */
	public void testActions() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#hasActions() <em>Has Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#hasActions()
	 * @generated
	 */
	public void testHasActions() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#hasActionsWithDisabledMessage() <em>Has Actions With Disabled Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#hasActionsWithDisabledMessage()
	 * @generated
	 */
	public void testHasActionsWithDisabledMessage() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#hasActionsWithSuccessMessage() <em>Has Actions With Success Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#hasActionsWithSuccessMessage()
	 * @generated
	 */
	public void testHasActionsWithSuccessMessage() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#hasActionsWithMessages() <em>Has Actions With Messages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#hasActionsWithMessages()
	 * @generated
	 */
	public void testHasActionsWithMessages() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#actionsWithoutTarget() <em>Actions Without Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#actionsWithoutTarget()
	 * @generated
	 */
	public void testActionsWithoutTarget() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#containerActions() <em>Container Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#containerActions()
	 * @generated
	 */
	public void testContainerActions() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#hasContainerActions() <em>Has Container Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#hasContainerActions()
	 * @generated
	 */
	public void testHasContainerActions() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#fileActions() <em>File Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#fileActions()
	 * @generated
	 */
	public void testFileActions() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#hasFileActions() <em>Has File Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#hasFileActions()
	 * @generated
	 */
	public void testHasFileActions() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#generalActions() <em>General Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#generalActions()
	 * @generated
	 */
	public void testGeneralActions() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#hasGeneralActions() <em>Has General Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#hasGeneralActions()
	 * @generated
	 */
	public void testHasGeneralActions() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#targetActions() <em>Target Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#targetActions()
	 * @generated
	 */
	public void testTargetActions() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#hasTargetActions() <em>Has Target Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#hasTargetActions()
	 * @generated
	 */
	public void testHasTargetActions() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#instanceActions() <em>Instance Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#instanceActions()
	 * @generated
	 */
	public void testInstanceActions() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#hasInstanceActions() <em>Has Instance Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#hasInstanceActions()
	 * @generated
	 */
	public void testHasInstanceActions() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#operationActions() <em>Operation Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#operationActions()
	 * @generated
	 */
	public void testOperationActions() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#hasOperationActions() <em>Has Operation Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#hasOperationActions()
	 * @generated
	 */
	public void testHasOperationActions() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DynamicUnitTest
