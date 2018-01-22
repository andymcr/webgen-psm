/**
 */
package uk.ac.man.cs.mdsd.waf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.SelectAction#getTarget <em>Target</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.SelectAction#getValuePath <em>Value Path</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelectAction()
 * @model
 * @generated
 */
public interface SelectAction extends InlineAction {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.SelectableUnit#getSelectors <em>Selectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SelectableUnit)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelectAction_Target()
	 * @see uk.ac.man.cs.mdsd.waf.SelectableUnit#getSelectors
	 * @model opposite="selectors" required="true"
	 * @generated
	 */
	SelectableUnit getTarget();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.SelectAction#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SelectableUnit value);

	/**
	 * Returns the value of the '<em><b>Value Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Path</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Path</em>' containment reference.
	 * @see #setValuePath(FeaturePath)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getSelectAction_ValuePath()
	 * @model containment="true"
	 * @generated
	 */
	FeaturePath getValuePath();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.SelectAction#getValuePath <em>Value Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Path</em>' containment reference.
	 * @see #getValuePath()
	 * @generated
	 */
	void setValuePath(FeaturePath value);

} // SelectAction
