package com.example.swapi

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlaneteViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

    private val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)

    fun bind(planete: planetsData) {
        nameTextView.text = planete.name

    }
}