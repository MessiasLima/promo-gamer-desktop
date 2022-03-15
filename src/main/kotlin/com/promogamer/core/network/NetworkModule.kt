package com.promogamer.core.network

import com.promogamer.core.network.deal.DealDataSource
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://www.cheapshark.com"

val networkModule = module {
    single<CheapSharkService> {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CheapSharkService::class.java)
    }

    factory { DealDataSource(get()) }
}