package com.example.app3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.app3.web.CountriesApi
import com.example.example.CountriesInfo
import com.google.gson.Gson

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val result= CountriesApi.retrofitService.getPropreties().enqueue(object :retrofit2.Callback<String>{
            override fun onResponse(call: retrofit2.Call<String>, response: retrofit2.Response<String>) {
                Log.i("response",response.body().toString())
                //convertir le json en liste de paysinfos
                val listContriesInfo= Gson().fromJson(response.body(),Array<CountriesInfo>::class.java).toList()
                //convertir la liste de paysinfos en liste de pays
                val listContries= mutableListOf<Country>()
                    for (countryInfo in listContriesInfo){
                        val country=Country("","","","","")
                        country.setCountryByCountriesInfo(countryInfo)
                        listContries.add(country)
                    }
                //afficher la liste de pays

                val listePays:RecyclerView = findViewById(R.id.rcl_countries)
                val layoutmanager:RecyclerView.LayoutManager = androidx.recyclerview.widget.LinearLayoutManager(this@Home)
                val adapter = AdapterRecycleView(this@Home,listContries)
                listePays.layoutManager = layoutmanager
                listePays.adapter = adapter
                listePays.setHasFixedSize(true)

            }

            override fun onFailure(call: retrofit2.Call<String>, t: Throwable) {
                Log.i("response",t.message.toString())
            }

        });

        // Recuperer le username et le password
        val username = intent.getStringExtra("username")




    }
}