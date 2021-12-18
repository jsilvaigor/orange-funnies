package com.orange.chuck

import io.micronaut.core.annotation.Introspected

@Introspected
data class ChuckNorrisJoke(val icon_url: String, val id: String, val url: String, val value: String)