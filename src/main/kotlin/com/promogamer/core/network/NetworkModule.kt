package com.promogamer.core.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkModule {
    private const val BASE_URL = "https://www.cheapshark.com"

    fun provideCheapSharkService(): CheapSharkService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CheapSharkService::class.java)
    }
}