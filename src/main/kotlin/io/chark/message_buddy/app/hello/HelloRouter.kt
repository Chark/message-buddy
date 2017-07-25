package io.chark.message_buddy.app.hello

import com.google.inject.Inject
import com.google.inject.Singleton
import spark.Spark.get

@Singleton
class HelloRouter @Inject constructor(val helloService: HelloService) {

    init {
        get("/hello") { req, _ ->
            helloService.hello(req.queryParamOrDefault("name", ""))
        }
    }
}