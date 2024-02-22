package com.example.glide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import coil.load
import coil.transform.CircleCropTransformation

class Coil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coil)

        //to go to main activity, we are using a button
        val home : Button =findViewById(R.id.home)

        home.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

        //finding imageview
        val imageViewCoil: ImageView = findViewById(R.id.imageViewC)
        //setting the url of the image
        val url = "https://cdn.weka-fachmedien.de/thumbs/media_uploads/images/1483542100-275-wor1kgci7.jpg.950x534.jpg"
        //using Coil to display image

        imageViewCoil.load(url) {
            crossfade(true)
            placeholder(R.drawable.image)
            transformations(CircleCropTransformation())
        }
    }
}