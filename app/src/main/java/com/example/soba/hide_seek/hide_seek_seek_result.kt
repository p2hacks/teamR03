package com.example.soba.hide_seek


import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.findNavController

import com.example.soba.R
import kotlinx.android.synthetic.main.fragment_hide_seek_seek_result.*
import kotlinx.android.synthetic.main.fragment_hide_seek_seek_result.view.*


/**
 * A simple [Fragment] subclass.
 */
class hide_seek_seek_result : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hide_seek_seek_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        back_to_home_button.setOnClickListener {
            for (i in 0..4){
                findNavController().popBackStack()
            }
        }
        //sharedPreferencesで保存したファイルの読み取りと表示
        val pref = activity?.getSharedPreferences("sharedHidePlace", Context.MODE_PRIVATE)
        val stringValue = pref?.getString("hidePlace", "スマホのもちぬしにきいてね")
        view.result_place.text = stringValue
    }
}
