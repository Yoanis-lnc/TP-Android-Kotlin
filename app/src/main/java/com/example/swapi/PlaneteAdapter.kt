package com.example.swapi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PlaneteAdapter (private val planetes: List<planetsData>) : RecyclerView.Adapter<PlaneteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaneteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.planete, parent, false)
        return PlaneteViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlaneteViewHolder, position: Int) {
        val planete = planetes[position]
        holder.bind(planete)
    }

    override fun getItemCount() = planetes.size
}