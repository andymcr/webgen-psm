/**
 */
package work.andycarpenter.psms.base.impl;

import org.eclipse.emf.ecore.EClass;

import work.andycarpenter.psms.base.BasePackage;
import work.andycarpenter.psms.base.Classifier;
import work.andycarpenter.psms.base.DataType;
import work.andycarpenter.psms.base.EnumerationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.psms.base.impl.ClassifierImpl#isIsBooleanClassifier <em>Is Boolean Classifier</em>}</li>
 *   <li>{@link work.andycarpenter.psms.base.impl.ClassifierImpl#isIsEmailClassifier <em>Is Email Classifier</em>}</li>
 *   <li>{@link work.andycarpenter.psms.base.impl.ClassifierImpl#isIsEnumerationClassifier <em>Is Enumeration Classifier</em>}</li>
 *   <li>{@link work.andycarpenter.psms.base.impl.ClassifierImpl#isIsIntegerClassifier <em>Is Integer Classifier</em>}</li>
 *   <li>{@link work.andycarpenter.psms.base.impl.ClassifierImpl#isIsStringClassifier <em>Is String Classifier</em>}</li>
 *   <li>{@link work.andycarpenter.psms.base.impl.ClassifierImpl#isIsTextareaClassifier <em>Is Textarea Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassifierImpl extends NamedDisplayElementImpl implements Classifier {
	/**
	 * The default value of the '{@link #isIsBooleanClassifier() <em>Is Boolean Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBooleanClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BOOLEAN_CLASSIFIER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsEmailClassifier() <em>Is Email Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEmailClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EMAIL_CLASSIFIER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsEnumerationClassifier() <em>Is Enumeration Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnumerationClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENUMERATION_CLASSIFIER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsIntegerClassifier() <em>Is Integer Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIntegerClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INTEGER_CLASSIFIER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsStringClassifier() <em>Is String Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStringClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STRING_CLASSIFIER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsTextareaClassifier() <em>Is Textarea Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTextareaClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TEXTAREA_CLASSIFIER_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBooleanClassifier() {
		boolean _xifexpression = false;
		if ((this instanceof DataType)) {
			_xifexpression = ((DataType) this).isIsBooleanDataType();
		}
		else {
			_xifexpression = false;
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEmailClassifier() {
		boolean _xifexpression = false;
		if ((this instanceof DataType)) {
			_xifexpression = ((DataType) this).isIsEmailDataType();
		}
		else {
			_xifexpression = false;
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEnumerationClassifier() {
		return (this instanceof EnumerationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIntegerClassifier() {
		boolean _xifexpression = false;
		if ((this instanceof DataType)) {
			_xifexpression = ((DataType) this).isIsIntegerDataType();
		}
		else {
			_xifexpression = false;
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStringClassifier() {
		boolean _xifexpression = false;
		if ((this instanceof DataType)) {
			_xifexpression = ((DataType) this).isIsStringDataType();
		}
		else {
			_xifexpression = false;
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTextareaClassifier() {
		boolean _xifexpression = false;
		if ((this instanceof DataType)) {
			_xifexpression = ((DataType) this).isIsTextareaDataType();
		}
		else {
			_xifexpression = false;
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.CLASSIFIER__IS_BOOLEAN_CLASSIFIER:
				return isIsBooleanClassifier();
			case BasePackage.CLASSIFIER__IS_EMAIL_CLASSIFIER:
				return isIsEmailClassifier();
			case BasePackage.CLASSIFIER__IS_ENUMERATION_CLASSIFIER:
				return isIsEnumerationClassifier();
			case BasePackage.CLASSIFIER__IS_INTEGER_CLASSIFIER:
				return isIsIntegerClassifier();
			case BasePackage.CLASSIFIER__IS_STRING_CLASSIFIER:
				return isIsStringClassifier();
			case BasePackage.CLASSIFIER__IS_TEXTAREA_CLASSIFIER:
				return isIsTextareaClassifier();
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
			case BasePackage.CLASSIFIER__IS_BOOLEAN_CLASSIFIER:
				return isIsBooleanClassifier() != IS_BOOLEAN_CLASSIFIER_EDEFAULT;
			case BasePackage.CLASSIFIER__IS_EMAIL_CLASSIFIER:
				return isIsEmailClassifier() != IS_EMAIL_CLASSIFIER_EDEFAULT;
			case BasePackage.CLASSIFIER__IS_ENUMERATION_CLASSIFIER:
				return isIsEnumerationClassifier() != IS_ENUMERATION_CLASSIFIER_EDEFAULT;
			case BasePackage.CLASSIFIER__IS_INTEGER_CLASSIFIER:
				return isIsIntegerClassifier() != IS_INTEGER_CLASSIFIER_EDEFAULT;
			case BasePackage.CLASSIFIER__IS_STRING_CLASSIFIER:
				return isIsStringClassifier() != IS_STRING_CLASSIFIER_EDEFAULT;
			case BasePackage.CLASSIFIER__IS_TEXTAREA_CLASSIFIER:
				return isIsTextareaClassifier() != IS_TEXTAREA_CLASSIFIER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ClassifierImpl
