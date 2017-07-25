package io.chark.message_buddy.config.filters

import com.google.inject.Injector

class FilterConfiguration(injector: Injector, filters: Filters) {

    init {
        filters.types.forEach {
            injector.getInstance(it.java)
        }
    }
}