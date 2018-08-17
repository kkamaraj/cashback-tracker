package com.kkamaraj.cashbacktracker

import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kkamaraj.cashbacktracker.adapter.CardData
import com.kkamaraj.cashbacktracker.adapter.CardListAdapter

/**
 * A fragment containing a card list that was already registered or empty list.
 */
class CardListActivityFragment : Fragment() {

    private lateinit var cardList: RecyclerView
    private lateinit var recyclerViewAdapter: CardListAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_card_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // TODO: Implement a repository pattern to get the card list that is already registered.
        val cardData = mutableListOf(CardData("Chase Sapphire Preferred®", ""))
        recyclerViewAdapter = CardListAdapter(cardData)
        cardList = view.findViewById(R.id.card_list_view)
        cardList.apply {
            setHasFixedSize(true)
            adapter = recyclerViewAdapter
            layoutManager = LinearLayoutManager(context)
        }
    }
}
