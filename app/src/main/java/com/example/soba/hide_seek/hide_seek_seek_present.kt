package com.example.soba.hide_seek


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.soba.R
import kotlinx.android.synthetic.main.fragment_hide_seek_make_question.view.*
import kotlinx.android.synthetic.main.fragment_hide_seek_seek_present.view.*

/**
 * A simple [Fragment] subclass.
 */
class hide_seek_seek_present : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_hide_seek_seek_present, container, false)
        // 問題に答えるボタンを押したときの遷移処理
        view.answer_button.setOnClickListener {
            findNavController().navigate(R.id.action_hide_seek_seek_present_to_hide_seek_seek_question1)
        }
        return view
    }


}
