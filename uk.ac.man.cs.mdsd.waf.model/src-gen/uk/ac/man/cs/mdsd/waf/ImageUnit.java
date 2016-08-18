/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.SingletonImage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ImageUnit#getDefaultSelection <em>Default Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ImageUnit#getImageProperty <em>Image Property</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getImageUnit()
 * @model abstract="true"
 * @generated
 */
public interface ImageUnit extends DynamicUnit {
	/**
	 * Returns the value of the '<em><b>Default Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Selection</em>' reference.
	 * @see #setDefaultSelection(Selection)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getImageUnit_DefaultSelection()
	 * @model
	 * @generated
	 */
	Selection getDefaultSelection();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ImageUnit#getDefaultSelection <em>Default Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Selection</em>' reference.
	 * @see #getDefaultSelection()
	 * @generated
	 */
	void setDefaultSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Image Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Property</em>' reference.
	 * @see #setImageProperty(SingletonImage)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getImageUnit_ImageProperty()
	 * @model required="true"
	 * @generated
	 */
	SingletonImage getImageProperty();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ImageUnit#getImageProperty <em>Image Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Property</em>' reference.
	 * @see #getImageProperty()
	 * @generated
	 */
	void setImageProperty(SingletonImage value);

} // ImageUnit
