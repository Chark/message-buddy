package io.chark.message_buddy.app.global

import com.fasterxml.jackson.databind.ObjectMapper
import com.google.inject.Singleton
import spark.Filter
import spark.Spark.before
import spark.Spark.get

@Singleton
class JsonFilter(mapper: ObjectMapper) {

    init {
        before(Filter({ req, res ->
            res.type("application/json")

        }))
    }
}