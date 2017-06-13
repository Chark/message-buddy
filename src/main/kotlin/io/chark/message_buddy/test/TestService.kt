package io.chark.message_buddy.test

import org.springframework.stereotype.Service

@Service
class TestService {
    fun test(test: Test) = test.copy(test.test.toUpperCase())
}