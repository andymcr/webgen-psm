/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Attribute Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ServiceAttributeReference#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceAttributeReference()
 * @model
 * @generated
 */
public interface ServiceAttributeReference extends ServiceFeatureReference {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(ServiceAttribute)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getServiceAttributeReference_Attribute()
	 * @model required="true"
	 * @generated
	 */
	ServiceAttribute getAttribute();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ServiceAttributeReference#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(ServiceAttribute value);

} // ServiceAttributeReference
