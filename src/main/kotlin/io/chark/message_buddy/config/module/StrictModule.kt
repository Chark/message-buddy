package io.chark.message_buddy.config.module

import com.google.inject.AbstractModule
import com.google.inject.Binder

/**
 * Helper class to create modules which are strict.
 */
abstract class StrictModule : AbstractModule() {

    override fun configure() {
        val binder = binder().apply {
            requireExactBindingAnnotations()
            requireExplicitBindings()
        }

        strictConfigure(binder)
    }

    /**
     * Hook function called right after strictly configuring the module.
     */
    abstract fun strictConfigure(binder: Binder)

    /**
     * Eagerly bind a singleton class.
     */
    protected fun bindSingleton(clazz: Class<*>) = bind(clazz).asEagerSingleton()
}