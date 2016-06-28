/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uk.ac.man.cs.mdsd.orm.OrmModel;

import uk.ac.man.cs.mdsd.rest.API;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getServices <em>Services</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getPages <em>Pages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getMenus <em>Menus</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getSiteName <em>Site Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getSiteTitle <em>Site Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#isDevelopmentVersion <em>Development Version</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getBaseURL <em>Base URL</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#isRewriteURLs <em>Rewrite UR Ls</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getWebmasterEmail <em>Webmaster Email</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getCopyrightText <em>Copyright Text</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getMetaDescription <em>Meta Description</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getFrameworkTechnology <em>Framework Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getAjaxTechnology <em>Ajax Technology</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getCaptchaSiteKey <em>Captcha Site Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getCaptchaSecretKey <em>Captcha Secret Key</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getTextEditorURL <em>Text Editor URL</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getTopNavigationId <em>Top Navigation Id</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getSideMenu <em>Side Menu</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#isStaticUnitsEditable <em>Static Units Editable</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.WafModel#getRestApi <em>Rest Api</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel()
 * @model
 * @generated
 */
public interface WafModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Persistence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence</em>' reference.
	 * @see #setPersistence(OrmModel)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_Persistence()
	 * @model required="true"
	 * @generated
	 */
	OrmModel getPersistence();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#getPersistence <em>Persistence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence</em>' reference.
	 * @see #getPersistence()
	 * @generated
	 */
	void setPersistence(OrmModel value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.Service}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.Service#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_Services()
	 * @see uk.ac.man.cs.mdsd.waf.Service#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.Page}.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.Page#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_Pages()
	 * @see uk.ac.man.cs.mdsd.waf.Page#getPartOf
	 * @model opposite="partOf" containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.Menu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menus</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_Menus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Menu> getMenus();

	/**
	 * Returns the value of the '<em><b>Site Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Name</em>' attribute.
	 * @see #setSiteName(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_SiteName()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getSiteName();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#getSiteName <em>Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Name</em>' attribute.
	 * @see #getSiteName()
	 * @generated
	 */
	void setSiteName(String value);

	/**
	 * Returns the value of the '<em><b>Site Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Title</em>' attribute.
	 * @see #setSiteTitle(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_SiteTitle()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getSiteTitle();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#getSiteTitle <em>Site Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Title</em>' attribute.
	 * @see #getSiteTitle()
	 * @generated
	 */
	void setSiteTitle(String value);

	/**
	 * Returns the value of the '<em><b>Development Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Development Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Development Version</em>' attribute.
	 * @see #setDevelopmentVersion(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_DevelopmentVersion()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDevelopmentVersion();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#isDevelopmentVersion <em>Development Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Development Version</em>' attribute.
	 * @see #isDevelopmentVersion()
	 * @generated
	 */
	void setDevelopmentVersion(boolean value);

	/**
	 * Returns the value of the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base URL</em>' attribute.
	 * @see #setBaseURL(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_BaseURL()
	 * @model unique="false"
	 * @generated
	 */
	String getBaseURL();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#getBaseURL <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URL</em>' attribute.
	 * @see #getBaseURL()
	 * @generated
	 */
	void setBaseURL(String value);

	/**
	 * Returns the value of the '<em><b>Rewrite UR Ls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rewrite UR Ls</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewrite UR Ls</em>' attribute.
	 * @see #setRewriteURLs(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_RewriteURLs()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRewriteURLs();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#isRewriteURLs <em>Rewrite UR Ls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rewrite UR Ls</em>' attribute.
	 * @see #isRewriteURLs()
	 * @generated
	 */
	void setRewriteURLs(boolean value);

	/**
	 * Returns the value of the '<em><b>Webmaster Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webmaster Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webmaster Email</em>' attribute.
	 * @see #setWebmasterEmail(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_WebmasterEmail()
	 * @model unique="false"
	 * @generated
	 */
	String getWebmasterEmail();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#getWebmasterEmail <em>Webmaster Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webmaster Email</em>' attribute.
	 * @see #getWebmasterEmail()
	 * @generated
	 */
	void setWebmasterEmail(String value);

	/**
	 * Returns the value of the '<em><b>Copyright Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright Text</em>' attribute.
	 * @see #setCopyrightText(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_CopyrightText()
	 * @model unique="false"
	 * @generated
	 */
	String getCopyrightText();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#getCopyrightText <em>Copyright Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright Text</em>' attribute.
	 * @see #getCopyrightText()
	 * @generated
	 */
	void setCopyrightText(String value);

	/**
	 * Returns the value of the '<em><b>Meta Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Description</em>' attribute.
	 * @see #setMetaDescription(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_MetaDescription()
	 * @model unique="false"
	 * @generated
	 */
	String getMetaDescription();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#getMetaDescription <em>Meta Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Description</em>' attribute.
	 * @see #getMetaDescription()
	 * @generated
	 */
	void setMetaDescription(String value);

	/**
	 * Returns the value of the '<em><b>Framework Technology</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.waf.FrameworkTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framework Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framework Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.waf.FrameworkTechnologies
	 * @see #setFrameworkTechnology(FrameworkTechnologies)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_FrameworkTechnology()
	 * @model unique="false"
	 * @generated
	 */
	FrameworkTechnologies getFrameworkTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#getFrameworkTechnology <em>Framework Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framework Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.waf.FrameworkTechnologies
	 * @see #getFrameworkTechnology()
	 * @generated
	 */
	void setFrameworkTechnology(FrameworkTechnologies value);

	/**
	 * Returns the value of the '<em><b>Ajax Technology</b></em>' attribute.
	 * The literals are from the enumeration {@link uk.ac.man.cs.mdsd.waf.AjaxTechnologies}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ajax Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ajax Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.waf.AjaxTechnologies
	 * @see #setAjaxTechnology(AjaxTechnologies)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_AjaxTechnology()
	 * @model unique="false"
	 * @generated
	 */
	AjaxTechnologies getAjaxTechnology();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#getAjaxTechnology <em>Ajax Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ajax Technology</em>' attribute.
	 * @see uk.ac.man.cs.mdsd.waf.AjaxTechnologies
	 * @see #getAjaxTechnology()
	 * @generated
	 */
	void setAjaxTechnology(AjaxTechnologies value);

	/**
	 * Returns the value of the '<em><b>Authentication</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.Authentication#getAuthorises <em>Authorises</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication</em>' containment reference.
	 * @see #setAuthentication(Authentication)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_Authentication()
	 * @see uk.ac.man.cs.mdsd.waf.Authentication#getAuthorises
	 * @model opposite="authorises" containment="true"
	 * @generated
	 */
	Authentication getAuthentication();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#getAuthentication <em>Authentication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication</em>' containment reference.
	 * @see #getAuthentication()
	 * @generated
	 */
	void setAuthentication(Authentication value);

	/**
	 * Returns the value of the '<em><b>Captcha Site Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Captcha Site Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Captcha Site Key</em>' attribute.
	 * @see #setCaptchaSiteKey(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_CaptchaSiteKey()
	 * @model unique="false"
	 * @generated
	 */
	String getCaptchaSiteKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#getCaptchaSiteKey <em>Captcha Site Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Captcha Site Key</em>' attribute.
	 * @see #getCaptchaSiteKey()
	 * @generated
	 */
	void setCaptchaSiteKey(String value);

	/**
	 * Returns the value of the '<em><b>Captcha Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Captcha Secret Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Captcha Secret Key</em>' attribute.
	 * @see #setCaptchaSecretKey(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_CaptchaSecretKey()
	 * @model unique="false"
	 * @generated
	 */
	String getCaptchaSecretKey();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#getCaptchaSecretKey <em>Captcha Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Captcha Secret Key</em>' attribute.
	 * @see #getCaptchaSecretKey()
	 * @generated
	 */
	void setCaptchaSecretKey(String value);

	/**
	 * Returns the value of the '<em><b>Text Editor URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Editor URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Editor URL</em>' attribute.
	 * @see #setTextEditorURL(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_TextEditorURL()
	 * @model unique="false"
	 * @generated
	 */
	String getTextEditorURL();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#getTextEditorURL <em>Text Editor URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Editor URL</em>' attribute.
	 * @see #getTextEditorURL()
	 * @generated
	 */
	void setTextEditorURL(String value);

	/**
	 * Returns the value of the '<em><b>Top Navigation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Navigation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Navigation Id</em>' attribute.
	 * @see #setTopNavigationId(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_TopNavigationId()
	 * @model unique="false"
	 * @generated
	 */
	String getTopNavigationId();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#getTopNavigationId <em>Top Navigation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Navigation Id</em>' attribute.
	 * @see #getTopNavigationId()
	 * @generated
	 */
	void setTopNavigationId(String value);

	/**
	 * Returns the value of the '<em><b>Side Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Menu</em>' reference.
	 * @see #setSideMenu(Menu)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_SideMenu()
	 * @model
	 * @generated
	 */
	Menu getSideMenu();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#getSideMenu <em>Side Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Menu</em>' reference.
	 * @see #getSideMenu()
	 * @generated
	 */
	void setSideMenu(Menu value);

	/**
	 * Returns the value of the '<em><b>Static Units Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Units Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Units Editable</em>' attribute.
	 * @see #setStaticUnitsEditable(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_StaticUnitsEditable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isStaticUnitsEditable();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#isStaticUnitsEditable <em>Static Units Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Units Editable</em>' attribute.
	 * @see #isStaticUnitsEditable()
	 * @generated
	 */
	void setStaticUnitsEditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Rest Api</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest Api</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest Api</em>' reference.
	 * @see #setRestApi(API)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getWafModel_RestApi()
	 * @model
	 * @generated
	 */
	API getRestApi();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.WafModel#getRestApi <em>Rest Api</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest Api</em>' reference.
	 * @see #getRestApi()
	 * @generated
	 */
	void setRestApi(API value);

} // WafModel
