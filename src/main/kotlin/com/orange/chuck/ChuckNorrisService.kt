package com.orange.chuck

import com.orange.JokesClient
import gen.jokes.models.Joke
import jakarta.inject.Singleton

@Singleton
class ChuckNorrisService(private val chuckNorrisClient: ChuckNorrisClient): JokesClient {
    override fun getRandomJoke(source: String): Joke {
        val joke = chuckNorrisClient.fetchRandomJoke().block()
        return Joke(joke = joke.value, source)
    }
}