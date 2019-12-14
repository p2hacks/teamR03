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
import kotlinx.android.synthetic.main.fragment_hide_seek_hide_place.*
import kotlinx.android.synthetic.main.fragment_hide_seek_hide_place.view.*
import kotlinx.android.synthetic.main.fragment_hide_seek_hide_present.view.*
import kotlinx.android.synthetic.main.fragment_hide_seek_make_question.view.*


/**
 * A simple [Fragment] subclass.
 */
class hide_seek_hide_place : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_hide_seek_hide_place, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.save_hidePlace.setOnClickListener {
            //ボタン押下時テキストボックスの内容の受け取りと表示
            val hidePlace = view.edit_hidePlace.text.toString()
            //SharePreferencesのsharedHidePlaceにキーをhidePlaceとして、↑で取得した内容を保存
            activity?.getSharedPreferences("sharedHidePlace", Context.MODE_PRIVATE)?.edit {
                putString("hidePlace", hidePlace)
                apply()
            }
            //ボタン押すとアニメーションの再生
            animationView.setAnimation(R.raw.save_checked)
            animationView.loop(false)
            animationView.playAnimation()
        }
    }
}
