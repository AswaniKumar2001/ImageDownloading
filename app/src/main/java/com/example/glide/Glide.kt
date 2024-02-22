package com.example.glide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class Glide : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glide)

        //to go to main activity, we are using a button
        val home : Button =findViewById(R.id.home)

        home.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

        //finding imageview
        val imageViewGl: ImageView = findViewById(R.id.imageViewGL)
        //setting the url of the image
        val url = "https://photos.prnewswire.com/prnfull/20160628/384645?max=650"
        //using glide to display image
        Glide.with(this)
            .load(url)
            .placeholder(R.drawable.image)
            .into(imageViewGl)
    }
}