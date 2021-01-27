/**
 */
package work.andycarpenter.psms.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.psms.base.EnumerationType#getEnumerations <em>Enumerations</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.psms.base.BasePackage#getEnumerationType()
 * @model
 * @generated
 */
public interface EnumerationType extends DataType {
	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link work.andycarpenter.psms.base.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see work.andycarpenter.psms.base.BasePackage#getEnumerationType_Enumerations()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getEnumerations();

} // EnumerationType
