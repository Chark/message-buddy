package io.chark.message_buddy.config.module

import com.google.inject.AbstractModule
import com.google.inject.Provides
import com.google.inject.Singleton
import io.chark.message_buddy.app.hello.HelloRouter
import io.chark.message_buddy.config.filters.Filters
import io.chark.message_buddy.config.router.Routers

class FilterModule : AbstractModule() {

    override fun configure() {
    }

    @Provides @Singleton
    fun filters() = Filters(
            HelloRouter::class
    )
}