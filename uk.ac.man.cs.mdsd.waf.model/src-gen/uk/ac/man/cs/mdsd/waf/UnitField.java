/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitField#getDisplayedOn <em>Displayed On</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitField#getTitle <em>Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitField#getCollectionDisplayOption <em>Collection Display Option</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitField#isCollectionAllowAdd <em>Collection Allow Add</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitField#isCollectionAllowRemove <em>Collection Allow Remove</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitField#getMaximumDisplaySize <em>Maximum Display Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.UnitField#getDateFormat <em>Date Format</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitField()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface UnitField extends DisplayElement {
	/**
	 * Returns the value of the '<em><b>Displayed On</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.DynamicUnit#getDisplayFields <em>Display Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displayed On</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displayed On</em>' container reference.
	 * @see #setDisplayedOn(DynamicUnit)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitField_DisplayedOn()
	 * @see uk.ac.man.cs.mdsd.waf.DynamicUnit#getDisplayFields
	 * @model opposite="displayFields" required="true" transient="false"
	 * @generated
	 */
	DynamicUnit getDisplayedOn();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitField#getDisplayedOn <em>Displayed On</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displayed On</em>' container reference.
	 * @see #getDisplayedOn()
	 * @generated
	 */
	void setDisplayedOn(DynamicUnit value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitField_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitField#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Collection Display Option</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.waf.CollectionDisplayOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Display Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Display Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionDisplayOptions
	 * @see #setCollectionDisplayOption(CollectionDisplayOptions)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitField_CollectionDisplayOption()
	 * @model unique="false"
	 * @generated
	 */
	CollectionDisplayOptions getCollectionDisplayOption();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitField#getCollectionDisplayOption <em>Collection Display Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Display Option</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.waf.CollectionDisplayOptions
	 * @see #getCollectionDisplayOption()
	 * @generated
	 */
	void setCollectionDisplayOption(CollectionDisplayOptions value);

	/**
	 * Returns the value of the '<em><b>Collection Allow Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Allow Add</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Allow Add</em>' attribute.
	 * @see #setCollectionAllowAdd(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitField_CollectionAllowAdd()
	 * @model unique="false"
	 * @generated
	 */
	boolean isCollectionAllowAdd();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitField#isCollectionAllowAdd <em>Collection Allow Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Allow Add</em>' attribute.
	 * @see #isCollectionAllowAdd()
	 * @generated
	 */
	void setCollectionAllowAdd(boolean value);

	/**
	 * Returns the value of the '<em><b>Collection Allow Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Allow Remove</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Allow Remove</em>' attribute.
	 * @see #setCollectionAllowRemove(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitField_CollectionAllowRemove()
	 * @model unique="false"
	 * @generated
	 */
	boolean isCollectionAllowRemove();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitField#isCollectionAllowRemove <em>Collection Allow Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Allow Remove</em>' attribute.
	 * @see #isCollectionAllowRemove()
	 * @generated
	 */
	void setCollectionAllowRemove(boolean value);

	/**
	 * Returns the value of the '<em><b>Maximum Display Size</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Display Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Display Size</em>' attribute.
	 * @see #setMaximumDisplaySize(int)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitField_MaximumDisplaySize()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getMaximumDisplaySize();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitField#getMaximumDisplaySize <em>Maximum Display Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Display Size</em>' attribute.
	 * @see #getMaximumDisplaySize()
	 * @generated
	 */
	void setMaximumDisplaySize(int value);

	/**
	 * Returns the value of the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Format</em>' attribute.
	 * @see #setDateFormat(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getUnitField_DateFormat()
	 * @model unique="false"
	 * @generated
	 */
	String getDateFormat();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.UnitField#getDateFormat <em>Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Format</em>' attribute.
	 * @see #getDateFormat()
	 * @generated
	 */
	void setDateFormat(String value);

} // UnitField
