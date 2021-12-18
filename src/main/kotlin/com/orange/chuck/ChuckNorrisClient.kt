package com.orange.chuck

import io.micronaut.core.type.Argument
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.http.uri.UriBuilder
import jakarta.inject.Singleton
import reactor.core.publisher.Mono

@Singleton
class ChuckNorrisClient(@param:Client(ChuckNorrisConfig.URL) private val httpClient: HttpClient) {

    private val uri = UriBuilder.of("/jokes/random").build()

    fun fetchRandomJoke(): Mono<ChuckNorrisJoke> {
        val req: HttpRequest<*> = HttpRequest.GET<Any>(uri)
        return Mono.from(httpClient.retrieve(req, ChuckNorrisJoke::class.java))
    }
}