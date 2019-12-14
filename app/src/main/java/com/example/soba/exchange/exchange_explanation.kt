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
import kotlinx.android.synthetic.main.fragment_exchange_play.view.*


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [exchange_explanation.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [exchange_explanation.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class exchange_explanation : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_exchange_explanation, container, false)
        view.nextButtonPreGeter.setOnClickListener {
            findNavController().navigate(R.id.action_exchange_explanation_to_exchange_play)
        }
        // Inflate the layout for this fragment
        return view
    }
}
