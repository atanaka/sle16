/*
* generated by Xtext
*/
package org.gemoc.gexpressions.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GExpressionsStandaloneSetup extends GExpressionsStandaloneSetupGenerated{

	public static void doSetup() {
		new GExpressionsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

