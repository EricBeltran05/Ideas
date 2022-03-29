package beltran.fandos.eric.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import beltran.fandos.eric.databinding.FragmentMainScreenBinding
import beltran.fandos.eric.databinding.FragmentSettingsBinding
import beltran.fandos.eric.snack

class SettingsFragment : Fragment() {

    private lateinit var bindingSettings: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding = FragmentSettingsBinding.inflate(inflater, container, false)
        bindingSettings = binding

        bindingSettings.cvNotif.setOnClickListener {
            view?.snack("TESTEST")
        }

        return binding.root
    }

}