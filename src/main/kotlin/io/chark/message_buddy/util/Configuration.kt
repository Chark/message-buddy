package io.chark.message_buddy.util

/**
 * Application configuration properties.
 *
 * todo load from config file.
 */
object Configuration {

    /**
     * Java spark specific configurations.
     */
    object Spark {
        const val port = 8080
        const val maxThreads = 10
    }
}