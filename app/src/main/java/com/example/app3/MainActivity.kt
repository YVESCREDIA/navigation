package com.example.app3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.app3.web.CountriesApi
import com.example.app3.web.RetrofitHelper
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val usernane = "admin"
        val password = "1234"

        val edit_username: EditText = findViewById<EditText>(R.id.edit_username)
        val edit_password: EditText = findViewById<EditText>(R.id.edit_password)

        val btn_login: Button = findViewById<Button>(R.id.btn_login)
        btn_login.setOnClickListener {
            if (edit_username.text.toString().isEmpty()) {
                edit_username.error = "Username is required"
                return@setOnClickListener
            }

            if (edit_username.text.toString() == usernane && edit_password.text.toString() == password) {
                val itent = Intent(this, Home::class.java)
                itent.putExtra("username", usernane)
                startActivity(itent)
            } else if (edit_username.text.toString() != usernane)
                edit_username.error = "Username is incorrect"
            else if (edit_password.text.toString() != password)
                edit_password.error = "Password is incorrect"

        }


        val result= CountriesApi.retrofitService.getPropreties().enqueue(object :retrofit2.Callback<String>{
            override fun onResponse(call: retrofit2.Call<String>, response: retrofit2.Response<String>) {
                Log.i("response",response.body().toString())
            }

            override fun onFailure(call: retrofit2.Call<String>, t: Throwable) {
                Log.i("response",t.message.toString())
            }

        });
    }

    private fun log(x: String, base: String) {

    }
}
    