/*
 * generated by Xtext 2.32.0
 */
package pt.up.fe.els2023;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ExternalDslStandaloneSetup extends ExternalDslStandaloneSetupGenerated {

	public static void doSetup() {
		new ExternalDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
