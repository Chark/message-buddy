package io.chark.message_buddy.config.router

import com.google.inject.Injector

class RouterConfiguration(injector: Injector, routes: Routers) {

    init {
        routes.types.forEach {
            injector.getInstance(it.java)
        }
    }
}