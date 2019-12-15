package com.example.soba.exchange

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.soba.R
import kotlinx.android.synthetic.main.fragment_exchange_input_name.*
import kotlinx.android.synthetic.main.fragment_exchange_input_name.view.*

// 名前のarrayList
val nameList =  mutableListOf<String>()


class exchange_input_name : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this
        val view = inflater.inflate(R.layout.fragment_exchange_input_name, container, false)
        var remaining = totalNumber
        view.addNameButton.setOnClickListener {
            // 参加人数より入力された名前が少ないとき
            if (totalNumber > nameList.size) {
                // テキストボックスに名前が入力されているとき
                if (inputName.text != null) {
                    // Listに名前を追加
                    nameList.add(inputName.text.toString())
                    inputName.text = null
                    remaining -= 1
                    view.remainingNumber.text = "残り" + remaining.toString() + "人"
                }
            }
        }
        view.nextButtonName.setOnClickListener{
            findNavController().navigate(R.id.action_exchange_input_name_to_exchange_explanation)
        }
        return view
    }
}
