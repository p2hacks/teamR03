package com.example.soba.hide_seek.hide_seek_sample


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.soba.R
import kotlinx.android.synthetic.main.fragment_hide_seek_question_sample_1.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [hide_seek_question_sample_1.newInstance] factory method to
 * create an instance of this fragment.
 */
class hide_seek_question_sample_1 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_hide_seek_question_sample_1, container, false)
        // 問1ボタンを押したときの遷移処理
        view.input_sample_1_button.setOnClickListener {
            findNavController().navigate(R.id.action_hide_seek_question_sample_1_to_hide_seek_question_sample_1_input_1)
        }
        // 問2ボタンを押したときの遷移処理
        view.input_sample_2_button.setOnClickListener {
            findNavController().navigate(R.id.action_hide_seek_question_sample_1_to_hide_seek_question_sample_1_input_2)
        }
        // 問3ボタンを押したときの遷移処理
        view.input_sample_3_button.setOnClickListener {
            findNavController().navigate(R.id.action_hide_seek_question_sample_1_to_hide_seek_question_sample_1_input_3)
        }
        return view
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment hide_seek_question_sample_1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            hide_seek_question_sample_1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
