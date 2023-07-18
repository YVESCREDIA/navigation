package com.example.app3

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AdapterRecycleView(private val context:Context, private val ListCountry:List<Country>):RecyclerView.Adapter<AdapterRecycleView.ViewHolder>() {
    class ViewHolder(private val view: View):RecyclerView.ViewHolder(view){
            val name: TextView = view.findViewById(R.id.txt_name)
            val description: TextView = view.findViewById(R.id.txt_description)
            val image:ImageView = view.findViewById(R.id.img_drapeau)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = View.inflate(context,R.layout.item_countries,null)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ListCountry.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val country = ListCountry[position]
        holder.name.text = country.name
        holder.description.text = country.description
        //holder.image.setImageResource(country.flag)
        Glide.with(context).load(country.flag).into(holder.image)

    }
}