package com.example.swapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val backgroundImage = resources.getIdentifier("fondsw", "drawable", packageName)
        findViewById<View>(android.R.id.content).setBackgroundResource(backgroundImage)


    }

}