package com.example.swapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiManager {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://swapi.dev/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val SwapiPers: getPersonnages = retrofit.create(getPersonnages::class.java)
    val SwapiVais: getVehicle = retrofit.create(getVehicle::class.java)
    val SwapiPlanete: getPlanete = retrofit.create(getPlanete::class.java)

}
