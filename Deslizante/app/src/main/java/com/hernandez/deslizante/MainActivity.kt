package com.hernandez.deslizante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imagenLista = ArrayList<SlideModel>()

        imagenLista.add(SlideModel("https://farm6.staticflickr.com/5137/5400078463_0194cd0108.jpg","Nombre del lugar"))
        imagenLista.add(SlideModel("https://i.pinimg.com/564x/fc/ab/6d/fcab6d612894fecc8dd7666ede4c9a99.jpg","Nombre del lugar"))
        imagenLista.add(SlideModel("https://i.pinimg.com/564x/dc/8c/a1/dc8ca15e9419169b0ead0bd2e40b0d76.jpg","Nombre del lugar"))
        imagenLista.add(SlideModel("https://i.pinimg.com/564x/ac/bf/5b/acbf5be87edc0afc75830a8d839cf1a1.jpg","Nombre del lugar"))
        imagenLista.add(SlideModel("https://i.pinimg.com/564x/87/43/cf/8743cf8bc1dcc525a77261fec1fe2d36.jpg","Nombre del lugar"))
        imagenLista.add(SlideModel("https://i.pinimg.com/564x/b8/6d/b9/b86db98af4a10b49b91308973020514a.jpg","Nombre del lugar"))
        imagenLista.add(SlideModel("https://i.pinimg.com/564x/88/76/47/887647893da33aa37bc5e80fd749f923.jpg","Nombre del lugar"))

        val imagenDeslizante = findViewById<ImageSlider>(R.id.desplazamiento)
        imagenDeslizante.setImageList(imagenLista)

    }
}