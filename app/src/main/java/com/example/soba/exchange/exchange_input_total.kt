package com.example.soba.exchange

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.example.soba.R
import kotlinx.android.synthetic.main.fragment_exchange_input_total.*
import android.util.Log
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_exchange_input_total.view.*

var totalNumber: Int = 0

class exchange_input_total : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


        ): View? {
        val view = inflater.inflate(R.layout.fragment_exchange_input_total, container, false)
        view.nextButtonTotal.setOnClickListener {
            if (inputTotalNumber.text != null) {
                //　次へボタン を押したときに数字が入力されていれば、その数字を取得
                totalNumber = inputTotalNumber.text.toString().toInt()
            }
            findNavController().navigate(R.id.action_exchange_input_total_to_exchange_input_name)
    }
        return view
    }
}
