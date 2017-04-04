/**
 */
package uk.ac.man.cs.mdsd.service;

import uk.ac.man.cs.mdsd.expression.Variable;

import uk.ac.man.cs.mdsd.orm.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.service.FeatureReference#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.service.ServicePackage#getFeatureReference()
 * @model
 * @generated
 */
public interface FeatureReference extends Variable {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see uk.ac.man.cs.mdsd.service.ServicePackage#getFeatureReference_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.service.FeatureReference#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // FeatureReference
