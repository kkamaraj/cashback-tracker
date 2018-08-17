package com.kkamaraj.cashbacktracker.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.kkamaraj.cashbacktracker.R

class CardListAdapter(private val cardListData: MutableList<CardData>) : RecyclerView.Adapter<CardListAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_card_view, parent,false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int = cardListData.size

    override fun onBindViewHolder(viewHolder: CardViewHolder, position: Int) {
        viewHolder.cardName.text = cardListData[position].cardName
    }

    class CardViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        var cardName: TextView = view.findViewById(R.id.card_name)
        var cardImage: ImageView = view.findViewById(R.id.card_image)
    }
}