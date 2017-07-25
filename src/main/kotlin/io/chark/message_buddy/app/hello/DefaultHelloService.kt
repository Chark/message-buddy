package io.chark.message_buddy.app.hello

import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

class DefaultHelloService : HelloService {

    companion object {
        val LOG: Logger = LogManager.getLogger(DefaultHelloService::class.java)
    }

    override fun hello(name: String) : Hello {
        LOG.info("Hello {}", name)
        return Hello(name)
    }
}