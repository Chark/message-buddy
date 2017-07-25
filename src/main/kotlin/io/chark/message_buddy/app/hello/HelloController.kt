package io.chark.message_buddy.app.hello

import com.google.inject.Inject
import io.chark.message_buddy.util.route.Router

class HelloController @Inject constructor(helloService: HelloService,
                                          router: Router) {

    init {
        router.get("/hello") { req, _ ->
            helloService.hello(req.queryParamOrDefault("name", ""))
        }
    }
}