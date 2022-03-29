package beltran.fandos.eric.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import beltran.fandos.eric.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private lateinit var bindingInfoFragment: FragmentInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding = FragmentInfoBinding.inflate(inflater, container, false)
        bindingInfoFragment = binding

        return binding.root
    }

}