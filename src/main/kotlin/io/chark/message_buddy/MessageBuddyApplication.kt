package io.chark.message_buddy

import io.chark.message_buddy.config.module.ModuleConfiguration
import io.chark.message_buddy.config.router.RouterConfiguration
import io.chark.message_buddy.config.router.Routers

fun main(args: Array<String>) {
    configure()
}

/**
 * Configure the application.
 */
fun configure() {
    val injector = ModuleConfiguration().injector
    RouterConfiguration(injector, injector.getInstance(Routers::class.java))
}