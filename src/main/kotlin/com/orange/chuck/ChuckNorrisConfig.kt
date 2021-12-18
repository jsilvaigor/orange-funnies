package com.orange.chuck

import io.micronaut.context.annotation.ConfigurationProperties
import io.micronaut.context.annotation.Requires

@ConfigurationProperties(ChuckNorrisConfig.PREFIX)
@Requires(property = ChuckNorrisConfig.PREFIX)
class ChuckNorrisConfig {

    companion object {
        const val PREFIX = "chuck-norris-config"
        const val URL = "https://api.chucknorris.io/"
    }

}