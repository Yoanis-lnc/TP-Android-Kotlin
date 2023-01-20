package com.example.swapi

import retrofit2.Response
import retrofit2.http.GET

interface getPersonnages {
    @GET("people/")
    suspend fun getCharacters(): Response<CharacterResponse>
}