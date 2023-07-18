package com.example.app3

class Country(

    val name: String,val capital: String, val flag: Int, val continent: String,val description:String) {
    override fun toString(): String {
        return name
    }
}