package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class adaptador(private val stwPers : List<character>) : RecyclerView.Adapter<adaptador.adap>() {

    inner class adap(renglon: View): RecyclerView.ViewHolder(renglon){
        var nombre = renglon.findViewById<TextView>(R.id.nombre_c)
        var clase = renglon.findViewById<TextView>(R.id.clase_c)
        var planeta = renglon.findViewById<TextView>(R.id.planeta_c)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adap {
        val infl = LayoutInflater.from(parent.context)
        val renglon_v = infl.inflate(R.layout.renglon,parent, false)
        return adap(renglon_v)
    }

    override fun onBindViewHolder(holder: adap, position: Int) {
        val lista = stwPers[position]
        holder.nombre.text = lista.nombre
        holder.clase.text = lista.clase
        holder.planeta.text = lista.planeta


        holder.itemView.setOnClickListener {
            val action = personajesDirections.actionPersonajesToPersonajeInfo2(lista)
            holder.itemView.findNavController().navigate(action)
        }


    }

    override fun getItemCount(): Int {
        return stwPers.size
    }
}