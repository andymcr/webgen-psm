/**
 */
package uk.ac.man.cs.mdsd.waf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IndexUnit#isOmitColumnLabels <em>Omit Column Labels</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getFilters <em>Filters</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getPagination <em>Pagination</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getDefaultPaginationSize <em>Default Pagination Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getNextNpages <em>Next Npages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getPreviousNpages <em>Previous Npages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getNextPageLabel <em>Next Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getPreviousPageLabel <em>Previous Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IndexUnit#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getFirstPageLabel <em>First Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getLastPageLabel <em>Last Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getTargettingSearches <em>Targetting Searches</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getRowClasses <em>Row Classes</em>}</li>
 * </ul>
 *
 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit()
 * @model abstract="true"
 * @generated
 */
public interface IndexUnit extends DataUnit, InlineActionContainer {
	/**
	 * Returns the value of the '<em><b>Omit Column Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omit Column Labels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omit Column Labels</em>' attribute.
	 * @see #setOmitColumnLabels(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit_OmitColumnLabels()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOmitColumnLabels();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#isOmitColumnLabels <em>Omit Column Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Omit Column Labels</em>' attribute.
	 * @see #isOmitColumnLabels()
	 * @generated
	 */
	void setOmitColumnLabels(boolean value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.man.cs.mdsd.waf.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getFilters();

	/**
	 * Returns the value of the '<em><b>Pagination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagination</em>' reference.
	 * @see #setPagination(Filter)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit_Pagination()
	 * @model
	 * @generated
	 */
	Filter getPagination();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getPagination <em>Pagination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagination</em>' reference.
	 * @see #getPagination()
	 * @generated
	 */
	void setPagination(Filter value);

	/**
	 * Returns the value of the '<em><b>Default Pagination Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Pagination Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Pagination Size</em>' attribute.
	 * @see #setDefaultPaginationSize(int)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit_DefaultPaginationSize()
	 * @model unique="false"
	 * @generated
	 */
	int getDefaultPaginationSize();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getDefaultPaginationSize <em>Default Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Pagination Size</em>' attribute.
	 * @see #getDefaultPaginationSize()
	 * @generated
	 */
	void setDefaultPaginationSize(int value);

	/**
	 * Returns the value of the '<em><b>Next Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Npages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Npages</em>' attribute.
	 * @see #setNextNpages(int)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit_NextNpages()
	 * @model unique="false"
	 * @generated
	 */
	int getNextNpages();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getNextNpages <em>Next Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Npages</em>' attribute.
	 * @see #getNextNpages()
	 * @generated
	 */
	void setNextNpages(int value);

	/**
	 * Returns the value of the '<em><b>Previous Npages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Npages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Npages</em>' attribute.
	 * @see #setPreviousNpages(int)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit_PreviousNpages()
	 * @model unique="false"
	 * @generated
	 */
	int getPreviousNpages();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getPreviousNpages <em>Previous Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Npages</em>' attribute.
	 * @see #getPreviousNpages()
	 * @generated
	 */
	void setPreviousNpages(int value);

	/**
	 * Returns the value of the '<em><b>Next Page Label</b></em>' attribute.
	 * The default value is <code>">"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Page Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Page Label</em>' attribute.
	 * @see #setNextPageLabel(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit_NextPageLabel()
	 * @model default=">" unique="false"
	 * @generated
	 */
	String getNextPageLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getNextPageLabel <em>Next Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page Label</em>' attribute.
	 * @see #getNextPageLabel()
	 * @generated
	 */
	void setNextPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Previous Page Label</b></em>' attribute.
	 * The default value is <code>"<"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Page Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Page Label</em>' attribute.
	 * @see #setPreviousPageLabel(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit_PreviousPageLabel()
	 * @model default="<" unique="false"
	 * @generated
	 */
	String getPreviousPageLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getPreviousPageLabel <em>Previous Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Page Label</em>' attribute.
	 * @see #getPreviousPageLabel()
	 * @generated
	 */
	void setPreviousPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Use First Last Page Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use First Last Page Links</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use First Last Page Links</em>' attribute.
	 * @see #setUseFirstLastPageLinks(boolean)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit_UseFirstLastPageLinks()
	 * @model unique="false"
	 * @generated
	 */
	boolean isUseFirstLastPageLinks();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use First Last Page Links</em>' attribute.
	 * @see #isUseFirstLastPageLinks()
	 * @generated
	 */
	void setUseFirstLastPageLinks(boolean value);

	/**
	 * Returns the value of the '<em><b>First Page Label</b></em>' attribute.
	 * The default value is <code>"<<"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Page Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Page Label</em>' attribute.
	 * @see #setFirstPageLabel(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit_FirstPageLabel()
	 * @model default="<<" unique="false"
	 * @generated
	 */
	String getFirstPageLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getFirstPageLabel <em>First Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Page Label</em>' attribute.
	 * @see #getFirstPageLabel()
	 * @generated
	 */
	void setFirstPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Last Page Label</b></em>' attribute.
	 * The default value is <code>">>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Page Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Page Label</em>' attribute.
	 * @see #setLastPageLabel(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit_LastPageLabel()
	 * @model default=">>" unique="false"
	 * @generated
	 */
	String getLastPageLabel();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getLastPageLabel <em>Last Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Page Label</em>' attribute.
	 * @see #getLastPageLabel()
	 * @generated
	 */
	void setLastPageLabel(String value);

	/**
	 * Returns the value of the '<em><b>Targetting Searches</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uk.ac.man.cs.mdsd.waf.SearchUnit#getResultsDestination <em>Results Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targetting Searches</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetting Searches</em>' reference.
	 * @see #setTargettingSearches(SearchUnit)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit_TargettingSearches()
	 * @see uk.ac.man.cs.mdsd.waf.SearchUnit#getResultsDestination
	 * @model opposite="resultsDestination"
	 * @generated
	 */
	SearchUnit getTargettingSearches();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getTargettingSearches <em>Targetting Searches</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetting Searches</em>' reference.
	 * @see #getTargettingSearches()
	 * @generated
	 */
	void setTargettingSearches(SearchUnit value);

	/**
	 * Returns the value of the '<em><b>Row Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Classes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Classes</em>' attribute.
	 * @see #setRowClasses(String)
	 * @see uk.ac.man.cs.mdsd.waf.WafPackage#getIndexUnit_RowClasses()
	 * @model unique="false"
	 * @generated
	 */
	String getRowClasses();

	/**
	 * Sets the value of the '{@link uk.ac.man.cs.mdsd.waf.IndexUnit#getRowClasses <em>Row Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Classes</em>' attribute.
	 * @see #getRowClasses()
	 * @generated
	 */
	void setRowClasses(String value);

} // IndexUnit
