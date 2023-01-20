package com.example.swapi

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val backgroundImage = resources.getIdentifier("fondsw", "drawable", packageName)
        findViewById<View>(android.R.id.content).setBackgroundResource(backgroundImage)

        val mediaPlayer = MediaPlayer.create(this, R.raw.starwars)
        mediaPlayer.start()

        val personneBtn: Button = findViewById(R.id.personneBtn)

        personneBtn.setOnClickListener {
            val personneIntent = Intent(this, PersonnageActivity::class.java)
            startActivity(personneIntent)
        }

        val vaisseauBtn: Button = findViewById(R.id.vaisseauBtn)

       vaisseauBtn.setOnClickListener {
            val vaisseauIntent = Intent(this, VehicleActivity::class.java)
            startActivity(vaisseauIntent)
        }

        val planeteBtn: Button = findViewById(R.id.planeteBtn)

        planeteBtn.setOnClickListener {
            val planeteIntent = Intent(this, PlaneteActivity::class.java)
            startActivity(planeteIntent)
        }
    }

}