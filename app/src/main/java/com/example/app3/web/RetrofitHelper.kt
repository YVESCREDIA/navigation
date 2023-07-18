package com.example.app3.web

import retrofit2.converter.scalars.ScalarsConverterFactory

class RetrofitHelper {
    val baseUrl="https://restcountries.com/v3.1/"
    fun getRetrofit():retrofit2.Retrofit{
        return retrofit2.Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
    }
}