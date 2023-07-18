package com.example.app3

import com.example.example.CountriesInfo

class Country(

    var name: String,var capital: String, var flag: String, var continent: String,var description:String) {
    override fun toString(): String {
        return name
    }

    fun setCountryByCountriesInfo(countriesInfo: CountriesInfo){
        name= countriesInfo.name?.common.toString()
        capital=countriesInfo.capital.toString()
        continent=countriesInfo.region.toString()
        description=countriesInfo.startOfWeek+","+countriesInfo.population
        flag= countriesInfo.flags?.png.toString()
    }
}