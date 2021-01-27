/**
 */
package work.andycarpenter.psms.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.psms.base.FormalParameter#getDataType <em>Data Type</em>}</li>
 *   <li>{@link work.andycarpenter.psms.base.FormalParameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link work.andycarpenter.psms.base.FormalParameter#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link work.andycarpenter.psms.base.FormalParameter#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.psms.base.BasePackage#getFormalParameter()
 * @model
 * @generated
 */
public interface FormalParameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see work.andycarpenter.psms.base.BasePackage#getFormalParameter_DataType()
	 * @model
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link work.andycarpenter.psms.base.FormalParameter#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see work.andycarpenter.psms.base.BasePackage#getFormalParameter_DefaultValue()
	 * @model unique="false"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link work.andycarpenter.psms.base.FormalParameter#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see work.andycarpenter.psms.base.BasePackage#getFormalParameter_Placeholder()
	 * @model unique="false"
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link work.andycarpenter.psms.base.FormalParameter#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see work.andycarpenter.psms.base.BasePackage#getFormalParameter_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link work.andycarpenter.psms.base.FormalParameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // FormalParameter
