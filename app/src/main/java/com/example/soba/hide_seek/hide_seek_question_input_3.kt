package com.example.soba.hide_seek


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.edit
import androidx.navigation.fragment.findNavController

import com.example.soba.R
import kotlinx.android.synthetic.main.fragment_hide_seek_question_input_3.*
import kotlinx.android.synthetic.main.fragment_hide_seek_question_input_3.view.*


/**
 * A simple [Fragment] subclass.
 */
class hide_seek_question_input_3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_hide_seek_question_input_3, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.question3_save.setOnClickListener {
            //ボタン押下時テキストボックスの内容の受け取りと表示
            val question3 = view.edit_question3.text.toString()
            val choice1 = view.input3_choice1.text.toString()
            val choice2 = view.input3_choice2.text.toString()
            val choice3 = view.input3_choice3.text.toString()

            //SharePreferencesのquestionSet3にキーを↑で取得した内容を保存
            activity?.getSharedPreferences("questionSet3", Context.MODE_PRIVATE)?.edit {
                putString("question", question3)
                putString("choice1", choice1)
                putString("choice2", choice2)
                putString("choice3", choice3)
                apply()
            }
            //ボタン押すとアニメーションの再生
            animationView4.setAnimation(R.raw.save_checked)
            animationView4.playAnimation()
        }
        view.backhome3_button.setOnClickListener {
            for (i in 0..2){
                findNavController().popBackStack()
            }
        }
    }
}
