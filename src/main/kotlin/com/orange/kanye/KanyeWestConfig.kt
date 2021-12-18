package com.orange.kanye

import io.micronaut.context.annotation.ConfigurationProperties
import io.micronaut.context.annotation.Requires

@ConfigurationProperties(KanyeWestConfig.PREFIX)
@Requires(property = KanyeWestConfig.PREFIX)
class KanyeWestConfig {
    companion object {
        const val PREFIX = "kanye-west-config"
        const val URL = "https://api.kanye.rest/"
    }
}