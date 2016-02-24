/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DataTypeField#getDataType <em>Data Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DataTypeField#isCaseInsensitive <em>Case Insensitive</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DataTypeField#isObfuscateFormFields <em>Obfuscate Form Fields</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DataTypeField#isEncrypt <em>Encrypt</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.DataTypeField#getInterfaceType <em>Interface Type</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDataTypeField()
 * @model
 * @generated
 */
public interface DataTypeField extends InterfaceField {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDataTypeField_DataType()
	 * @model required="true"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DataTypeField#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Case Insensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Insensitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Insensitive</em>' attribute.
	 * @see #setCaseInsensitive(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDataTypeField_CaseInsensitive()
	 * @model unique="false"
	 * @generated
	 */
	boolean isCaseInsensitive();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DataTypeField#isCaseInsensitive <em>Case Insensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Insensitive</em>' attribute.
	 * @see #isCaseInsensitive()
	 * @generated
	 */
	void setCaseInsensitive(boolean value);

	/**
	 * Returns the value of the '<em><b>Obfuscate Form Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obfuscate Form Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obfuscate Form Fields</em>' attribute.
	 * @see #setObfuscateFormFields(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDataTypeField_ObfuscateFormFields()
	 * @model unique="false"
	 * @generated
	 */
	boolean isObfuscateFormFields();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DataTypeField#isObfuscateFormFields <em>Obfuscate Form Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obfuscate Form Fields</em>' attribute.
	 * @see #isObfuscateFormFields()
	 * @generated
	 */
	void setObfuscateFormFields(boolean value);

	/**
	 * Returns the value of the '<em><b>Encrypt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encrypt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypt</em>' attribute.
	 * @see #setEncrypt(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDataTypeField_Encrypt()
	 * @model unique="false"
	 * @generated
	 */
	boolean isEncrypt();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DataTypeField#isEncrypt <em>Encrypt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypt</em>' attribute.
	 * @see #isEncrypt()
	 * @generated
	 */
	void setEncrypt(boolean value);

	/**
	 * Returns the value of the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Type</em>' attribute.
	 * @see #setInterfaceType(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getDataTypeField_InterfaceType()
	 * @model unique="false"
	 * @generated
	 */
	String getInterfaceType();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.DataTypeField#getInterfaceType <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Type</em>' attribute.
	 * @see #getInterfaceType()
	 * @generated
	 */
	void setInterfaceType(String value);

} // DataTypeField
