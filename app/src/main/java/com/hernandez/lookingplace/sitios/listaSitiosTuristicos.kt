package com.hernandez.lookingplace.sitios

import android.content.Intent
import android.net.NetworkInfo
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.hernandez.lookingplace.R
import com.hernandez.lookingplace.adapter.SitiosAdaptador
import com.hernandez.lookingplace.databinding.FragmentListaSitiosTuristicosBinding

class listaSitiosTuristicos : Fragment() {

    private lateinit var binding: FragmentListaSitiosTuristicosBinding
    private lateinit var titulo: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Guardamos la variable de tiulo, llamandola con bundle
        arguments?.let { bundle ->
            titulo = bundle.getString("Titulo", "DEFECTO")
        }

    }

    // Funcion donde se aplica RecyclewView
    private fun initRecycleView(navController: NavController) {
        val manager = LinearLayoutManager(activity)
        val decoration = DividerItemDecoration(activity, manager.orientation)
        binding.sitiosRecycler.layoutManager = manager
        binding.sitiosRecycler.adapter =
            SitiosAdaptador(sitioProveedor.sitioList) {
                onItemSelected(
                    it,
                    navController
                )
            }
        binding.sitiosRecycler.addItemDecoration(decoration)
    }

    private fun onItemSelected(sitio: Sitio, navController: NavController) {
        val intent = Intent(activity, VistaSitioActivity::class.java)
        intent.putExtra("sitio",sitio)
        startActivity(intent)
        Toast.makeText(activity, sitio.nombre, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
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
        // Hacemos uso de la variable titulo.
        binding.tituloText.text = titulo
        val navController = findNavController()
        initRecycleView(navController)
    }


}