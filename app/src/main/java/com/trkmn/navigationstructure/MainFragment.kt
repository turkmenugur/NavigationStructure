package com.trkmn.navigationstructure

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.trkmn.navigationstructure.databinding.ActivityMainBinding
import com.trkmn.navigationstructure.databinding.FragmentMainBinding
import androidx.navigation.findNavController


class MainFragment : Fragment() {

    private lateinit var binding : FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.buttonGoToA.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainFragment_to_fragmentA)

        }
        binding.buttonGoToX.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainFragment_to_fragmentX)
        }

        return binding.root
    }


}