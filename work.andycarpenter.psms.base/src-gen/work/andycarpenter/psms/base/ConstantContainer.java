/**
 */
package work.andycarpenter.psms.base;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.psms.base.ConstantContainer#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.psms.base.BasePackage#getConstantContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ConstantContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.psms.base.Constant}.
	 * It is bidirectional and its opposite is '{@link work.andycarpenter.psms.base.Constant#getDefinedBy <em>Defined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' containment reference list.
	 * @see work.andycarpenter.psms.base.BasePackage#getConstantContainer_Constants()
	 * @see work.andycarpenter.psms.base.Constant#getDefinedBy
	 * @model opposite="definedBy" containment="true"
	 * @generated
	 */
	EList<Constant> getConstants();

} // ConstantContainer
