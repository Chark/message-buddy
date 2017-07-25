package io.chark.message_buddy.config.module

import com.google.inject.Binder
import io.chark.message_buddy.app.hello.DefaultHelloService
import io.chark.message_buddy.app.hello.HelloService

/**
 * Configures services.
 */
class ServiceModule : StrictModule() {

    override fun strictConfigure(binder: Binder) {
        bind(HelloService::class.java).to(DefaultHelloService::class.java).asEagerSingleton()
    }
}