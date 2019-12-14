package com.example.soba.hide_seek


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.soba.R
import kotlinx.android.synthetic.main.fragment_hide_seek_seek_question2.view.*


/**
 * A simple [Fragment] subclass.
 */
class hide_seek_seek_question2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_hide_seek_seek_question2, container, false)
        // 正解だったときの遷移処理
        view.next_sample2_button.setOnClickListener {
            findNavController().navigate(R.id.action_hide_seek_seek_question2_to_hide_seek_seek_question3)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //sheredPreferencesで保存したファイルの読み取りと表示
        val pref = activity?.getSharedPreferences("questionSet2", Context.MODE_PRIVATE)
        val question1 = pref?.getString("question", "問題が設定されていません")
        view.question2_view.text = question1

        //選択肢を取得、配列に格納してシャッフル
        val choice1 = pref?.getString("choice1", "選択肢が設定されていません")
        val choice2 = pref?.getString("choice2", "選択肢が設定されていません")
        val choice3 = pref?.getString("choice3", "選択肢が設定されていません")
        val choiceList = listOf(choice1,choice2,choice3).shuffled()

        //選択肢を表示
        view.question2_ans1.text = choiceList[0]
        view.question2_ans2.text = choiceList[1]
        view.question2_ans3.text = choiceList[2]
    }
}
