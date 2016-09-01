/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.orm.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Path Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.FeaturePathAttribute#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getFeaturePathAttribute()
 * @model
 * @generated
 */
public interface FeaturePathAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getFeaturePathAttribute_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.FeaturePathAttribute#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

} // FeaturePathAttribute