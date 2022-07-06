package com.hernandez.deslizante

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlanesAdaptador(private val planesList:ArrayList<Planes>):
    RecyclerView.Adapter<PlanesAdaptador.PlanesVistaControlador>(){

    class PlanesVistaControlador(itemView: View): RecyclerView.ViewHolder(itemView){
        val imagenPlan1 : ImageView = itemView.findViewById(R.id.ivImagenes)
        val imagenPlan2 : ImageView = itemView.findViewById(R.id.ivImagenes2)
        val tituloPlan  : TextView = itemView.findViewById(R.id.tvTituloPlanes)
        val DescripcionPlan  : TextView = itemView.findViewById(R.id.tvTituloPlanes)
        val boton : TextView = itemView.findViewById(R.id.botonGuardar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanesVistaControlador {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_planes,parent,false)
        return PlanesVistaControlador(vista)
    }

    override fun onBindViewHolder(holder: PlanesVistaControlador, position: Int) {
        val planes = planesList[position]
        holder.imagenPlan1
        holder.imagenPlan2.setImageResource(planes.imagen2)
        holder.tituloPlan.text = planes.nombre
        holder.DescripcionPlan.text = planes.descripcion
        holder.boton.text = planes.boton

    }

    override fun getItemCount(): Int {
        return planesList.size
    }
}