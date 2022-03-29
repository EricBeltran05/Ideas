package beltran.fandos.eric.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import beltran.fandos.eric.databinding.FragmentDashboardBinding
import beltran.fandos.eric.databinding.FragmentSettingsBinding

class DashboardFragment : Fragment() {

    private lateinit var bindingDashboard: FragmentDashboardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding = FragmentDashboardBinding.inflate(inflater, container, false)
        bindingDashboard = binding

        return binding.root
    }

}