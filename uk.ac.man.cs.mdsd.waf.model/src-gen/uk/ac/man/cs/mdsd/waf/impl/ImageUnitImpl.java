/**
 */
package uk.ac.man.cs.mdsd.waf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.man.cs.mdsd.orm.EntityOrView;
import uk.ac.man.cs.mdsd.orm.Label;

import uk.ac.man.cs.mdsd.service.Filter;
import uk.ac.man.cs.mdsd.service.Selection;

import uk.ac.man.cs.mdsd.waf.Badge;
import uk.ac.man.cs.mdsd.waf.CollectionUnit;
import uk.ac.man.cs.mdsd.waf.FeaturePath;
import uk.ac.man.cs.mdsd.waf.ImageManipulation;
import uk.ac.man.cs.mdsd.waf.ImageUnit;
import uk.ac.man.cs.mdsd.waf.SelectAction;
import uk.ac.man.cs.mdsd.waf.SelectableUnit;
import uk.ac.man.cs.mdsd.waf.WafPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getSelectors <em>Selectors</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getFindContainerSelection <em>Find Container Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#isOmitContainerLoad <em>Omit Container Load</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getFindElementSelection <em>Find Element Selection</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getSupportedFilters <em>Supported Filters</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getBadges <em>Badges</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getEmptyMessage <em>Empty Message</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getDefaultPaginationSize <em>Default Pagination Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getMaximumPaginationSize <em>Maximum Pagination Size</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getNextNpages <em>Next Npages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getPreviousNpages <em>Previous Npages</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getNextPageLabel <em>Next Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getNextPageIconName <em>Next Page Icon Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getPreviousPageLabel <em>Previous Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getPreviousPageIconName <em>Previous Page Icon Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#isUseDisabledPageLinks <em>Use Disabled Page Links</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#isUseFirstLastPageLinks <em>Use First Last Page Links</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getFirstPageLabel <em>First Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getFirstPageIconName <em>First Page Icon Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getLastPageLabel <em>Last Page Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getLastPageIconName <em>Last Page Icon Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getPaginationClass <em>Pagination Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getPaginationElementClass <em>Pagination Element Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getImagePathFeature <em>Image Path Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getImageTitleFeature <em>Image Title Feature</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#isTruncateImageTitle <em>Truncate Image Title</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getMissingImagePath <em>Missing Image Path</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.waf.impl.ImageUnitImpl#getImageFilter <em>Image Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ImageUnitImpl extends DynamicUnitImpl implements ImageUnit {
	/**
	 * The cached value of the '{@link #getSelectors() <em>Selectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectors()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectAction> selectors;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityOrView> contentType;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Selection selection;

	/**
	 * The cached value of the '{@link #getFindContainerSelection() <em>Find Container Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindContainerSelection()
	 * @generated
	 * @ordered
	 */
	protected Selection findContainerSelection;

	/**
	 * The default value of the '{@link #isOmitContainerLoad() <em>Omit Container Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitContainerLoad()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OMIT_CONTAINER_LOAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOmitContainerLoad() <em>Omit Container Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmitContainerLoad()
	 * @generated
	 * @ordered
	 */
	protected boolean omitContainerLoad = OMIT_CONTAINER_LOAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFindElementSelection() <em>Find Element Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindElementSelection()
	 * @generated
	 * @ordered
	 */
	protected Selection findElementSelection;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected Filter filter;

	/**
	 * The cached value of the '{@link #getSupportedFilters() <em>Supported Filters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> supportedFilters;

	/**
	 * The cached value of the '{@link #getBadges() <em>Badges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadges()
	 * @generated
	 * @ordered
	 */
	protected EList<Badge> badges;

	/**
	 * The default value of the '{@link #getEmptyMessage() <em>Empty Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPTY_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmptyMessage() <em>Empty Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyMessage()
	 * @generated
	 * @ordered
	 */
	protected String emptyMessage = EMPTY_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultPaginationSize() <em>Default Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPaginationSize()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_PAGINATION_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultPaginationSize() <em>Default Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPaginationSize()
	 * @generated
	 * @ordered
	 */
	protected int defaultPaginationSize = DEFAULT_PAGINATION_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumPaginationSize() <em>Maximum Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPaginationSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_PAGINATION_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximumPaginationSize() <em>Maximum Pagination Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPaginationSize()
	 * @generated
	 * @ordered
	 */
	protected int maximumPaginationSize = MAXIMUM_PAGINATION_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextNpages() <em>Next Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextNpages()
	 * @generated
	 * @ordered
	 */
	protected static final int NEXT_NPAGES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNextNpages() <em>Next Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextNpages()
	 * @generated
	 * @ordered
	 */
	protected int nextNpages = NEXT_NPAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviousNpages() <em>Previous Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousNpages()
	 * @generated
	 * @ordered
	 */
	protected static final int PREVIOUS_NPAGES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPreviousNpages() <em>Previous Npages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousNpages()
	 * @generated
	 * @ordered
	 */
	protected int previousNpages = PREVIOUS_NPAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextPageLabel() <em>Next Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPageLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_PAGE_LABEL_EDEFAULT = ">";

	/**
	 * The cached value of the '{@link #getNextPageLabel() <em>Next Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPageLabel()
	 * @generated
	 * @ordered
	 */
	protected String nextPageLabel = NEXT_PAGE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextPageIconName() <em>Next Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPageIconName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_PAGE_ICON_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getNextPageIconName() <em>Next Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPageIconName()
	 * @generated
	 * @ordered
	 */
	protected String nextPageIconName = NEXT_PAGE_ICON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviousPageLabel() <em>Previous Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousPageLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_PAGE_LABEL_EDEFAULT = "<";

	/**
	 * The cached value of the '{@link #getPreviousPageLabel() <em>Previous Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousPageLabel()
	 * @generated
	 * @ordered
	 */
	protected String previousPageLabel = PREVIOUS_PAGE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreviousPageIconName() <em>Previous Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousPageIconName()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIOUS_PAGE_ICON_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPreviousPageIconName() <em>Previous Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousPageIconName()
	 * @generated
	 * @ordered
	 */
	protected String previousPageIconName = PREVIOUS_PAGE_ICON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseDisabledPageLinks() <em>Use Disabled Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDisabledPageLinks()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_DISABLED_PAGE_LINKS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseDisabledPageLinks() <em>Use Disabled Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseDisabledPageLinks()
	 * @generated
	 * @ordered
	 */
	protected boolean useDisabledPageLinks = USE_DISABLED_PAGE_LINKS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseFirstLastPageLinks() <em>Use First Last Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFirstLastPageLinks()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_FIRST_LAST_PAGE_LINKS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseFirstLastPageLinks() <em>Use First Last Page Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFirstLastPageLinks()
	 * @generated
	 * @ordered
	 */
	protected boolean useFirstLastPageLinks = USE_FIRST_LAST_PAGE_LINKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstPageLabel() <em>First Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPageLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_PAGE_LABEL_EDEFAULT = "<<";

	/**
	 * The cached value of the '{@link #getFirstPageLabel() <em>First Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPageLabel()
	 * @generated
	 * @ordered
	 */
	protected String firstPageLabel = FIRST_PAGE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstPageIconName() <em>First Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPageIconName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_PAGE_ICON_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFirstPageIconName() <em>First Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPageIconName()
	 * @generated
	 * @ordered
	 */
	protected String firstPageIconName = FIRST_PAGE_ICON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastPageLabel() <em>Last Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPageLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_PAGE_LABEL_EDEFAULT = ">>";

	/**
	 * The cached value of the '{@link #getLastPageLabel() <em>Last Page Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPageLabel()
	 * @generated
	 * @ordered
	 */
	protected String lastPageLabel = LAST_PAGE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastPageIconName() <em>Last Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPageIconName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_PAGE_ICON_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLastPageIconName() <em>Last Page Icon Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPageIconName()
	 * @generated
	 * @ordered
	 */
	protected String lastPageIconName = LAST_PAGE_ICON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaginationClass() <em>Pagination Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginationClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGINATION_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaginationClass() <em>Pagination Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginationClass()
	 * @generated
	 * @ordered
	 */
	protected String paginationClass = PAGINATION_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaginationElementClass() <em>Pagination Element Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginationElementClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGINATION_ELEMENT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaginationElementClass() <em>Pagination Element Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginationElementClass()
	 * @generated
	 * @ordered
	 */
	protected String paginationElementClass = PAGINATION_ELEMENT_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected Label title;

	/**
	 * The cached value of the '{@link #getImagePathFeature() <em>Image Path Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePathFeature()
	 * @generated
	 * @ordered
	 */
	protected FeaturePath imagePathFeature;

	/**
	 * The cached value of the '{@link #getImageTitleFeature() <em>Image Title Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageTitleFeature()
	 * @generated
	 * @ordered
	 */
	protected FeaturePath imageTitleFeature;

	/**
	 * The default value of the '{@link #isTruncateImageTitle() <em>Truncate Image Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTruncateImageTitle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRUNCATE_IMAGE_TITLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTruncateImageTitle() <em>Truncate Image Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTruncateImageTitle()
	 * @generated
	 * @ordered
	 */
	protected boolean truncateImageTitle = TRUNCATE_IMAGE_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMissingImagePath() <em>Missing Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingImagePath()
	 * @generated
	 * @ordered
	 */
	protected static final String MISSING_IMAGE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMissingImagePath() <em>Missing Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissingImagePath()
	 * @generated
	 * @ordered
	 */
	protected String missingImagePath = MISSING_IMAGE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImageFilter() <em>Image Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageFilter()
	 * @generated
	 * @ordered
	 */
	protected ImageManipulation imageFilter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WafPackage.Literals.IMAGE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectAction> getSelectors() {
		if (selectors == null) {
			selectors = new EObjectWithInverseResolvingEList<SelectAction>(SelectAction.class, this, WafPackage.IMAGE_UNIT__SELECTORS, WafPackage.SELECT_ACTION__TARGET);
		}
		return selectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityOrView> getContentType() {
		if (contentType == null) {
			contentType = new EObjectResolvingEList<EntityOrView>(EntityOrView.class, this, WafPackage.IMAGE_UNIT__CONTENT_TYPE);
		}
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection getSelection() {
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject)selection;
			selection = (Selection)eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.IMAGE_UNIT__SELECTION, oldSelection, selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Selection newSelection) {
		Selection oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection getFindContainerSelection() {
		if (findContainerSelection != null && findContainerSelection.eIsProxy()) {
			InternalEObject oldFindContainerSelection = (InternalEObject)findContainerSelection;
			findContainerSelection = (Selection)eResolveProxy(oldFindContainerSelection);
			if (findContainerSelection != oldFindContainerSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.IMAGE_UNIT__FIND_CONTAINER_SELECTION, oldFindContainerSelection, findContainerSelection));
			}
		}
		return findContainerSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetFindContainerSelection() {
		return findContainerSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFindContainerSelection(Selection newFindContainerSelection) {
		Selection oldFindContainerSelection = findContainerSelection;
		findContainerSelection = newFindContainerSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__FIND_CONTAINER_SELECTION, oldFindContainerSelection, findContainerSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOmitContainerLoad() {
		return omitContainerLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOmitContainerLoad(boolean newOmitContainerLoad) {
		boolean oldOmitContainerLoad = omitContainerLoad;
		omitContainerLoad = newOmitContainerLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__OMIT_CONTAINER_LOAD, oldOmitContainerLoad, omitContainerLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection getFindElementSelection() {
		if (findElementSelection != null && findElementSelection.eIsProxy()) {
			InternalEObject oldFindElementSelection = (InternalEObject)findElementSelection;
			findElementSelection = (Selection)eResolveProxy(oldFindElementSelection);
			if (findElementSelection != oldFindElementSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.IMAGE_UNIT__FIND_ELEMENT_SELECTION, oldFindElementSelection, findElementSelection));
			}
		}
		return findElementSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selection basicGetFindElementSelection() {
		return findElementSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFindElementSelection(Selection newFindElementSelection) {
		Selection oldFindElementSelection = findElementSelection;
		findElementSelection = newFindElementSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__FIND_ELEMENT_SELECTION, oldFindElementSelection, findElementSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter getFilter() {
		if (filter != null && filter.eIsProxy()) {
			InternalEObject oldFilter = (InternalEObject)filter;
			filter = (Filter)eResolveProxy(oldFilter);
			if (filter != oldFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.IMAGE_UNIT__FILTER, oldFilter, filter));
			}
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter basicGetFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(Filter newFilter) {
		Filter oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getSupportedFilters() {
		if (supportedFilters == null) {
			supportedFilters = new EObjectResolvingEList<Filter>(Filter.class, this, WafPackage.IMAGE_UNIT__SUPPORTED_FILTERS);
		}
		return supportedFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Badge> getBadges() {
		if (badges == null) {
			badges = new EObjectContainmentEList<Badge>(Badge.class, this, WafPackage.IMAGE_UNIT__BADGES);
		}
		return badges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmptyMessage() {
		return emptyMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmptyMessage(String newEmptyMessage) {
		String oldEmptyMessage = emptyMessage;
		emptyMessage = newEmptyMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__EMPTY_MESSAGE, oldEmptyMessage, emptyMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultPaginationSize() {
		return defaultPaginationSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultPaginationSize(int newDefaultPaginationSize) {
		int oldDefaultPaginationSize = defaultPaginationSize;
		defaultPaginationSize = newDefaultPaginationSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__DEFAULT_PAGINATION_SIZE, oldDefaultPaginationSize, defaultPaginationSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximumPaginationSize() {
		return maximumPaginationSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumPaginationSize(int newMaximumPaginationSize) {
		int oldMaximumPaginationSize = maximumPaginationSize;
		maximumPaginationSize = newMaximumPaginationSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__MAXIMUM_PAGINATION_SIZE, oldMaximumPaginationSize, maximumPaginationSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNextNpages() {
		return nextNpages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextNpages(int newNextNpages) {
		int oldNextNpages = nextNpages;
		nextNpages = newNextNpages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__NEXT_NPAGES, oldNextNpages, nextNpages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPreviousNpages() {
		return previousNpages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousNpages(int newPreviousNpages) {
		int oldPreviousNpages = previousNpages;
		previousNpages = newPreviousNpages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__PREVIOUS_NPAGES, oldPreviousNpages, previousNpages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNextPageLabel() {
		return nextPageLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextPageLabel(String newNextPageLabel) {
		String oldNextPageLabel = nextPageLabel;
		nextPageLabel = newNextPageLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__NEXT_PAGE_LABEL, oldNextPageLabel, nextPageLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNextPageIconName() {
		return nextPageIconName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextPageIconName(String newNextPageIconName) {
		String oldNextPageIconName = nextPageIconName;
		nextPageIconName = newNextPageIconName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__NEXT_PAGE_ICON_NAME, oldNextPageIconName, nextPageIconName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreviousPageLabel() {
		return previousPageLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousPageLabel(String newPreviousPageLabel) {
		String oldPreviousPageLabel = previousPageLabel;
		previousPageLabel = newPreviousPageLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__PREVIOUS_PAGE_LABEL, oldPreviousPageLabel, previousPageLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreviousPageIconName() {
		return previousPageIconName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousPageIconName(String newPreviousPageIconName) {
		String oldPreviousPageIconName = previousPageIconName;
		previousPageIconName = newPreviousPageIconName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__PREVIOUS_PAGE_ICON_NAME, oldPreviousPageIconName, previousPageIconName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseDisabledPageLinks() {
		return useDisabledPageLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseDisabledPageLinks(boolean newUseDisabledPageLinks) {
		boolean oldUseDisabledPageLinks = useDisabledPageLinks;
		useDisabledPageLinks = newUseDisabledPageLinks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__USE_DISABLED_PAGE_LINKS, oldUseDisabledPageLinks, useDisabledPageLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseFirstLastPageLinks() {
		return useFirstLastPageLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseFirstLastPageLinks(boolean newUseFirstLastPageLinks) {
		boolean oldUseFirstLastPageLinks = useFirstLastPageLinks;
		useFirstLastPageLinks = newUseFirstLastPageLinks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS, oldUseFirstLastPageLinks, useFirstLastPageLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstPageLabel() {
		return firstPageLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstPageLabel(String newFirstPageLabel) {
		String oldFirstPageLabel = firstPageLabel;
		firstPageLabel = newFirstPageLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__FIRST_PAGE_LABEL, oldFirstPageLabel, firstPageLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstPageIconName() {
		return firstPageIconName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstPageIconName(String newFirstPageIconName) {
		String oldFirstPageIconName = firstPageIconName;
		firstPageIconName = newFirstPageIconName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__FIRST_PAGE_ICON_NAME, oldFirstPageIconName, firstPageIconName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastPageLabel() {
		return lastPageLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastPageLabel(String newLastPageLabel) {
		String oldLastPageLabel = lastPageLabel;
		lastPageLabel = newLastPageLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__LAST_PAGE_LABEL, oldLastPageLabel, lastPageLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastPageIconName() {
		return lastPageIconName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastPageIconName(String newLastPageIconName) {
		String oldLastPageIconName = lastPageIconName;
		lastPageIconName = newLastPageIconName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__LAST_PAGE_ICON_NAME, oldLastPageIconName, lastPageIconName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaginationClass() {
		return paginationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaginationClass(String newPaginationClass) {
		String oldPaginationClass = paginationClass;
		paginationClass = newPaginationClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__PAGINATION_CLASS, oldPaginationClass, paginationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaginationElementClass() {
		return paginationElementClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaginationElementClass(String newPaginationElementClass) {
		String oldPaginationElementClass = paginationElementClass;
		paginationElementClass = newPaginationElementClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__PAGINATION_ELEMENT_CLASS, oldPaginationElementClass, paginationElementClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getTitle() {
		if (title != null && title.eIsProxy()) {
			InternalEObject oldTitle = (InternalEObject)title;
			title = (Label)eResolveProxy(oldTitle);
			if (title != oldTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.IMAGE_UNIT__TITLE, oldTitle, title));
			}
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(Label newTitle) {
		Label oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePath getImagePathFeature() {
		return imagePathFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagePathFeature(FeaturePath newImagePathFeature, NotificationChain msgs) {
		FeaturePath oldImagePathFeature = imagePathFeature;
		imagePathFeature = newImagePathFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE, oldImagePathFeature, newImagePathFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagePathFeature(FeaturePath newImagePathFeature) {
		if (newImagePathFeature != imagePathFeature) {
			NotificationChain msgs = null;
			if (imagePathFeature != null)
				msgs = ((InternalEObject)imagePathFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WafPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE, null, msgs);
			if (newImagePathFeature != null)
				msgs = ((InternalEObject)newImagePathFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WafPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE, null, msgs);
			msgs = basicSetImagePathFeature(newImagePathFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE, newImagePathFeature, newImagePathFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePath getImageTitleFeature() {
		return imageTitleFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageTitleFeature(FeaturePath newImageTitleFeature, NotificationChain msgs) {
		FeaturePath oldImageTitleFeature = imageTitleFeature;
		imageTitleFeature = newImageTitleFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__IMAGE_TITLE_FEATURE, oldImageTitleFeature, newImageTitleFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageTitleFeature(FeaturePath newImageTitleFeature) {
		if (newImageTitleFeature != imageTitleFeature) {
			NotificationChain msgs = null;
			if (imageTitleFeature != null)
				msgs = ((InternalEObject)imageTitleFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WafPackage.IMAGE_UNIT__IMAGE_TITLE_FEATURE, null, msgs);
			if (newImageTitleFeature != null)
				msgs = ((InternalEObject)newImageTitleFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WafPackage.IMAGE_UNIT__IMAGE_TITLE_FEATURE, null, msgs);
			msgs = basicSetImageTitleFeature(newImageTitleFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__IMAGE_TITLE_FEATURE, newImageTitleFeature, newImageTitleFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTruncateImageTitle() {
		return truncateImageTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTruncateImageTitle(boolean newTruncateImageTitle) {
		boolean oldTruncateImageTitle = truncateImageTitle;
		truncateImageTitle = newTruncateImageTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__TRUNCATE_IMAGE_TITLE, oldTruncateImageTitle, truncateImageTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMissingImagePath() {
		return missingImagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissingImagePath(String newMissingImagePath) {
		String oldMissingImagePath = missingImagePath;
		missingImagePath = newMissingImagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__MISSING_IMAGE_PATH, oldMissingImagePath, missingImagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageManipulation getImageFilter() {
		if (imageFilter != null && imageFilter.eIsProxy()) {
			InternalEObject oldImageFilter = (InternalEObject)imageFilter;
			imageFilter = (ImageManipulation)eResolveProxy(oldImageFilter);
			if (imageFilter != oldImageFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WafPackage.IMAGE_UNIT__IMAGE_FILTER, oldImageFilter, imageFilter));
			}
		}
		return imageFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageManipulation basicGetImageFilter() {
		return imageFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageFilter(ImageManipulation newImageFilter) {
		ImageManipulation oldImageFilter = imageFilter;
		imageFilter = newImageFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WafPackage.IMAGE_UNIT__IMAGE_FILTER, oldImageFilter, imageFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.IMAGE_UNIT__SELECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelectors()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WafPackage.IMAGE_UNIT__SELECTORS:
				return ((InternalEList<?>)getSelectors()).basicRemove(otherEnd, msgs);
			case WafPackage.IMAGE_UNIT__BADGES:
				return ((InternalEList<?>)getBadges()).basicRemove(otherEnd, msgs);
			case WafPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
				return basicSetImagePathFeature(null, msgs);
			case WafPackage.IMAGE_UNIT__IMAGE_TITLE_FEATURE:
				return basicSetImageTitleFeature(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WafPackage.IMAGE_UNIT__SELECTORS:
				return getSelectors();
			case WafPackage.IMAGE_UNIT__CONTENT_TYPE:
				return getContentType();
			case WafPackage.IMAGE_UNIT__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case WafPackage.IMAGE_UNIT__FIND_CONTAINER_SELECTION:
				if (resolve) return getFindContainerSelection();
				return basicGetFindContainerSelection();
			case WafPackage.IMAGE_UNIT__OMIT_CONTAINER_LOAD:
				return isOmitContainerLoad();
			case WafPackage.IMAGE_UNIT__FIND_ELEMENT_SELECTION:
				if (resolve) return getFindElementSelection();
				return basicGetFindElementSelection();
			case WafPackage.IMAGE_UNIT__FILTER:
				if (resolve) return getFilter();
				return basicGetFilter();
			case WafPackage.IMAGE_UNIT__SUPPORTED_FILTERS:
				return getSupportedFilters();
			case WafPackage.IMAGE_UNIT__BADGES:
				return getBadges();
			case WafPackage.IMAGE_UNIT__EMPTY_MESSAGE:
				return getEmptyMessage();
			case WafPackage.IMAGE_UNIT__DEFAULT_PAGINATION_SIZE:
				return getDefaultPaginationSize();
			case WafPackage.IMAGE_UNIT__MAXIMUM_PAGINATION_SIZE:
				return getMaximumPaginationSize();
			case WafPackage.IMAGE_UNIT__NEXT_NPAGES:
				return getNextNpages();
			case WafPackage.IMAGE_UNIT__PREVIOUS_NPAGES:
				return getPreviousNpages();
			case WafPackage.IMAGE_UNIT__NEXT_PAGE_LABEL:
				return getNextPageLabel();
			case WafPackage.IMAGE_UNIT__NEXT_PAGE_ICON_NAME:
				return getNextPageIconName();
			case WafPackage.IMAGE_UNIT__PREVIOUS_PAGE_LABEL:
				return getPreviousPageLabel();
			case WafPackage.IMAGE_UNIT__PREVIOUS_PAGE_ICON_NAME:
				return getPreviousPageIconName();
			case WafPackage.IMAGE_UNIT__USE_DISABLED_PAGE_LINKS:
				return isUseDisabledPageLinks();
			case WafPackage.IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS:
				return isUseFirstLastPageLinks();
			case WafPackage.IMAGE_UNIT__FIRST_PAGE_LABEL:
				return getFirstPageLabel();
			case WafPackage.IMAGE_UNIT__FIRST_PAGE_ICON_NAME:
				return getFirstPageIconName();
			case WafPackage.IMAGE_UNIT__LAST_PAGE_LABEL:
				return getLastPageLabel();
			case WafPackage.IMAGE_UNIT__LAST_PAGE_ICON_NAME:
				return getLastPageIconName();
			case WafPackage.IMAGE_UNIT__PAGINATION_CLASS:
				return getPaginationClass();
			case WafPackage.IMAGE_UNIT__PAGINATION_ELEMENT_CLASS:
				return getPaginationElementClass();
			case WafPackage.IMAGE_UNIT__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case WafPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
				return getImagePathFeature();
			case WafPackage.IMAGE_UNIT__IMAGE_TITLE_FEATURE:
				return getImageTitleFeature();
			case WafPackage.IMAGE_UNIT__TRUNCATE_IMAGE_TITLE:
				return isTruncateImageTitle();
			case WafPackage.IMAGE_UNIT__MISSING_IMAGE_PATH:
				return getMissingImagePath();
			case WafPackage.IMAGE_UNIT__IMAGE_FILTER:
				if (resolve) return getImageFilter();
				return basicGetImageFilter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WafPackage.IMAGE_UNIT__SELECTORS:
				getSelectors().clear();
				getSelectors().addAll((Collection<? extends SelectAction>)newValue);
				return;
			case WafPackage.IMAGE_UNIT__CONTENT_TYPE:
				getContentType().clear();
				getContentType().addAll((Collection<? extends EntityOrView>)newValue);
				return;
			case WafPackage.IMAGE_UNIT__SELECTION:
				setSelection((Selection)newValue);
				return;
			case WafPackage.IMAGE_UNIT__FIND_CONTAINER_SELECTION:
				setFindContainerSelection((Selection)newValue);
				return;
			case WafPackage.IMAGE_UNIT__OMIT_CONTAINER_LOAD:
				setOmitContainerLoad((Boolean)newValue);
				return;
			case WafPackage.IMAGE_UNIT__FIND_ELEMENT_SELECTION:
				setFindElementSelection((Selection)newValue);
				return;
			case WafPackage.IMAGE_UNIT__FILTER:
				setFilter((Filter)newValue);
				return;
			case WafPackage.IMAGE_UNIT__SUPPORTED_FILTERS:
				getSupportedFilters().clear();
				getSupportedFilters().addAll((Collection<? extends Filter>)newValue);
				return;
			case WafPackage.IMAGE_UNIT__BADGES:
				getBadges().clear();
				getBadges().addAll((Collection<? extends Badge>)newValue);
				return;
			case WafPackage.IMAGE_UNIT__EMPTY_MESSAGE:
				setEmptyMessage((String)newValue);
				return;
			case WafPackage.IMAGE_UNIT__DEFAULT_PAGINATION_SIZE:
				setDefaultPaginationSize((Integer)newValue);
				return;
			case WafPackage.IMAGE_UNIT__MAXIMUM_PAGINATION_SIZE:
				setMaximumPaginationSize((Integer)newValue);
				return;
			case WafPackage.IMAGE_UNIT__NEXT_NPAGES:
				setNextNpages((Integer)newValue);
				return;
			case WafPackage.IMAGE_UNIT__PREVIOUS_NPAGES:
				setPreviousNpages((Integer)newValue);
				return;
			case WafPackage.IMAGE_UNIT__NEXT_PAGE_LABEL:
				setNextPageLabel((String)newValue);
				return;
			case WafPackage.IMAGE_UNIT__NEXT_PAGE_ICON_NAME:
				setNextPageIconName((String)newValue);
				return;
			case WafPackage.IMAGE_UNIT__PREVIOUS_PAGE_LABEL:
				setPreviousPageLabel((String)newValue);
				return;
			case WafPackage.IMAGE_UNIT__PREVIOUS_PAGE_ICON_NAME:
				setPreviousPageIconName((String)newValue);
				return;
			case WafPackage.IMAGE_UNIT__USE_DISABLED_PAGE_LINKS:
				setUseDisabledPageLinks((Boolean)newValue);
				return;
			case WafPackage.IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS:
				setUseFirstLastPageLinks((Boolean)newValue);
				return;
			case WafPackage.IMAGE_UNIT__FIRST_PAGE_LABEL:
				setFirstPageLabel((String)newValue);
				return;
			case WafPackage.IMAGE_UNIT__FIRST_PAGE_ICON_NAME:
				setFirstPageIconName((String)newValue);
				return;
			case WafPackage.IMAGE_UNIT__LAST_PAGE_LABEL:
				setLastPageLabel((String)newValue);
				return;
			case WafPackage.IMAGE_UNIT__LAST_PAGE_ICON_NAME:
				setLastPageIconName((String)newValue);
				return;
			case WafPackage.IMAGE_UNIT__PAGINATION_CLASS:
				setPaginationClass((String)newValue);
				return;
			case WafPackage.IMAGE_UNIT__PAGINATION_ELEMENT_CLASS:
				setPaginationElementClass((String)newValue);
				return;
			case WafPackage.IMAGE_UNIT__TITLE:
				setTitle((Label)newValue);
				return;
			case WafPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
				setImagePathFeature((FeaturePath)newValue);
				return;
			case WafPackage.IMAGE_UNIT__IMAGE_TITLE_FEATURE:
				setImageTitleFeature((FeaturePath)newValue);
				return;
			case WafPackage.IMAGE_UNIT__TRUNCATE_IMAGE_TITLE:
				setTruncateImageTitle((Boolean)newValue);
				return;
			case WafPackage.IMAGE_UNIT__MISSING_IMAGE_PATH:
				setMissingImagePath((String)newValue);
				return;
			case WafPackage.IMAGE_UNIT__IMAGE_FILTER:
				setImageFilter((ImageManipulation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WafPackage.IMAGE_UNIT__SELECTORS:
				getSelectors().clear();
				return;
			case WafPackage.IMAGE_UNIT__CONTENT_TYPE:
				getContentType().clear();
				return;
			case WafPackage.IMAGE_UNIT__SELECTION:
				setSelection((Selection)null);
				return;
			case WafPackage.IMAGE_UNIT__FIND_CONTAINER_SELECTION:
				setFindContainerSelection((Selection)null);
				return;
			case WafPackage.IMAGE_UNIT__OMIT_CONTAINER_LOAD:
				setOmitContainerLoad(OMIT_CONTAINER_LOAD_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__FIND_ELEMENT_SELECTION:
				setFindElementSelection((Selection)null);
				return;
			case WafPackage.IMAGE_UNIT__FILTER:
				setFilter((Filter)null);
				return;
			case WafPackage.IMAGE_UNIT__SUPPORTED_FILTERS:
				getSupportedFilters().clear();
				return;
			case WafPackage.IMAGE_UNIT__BADGES:
				getBadges().clear();
				return;
			case WafPackage.IMAGE_UNIT__EMPTY_MESSAGE:
				setEmptyMessage(EMPTY_MESSAGE_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__DEFAULT_PAGINATION_SIZE:
				setDefaultPaginationSize(DEFAULT_PAGINATION_SIZE_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__MAXIMUM_PAGINATION_SIZE:
				setMaximumPaginationSize(MAXIMUM_PAGINATION_SIZE_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__NEXT_NPAGES:
				setNextNpages(NEXT_NPAGES_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__PREVIOUS_NPAGES:
				setPreviousNpages(PREVIOUS_NPAGES_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__NEXT_PAGE_LABEL:
				setNextPageLabel(NEXT_PAGE_LABEL_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__NEXT_PAGE_ICON_NAME:
				setNextPageIconName(NEXT_PAGE_ICON_NAME_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__PREVIOUS_PAGE_LABEL:
				setPreviousPageLabel(PREVIOUS_PAGE_LABEL_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__PREVIOUS_PAGE_ICON_NAME:
				setPreviousPageIconName(PREVIOUS_PAGE_ICON_NAME_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__USE_DISABLED_PAGE_LINKS:
				setUseDisabledPageLinks(USE_DISABLED_PAGE_LINKS_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS:
				setUseFirstLastPageLinks(USE_FIRST_LAST_PAGE_LINKS_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__FIRST_PAGE_LABEL:
				setFirstPageLabel(FIRST_PAGE_LABEL_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__FIRST_PAGE_ICON_NAME:
				setFirstPageIconName(FIRST_PAGE_ICON_NAME_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__LAST_PAGE_LABEL:
				setLastPageLabel(LAST_PAGE_LABEL_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__LAST_PAGE_ICON_NAME:
				setLastPageIconName(LAST_PAGE_ICON_NAME_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__PAGINATION_CLASS:
				setPaginationClass(PAGINATION_CLASS_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__PAGINATION_ELEMENT_CLASS:
				setPaginationElementClass(PAGINATION_ELEMENT_CLASS_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__TITLE:
				setTitle((Label)null);
				return;
			case WafPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
				setImagePathFeature((FeaturePath)null);
				return;
			case WafPackage.IMAGE_UNIT__IMAGE_TITLE_FEATURE:
				setImageTitleFeature((FeaturePath)null);
				return;
			case WafPackage.IMAGE_UNIT__TRUNCATE_IMAGE_TITLE:
				setTruncateImageTitle(TRUNCATE_IMAGE_TITLE_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__MISSING_IMAGE_PATH:
				setMissingImagePath(MISSING_IMAGE_PATH_EDEFAULT);
				return;
			case WafPackage.IMAGE_UNIT__IMAGE_FILTER:
				setImageFilter((ImageManipulation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WafPackage.IMAGE_UNIT__SELECTORS:
				return selectors != null && !selectors.isEmpty();
			case WafPackage.IMAGE_UNIT__CONTENT_TYPE:
				return contentType != null && !contentType.isEmpty();
			case WafPackage.IMAGE_UNIT__SELECTION:
				return selection != null;
			case WafPackage.IMAGE_UNIT__FIND_CONTAINER_SELECTION:
				return findContainerSelection != null;
			case WafPackage.IMAGE_UNIT__OMIT_CONTAINER_LOAD:
				return omitContainerLoad != OMIT_CONTAINER_LOAD_EDEFAULT;
			case WafPackage.IMAGE_UNIT__FIND_ELEMENT_SELECTION:
				return findElementSelection != null;
			case WafPackage.IMAGE_UNIT__FILTER:
				return filter != null;
			case WafPackage.IMAGE_UNIT__SUPPORTED_FILTERS:
				return supportedFilters != null && !supportedFilters.isEmpty();
			case WafPackage.IMAGE_UNIT__BADGES:
				return badges != null && !badges.isEmpty();
			case WafPackage.IMAGE_UNIT__EMPTY_MESSAGE:
				return EMPTY_MESSAGE_EDEFAULT == null ? emptyMessage != null : !EMPTY_MESSAGE_EDEFAULT.equals(emptyMessage);
			case WafPackage.IMAGE_UNIT__DEFAULT_PAGINATION_SIZE:
				return defaultPaginationSize != DEFAULT_PAGINATION_SIZE_EDEFAULT;
			case WafPackage.IMAGE_UNIT__MAXIMUM_PAGINATION_SIZE:
				return maximumPaginationSize != MAXIMUM_PAGINATION_SIZE_EDEFAULT;
			case WafPackage.IMAGE_UNIT__NEXT_NPAGES:
				return nextNpages != NEXT_NPAGES_EDEFAULT;
			case WafPackage.IMAGE_UNIT__PREVIOUS_NPAGES:
				return previousNpages != PREVIOUS_NPAGES_EDEFAULT;
			case WafPackage.IMAGE_UNIT__NEXT_PAGE_LABEL:
				return NEXT_PAGE_LABEL_EDEFAULT == null ? nextPageLabel != null : !NEXT_PAGE_LABEL_EDEFAULT.equals(nextPageLabel);
			case WafPackage.IMAGE_UNIT__NEXT_PAGE_ICON_NAME:
				return NEXT_PAGE_ICON_NAME_EDEFAULT == null ? nextPageIconName != null : !NEXT_PAGE_ICON_NAME_EDEFAULT.equals(nextPageIconName);
			case WafPackage.IMAGE_UNIT__PREVIOUS_PAGE_LABEL:
				return PREVIOUS_PAGE_LABEL_EDEFAULT == null ? previousPageLabel != null : !PREVIOUS_PAGE_LABEL_EDEFAULT.equals(previousPageLabel);
			case WafPackage.IMAGE_UNIT__PREVIOUS_PAGE_ICON_NAME:
				return PREVIOUS_PAGE_ICON_NAME_EDEFAULT == null ? previousPageIconName != null : !PREVIOUS_PAGE_ICON_NAME_EDEFAULT.equals(previousPageIconName);
			case WafPackage.IMAGE_UNIT__USE_DISABLED_PAGE_LINKS:
				return useDisabledPageLinks != USE_DISABLED_PAGE_LINKS_EDEFAULT;
			case WafPackage.IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS:
				return useFirstLastPageLinks != USE_FIRST_LAST_PAGE_LINKS_EDEFAULT;
			case WafPackage.IMAGE_UNIT__FIRST_PAGE_LABEL:
				return FIRST_PAGE_LABEL_EDEFAULT == null ? firstPageLabel != null : !FIRST_PAGE_LABEL_EDEFAULT.equals(firstPageLabel);
			case WafPackage.IMAGE_UNIT__FIRST_PAGE_ICON_NAME:
				return FIRST_PAGE_ICON_NAME_EDEFAULT == null ? firstPageIconName != null : !FIRST_PAGE_ICON_NAME_EDEFAULT.equals(firstPageIconName);
			case WafPackage.IMAGE_UNIT__LAST_PAGE_LABEL:
				return LAST_PAGE_LABEL_EDEFAULT == null ? lastPageLabel != null : !LAST_PAGE_LABEL_EDEFAULT.equals(lastPageLabel);
			case WafPackage.IMAGE_UNIT__LAST_PAGE_ICON_NAME:
				return LAST_PAGE_ICON_NAME_EDEFAULT == null ? lastPageIconName != null : !LAST_PAGE_ICON_NAME_EDEFAULT.equals(lastPageIconName);
			case WafPackage.IMAGE_UNIT__PAGINATION_CLASS:
				return PAGINATION_CLASS_EDEFAULT == null ? paginationClass != null : !PAGINATION_CLASS_EDEFAULT.equals(paginationClass);
			case WafPackage.IMAGE_UNIT__PAGINATION_ELEMENT_CLASS:
				return PAGINATION_ELEMENT_CLASS_EDEFAULT == null ? paginationElementClass != null : !PAGINATION_ELEMENT_CLASS_EDEFAULT.equals(paginationElementClass);
			case WafPackage.IMAGE_UNIT__TITLE:
				return title != null;
			case WafPackage.IMAGE_UNIT__IMAGE_PATH_FEATURE:
				return imagePathFeature != null;
			case WafPackage.IMAGE_UNIT__IMAGE_TITLE_FEATURE:
				return imageTitleFeature != null;
			case WafPackage.IMAGE_UNIT__TRUNCATE_IMAGE_TITLE:
				return truncateImageTitle != TRUNCATE_IMAGE_TITLE_EDEFAULT;
			case WafPackage.IMAGE_UNIT__MISSING_IMAGE_PATH:
				return MISSING_IMAGE_PATH_EDEFAULT == null ? missingImagePath != null : !MISSING_IMAGE_PATH_EDEFAULT.equals(missingImagePath);
			case WafPackage.IMAGE_UNIT__IMAGE_FILTER:
				return imageFilter != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SelectableUnit.class) {
			switch (derivedFeatureID) {
				case WafPackage.IMAGE_UNIT__SELECTORS: return WafPackage.SELECTABLE_UNIT__SELECTORS;
				default: return -1;
			}
		}
		if (baseClass == CollectionUnit.class) {
			switch (derivedFeatureID) {
				case WafPackage.IMAGE_UNIT__CONTENT_TYPE: return WafPackage.COLLECTION_UNIT__CONTENT_TYPE;
				case WafPackage.IMAGE_UNIT__SELECTION: return WafPackage.COLLECTION_UNIT__SELECTION;
				case WafPackage.IMAGE_UNIT__FIND_CONTAINER_SELECTION: return WafPackage.COLLECTION_UNIT__FIND_CONTAINER_SELECTION;
				case WafPackage.IMAGE_UNIT__OMIT_CONTAINER_LOAD: return WafPackage.COLLECTION_UNIT__OMIT_CONTAINER_LOAD;
				case WafPackage.IMAGE_UNIT__FIND_ELEMENT_SELECTION: return WafPackage.COLLECTION_UNIT__FIND_ELEMENT_SELECTION;
				case WafPackage.IMAGE_UNIT__FILTER: return WafPackage.COLLECTION_UNIT__FILTER;
				case WafPackage.IMAGE_UNIT__SUPPORTED_FILTERS: return WafPackage.COLLECTION_UNIT__SUPPORTED_FILTERS;
				case WafPackage.IMAGE_UNIT__BADGES: return WafPackage.COLLECTION_UNIT__BADGES;
				case WafPackage.IMAGE_UNIT__EMPTY_MESSAGE: return WafPackage.COLLECTION_UNIT__EMPTY_MESSAGE;
				case WafPackage.IMAGE_UNIT__DEFAULT_PAGINATION_SIZE: return WafPackage.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE;
				case WafPackage.IMAGE_UNIT__MAXIMUM_PAGINATION_SIZE: return WafPackage.COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE;
				case WafPackage.IMAGE_UNIT__NEXT_NPAGES: return WafPackage.COLLECTION_UNIT__NEXT_NPAGES;
				case WafPackage.IMAGE_UNIT__PREVIOUS_NPAGES: return WafPackage.COLLECTION_UNIT__PREVIOUS_NPAGES;
				case WafPackage.IMAGE_UNIT__NEXT_PAGE_LABEL: return WafPackage.COLLECTION_UNIT__NEXT_PAGE_LABEL;
				case WafPackage.IMAGE_UNIT__NEXT_PAGE_ICON_NAME: return WafPackage.COLLECTION_UNIT__NEXT_PAGE_ICON_NAME;
				case WafPackage.IMAGE_UNIT__PREVIOUS_PAGE_LABEL: return WafPackage.COLLECTION_UNIT__PREVIOUS_PAGE_LABEL;
				case WafPackage.IMAGE_UNIT__PREVIOUS_PAGE_ICON_NAME: return WafPackage.COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME;
				case WafPackage.IMAGE_UNIT__USE_DISABLED_PAGE_LINKS: return WafPackage.COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS;
				case WafPackage.IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS: return WafPackage.COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS;
				case WafPackage.IMAGE_UNIT__FIRST_PAGE_LABEL: return WafPackage.COLLECTION_UNIT__FIRST_PAGE_LABEL;
				case WafPackage.IMAGE_UNIT__FIRST_PAGE_ICON_NAME: return WafPackage.COLLECTION_UNIT__FIRST_PAGE_ICON_NAME;
				case WafPackage.IMAGE_UNIT__LAST_PAGE_LABEL: return WafPackage.COLLECTION_UNIT__LAST_PAGE_LABEL;
				case WafPackage.IMAGE_UNIT__LAST_PAGE_ICON_NAME: return WafPackage.COLLECTION_UNIT__LAST_PAGE_ICON_NAME;
				case WafPackage.IMAGE_UNIT__PAGINATION_CLASS: return WafPackage.COLLECTION_UNIT__PAGINATION_CLASS;
				case WafPackage.IMAGE_UNIT__PAGINATION_ELEMENT_CLASS: return WafPackage.COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SelectableUnit.class) {
			switch (baseFeatureID) {
				case WafPackage.SELECTABLE_UNIT__SELECTORS: return WafPackage.IMAGE_UNIT__SELECTORS;
				default: return -1;
			}
		}
		if (baseClass == CollectionUnit.class) {
			switch (baseFeatureID) {
				case WafPackage.COLLECTION_UNIT__CONTENT_TYPE: return WafPackage.IMAGE_UNIT__CONTENT_TYPE;
				case WafPackage.COLLECTION_UNIT__SELECTION: return WafPackage.IMAGE_UNIT__SELECTION;
				case WafPackage.COLLECTION_UNIT__FIND_CONTAINER_SELECTION: return WafPackage.IMAGE_UNIT__FIND_CONTAINER_SELECTION;
				case WafPackage.COLLECTION_UNIT__OMIT_CONTAINER_LOAD: return WafPackage.IMAGE_UNIT__OMIT_CONTAINER_LOAD;
				case WafPackage.COLLECTION_UNIT__FIND_ELEMENT_SELECTION: return WafPackage.IMAGE_UNIT__FIND_ELEMENT_SELECTION;
				case WafPackage.COLLECTION_UNIT__FILTER: return WafPackage.IMAGE_UNIT__FILTER;
				case WafPackage.COLLECTION_UNIT__SUPPORTED_FILTERS: return WafPackage.IMAGE_UNIT__SUPPORTED_FILTERS;
				case WafPackage.COLLECTION_UNIT__BADGES: return WafPackage.IMAGE_UNIT__BADGES;
				case WafPackage.COLLECTION_UNIT__EMPTY_MESSAGE: return WafPackage.IMAGE_UNIT__EMPTY_MESSAGE;
				case WafPackage.COLLECTION_UNIT__DEFAULT_PAGINATION_SIZE: return WafPackage.IMAGE_UNIT__DEFAULT_PAGINATION_SIZE;
				case WafPackage.COLLECTION_UNIT__MAXIMUM_PAGINATION_SIZE: return WafPackage.IMAGE_UNIT__MAXIMUM_PAGINATION_SIZE;
				case WafPackage.COLLECTION_UNIT__NEXT_NPAGES: return WafPackage.IMAGE_UNIT__NEXT_NPAGES;
				case WafPackage.COLLECTION_UNIT__PREVIOUS_NPAGES: return WafPackage.IMAGE_UNIT__PREVIOUS_NPAGES;
				case WafPackage.COLLECTION_UNIT__NEXT_PAGE_LABEL: return WafPackage.IMAGE_UNIT__NEXT_PAGE_LABEL;
				case WafPackage.COLLECTION_UNIT__NEXT_PAGE_ICON_NAME: return WafPackage.IMAGE_UNIT__NEXT_PAGE_ICON_NAME;
				case WafPackage.COLLECTION_UNIT__PREVIOUS_PAGE_LABEL: return WafPackage.IMAGE_UNIT__PREVIOUS_PAGE_LABEL;
				case WafPackage.COLLECTION_UNIT__PREVIOUS_PAGE_ICON_NAME: return WafPackage.IMAGE_UNIT__PREVIOUS_PAGE_ICON_NAME;
				case WafPackage.COLLECTION_UNIT__USE_DISABLED_PAGE_LINKS: return WafPackage.IMAGE_UNIT__USE_DISABLED_PAGE_LINKS;
				case WafPackage.COLLECTION_UNIT__USE_FIRST_LAST_PAGE_LINKS: return WafPackage.IMAGE_UNIT__USE_FIRST_LAST_PAGE_LINKS;
				case WafPackage.COLLECTION_UNIT__FIRST_PAGE_LABEL: return WafPackage.IMAGE_UNIT__FIRST_PAGE_LABEL;
				case WafPackage.COLLECTION_UNIT__FIRST_PAGE_ICON_NAME: return WafPackage.IMAGE_UNIT__FIRST_PAGE_ICON_NAME;
				case WafPackage.COLLECTION_UNIT__LAST_PAGE_LABEL: return WafPackage.IMAGE_UNIT__LAST_PAGE_LABEL;
				case WafPackage.COLLECTION_UNIT__LAST_PAGE_ICON_NAME: return WafPackage.IMAGE_UNIT__LAST_PAGE_ICON_NAME;
				case WafPackage.COLLECTION_UNIT__PAGINATION_CLASS: return WafPackage.IMAGE_UNIT__PAGINATION_CLASS;
				case WafPackage.COLLECTION_UNIT__PAGINATION_ELEMENT_CLASS: return WafPackage.IMAGE_UNIT__PAGINATION_ELEMENT_CLASS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (omitContainerLoad: ");
		result.append(omitContainerLoad);
		result.append(", emptyMessage: ");
		result.append(emptyMessage);
		result.append(", defaultPaginationSize: ");
		result.append(defaultPaginationSize);
		result.append(", maximumPaginationSize: ");
		result.append(maximumPaginationSize);
		result.append(", nextNpages: ");
		result.append(nextNpages);
		result.append(", previousNpages: ");
		result.append(previousNpages);
		result.append(", nextPageLabel: ");
		result.append(nextPageLabel);
		result.append(", nextPageIconName: ");
		result.append(nextPageIconName);
		result.append(", previousPageLabel: ");
		result.append(previousPageLabel);
		result.append(", previousPageIconName: ");
		result.append(previousPageIconName);
		result.append(", useDisabledPageLinks: ");
		result.append(useDisabledPageLinks);
		result.append(", useFirstLastPageLinks: ");
		result.append(useFirstLastPageLinks);
		result.append(", firstPageLabel: ");
		result.append(firstPageLabel);
		result.append(", firstPageIconName: ");
		result.append(firstPageIconName);
		result.append(", lastPageLabel: ");
		result.append(lastPageLabel);
		result.append(", lastPageIconName: ");
		result.append(lastPageIconName);
		result.append(", paginationClass: ");
		result.append(paginationClass);
		result.append(", paginationElementClass: ");
		result.append(paginationElementClass);
		result.append(", truncateImageTitle: ");
		result.append(truncateImageTitle);
		result.append(", missingImagePath: ");
		result.append(missingImagePath);
		result.append(')');
		return result.toString();
	}

} //ImageUnitImpl
