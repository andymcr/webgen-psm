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
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#getActions() <em>Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#isHasActions() <em>Has Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#getActionsWithMessages() <em>Actions With Messages</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#isHasActionsWithMessages() <em>Has Actions With Messages</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#getActionsWithoutTarget() <em>Actions Without Target</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#getContainerActions() <em>Container Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#isHasContainerActions() <em>Has Container Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#getFileActions() <em>File Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#isHasFileActions() <em>Has File Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#getGeneralActions() <em>General Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#isHasGeneralActions() <em>Has General Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#getInstanceActions() <em>Instance Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#isHasInstanceActions() <em>Has Instance Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#getOperationActions() <em>Operation Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#isHasOperationActions() <em>Has Operation Actions</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#getGenModelRef() <em>Gen Model Ref</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.ActionContainer#getUiModelRef() <em>Ui Model Ref</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getContentRepository() <em>Content Repository</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getContainingAssociation() <em>Containing Association</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getContainingType() <em>Containing Type</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isIsContained() <em>Is Contained</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getContainerRepository() <em>Container Repository</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasExplicitlyEditedContainer() <em>Has Explicitly Edited Container</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getRepositoriesUsed() <em>Repositories Used</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getIsConditionallyDisplayed() <em>Is Conditionally Displayed</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getHasHiddenMessage() <em>Has Hidden Message</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getAssociationFields() <em>Association Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasAssociationFields() <em>Has Association Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getAutocompleteFields() <em>Autocomplete Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasAutocompleteFields() <em>Has Autocomplete Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasBooleanFields() <em>Has Boolean Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasCaptcha() <em>Has Captcha</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasChangableCollections() <em>Has Changable Collections</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getCollectionFields() <em>Collection Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getCollectionFeatures() <em>Collection Features</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getDataTypeFields() <em>Data Type Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getDateFields() <em>Date Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getDefaultValueFields() <em>Default Value Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasDefaultValueFields() <em>Has Default Value Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasDisabledFields() <em>Has Disabled Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasEmailFields() <em>Has Email Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getEncryptedFields() <em>Encrypted Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasEncryptedFields() <em>Has Encrypted Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getEnumerationFields() <em>Enumeration Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasEnumerationFields() <em>Has Enumeration Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getFeatureFields() <em>Feature Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasFeatureFields() <em>Has Feature Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getForcedValueFields() <em>Forced Value Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasForcedValueFields() <em>Has Forced Value Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getFormFields() <em>Form Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasIntegerFields() <em>Has Integer Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getInterfaceFields() <em>Interface Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasInterfaceFields() <em>Has Interface Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasRequiredInterfaceFields() <em>Has Required Interface Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasObfuscatedFields() <em>Has Obfuscated Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasRepeatedFields() <em>Has Repeated Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasResourceFields() <em>Has Resource Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasStringFields() <em>Has String Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasTextareaFields() <em>Has Textarea Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasUrlFields() <em>Has Url Fields</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getCommonFieldListClass() <em>Common Field List Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasCommonFieldListClass() <em>Has Common Field List Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getCommonDefinitionFieldListClass() <em>Common Definition Field List Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasCommonDefinitionFieldListClass() <em>Has Common Definition Field List Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getCommonFieldLabelClass() <em>Common Field Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasCommonFieldLabelClass() <em>Has Common Field Label Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getCommonFieldValueClass() <em>Common Field Value Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasCommonFieldValueClass() <em>Has Common Field Value Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#getCommonAnchorClass() <em>Common Anchor Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasCommonAnchorClass() <em>Has Common Anchor Class</em>}</li>
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
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#getActions() <em>Actions</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#getActions()
	 * @generated
	 */
	public void testGetActions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isSetActions() <em>isSetActions()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isSetActions()
	 * @generated
	 */
	public void testIsSetActions() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isHasActions() <em>Has Actions</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isHasActions()
	 * @generated
	 */
	public void testIsHasActions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isSetHasActions() <em>isSetHasActions()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isSetHasActions()
	 * @generated
	 */
	public void testIsSetHasActions() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#getActionsWithMessages() <em>Actions With Messages</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#getActionsWithMessages()
	 * @generated
	 */
	public void testGetActionsWithMessages() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isSetActionsWithMessages() <em>isSetActionsWithMessages()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isSetActionsWithMessages()
	 * @generated
	 */
	public void testIsSetActionsWithMessages() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isHasActionsWithMessages() <em>Has Actions With Messages</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isHasActionsWithMessages()
	 * @generated
	 */
	public void testIsHasActionsWithMessages() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isSetHasActionsWithMessages() <em>isSetHasActionsWithMessages()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isSetHasActionsWithMessages()
	 * @generated
	 */
	public void testIsSetHasActionsWithMessages() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#getActionsWithoutTarget() <em>Actions Without Target</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#getActionsWithoutTarget()
	 * @generated
	 */
	public void testGetActionsWithoutTarget() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isSetActionsWithoutTarget() <em>isSetActionsWithoutTarget()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isSetActionsWithoutTarget()
	 * @generated
	 */
	public void testIsSetActionsWithoutTarget() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#getContainerActions() <em>Container Actions</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#getContainerActions()
	 * @generated
	 */
	public void testGetContainerActions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isSetContainerActions() <em>isSetContainerActions()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isSetContainerActions()
	 * @generated
	 */
	public void testIsSetContainerActions() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isHasContainerActions() <em>Has Container Actions</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isHasContainerActions()
	 * @generated
	 */
	public void testIsHasContainerActions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isSetHasContainerActions() <em>isSetHasContainerActions()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isSetHasContainerActions()
	 * @generated
	 */
	public void testIsSetHasContainerActions() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#getFileActions() <em>File Actions</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#getFileActions()
	 * @generated
	 */
	public void testGetFileActions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isSetFileActions() <em>isSetFileActions()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isSetFileActions()
	 * @generated
	 */
	public void testIsSetFileActions() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isHasFileActions() <em>Has File Actions</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isHasFileActions()
	 * @generated
	 */
	public void testIsHasFileActions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isSetHasFileActions() <em>isSetHasFileActions()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isSetHasFileActions()
	 * @generated
	 */
	public void testIsSetHasFileActions() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#getGeneralActions() <em>General Actions</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#getGeneralActions()
	 * @generated
	 */
	public void testGetGeneralActions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isSetGeneralActions() <em>isSetGeneralActions()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isSetGeneralActions()
	 * @generated
	 */
	public void testIsSetGeneralActions() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isHasGeneralActions() <em>Has General Actions</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isHasGeneralActions()
	 * @generated
	 */
	public void testIsHasGeneralActions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isSetHasGeneralActions() <em>isSetHasGeneralActions()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isSetHasGeneralActions()
	 * @generated
	 */
	public void testIsSetHasGeneralActions() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#getInstanceActions() <em>Instance Actions</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#getInstanceActions()
	 * @generated
	 */
	public void testGetInstanceActions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isSetInstanceActions() <em>isSetInstanceActions()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isSetInstanceActions()
	 * @generated
	 */
	public void testIsSetInstanceActions() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isHasInstanceActions() <em>Has Instance Actions</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isHasInstanceActions()
	 * @generated
	 */
	public void testIsHasInstanceActions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isSetHasInstanceActions() <em>isSetHasInstanceActions()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isSetHasInstanceActions()
	 * @generated
	 */
	public void testIsSetHasInstanceActions() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#getOperationActions() <em>Operation Actions</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#getOperationActions()
	 * @generated
	 */
	public void testGetOperationActions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isSetOperationActions() <em>isSetOperationActions()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isSetOperationActions()
	 * @generated
	 */
	public void testIsSetOperationActions() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isHasOperationActions() <em>Has Operation Actions</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isHasOperationActions()
	 * @generated
	 */
	public void testIsHasOperationActions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isSetHasOperationActions() <em>isSetHasOperationActions()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isSetHasOperationActions()
	 * @generated
	 */
	public void testIsSetHasOperationActions() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#getGenModelRef() <em>Gen Model Ref</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#getGenModelRef()
	 * @generated
	 */
	public void testGetGenModelRef() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isSetGenModelRef() <em>isSetGenModelRef()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isSetGenModelRef()
	 * @generated
	 */
	public void testIsSetGenModelRef() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#getUiModelRef() <em>Ui Model Ref</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#getUiModelRef()
	 * @generated
	 */
	public void testGetUiModelRef() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.ActionContainer#isSetUiModelRef() <em>isSetUiModelRef()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.ActionContainer#isSetUiModelRef()
	 * @generated
	 */
	public void testIsSetUiModelRef() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getContentRepository() <em>Content Repository</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getContentRepository()
	 * @generated
	 */
	public void testGetContentRepository() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetContentRepository() <em>isSetContentRepository()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetContentRepository()
	 * @generated
	 */
	public void testIsSetContentRepository() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
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
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getContainingType() <em>Containing Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getContainingType()
	 * @generated
	 */
	public void testGetContainingType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetContainingType() <em>isSetContainingType()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetContainingType()
	 * @generated
	 */
	public void testIsSetContainingType() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isIsContained() <em>Is Contained</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isIsContained()
	 * @generated
	 */
	public void testIsIsContained() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetIsContained() <em>isSetIsContained()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetIsContained()
	 * @generated
	 */
	public void testIsSetIsContained() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getContainerRepository() <em>Container Repository</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getContainerRepository()
	 * @generated
	 */
	public void testGetContainerRepository() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetContainerRepository() <em>isSetContainerRepository()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetContainerRepository()
	 * @generated
	 */
	public void testIsSetContainerRepository() {
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
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getRepositoriesUsed() <em>Repositories Used</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getRepositoriesUsed()
	 * @generated
	 */
	public void testGetRepositoriesUsed() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetRepositoriesUsed() <em>isSetRepositoriesUsed()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetRepositoriesUsed()
	 * @generated
	 */
	public void testIsSetRepositoriesUsed() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getIsConditionallyDisplayed() <em>Is Conditionally Displayed</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getIsConditionallyDisplayed()
	 * @generated
	 */
	public void testGetIsConditionallyDisplayed() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetIsConditionallyDisplayed() <em>isSetIsConditionallyDisplayed()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetIsConditionallyDisplayed()
	 * @generated
	 */
	public void testIsSetIsConditionallyDisplayed() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getHasHiddenMessage() <em>Has Hidden Message</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getHasHiddenMessage()
	 * @generated
	 */
	public void testGetHasHiddenMessage() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasHiddenMessage() <em>isSetHasHiddenMessage()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasHiddenMessage()
	 * @generated
	 */
	public void testIsSetHasHiddenMessage() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getAssociationFields() <em>Association Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getAssociationFields()
	 * @generated
	 */
	public void testGetAssociationFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetAssociationFields() <em>isSetAssociationFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetAssociationFields()
	 * @generated
	 */
	public void testIsSetAssociationFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasAssociationFields() <em>Has Association Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasAssociationFields()
	 * @generated
	 */
	public void testIsHasAssociationFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getAutocompleteFields() <em>Autocomplete Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getAutocompleteFields()
	 * @generated
	 */
	public void testGetAutocompleteFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasAutocompleteFields() <em>Has Autocomplete Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasAutocompleteFields()
	 * @generated
	 */
	public void testIsHasAutocompleteFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasBooleanFields() <em>Has Boolean Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasBooleanFields()
	 * @generated
	 */
	public void testIsHasBooleanFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasCaptcha() <em>Has Captcha</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasCaptcha()
	 * @generated
	 */
	public void testIsHasCaptcha() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasCaptcha() <em>isSetHasCaptcha()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasCaptcha()
	 * @generated
	 */
	public void testIsSetHasCaptcha() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasChangableCollections() <em>Has Changable Collections</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasChangableCollections()
	 * @generated
	 */
	public void testIsHasChangableCollections() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getCollectionFields() <em>Collection Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getCollectionFields()
	 * @generated
	 */
	public void testGetCollectionFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetCollectionFields() <em>isSetCollectionFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetCollectionFields()
	 * @generated
	 */
	public void testIsSetCollectionFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getCollectionFeatures() <em>Collection Features</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getCollectionFeatures()
	 * @generated
	 */
	public void testGetCollectionFeatures() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetCollectionFeatures() <em>isSetCollectionFeatures()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetCollectionFeatures()
	 * @generated
	 */
	public void testIsSetCollectionFeatures() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getDataTypeFields() <em>Data Type Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getDataTypeFields()
	 * @generated
	 */
	public void testGetDataTypeFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetDataTypeFields() <em>isSetDataTypeFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetDataTypeFields()
	 * @generated
	 */
	public void testIsSetDataTypeFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getDateFields() <em>Date Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getDateFields()
	 * @generated
	 */
	public void testGetDateFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetDateFields() <em>isSetDateFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetDateFields()
	 * @generated
	 */
	public void testIsSetDateFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getDefaultValueFields() <em>Default Value Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getDefaultValueFields()
	 * @generated
	 */
	public void testGetDefaultValueFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetDefaultValueFields() <em>isSetDefaultValueFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetDefaultValueFields()
	 * @generated
	 */
	public void testIsSetDefaultValueFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasDefaultValueFields() <em>Has Default Value Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasDefaultValueFields()
	 * @generated
	 */
	public void testIsHasDefaultValueFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasDisabledFields() <em>Has Disabled Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasDisabledFields()
	 * @generated
	 */
	public void testIsHasDisabledFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasEmailFields() <em>Has Email Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasEmailFields()
	 * @generated
	 */
	public void testIsHasEmailFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getEncryptedFields() <em>Encrypted Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getEncryptedFields()
	 * @generated
	 */
	public void testGetEncryptedFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetEncryptedFields() <em>isSetEncryptedFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetEncryptedFields()
	 * @generated
	 */
	public void testIsSetEncryptedFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasEncryptedFields() <em>Has Encrypted Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasEncryptedFields()
	 * @generated
	 */
	public void testIsHasEncryptedFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getEnumerationFields() <em>Enumeration Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getEnumerationFields()
	 * @generated
	 */
	public void testGetEnumerationFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetEnumerationFields() <em>isSetEnumerationFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetEnumerationFields()
	 * @generated
	 */
	public void testIsSetEnumerationFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasEnumerationFields() <em>Has Enumeration Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasEnumerationFields()
	 * @generated
	 */
	public void testIsHasEnumerationFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getFeatureFields() <em>Feature Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getFeatureFields()
	 * @generated
	 */
	public void testGetFeatureFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetFeatureFields() <em>isSetFeatureFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetFeatureFields()
	 * @generated
	 */
	public void testIsSetFeatureFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasFeatureFields() <em>Has Feature Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasFeatureFields()
	 * @generated
	 */
	public void testIsHasFeatureFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getForcedValueFields() <em>Forced Value Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getForcedValueFields()
	 * @generated
	 */
	public void testGetForcedValueFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetForcedValueFields() <em>isSetForcedValueFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetForcedValueFields()
	 * @generated
	 */
	public void testIsSetForcedValueFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasForcedValueFields() <em>Has Forced Value Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasForcedValueFields()
	 * @generated
	 */
	public void testIsHasForcedValueFields() {
		// TODO: implement this feature getter test method
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
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasIntegerFields() <em>Has Integer Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasIntegerFields()
	 * @generated
	 */
	public void testIsHasIntegerFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getInterfaceFields() <em>Interface Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getInterfaceFields()
	 * @generated
	 */
	public void testGetInterfaceFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetInterfaceFields() <em>isSetInterfaceFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetInterfaceFields()
	 * @generated
	 */
	public void testIsSetInterfaceFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasInterfaceFields() <em>Has Interface Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasInterfaceFields()
	 * @generated
	 */
	public void testIsHasInterfaceFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasInterfaceFields() <em>isSetHasInterfaceFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasInterfaceFields()
	 * @generated
	 */
	public void testIsSetHasInterfaceFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasRequiredInterfaceFields() <em>Has Required Interface Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasRequiredInterfaceFields()
	 * @generated
	 */
	public void testIsHasRequiredInterfaceFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasRequiredInterfaceFields() <em>isSetHasRequiredInterfaceFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasRequiredInterfaceFields()
	 * @generated
	 */
	public void testIsSetHasRequiredInterfaceFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasObfuscatedFields() <em>Has Obfuscated Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasObfuscatedFields()
	 * @generated
	 */
	public void testIsHasObfuscatedFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasObfuscatedFields() <em>isSetHasObfuscatedFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasObfuscatedFields()
	 * @generated
	 */
	public void testIsSetHasObfuscatedFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasRepeatedFields() <em>Has Repeated Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasRepeatedFields()
	 * @generated
	 */
	public void testIsHasRepeatedFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasRepeatedFields() <em>isSetHasRepeatedFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasRepeatedFields()
	 * @generated
	 */
	public void testIsSetHasRepeatedFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasResourceFields() <em>Has Resource Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasResourceFields()
	 * @generated
	 */
	public void testIsHasResourceFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasResourceFields() <em>isSetHasResourceFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasResourceFields()
	 * @generated
	 */
	public void testIsSetHasResourceFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasStringFields() <em>Has String Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasStringFields()
	 * @generated
	 */
	public void testIsHasStringFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasStringFields() <em>isSetHasStringFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasStringFields()
	 * @generated
	 */
	public void testIsSetHasStringFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasTextareaFields() <em>Has Textarea Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasTextareaFields()
	 * @generated
	 */
	public void testIsHasTextareaFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasTextareaFields() <em>isSetHasTextareaFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasTextareaFields()
	 * @generated
	 */
	public void testIsSetHasTextareaFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasUrlFields() <em>Has Url Fields</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasUrlFields()
	 * @generated
	 */
	public void testIsHasUrlFields() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasUrlFields() <em>isSetHasUrlFields()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetHasUrlFields()
	 * @generated
	 */
	public void testIsSetHasUrlFields() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getCommonFieldListClass() <em>Common Field List Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getCommonFieldListClass()
	 * @generated
	 */
	public void testGetCommonFieldListClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetCommonFieldListClass() <em>isSetCommonFieldListClass()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetCommonFieldListClass()
	 * @generated
	 */
	public void testIsSetCommonFieldListClass() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasCommonFieldListClass() <em>Has Common Field List Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasCommonFieldListClass()
	 * @generated
	 */
	public void testIsHasCommonFieldListClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getCommonDefinitionFieldListClass() <em>Common Definition Field List Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getCommonDefinitionFieldListClass()
	 * @generated
	 */
	public void testGetCommonDefinitionFieldListClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetCommonDefinitionFieldListClass() <em>isSetCommonDefinitionFieldListClass()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetCommonDefinitionFieldListClass()
	 * @generated
	 */
	public void testIsSetCommonDefinitionFieldListClass() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasCommonDefinitionFieldListClass() <em>Has Common Definition Field List Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasCommonDefinitionFieldListClass()
	 * @generated
	 */
	public void testIsHasCommonDefinitionFieldListClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getCommonFieldLabelClass() <em>Common Field Label Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getCommonFieldLabelClass()
	 * @generated
	 */
	public void testGetCommonFieldLabelClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetCommonFieldLabelClass() <em>isSetCommonFieldLabelClass()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetCommonFieldLabelClass()
	 * @generated
	 */
	public void testIsSetCommonFieldLabelClass() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasCommonFieldLabelClass() <em>Has Common Field Label Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasCommonFieldLabelClass()
	 * @generated
	 */
	public void testIsHasCommonFieldLabelClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getCommonFieldValueClass() <em>Common Field Value Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getCommonFieldValueClass()
	 * @generated
	 */
	public void testGetCommonFieldValueClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetCommonFieldValueClass() <em>isSetCommonFieldValueClass()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetCommonFieldValueClass()
	 * @generated
	 */
	public void testIsSetCommonFieldValueClass() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasCommonFieldValueClass() <em>Has Common Field Value Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasCommonFieldValueClass()
	 * @generated
	 */
	public void testIsHasCommonFieldValueClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#getCommonAnchorClass() <em>Common Anchor Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#getCommonAnchorClass()
	 * @generated
	 */
	public void testGetCommonAnchorClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isSetCommonAnchorClass() <em>isSetCommonAnchorClass()</em>}' method.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isSetCommonAnchorClass()
	 * @generated
	 */
	public void testIsSetCommonAnchorClass() {
		// TODO: implement this test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link work.andycarpenter.metamodel.waf.DynamicUnit#isHasCommonAnchorClass() <em>Has Common Anchor Class</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see work.andycarpenter.metamodel.waf.DynamicUnit#isHasCommonAnchorClass()
	 * @generated
	 */
	public void testIsHasCommonAnchorClass() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DynamicUnitTest
