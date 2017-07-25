package io.chark.message_buddy.config.module

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.google.inject.AbstractModule

class LibraryModule : AbstractModule() {

    override fun configure() {
        val mapper = jacksonObjectMapper()
        bind(ObjectMapper::class.java).toInstance(mapper)
    }
}