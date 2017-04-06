/**
 * <copyright>
 * </copyright>
 *
 * $Id: WafEditPlugin.java,v 1.2 2013/06/11 20:49:04 andy Exp $
 */
package uk.ac.man.cs.mdsd.waf.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;
import uk.ac.man.cs.mdsd.api.provider.ApiEditPlugin;
import uk.ac.man.cs.mdsd.expression.provider.ExpressionEditPlugin;
import uk.ac.man.cs.mdsd.orm.provider.OrmEditPlugin;
import uk.ac.man.cs.mdsd.service.provider.ServiceEditPlugin;

/**
 * This is the central singleton for the Waf edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class WafEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WafEditPlugin INSTANCE = new WafEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WafEditPlugin() {
		super
		  (new ResourceLocator [] {
		     OrmEditPlugin.INSTANCE,
		     ServiceEditPlugin.INSTANCE,
		     ApiEditPlugin.INSTANCE,
		     ExpressionEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
