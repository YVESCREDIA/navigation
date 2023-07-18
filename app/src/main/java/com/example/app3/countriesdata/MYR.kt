package com.example.example

import com.google.gson.annotations.SerializedName


data class MYR (

  @SerializedName("name"   ) var name   : String? = null,
  @SerializedName("symbol" ) var symbol : String? = null

)