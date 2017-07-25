package io.chark.message_buddy.util.route

import com.fasterxml.jackson.databind.ObjectMapper
import com.google.inject.Inject
import spark.ResponseTransformer

class JsonTransformer @Inject constructor(
        val mapper: ObjectMapper
) : ResponseTransformer {

    override fun render(model: Any?): String {
        return model?.let {
            mapper.writeValueAsString(model)
        } ?: ""
    }
}