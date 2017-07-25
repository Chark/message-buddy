package io.chark.message_buddy.config.spark

import io.chark.message_buddy.util.Configuration
import spark.Spark

/**
 * Configures spark properties.
 */
class SparkConfiguration {

    init {
        Spark.port(Configuration.Spark.port)
        Spark.threadPool(Configuration.Spark.maxThreads)
    }
}