/**
 */
package uk.ac.man.cs.mdsd.waf;

import uk.ac.man.cs.mdsd.orm.Association;
import uk.ac.man.cs.mdsd.orm.EntityOrView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ChildAssociation#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ChildAssociation#getAssociation <em>Association</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ChildAssociation#getChildFeature <em>Child Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ChildAssociation#getSource <em>Source</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ChildAssociation#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ChildAssociation#getTargetName <em>Target Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.ChildAssociation#getParentTarget <em>Parent Target</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getChildAssociation()
 * @model
 * @generated
 */
public interface ChildAssociation extends ChildFeature {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getChildAssociation_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%java.lang.String%> _xifexpression = null;\n<%uk.ac.man.cs.mdsd.orm.Association%> _association = this.getAssociation();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_association, null));\nif (_notEquals)\n{\n\t<%uk.ac.man.cs.mdsd.orm.Association%> _association_1 = this.getAssociation();\n\t_xifexpression = _association_1.getName();\n}\nreturn _xifexpression;'"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getChildAssociation_Association()
	 * @model required="true"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ChildAssociation#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Child Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Feature</em>' containment reference.
	 * @see #setChildFeature(ChildFeature)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getChildAssociation_ChildFeature()
	 * @model containment="true"
	 * @generated
	 */
	ChildFeature getChildFeature();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ChildAssociation#getChildFeature <em>Child Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Feature</em>' containment reference.
	 * @see #getChildFeature()
	 * @generated
	 */
	void setChildFeature(ChildFeature value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(Boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getChildAssociation_Source()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getSource();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ChildAssociation#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Boolean value);

	/**
	 * Returns the value of the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Name</em>' attribute.
	 * @see #setSourceName(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getChildAssociation_SourceName()
	 * @model unique="false"
	 * @generated
	 */
	String getSourceName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ChildAssociation#getSourceName <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Name</em>' attribute.
	 * @see #getSourceName()
	 * @generated
	 */
	void setSourceName(String value);

	/**
	 * Returns the value of the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Name</em>' attribute.
	 * @see #setTargetName(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getChildAssociation_TargetName()
	 * @model unique="false"
	 * @generated
	 */
	String getTargetName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ChildAssociation#getTargetName <em>Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Name</em>' attribute.
	 * @see #getTargetName()
	 * @generated
	 */
	void setTargetName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Target</em>' reference.
	 * @see #setParentTarget(EntityOrView)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getChildAssociation_ParentTarget()
	 * @model required="true"
	 * @generated
	 */
	EntityOrView getParentTarget();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.ChildAssociation#getParentTarget <em>Parent Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Target</em>' reference.
	 * @see #getParentTarget()
	 * @generated
	 */
	void setParentTarget(EntityOrView value);

} // ChildAssociation