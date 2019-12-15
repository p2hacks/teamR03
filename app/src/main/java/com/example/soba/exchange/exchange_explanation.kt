package com.example.soba.exchange

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.soba.R
import kotlinx.android.synthetic.main.fragment_exchange_explanation.view.*
import kotlinx.android.synthetic.main.fragment_exchange_play.view.*

class exchange_explanation : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_exchange_explanation, container, false)
        view.startButton.setOnClickListener {
            findNavController().navigate(R.id.action_exchange_explanation_to_exchange_play)
        }
        return view
    }
}
