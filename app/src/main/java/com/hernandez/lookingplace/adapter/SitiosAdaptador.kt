package com.hernandez.lookingplace.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hernandez.lookingplace.R
import com.hernandez.lookingplace.sitios.Sitio

class SitiosAdaptador(
    private val sitiosList: List<Sitio>,
    private val onClickListener: (Sitio) -> Unit
) : RecyclerView.Adapter<SitioViewHolder>() {
    // Hacemos llamado para las funciones que se solicitan en la ejecucion de la clase Adapter.
    // Del recycleView.

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SitioViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SitioViewHolder(layoutInflater.inflate(R.layout.elemento_sitio, parent, false))
    }

    override fun onBindViewHolder(holder: SitioViewHolder, position: Int) {
        val item =sitiosList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int =sitiosList.size

}