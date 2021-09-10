package com.example.deckytest

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_word_test.*

class WordTestFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_word_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        //sending data = question asked ->word  answers->answer words
        start_button.setOnClickListener {
            val word : String = "Visualize"
            val answers = ArrayList<String>()
            answers.add("Görselleştirmek")
            answers.add("Altında")
            answers.add("Bağış")
            answers.add("Ensülin")

        //sending datas with intent
            val intent = Intent(context,QuestionAnswerActivity::class.java)
            intent.putStringArrayListExtra("answers",answers)
            intent.putExtra("word",word)
            startActivity(intent)
        }

        super.onViewCreated(view, savedInstanceState)
    }
}