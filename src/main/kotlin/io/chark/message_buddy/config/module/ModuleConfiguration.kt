package io.chark.message_buddy.config.module

import com.google.inject.Guice
import com.google.inject.Injector

class ModuleConfiguration {

    val injector: Injector = Guice.createInjector(modules())

    /**
     * Create all modules.
     */
    private fun modules() = listOf(
            LibraryModule(),
            FilterModule(),
            RouterModule()
    )
}