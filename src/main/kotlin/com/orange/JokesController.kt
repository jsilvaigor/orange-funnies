package com.orange

import gen.jokes.models.Joke
import gen.jokes.models.Source
import gen.jokes.operations.JokesOperations
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller

@Controller
class JokesController(private val jokesService: JokesService): JokesOperations {
    override fun getAvailableJokeSources(): HttpResponse<Source> {
        return HttpResponse.ok(jokesService.getAvailableJokeSources())
    }

    override fun getRandomJoke(source: String): HttpResponse<Joke> {
        return HttpResponse.ok(jokesService.getRandomJoke(source))
    }


}