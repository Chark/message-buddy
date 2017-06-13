package io.chark.message_buddy.test

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController("/test")
class TestController(val testService: TestService) {

    @PostMapping
    fun test(@RequestBody test: Test) =
            testService.test(test)
}