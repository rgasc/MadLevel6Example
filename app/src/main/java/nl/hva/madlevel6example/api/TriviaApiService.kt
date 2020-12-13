package nl.hva.madlevel6example.api

import nl.hva.madlevel6example.models.Trivia
import retrofit2.http.GET

interface TriviaApiService {

    @GET("/random/trivia?json")
    suspend fun getRandomNumberTrivia(): Trivia
}