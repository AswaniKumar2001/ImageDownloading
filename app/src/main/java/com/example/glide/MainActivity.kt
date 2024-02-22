package com.example.glide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val B1 : Button =findViewById(R.id.glide)
        val B2 : Button =findViewById(R.id.picasso)
        val B3 : Button =findViewById(R.id.coil)

        B1.setOnClickListener {
            val intent = Intent(applicationContext, com.example.glide.Glide::class.java)
            startActivity(intent)
        }

        B2.setOnClickListener {
            val intent = Intent(applicationContext, com.example.glide.Picasso::class.java)
            startActivity(intent)
        }

        B3.setOnClickListener {
            val intent = Intent(applicationContext, Coil::class.java)
            startActivity(intent)
        }
    }
}