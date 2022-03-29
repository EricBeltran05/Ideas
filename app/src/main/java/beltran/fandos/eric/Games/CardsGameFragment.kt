package beltran.fandos.eric.Games

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import beltran.fandos.eric.Adapters.CardsAdapter
import beltran.fandos.eric.Objects.Card
import beltran.fandos.eric.databinding.FragmentCardsGameBinding

class CardsGameFragment : Fragment() {

    private lateinit var bindingCartsGameFragment: FragmentCardsGameBinding
    private lateinit var cardsAdapter: CardsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding = FragmentCardsGameBinding.inflate(inflater, container, false)
        bindingCartsGameFragment = binding

        cardsRecyclerView()

        return binding.root
    }

    private fun cardsRecyclerView() {
        bindingCartsGameFragment.rvCards.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        cardsAdapter = CardsAdapter(requireContext())
        bindingCartsGameFragment.rvCards.adapter = cardsAdapter

        return observeDataCards()
    }

    fun fetchCards(): LiveData<MutableList<Card>> {
        val mutableData = MutableLiveData<MutableList<Card>>()
        getCards().observeForever { dataList ->
            mutableData.value = dataList
        }
        return mutableData
    }

    private fun observeDataCards() {
        fetchCards().observe(viewLifecycleOwner, Observer {
            cardsAdapter.setListData(it)
            cardsAdapter.notifyDataSetChanged()
        })
    }

    private fun getCards(): LiveData<MutableList<Card>> {
        val mutableData = MutableLiveData<MutableList<Card>>()
        val listData = mutableListOf<Card>()


        val idCard = "0001"
        val titleCard = "Default"
        val imgCard =
            "https://static.giga.de/wp-content/uploads/2021/09/random-GettyImages-531316319.jpg"
        val descCard = "This is the default card"
        val defaultCard = Card(idCard, titleCard, imgCard, descCard)

        val idCard2 = "0002"
        val titleCard2 = "Second Default"
        val imgCard2 =
            "https://static.giga.de/wp-content/uploads/2021/09/random-GettyImages-531316319.jpg"
        val descCard2 = "This is the second default card"
        val defaultCard2 = Card(idCard2, titleCard2, imgCard2, descCard2)

        listData.add(defaultCard)
        listData.add(defaultCard2)
        mutableData.value = listData

        return mutableData
    }


}