/*
 * generated by Xtext 2.32.0
 */
package pt.up.fe.els2023.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import pt.up.fe.els2023.DslRuntimeModule;
import pt.up.fe.els2023.DslStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class DslIdeSetup extends DslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new DslRuntimeModule(), new DslIdeModule()));
	}
	
}
