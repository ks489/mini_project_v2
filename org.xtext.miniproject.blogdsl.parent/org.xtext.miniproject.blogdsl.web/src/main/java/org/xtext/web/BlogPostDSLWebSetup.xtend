/*
 * generated by Xtext 2.10.0
 */
package org.xtext.web

import com.google.inject.Guice
import com.google.inject.Injector
import com.google.inject.Provider
import com.google.inject.util.Modules
import java.util.concurrent.ExecutorService
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.xtext.BlogPostDSLRuntimeModule
import org.xtext.BlogPostDSLStandaloneSetup

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor
class BlogPostDSLWebSetup extends BlogPostDSLStandaloneSetup {
	
	val Provider<ExecutorService> executorServiceProvider;
	
	override Injector createInjector() {
		val runtimeModule = new BlogPostDSLRuntimeModule()
		val webModule = new BlogPostDSLWebModule(executorServiceProvider)
		return Guice.createInjector(Modules.override(runtimeModule).with(webModule))
	}
	
}
