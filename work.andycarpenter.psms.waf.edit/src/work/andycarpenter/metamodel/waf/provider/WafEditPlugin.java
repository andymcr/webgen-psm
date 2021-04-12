/**
 */
package work.andycarpenter.metamodel.waf.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import work.andycarpenter.metamodel.api.provider.ApiEditPlugin;

import work.andycarpenter.metamodel.base.provider.BaseEditPlugin;

import work.andycarpenter.metamodel.expression.provider.ExpressionEditPlugin;

import work.andycarpenter.metamodel.orm.provider.OrmEditPlugin;

import work.andycarpenter.metamodel.security.provider.SecurityEditPlugin;

import work.andycarpenter.metamodel.service.provider.ServiceEditPlugin;

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
		     SecurityEditPlugin.INSTANCE,
		     ServiceEditPlugin.INSTANCE,
		     ApiEditPlugin.INSTANCE,
		     BaseEditPlugin.INSTANCE,
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
