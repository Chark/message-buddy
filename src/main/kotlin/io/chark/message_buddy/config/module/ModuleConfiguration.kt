package io.chark.message_buddy.config.module

import com.google.inject.Guice
import com.google.inject.Injector

class ModuleConfiguration {

    val injector: Injector = Guice.createInjector(modules())

    /**
     * Creates all modules (initializes DI). Note that order of modules is important.
     */
    private fun modules() = listOf(
            LibraryModule(),
            ServiceModule(),
            ControllerModule()
    )
}