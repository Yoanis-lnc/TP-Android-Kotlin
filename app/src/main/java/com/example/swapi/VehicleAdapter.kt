package com.example.swapi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class VehicleAdapter (private val vaisseaux: List<VaisseauData>) : RecyclerView.Adapter<VehicleViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehicleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.vaisseau, parent, false)
        return VehicleViewHolder(view)
    }

    override fun onBindViewHolder(holder: VehicleViewHolder, position: Int) {
        val vaisseau = vaisseaux[position]
        holder.bind(vaisseau)
    }

    override fun getItemCount() = vaisseaux.size
}