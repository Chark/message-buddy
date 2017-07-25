package io.chark.message_buddy.config.module

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.google.inject.Binder
import io.chark.message_buddy.config.spark.SparkConfiguration
import io.chark.message_buddy.util.route.JsonRouter
import io.chark.message_buddy.util.route.JsonTransformer
import io.chark.message_buddy.util.route.Router

/**
 * Configures libraries and helper classes.
 */
class LibraryModule : StrictModule() {

    override fun strictConfigure(binder: Binder) {
        bind(ObjectMapper::class.java).toInstance(jacksonObjectMapper())

        bindSingleton(SparkConfiguration::class.java)

        bindSingleton(JsonTransformer::class.java)
        bind(Router::class.java).to(JsonRouter::class.java).asEagerSingleton()
    }
}