package com.example.app3.web

import com.example.app3.Country
import retrofit2.Call
import retrofit2.http.GET



interface CountriesApiService {
    @GET("all")
    suspend fun getCountries():List<Country>
    @GET("region/europe")
    fun getPropreties():
            Call<String>


}
object CountriesApi{
    val retrofitService:CountriesApiService by lazy {
        RetrofitHelper().getRetrofit().create(CountriesApiService::class.java)
    }
}