package com.example.soba.hide_seek


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.soba.R
import kotlinx.android.synthetic.main.fragment_hide_seek_seek_question2.*
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

        //正誤チェック
        view.question2_ans1.setOnClickListener {
            question2_view.visibility = View.GONE
            question2_ans1.visibility = View.GONE
            question2_ans2.visibility = View.GONE
            question2_ans3.visibility = View.GONE
            if (choiceList[0] == choice1) {
                //ここに正解時の処理
                goQuestion3.visibility = View.VISIBLE
                correctImage.visibility = View.VISIBLE
            }
            else{
                //不正解時の処理
                goToHomeButton2.visibility = View.VISIBLE
                wrongImage.visibility = View.VISIBLE
                view.goToQuestion3Text.text = "ざんねん！もういっかいやってみよう！"
            }
            goToQuestion3Text.visibility = View.VISIBLE
        }
        view.question2_ans2.setOnClickListener {
            question2_view.visibility = View.GONE
            question2_ans1.visibility = View.GONE
            question2_ans2.visibility = View.GONE
            question2_ans3.visibility = View.GONE
            if (choiceList[1] == choice1) {
                //ここに正解時の処理
                goQuestion3.visibility = View.VISIBLE
                correctImage.visibility = View.VISIBLE
            }
            else{
                //不正解時の処理
                goToHomeButton2.visibility = View.VISIBLE
                wrongImage.visibility = View.VISIBLE
                view.goToQuestion3Text.text = "ざんねん！もういっかいやってみよう！"
            }
            goToQuestion3Text.visibility = View.VISIBLE
        }
        view.question2_ans3.setOnClickListener {
            question2_view.visibility = View.GONE
            question2_ans1.visibility = View.GONE
            question2_ans2.visibility = View.GONE
            question2_ans3.visibility = View.GONE
            if (choiceList[2] == choice1) {
                //ここに正解時の処理
                goQuestion3.visibility = View.VISIBLE
                correctImage.visibility = View.VISIBLE
            }
            else{
                //不正解時の処理
                goToHomeButton2.visibility = View.VISIBLE
                wrongImage.visibility = View.VISIBLE
                view.goToQuestion3Text.text = "ざんねん！もういっかいやってみよう！"
            }
            goToQuestion3Text.visibility = View.VISIBLE
        }
        //次へ進むボタン
        view.goQuestion3.setOnClickListener {
            findNavController().navigate(R.id.action_hide_seek_seek_question2_to_hide_seek_seek_question3)
        }
        //もういっかいやるボタン
        view.goToHomeButton2.setOnClickListener {
            for (i in 0..1) {
                findNavController().popBackStack()
            }
        }
    }
}
