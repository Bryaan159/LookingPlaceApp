package com.hernandez.lookingplace

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.databinding.DataBindingUtil
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hernandez.lookingplace.databinding.FragmentAccesoPrincipalBinding
import com.hernandez.lookingplace.databinding.FragmentOlvidasteContraBinding


class accesoPrincipal : Fragment() {

    private lateinit var binding:FragmentAccesoPrincipalBinding
    //private lateinit var binding2: FragmentOlvidasteContraBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_acceso_principal,container,false)
        //binding2 = DataBindingUtil.inflate(inflater,R.layout.fragment_olvidaste_contra,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner
        var navControlador = findNavController()
        // Boton para iniciar sesion
        binding.btnIniciarSesion.setOnClickListener{
            val funcion = accesoPrincipalDirections.actionAccesoFragmentToTablaCategoria2()
            navControlador.navigate(funcion)
        }
        // Boton para entrar a recuperacion de contraseña
        binding.btnOlvidasteContra.setOnClickListener {
            val funcion = accesoPrincipalDirections.actionAccesoFragmentToOlvidasteContraFragmento2()
            navControlador.navigate(funcion)
        }
        // Boton para registrarse con nueva cuenta
        binding.btnRegistrate.setOnClickListener {
            val funcion = accesoPrincipalDirections.actionAccesoFragmentToRegistrateFragmento()
            navControlador.navigate(funcion)
        }
    }
}