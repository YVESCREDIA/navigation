package com.example.example

import com.google.gson.annotations.SerializedName


data class CountriesInfo (

  @SerializedName("name"        ) var name        : Name?             = Name(),
  @SerializedName("unMember"    ) var unMember    : Boolean?          = null,
  @SerializedName("currencies"  ) var currencies  : Currencies?       = Currencies(),
  @SerializedName("capital"     ) var capital     : ArrayList<String> = arrayListOf(),
  @SerializedName("region"      ) var region      : String?           = null,
  @SerializedName("subregion"   ) var subregion   : String?           = null,
  @SerializedName("languages"   ) var languages   : Languages?        = Languages(),
  @SerializedName("population"  ) var population  : Int?              = null,
  @SerializedName("timezones"   ) var timezones   : ArrayList<String> = arrayListOf(),
  @SerializedName("continents"  ) var continents  : ArrayList<String> = arrayListOf(),
  @SerializedName("flags"       ) var flags       : Flags?            = Flags(),
  @SerializedName("startOfWeek" ) var startOfWeek : String?           = null

)