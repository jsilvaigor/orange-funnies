package com.orange.kanye

import com.orange.JokesClient
import gen.jokes.models.Joke
import jakarta.inject.Singleton

@Singleton
class KanyeWestService(private val kanyeWestClient: KanyeWestClient): JokesClient {
    override fun getRandomJoke(source: String): Joke {
        val joke = kanyeWestClient.fetchRandomJoke().block()
        return Joke(joke = joke.quote, source)
    }
}