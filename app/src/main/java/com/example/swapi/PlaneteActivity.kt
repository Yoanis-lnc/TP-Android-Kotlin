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

class PlaneteActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.planete)
        val planete: ListView = findViewById(R.id.planete_listView)

        CoroutineScope(Dispatchers.IO).launch {
            try {
                val response = ApiManager.SwapiPlanete.getPlanete()
                if (response.isSuccessful) {
                    val planetes = response.body()?.results
                    if(planetes!=null) {
                        withContext(Dispatchers.Main) {
                            planete.adapter = ArrayAdapter(this@PlaneteActivity, android.R.layout.simple_list_item_1, planetes)
                            planete.setOnItemClickListener { _, _, position, _ ->
                                val planete = planetes[position]


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