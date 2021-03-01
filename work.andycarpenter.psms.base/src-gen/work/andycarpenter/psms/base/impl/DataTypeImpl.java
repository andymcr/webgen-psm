/**
 */
package work.andycarpenter.psms.base.impl;

import com.google.common.base.Objects;

import org.eclipse.emf.ecore.EClass;

import work.andycarpenter.psms.base.BasePackage;
import work.andycarpenter.psms.base.DataType;
import work.andycarpenter.psms.base.EnumerationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.psms.base.impl.DataTypeImpl#isIsBooleanDataType <em>Is Boolean Data Type</em>}</li>
 *   <li>{@link work.andycarpenter.psms.base.impl.DataTypeImpl#isIsEmailDataType <em>Is Email Data Type</em>}</li>
 *   <li>{@link work.andycarpenter.psms.base.impl.DataTypeImpl#isIsEnumerationType <em>Is Enumeration Type</em>}</li>
 *   <li>{@link work.andycarpenter.psms.base.impl.DataTypeImpl#isIsIntegerDataType <em>Is Integer Data Type</em>}</li>
 *   <li>{@link work.andycarpenter.psms.base.impl.DataTypeImpl#isIsStringDataType <em>Is String Data Type</em>}</li>
 *   <li>{@link work.andycarpenter.psms.base.impl.DataTypeImpl#isIsTextareaDataType <em>Is Textarea Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeImpl extends ClassifierImpl implements DataType {
	/**
	 * The default value of the '{@link #isIsBooleanDataType() <em>Is Boolean Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBooleanDataType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BOOLEAN_DATA_TYPE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsEmailDataType() <em>Is Email Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEmailDataType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EMAIL_DATA_TYPE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsEnumerationType() <em>Is Enumeration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnumerationType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENUMERATION_TYPE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsIntegerDataType() <em>Is Integer Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIntegerDataType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INTEGER_DATA_TYPE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsStringDataType() <em>Is String Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStringDataType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STRING_DATA_TYPE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsTextareaDataType() <em>Is Textarea Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTextareaDataType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TEXTAREA_DATA_TYPE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBooleanDataType() {
		String _name = this.getName();
		return Objects.equal(_name, "Boolean");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEmailDataType() {
		String _name = this.getName();
		return Objects.equal(_name, "Email");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEnumerationType() {
		return (this instanceof EnumerationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIntegerDataType() {
		String _name = this.getName();
		return Objects.equal(_name, "Integer");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStringDataType() {
		String _name = this.getName();
		return Objects.equal(_name, "String");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTextareaDataType() {
		String _name = this.getName();
		return Objects.equal(_name, "Textarea");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.DATA_TYPE__IS_BOOLEAN_DATA_TYPE:
				return isIsBooleanDataType();
			case BasePackage.DATA_TYPE__IS_EMAIL_DATA_TYPE:
				return isIsEmailDataType();
			case BasePackage.DATA_TYPE__IS_ENUMERATION_TYPE:
				return isIsEnumerationType();
			case BasePackage.DATA_TYPE__IS_INTEGER_DATA_TYPE:
				return isIsIntegerDataType();
			case BasePackage.DATA_TYPE__IS_STRING_DATA_TYPE:
				return isIsStringDataType();
			case BasePackage.DATA_TYPE__IS_TEXTAREA_DATA_TYPE:
				return isIsTextareaDataType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasePackage.DATA_TYPE__IS_BOOLEAN_DATA_TYPE:
				return isIsBooleanDataType() != IS_BOOLEAN_DATA_TYPE_EDEFAULT;
			case BasePackage.DATA_TYPE__IS_EMAIL_DATA_TYPE:
				return isIsEmailDataType() != IS_EMAIL_DATA_TYPE_EDEFAULT;
			case BasePackage.DATA_TYPE__IS_ENUMERATION_TYPE:
				return isIsEnumerationType() != IS_ENUMERATION_TYPE_EDEFAULT;
			case BasePackage.DATA_TYPE__IS_INTEGER_DATA_TYPE:
				return isIsIntegerDataType() != IS_INTEGER_DATA_TYPE_EDEFAULT;
			case BasePackage.DATA_TYPE__IS_STRING_DATA_TYPE:
				return isIsStringDataType() != IS_STRING_DATA_TYPE_EDEFAULT;
			case BasePackage.DATA_TYPE__IS_TEXTAREA_DATA_TYPE:
				return isIsTextareaDataType() != IS_TEXTAREA_DATA_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //DataTypeImpl
