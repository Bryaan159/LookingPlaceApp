package com.hernandez.lookingplace

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.hernandez.lookingplace.databinding.FragmentTablaCategoriaBinding

class tablaCategoria : Fragment() {

    private lateinit var binding: FragmentTablaCategoriaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_tabla_categoria, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner
        val navController = findNavController()

        binding.cartaCiclismo.setOnClickListener {
            val titulo = binding.ciclismoText.text.toString().trim()

            if (titulo.isNotEmpty()) {

                val funcion = tablaCategoriaDirections.actionTablaCategoriaToListaSitiosTuristicos(titulo)
                navController.navigate(funcion)
            }else{
                Toast.makeText(activity, "Nombre faltante", Toast.LENGTH_SHORT).show()
            }
        }

        binding.cartaMontaA.setOnClickListener {
            val titulo = binding.montaAText.text.toString().trim()

            if (titulo.isNotEmpty()) {

                val funcion = tablaCategoriaDirections.actionTablaCategoriaToListaSitiosTuristicos(titulo)
                navController.navigate(funcion)
            }else{
                Toast.makeText(activity, "Nombre faltante", Toast.LENGTH_SHORT).show()
            }
        }


        binding.cartaPlaya.setOnClickListener {
            val titulo = binding.playaText.text.toString().trim()

            if (titulo.isNotEmpty()) {

                val funcion = tablaCategoriaDirections.actionTablaCategoriaToListaSitiosTuristicos(titulo)
                navController.navigate(funcion)
            }else{
                Toast.makeText(activity, "Nombre faltante", Toast.LENGTH_SHORT).show()
            }
        }


        binding.cartaIglesia.setOnClickListener {
            val titulo = binding.iglesiaText.text.toString().trim()

            if (titulo.isNotEmpty()) {

                val funcion = tablaCategoriaDirections.actionTablaCategoriaToListaSitiosTuristicos(titulo)
                navController.navigate(funcion)
            }else{
                Toast.makeText(activity, "Nombre faltante", Toast.LENGTH_SHORT).show()
            }
        }


        binding.cartaDiscoteca.setOnClickListener {
            val titulo = binding.discoText.text.toString().trim()

            if (titulo.isNotEmpty()) {

                val funcion = tablaCategoriaDirections.actionTablaCategoriaToListaSitiosTuristicos(titulo)
                navController.navigate(funcion)
            }else{
                Toast.makeText(activity, "Nombre faltante", Toast.LENGTH_SHORT).show()
            }
        }


        binding.cartaMuseo.setOnClickListener {
            val titulo = binding.museoText.text.toString().trim()

            if (titulo.isNotEmpty()) {

                val funcion = tablaCategoriaDirections.actionTablaCategoriaToListaSitiosTuristicos(titulo)
                navController.navigate(funcion)
            }else{
                Toast.makeText(activity, "Nombre faltante", Toast.LENGTH_SHORT).show()
            }
        }


        binding.cartaRestaurante.setOnClickListener {
            val titulo = binding.restauranteText.text.toString().trim()

            if (titulo.isNotEmpty()) {

                val funcion = tablaCategoriaDirections.actionTablaCategoriaToListaSitiosTuristicos(titulo)
                navController.navigate(funcion)
            }else{
                Toast.makeText(activity, "Nombre faltante", Toast.LENGTH_SHORT).show()
            }
        }


        binding.cartaTeatro.setOnClickListener {
            val titulo = binding.teatroText.text.toString().trim()

            if (titulo.isNotEmpty()) {

                val funcion = tablaCategoriaDirections.actionTablaCategoriaToListaSitiosTuristicos(titulo)
                navController.navigate(funcion)
            }else{
                Toast.makeText(activity, "Nombre faltante", Toast.LENGTH_SHORT).show()
            }
        }
    }

}