package com.hernandez.lookingplace

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
            val funcion = tablaCategoriaDirections.actionTablaCategoriaToListaSitiosTuristicos()
            navController.navigate(funcion)
        }
    }

}