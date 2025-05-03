package com.trkmn.navigationstructure

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.trkmn.navigationstructure.databinding.FragmentBBinding


class FragmentB : Fragment() {

    private lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)

        binding.buttonGoToY.setOnClickListener {
            it.findNavController().navigate(R.id.action_fragmentB_to_fragmentY)
        }

        return binding.root
    }


}