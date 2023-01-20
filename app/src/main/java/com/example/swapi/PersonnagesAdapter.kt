package com.example.swapi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PersonnagesAdapter(private val characters: List<Character>) : RecyclerView.Adapter<PersonnageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonnageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.personnage, parent, false)
        return PersonnageViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonnageViewHolder, position: Int) {
        val character = characters[position]
        holder.bind(character)
    }

     override fun getItemCount() = characters.size
}
