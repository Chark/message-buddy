package io.chark.message_buddy.util.route

import com.google.inject.Inject
import spark.Request
import spark.Response
import spark.Route
import spark.Spark

class JsonRouter @Inject constructor(val transformer: JsonTransformer) : Router {

    companion object {
        const val CONTENT_TYPE_JSON = "application/json"
    }

    override fun get(path: String, route: (Request, Response) -> Any) {
        Spark.get(path, Route { req, res ->
            res.type(CONTENT_TYPE_JSON)
            route.invoke(req, res)
        }, transformer)
    }
}