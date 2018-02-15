/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.ModelLabel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Path Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.FeaturePathLabel#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.FeaturePathLabel#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getFeaturePathLabel()
 * @model
 * @generated
 */
public interface FeaturePathLabel extends FeaturePath {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getFeaturePathLabel_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _xifexpression = null;\n&lt;%uk.ac.man.cs.mdsd.orm.ModelLabel%&gt; _label = this.getLabel();\nboolean _tripleNotEquals = (_label != null);\nif (_tripleNotEquals)\n{\n\t_xifexpression = this.getLabel().getName();\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(ModelLabel)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getFeaturePathLabel_Label()
	 * @model required="true"
	 * @generated
	 */
	ModelLabel getLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.FeaturePathLabel#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(ModelLabel value);

} // FeaturePathLabel
