package io.chark.message_buddy.config.module

import com.google.inject.Binder
import io.chark.message_buddy.app.hello.HelloController

/**
 * Configures controllers and routes.
 */
class ControllerModule : StrictModule() {

    override fun strictConfigure(binder: Binder) {
        bindSingleton(HelloController::class.java)
    }
}