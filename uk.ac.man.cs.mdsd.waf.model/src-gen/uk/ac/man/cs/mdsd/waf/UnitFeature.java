/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.criteria.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getForcedValue <em>Forced Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getNullDisplayValue <em>Null Display Value</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitFeature#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitFeature#isAutofocus <em>Autofocus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getFooter <em>Footer</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getFooterClass <em>Footer Class</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitFeature()
 * @model abstract="true"
 * @generated
 */
public interface UnitFeature extends UnitField, InlineActionContainer {
	/**
	 * Returns the value of the '<em><b>Forced Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forced Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forced Value</em>' containment reference.
	 * @see #setForcedValue(Expression)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitFeature_ForcedValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getForcedValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getForcedValue <em>Forced Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forced Value</em>' containment reference.
	 * @see #getForcedValue()
	 * @generated
	 */
	void setForcedValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Null Display Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Display Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Display Value</em>' attribute.
	 * @see #setNullDisplayValue(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitFeature_NullDisplayValue()
	 * @model unique="false"
	 * @generated
	 */
	String getNullDisplayValue();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getNullDisplayValue <em>Null Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Display Value</em>' attribute.
	 * @see #getNullDisplayValue()
	 * @generated
	 */
	void setNullDisplayValue(String value);

	/**
	 * Returns the value of the '<em><b>Only Display When Not Empty</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Only Display When Not Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only Display When Not Empty</em>' attribute.
	 * @see #setOnlyDisplayWhenNotEmpty(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitFeature_OnlyDisplayWhenNotEmpty()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isOnlyDisplayWhenNotEmpty();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#isOnlyDisplayWhenNotEmpty <em>Only Display When Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Display When Not Empty</em>' attribute.
	 * @see #isOnlyDisplayWhenNotEmpty()
	 * @generated
	 */
	void setOnlyDisplayWhenNotEmpty(boolean value);

	/**
	 * Returns the value of the '<em><b>Autofocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autofocus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autofocus</em>' attribute.
	 * @see #setAutofocus(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitFeature_Autofocus()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAutofocus();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#isAutofocus <em>Autofocus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autofocus</em>' attribute.
	 * @see #isAutofocus()
	 * @generated
	 */
	void setAutofocus(boolean value);

	/**
	 * Returns the value of the '<em><b>Footer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer</em>' attribute.
	 * @see #setFooter(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitFeature_Footer()
	 * @model unique="false"
	 * @generated
	 */
	String getFooter();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getFooter <em>Footer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer</em>' attribute.
	 * @see #getFooter()
	 * @generated
	 */
	void setFooter(String value);

	/**
	 * Returns the value of the '<em><b>Header Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Class</em>' attribute.
	 * @see #setHeaderClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitFeature_HeaderClass()
	 * @model unique="false"
	 * @generated
	 */
	String getHeaderClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getHeaderClass <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Class</em>' attribute.
	 * @see #getHeaderClass()
	 * @generated
	 */
	void setHeaderClass(String value);

	/**
	 * Returns the value of the '<em><b>Input Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Class</em>' attribute.
	 * @see #setInputClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitFeature_InputClass()
	 * @model unique="false"
	 * @generated
	 */
	String getInputClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getInputClass <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Class</em>' attribute.
	 * @see #getInputClass()
	 * @generated
	 */
	void setInputClass(String value);

	/**
	 * Returns the value of the '<em><b>Display Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Class</em>' attribute.
	 * @see #setDisplayClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitFeature_DisplayClass()
	 * @model unique="false"
	 * @generated
	 */
	String getDisplayClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getDisplayClass <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Class</em>' attribute.
	 * @see #getDisplayClass()
	 * @generated
	 */
	void setDisplayClass(String value);

	/**
	 * Returns the value of the '<em><b>Footer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Footer Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footer Class</em>' attribute.
	 * @see #setFooterClass(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitFeature_FooterClass()
	 * @model unique="false"
	 * @generated
	 */
	String getFooterClass();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitFeature#getFooterClass <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footer Class</em>' attribute.
	 * @see #getFooterClass()
	 * @generated
	 */
	void setFooterClass(String value);

} // UnitFeature
