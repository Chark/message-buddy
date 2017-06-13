package io.chark.message_buddy

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MessageBuddyApplication {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(MessageBuddyApplication::class.java, *args)
        }
    }
}