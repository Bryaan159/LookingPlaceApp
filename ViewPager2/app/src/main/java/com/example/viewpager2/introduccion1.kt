package com.example.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.viewpager2.databinding.FragmentoIntroduccion1Binding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class introduccion1 : Fragment() {


    // This property is only valid between onCreateView and
    // onDestroyView.

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var binding = FragmentoIntroduccion1Binding.inflate(inflater, container, false)
        return binding.root

    }

}