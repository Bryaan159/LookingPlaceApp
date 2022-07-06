package com.hernandez.lookingplace.sitios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.hernandez.lookingplace.R

class VistaSitioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vista_sitio)

        val sitio = intent.getParcelableExtra<Sitio>("sitio")

        if(sitio != null){
            val texto: TextView = findViewById(R.id.nombre_sitio_text)
            val imagen: ImageView = findViewById(R.id.imageView2)
            val descripcion: TextView = findViewById(R.id.descripcion_sitio_text)

            // Se declaran y llenan de datos los valores del sitio en las cartas.
            texto.text = sitio.nombre
            Glide.with(imagen).load(sitio.foto)
                .into(imagen)
            descripcion.text = sitio.descripcion
        }
    }
}