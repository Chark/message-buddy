package io.chark.message_buddy.util.route

import spark.Request
import spark.Response

/**
 * Helps with route mapping. Useful in such cases when an endpoint must return a specific content type.
 */
interface Router {

    fun get(path: String, route: (Request, Response) -> Any)
}