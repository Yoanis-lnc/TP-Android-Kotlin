package com.example.swapi

data class planetsData(
    val name : String,
)

data class planete(
    val name : String,
    val rotation_period : String,
    val orbital_period : String,
    val diameter : String,
    val climate : String,
    val gravity : String,
    val terrain : String,
    val surface_water : String,
    val population : String,
    val residents : String,
    val films : String,
    val created : String,
    val edited : String,
    val url : String
)

data class PlaneteResponse(val results: List<planetsData>)
