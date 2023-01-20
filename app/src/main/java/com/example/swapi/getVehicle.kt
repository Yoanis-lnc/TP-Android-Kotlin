package com.example.swapi

import retrofit2.Response
import retrofit2.http.GET

interface getVehicle {
    @GET("vehicles/")
    suspend fun getStarships(): Response<VaisseauResponse>
}
