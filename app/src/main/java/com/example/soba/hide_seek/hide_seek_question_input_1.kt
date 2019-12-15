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
import kotlinx.android.synthetic.main.fragment_hide_seek_question_input_1.*
import kotlinx.android.synthetic.main.fragment_hide_seek_question_input_1.view.*
import org.json.JSONArray

/**
 * A simple [Fragment] subclass.
 */
class hide_seek_question_input_1 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_hide_seek_question_input_1, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.question1_save.setOnClickListener {
            //ボタン押下時テキストボックスの内容の受け取りと表示
            val question1 = view.edit_question1.text.toString()
            val choice1 = view.input1_choice1.text.toString()
            val choice2 = view.input1_choice2.text.toString()
            val choice3 = view.input1_choice3.text.toString()

            //SharePreferencesのquestionSet1にキーを↑で取得した内容を保存
            activity?.getSharedPreferences("questionSet1", Context.MODE_PRIVATE)?.edit {
                putString("question", question1)
                putString("choice1", choice1)
                putString("choice2", choice2)
                putString("choice3", choice3)
                apply()
            }

            //ボタン押すとアニメーションの再生
            animationView2.setAnimation(R.raw.checksave)
            animationView2.playAnimation()
        }
        view.backhome1_button.setOnClickListener {
            for (i in 0..2){
                findNavController().popBackStack()
            }
        }
        //入力内容をテキストボックスにも保持
        val pref = activity?.getSharedPreferences("questionSet1", Context.MODE_PRIVATE)
        val question1 = pref?.getString("question", null)
        val choice1 = pref?.getString("choice1", null)
        val choice2 = pref?.getString("choice2", null)
        val choice3 = pref?.getString("choice3", null)
        view.edit_question1.setText(question1)
        view.input1_choice1.setText(choice1)
        view.input1_choice2.setText(choice2)
        view.input1_choice3.setText(choice3)
    }
}
