package com.hernandez.lookingplace.sitios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.hernandez.lookingplace.R
import com.hernandez.lookingplace.databinding.FragmentListaSitiosTuristicosBinding

class listaSitiosTuristicos : Fragment() {

    private lateinit var binding: FragmentListaSitiosTuristicosBinding
    private lateinit var titulo: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let { bundle ->
            titulo = bundle.getString("Titulo", "DEFECTO")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_lista_sitios_turisticos,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.tituloText.text = titulo
    }


}