package com.example.soba.exchange

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.soba.R
import kotlinx.android.synthetic.main.fragment_exchange_play.*
import kotlinx.android.synthetic.main.fragment_exchange_play.view.*


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [exchange_play.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [exchange_play.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class exchange_play : Fragment() {

    var listManager : Int = 0 // リスト管理用変数
    val beforeShuffleList = nameList // シャッフルする前の仮置きリスト
    val afterShuffleList : List<String> = beforeShuffleList.shuffled() // シャッフル後のリスト

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        getName.text =  afterShuffleList[listManager] + "さんは"
        getNum.text = listManager.toString() + "番のプレゼントを受け取ってください"
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_exchange_play, container, false)
        view.nextButtonPreGeter.setOnClickListener {
            listManager += 1
        }

        return view
    }
}
