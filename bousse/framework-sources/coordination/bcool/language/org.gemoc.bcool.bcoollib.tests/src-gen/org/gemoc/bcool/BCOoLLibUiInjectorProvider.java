/*
* generated by Xtext
*/
package org.gemoc.bcool;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class BCOoLLibUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.gemoc.bcool.ui.internal.BCOoLLibActivator.getInstance().getInjector("org.gemoc.bcool.BCOoLLib");
	}
	
}
