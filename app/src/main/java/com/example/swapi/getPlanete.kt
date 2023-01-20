package com.example.swapi

import retrofit2.Response
import retrofit2.http.GET

interface getPlanete {
    @GET("planets/")
    suspend fun getPlanete(): Response<PlaneteResponse>
}