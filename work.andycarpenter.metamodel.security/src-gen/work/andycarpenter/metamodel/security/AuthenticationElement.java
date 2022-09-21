/**
 */
package work.andycarpenter.metamodel.security;

import work.andycarpenter.metamodel.base.NamedDisplayElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link work.andycarpenter.metamodel.security.AuthenticationElement#getConfirmLabel <em>Confirm Label</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.AuthenticationElement#getUriElement <em>Uri Element</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.AuthenticationElement#getSectionClassOverride <em>Section Class Override</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.AuthenticationElement#getSectionClass <em>Section Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.AuthenticationElement#isHasSectionClass <em>Has Section Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.AuthenticationElement#getCaptionClassOverride <em>Caption Class Override</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.AuthenticationElement#getCaptionClass <em>Caption Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.AuthenticationElement#isHasCaptionClass <em>Has Caption Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.AuthenticationElement#getContentClassOverride <em>Content Class Override</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.AuthenticationElement#getContentClass <em>Content Class</em>}</li>
 *   <li>{@link work.andycarpenter.metamodel.security.AuthenticationElement#isHasContentClass <em>Has Content Class</em>}</li>
 * </ul>
 *
 * @see work.andycarpenter.metamodel.security.SecurityPackage#getAuthenticationElement()
 * @model abstract="true"
 * @generated
 */
public interface AuthenticationElement extends NamedDisplayElement {
	/**
	 * Returns the value of the '<em><b>Confirm Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Label</em>' attribute.
	 * @see #setConfirmLabel(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getAuthenticationElement_ConfirmLabel()
	 * @model default="" unique="false" required="true"
	 * @generated
	 */
	String getConfirmLabel();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.AuthenticationElement#getConfirmLabel <em>Confirm Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Label</em>' attribute.
	 * @see #getConfirmLabel()
	 * @generated
	 */
	void setConfirmLabel(String value);

	/**
	 * Returns the value of the '<em><b>Uri Element</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Element</em>' attribute.
	 * @see #setUriElement(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getAuthenticationElement_UriElement()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getUriElement();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.AuthenticationElement#getUriElement <em>Uri Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Element</em>' attribute.
	 * @see #getUriElement()
	 * @generated
	 */
	void setUriElement(String value);

	/**
	 * Returns the value of the '<em><b>Section Class Override</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Class Override</em>' attribute.
	 * @see #setSectionClassOverride(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getAuthenticationElement_SectionClassOverride()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getSectionClassOverride();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.AuthenticationElement#getSectionClassOverride <em>Section Class Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Class Override</em>' attribute.
	 * @see #getSectionClassOverride()
	 * @generated
	 */
	void setSectionClassOverride(String value);

	/**
	 * Returns the value of the '<em><b>Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Class</em>' attribute.
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getAuthenticationElement_SectionClass()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if sectionClassOverride.trim() &lt;&gt; \'\' then\n\t\t\tsectionClassOverride.trim()\n\t\telse if self.oclAsType(ecore::EObject).eContainer().sectionClass.trim() &lt;&gt; \'\' then\n\t\t\tself.eContainer().sectionClass.trim()\n\t\telse\n\t\t\t\'\'\n\t\tendif endif'"
	 * @generated
	 */
	String getSectionClass();

	/**
	 * Returns the value of the '<em><b>Has Section Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Section Class</em>' attribute.
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getAuthenticationElement_HasSectionClass()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='sectionClass &lt;&gt; \'\''"
	 * @generated
	 */
	boolean isHasSectionClass();

	/**
	 * Returns the value of the '<em><b>Caption Class Override</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Class Override</em>' attribute.
	 * @see #setCaptionClassOverride(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getAuthenticationElement_CaptionClassOverride()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getCaptionClassOverride();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.AuthenticationElement#getCaptionClassOverride <em>Caption Class Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Class Override</em>' attribute.
	 * @see #getCaptionClassOverride()
	 * @generated
	 */
	void setCaptionClassOverride(String value);

	/**
	 * Returns the value of the '<em><b>Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Class</em>' attribute.
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getAuthenticationElement_CaptionClass()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if captionClassOverride.trim() &lt;&gt; \'\' then\n\t\t\tcaptionClassOverride.trim()\n\t\telse if self.oclAsType(ecore::EObject).eContainer().captionClass.trim() &lt;&gt; \'\' then\n\t\t\tself.eContainer().captionClass.trim()\n\t\telse\n\t\t\t\'\'\n\t\tendif endif'"
	 * @generated
	 */
	String getCaptionClass();

	/**
	 * Returns the value of the '<em><b>Has Caption Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Caption Class</em>' attribute.
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getAuthenticationElement_HasCaptionClass()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='captionClass &lt;&gt; \'\''"
	 * @generated
	 */
	boolean isHasCaptionClass();

	/**
	 * Returns the value of the '<em><b>Content Class Override</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Class Override</em>' attribute.
	 * @see #setContentClassOverride(String)
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getAuthenticationElement_ContentClassOverride()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getContentClassOverride();

	/**
	 * Sets the value of the '{@link work.andycarpenter.metamodel.security.AuthenticationElement#getContentClassOverride <em>Content Class Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Class Override</em>' attribute.
	 * @see #getContentClassOverride()
	 * @generated
	 */
	void setContentClassOverride(String value);

	/**
	 * Returns the value of the '<em><b>Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Class</em>' attribute.
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getAuthenticationElement_ContentClass()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if contentClassOverride.trim() &lt;&gt; \'\' then\n\t\t\tcontentClassOverride.trim()\n\t\telse if self.oclAsType(ecore::EObject).eContainer().contentClass.trim() &lt;&gt; \'\' then\n\t\t\tself.eContainer().contentClass.trim()\n\t\telse\n\t\t\t\'\'\n\t\tendif endif'"
	 * @generated
	 */
	String getContentClass();

	/**
	 * Returns the value of the '<em><b>Has Content Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Content Class</em>' attribute.
	 * @see work.andycarpenter.metamodel.security.SecurityPackage#getAuthenticationElement_HasContentClass()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='contentClass &lt;&gt; \'\''"
	 * @generated
	 */
	boolean isHasContentClass();

} // AuthenticationElement
