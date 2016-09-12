/*
 * generated by Xtext
 */
package org.gemoc.bcool.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.gemoc.bcool.ui.internal.BCOoLLibActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class BCOoLLibExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return BCOoLLibActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return BCOoLLibActivator.getInstance().getInjector(BCOoLLibActivator.ORG_GEMOC_BCOOL_BCOOLLIB);
	}
	
}