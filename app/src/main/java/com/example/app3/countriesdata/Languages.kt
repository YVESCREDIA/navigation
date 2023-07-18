package com.example.example

import com.google.gson.annotations.SerializedName


data class Languages (

  @SerializedName("eng" ) var eng : String? = null,
  @SerializedName("msa" ) var msa : String? = null

)