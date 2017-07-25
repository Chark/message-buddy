package io.chark.message_buddy.app.hello

import com.google.inject.Singleton

@Singleton
class HelloService {

    fun hello(name: String) = Hello(name)
}