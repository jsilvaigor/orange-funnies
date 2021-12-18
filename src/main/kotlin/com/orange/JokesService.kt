package com.orange

import com.orange.chuck.ChuckNorrisService
import com.orange.kanye.KanyeWestService
import gen.jokes.models.Joke
import gen.jokes.models.Source
import io.micronaut.http.HttpStatus
import io.micronaut.http.exceptions.HttpStatusException
import jakarta.inject.Singleton

interface JokesClient {
    fun getRandomJoke(source: String): Joke
}

@Singleton
class JokesService(private val chuckNorrisService: ChuckNorrisService, private val kanyeWestService: KanyeWestService) {

    fun getAvailableJokeSources(): Source {
        return Source(name = "chuck-norris")
    }

    fun getRandomJoke(source: String): Joke {
       return when(source) {
           "chuck-norris" -> chuckNorrisService.getRandomJoke(source)
           "kanye-west" -> kanyeWestService.getRandomJoke(source)
           else -> {
               throw HttpStatusException(HttpStatus.NOT_FOUND, "Unknown source")
           }
       }
    }

}