package com.example.swapi

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

class PersonnageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.personnage)
        val characterListView: ListView = findViewById(R.id.character_list_view)

        CoroutineScope(Dispatchers.IO).launch {
            try {
                val response = ApiManager.SwapiPers.getCharacters()
                if (response.isSuccessful) {
                    val characters = response.body()?.results
                    if(characters!=null) {
                        withContext(Dispatchers.Main) {
                            characterListView.adapter = ArrayAdapter(this@PersonnageActivity, android.R.layout.simple_list_item_1, characters)
                            characterListView.setOnItemClickListener { _, _, position, _ ->
                                val character = characters[position]

                            }
                        }
                    }else {

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
