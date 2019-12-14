package com.example.soba.hide_seek.hide_seek_sample


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.soba.R
import kotlinx.android.synthetic.main.fragment_hide_seek_hide_present.view.*
import kotlinx.android.synthetic.main.fragment_hide_seek_make_question.view.*

/**
 * A simple [Fragment] subclass.
 */

class hide_seek_make_question : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_hide_seek_make_question, container, false)
        // 問題を作るボタンを押したときの遷移処理
        //view.question_yourself_button.setOnClickListener {
          //  findNavController().navigate(R.id.action_hide_seek_make_question_to_hide_seek_question_view)
        //}
        //サンプル問題を作るボタンを押した時の遷移処理
        view.question_sample_button.setOnClickListener {
            findNavController().navigate(R.id.action_hide_seek_make_question_to_hide_seek_question_sample_1)
        }
        return view
    }

}
