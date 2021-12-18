package com.orange.kanye

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import jakarta.inject.Singleton
import reactor.core.publisher.Mono

@Singleton
class KanyeWestClient(@param:Client(KanyeWestConfig.URL) private val httpClient: HttpClient) {

    fun fetchRandomJoke(): Mono<KanyeWestJoke> {
        val req = HttpRequest.GET<Any>("")
        return Mono.from(httpClient.retrieve(req, KanyeWestJoke::class.java))
    }

}

//@Singleton
//class ChuckNorrisClient(@param:Client(ChuckNorrisConfig.URL) private val httpClient: HttpClient) {
//
//    private val uri = UriBuilder.of("/jokes/random").build()
//
//    fun fetchRandomJoke(): Mono<ChuckNorrisJoke> {
//        val req: HttpRequest<*> = HttpRequest.GET<Any>(uri)
//        return Mono.from(httpClient.retrieve(req, ChuckNorrisJoke::class.java))
//    }
//}