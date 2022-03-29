package beltran.fandos.eric.Adapters

import android.content.Context
import android.icu.number.NumberFormatter.with
import android.icu.number.NumberRangeFormatter.with
import android.media.Image
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import beltran.fandos.eric.Objects.Card
import beltran.fandos.eric.R
import com.squareup.picasso.Picasso

class CardsAdapter(private val context: Context) : RecyclerView.Adapter<CardsAdapter.ViewHolder>() {

    private var dataListCards = mutableListOf<Card>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentCard = dataListCards[position]

        holder.itemTitle.text = currentCard.titleCard
        holder.itemDesc.text = currentCard.descCard

        Picasso.get()
            .load(currentCard.imgCard)
            .into(holder.itemImage)


        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/2/23/The_Jolly_Nero.jpg").into(holder.itemBackground)


    }

    override fun getItemCount(): Int {
        return dataListCards.size
    }

    fun setListData(data: MutableList<Card>) {
        dataListCards = data
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDesc: TextView
        var itemBackground: ImageView


        init {
            itemImage = itemView.findViewById(R.id.cv_img)
            itemTitle = itemView.findViewById(R.id.cv_title)
            itemDesc = itemView.findViewById(R.id.cv_desc)
            itemBackground = itemView.findViewById(R.id.cv_background)


        }
    }


}