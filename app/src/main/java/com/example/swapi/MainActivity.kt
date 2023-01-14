package com.example.swapi

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val backgroundImage = resources.getIdentifier("fondsw", "drawable", packageName)
        findViewById<View>(android.R.id.content).setBackgroundResource(backgroundImage)

        val mediaPlayer = MediaPlayer.create(this, R.raw.starwars)
        mediaPlayer.start()


        val retrofit = Retrofit.Builder()
            .baseUrl("https://swapi.dev/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    }

}