package com.example.soba.exchange

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.soba.MainActivity
import com.example.soba.R
import kotlinx.android.synthetic.main.fragment_exchange_play.*
import kotlinx.android.synthetic.main.fragment_exchange_play.view.*
import kotlin.coroutines.coroutineContext


class exchange_play : Fragment() {

    var listManager : Int = 0 // リスト管理用変数
    val beforeShuffleList = nameList // シャッフルする前の仮置きリスト
    val afterShuffleList : List<String> = beforeShuffleList.shuffled() // シャッフル後のリスト


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("a", afterShuffleList[listManager])

        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_exchange_play, container, false)
        view.getName.text =  afterShuffleList[listManager]
        view.getNum.text = (listManager + 1 ).toString()
        view.backButtonPreGeter.setOnClickListener {
            if(listManager >= 1) listManager -= 1
            view.getName.text =  afterShuffleList[listManager]
            view.getNum.text = (listManager + 1 ).toString()
            view.nextButtonPreGeter.text = "次へ"
        }


        view.nextButtonPreGeter.setOnClickListener {
            if(listManager >= afterShuffleList.size - 1) {
                nameList.clear()
                activity?.startActivity(Intent(activity?.applicationContext, MainActivity::class.java))
            }
            if(listManager < afterShuffleList.size - 1) listManager += 1
            view.getName.text =  afterShuffleList[listManager]
            view.getNum.text = (listManager + 1 ).toString()
            if(listManager >= afterShuffleList.size - 1) view.nextButtonPreGeter.text = "終了"
        }


        return view
    }
}
