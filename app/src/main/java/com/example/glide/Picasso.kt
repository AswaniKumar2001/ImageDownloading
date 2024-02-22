package com.example.glide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.squareup.picasso.Picasso


class Picasso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picasso)

        //to go to main activity, we are using a button
        val home : Button =findViewById(R.id.home)

        home.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

        //finding imageview
        val imageViewPi: ImageView = findViewById(R.id.imageViewPi)
        //setting the url of the image
        val url = "https://th.bing.com/th/id/OIP.GBXQmIGDqNTUbuQ-O4uQRQAAAA?rs=1&pid=ImgDetMain"
        //using Picasso to display image
        Picasso.get()
            .load(url)
            .placeholder(R.drawable.image)
            .into(imageViewPi)
    }
}
