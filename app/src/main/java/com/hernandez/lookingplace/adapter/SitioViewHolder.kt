package com.hernandez.lookingplace.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hernandez.lookingplace.databinding.ElementoSitioBinding
import com.hernandez.lookingplace.sitios.Sitio

class SitioViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ElementoSitioBinding.bind(view)

    // Funcion para renderizar los datos dentro de la tarjeta
    fun render(sitioModelo: Sitio, onclickListener: (Sitio) -> Unit) {
        binding.nombreLugarText.text = sitioModelo.nombre
        Glide.with(binding.imagenLugarImagen.context).load(sitioModelo.foto)
            .into(binding.imagenLugarImagen)

        itemView.setOnClickListener{ onclickListener.invoke(sitioModelo)}
    }
}