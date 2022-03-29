package beltran.fandos.eric

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import beltran.fandos.eric.Fragments.InfoFragment
import beltran.fandos.eric.databinding.FragmentMainScreenBinding

class MainScreen : Fragment() {

    private lateinit var bindingMainScreen: FragmentMainScreenBinding
    private val infoFragment = InfoFragment()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding = FragmentMainScreenBinding.inflate(inflater, container, false)
        bindingMainScreen = binding


        navigationButtons()

        return binding.root
    }

    private fun navigationButtons() {
        bindingMainScreen.btnCards.setOnClickListener {
            findNavController().navigate(R.id.action_mainScreen_to_cartsGameFragment)


        }
    }



}