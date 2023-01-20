package com.example.swapi

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class VehicleActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vaisseau)
        val vaisseau: ListView = findViewById(R.id.vaisseau_list_view)

        CoroutineScope(Dispatchers.IO).launch {
            try {
                val response = ApiManager.SwapiVais.getStarships()
                if (response.isSuccessful) {
                    val vaisseaux = response.body()?.results
                    if(vaisseaux!=null) {
                        withContext(Dispatchers.Main) {
                            vaisseau.adapter = ArrayAdapter(this@VehicleActivity, android.R.layout.simple_list_item_1, vaisseaux)
                        }
                    }else {
                        // Handle null starship
                    }
                }
            } catch (e: Exception) {
                // Handle error
            }
        }

        val btnRetour = findViewById<Button>(R.id.btnretour).setOnClickListener{
            finish()
        }

    }
}