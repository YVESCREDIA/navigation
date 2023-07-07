package com.example.app3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Recuperer le username et le password
        val username = intent.getStringExtra("username")
        val listePays:RecyclerView = findViewById(R.id.rcl_countries)
        val pays=Datas.getCountries()
        val layoutmanager:RecyclerView.LayoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)
        val adapter = AdapterRecycleView(this,pays)
        listePays.layoutManager = layoutmanager
        listePays.adapter = adapter

        listePays.setHasFixedSize(true)


    }
}