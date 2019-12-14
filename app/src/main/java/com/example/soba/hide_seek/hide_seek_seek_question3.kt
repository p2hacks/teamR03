package com.example.soba.hide_seek


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.soba.R
import kotlinx.android.synthetic.main.fragment_hide_seek_seek_question3.*
import kotlinx.android.synthetic.main.fragment_hide_seek_seek_question3.view.*

/**
 * A simple [Fragment] subclass.
 */
class hide_seek_seek_question3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_hide_seek_seek_question3, container, false)
        return view    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //sheredPreferencesで保存したファイルの読み取りと表示
        val pref = activity?.getSharedPreferences("questionSet3", Context.MODE_PRIVATE)
        val question1 = pref?.getString("question", "問題が設定されていません")
        view.question3_view.text = question1

        //選択肢を取得、配列に格納してシャッフル
        val choice1 = pref?.getString("choice1", "選択肢が設定されていません")
        val choice2 = pref?.getString("choice2", "選択肢が設定されていません")
        val choice3 = pref?.getString("choice3", "選択肢が設定されていません")
        val choiceList = listOf(choice1, choice2, choice3).shuffled()

        //選択肢を表示
        view.question3_ans1.text = choiceList[0]
        view.question3_ans2.text = choiceList[1]
        view.question3_ans3.text = choiceList[2]

        //正誤チェック
        view.question3_ans1.setOnClickListener {
            question3_view.visibility = View.GONE
            question3_ans1.visibility = View.GONE
            question3_ans2.visibility = View.GONE
            question3_ans3.visibility = View.GONE
            if (choiceList[0] == choice1) {
                //ここに正解時の処理
                goResult.visibility = View.VISIBLE
                correctImage.visibility = View.VISIBLE
            }
            else{
                //不正解時の処理
                wrongImage.visibility = View.VISIBLE
                view.goToResultText.text = "ざんねん！もういっかいやってみよう！"
            }
            goToResultText.visibility = View.VISIBLE
        }
        view.question3_ans2.setOnClickListener {
            question3_view.visibility = View.GONE
            question3_ans1.visibility = View.GONE
            question3_ans2.visibility = View.GONE
            question3_ans3.visibility = View.GONE
            if (choiceList[1] == choice1) {
                //ここに正解時の処理
                goResult.visibility = View.VISIBLE
                correctImage.visibility = View.VISIBLE
            }
            else{
                //不正解時の処理
                wrongImage.visibility = View.VISIBLE
                view.goToResultText.text = "ざんねん！もういっかいやってみよう！"
            }
            goToResultText.visibility = View.VISIBLE
        }
        view.question3_ans3.setOnClickListener {
            question3_view.visibility = View.GONE
            question3_ans1.visibility = View.GONE
            question3_ans2.visibility = View.GONE
            question3_ans3.visibility = View.GONE
            if (choiceList[2] == choice1) {
                //ここに正解時の処理
                goResult.visibility = View.VISIBLE
                correctImage.visibility = View.VISIBLE
            }
            else{
                //不正解時の処理
                wrongImage.visibility = View.VISIBLE
                view.goToResultText.text = "ざんねん！もういっかいやってみよう！"
            }
            goToResultText.visibility = View.VISIBLE
        }
        //次へ進むボタン
        view.goResult.setOnClickListener {
            findNavController().navigate(R.id.action_hide_seek_seek_question3_to_hide_seek_seek_result)
        }
    }
}
