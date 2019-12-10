package com.example.soba.hide_seek


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.soba.R
import kotlinx.android.synthetic.main.fragment_hide_seek_title.view.*

/**
 * A simple [Fragment] subclass.
 */
class hide_seek_title : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_hide_seek_title, container, false)
        // プレゼントを隠すボタンを押したときの遷移処理
        view.hide_present_button.setOnClickListener {
            findNavController().navigate(R.id.action_title_to_hide_present)
        }
        // プレゼントを探すボタンを押したときの遷移処理
        view.seek_present_button.setOnClickListener {
            findNavController().navigate(R.id.action_title_to_seek_present)
        }
        return view
    }


}
