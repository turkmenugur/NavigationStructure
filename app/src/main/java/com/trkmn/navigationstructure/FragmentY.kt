package com.trkmn.navigationstructure

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.trkmn.navigationstructure.databinding.FragmentYBinding
import androidx.navigation.findNavController


class FragmentY : Fragment() {

    private lateinit var binding : FragmentYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentYBinding.inflate(inflater, container, false)

        val backPress = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                requireView().findNavController().navigate(R.id.action_fragmentY_to_mainFragment)
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, backPress)

        return binding.root
    }


}