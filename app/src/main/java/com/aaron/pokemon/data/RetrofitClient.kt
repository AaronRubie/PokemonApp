package com.aaron.pokemon.data

import retrofit2.Retrofit

object RetrofitClient {
    private var retrofit: Retrofit? = null
    private const val BAE_URL = "https://pokeapi.co/api/v2/pokemon?limit=151"

}