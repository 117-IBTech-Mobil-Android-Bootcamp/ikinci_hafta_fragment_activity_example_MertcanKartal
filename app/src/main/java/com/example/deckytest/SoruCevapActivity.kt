package com.example.deckytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_soru_cevap.*

class SoruCevapActivity : AppCompatActivity() {

    var progressStatus = 0
    var handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soru_cevap)

        //taking datas with intent
        val intent = intent
        val word = intent.getStringExtra("word")
        val wordList = intent.getStringArrayListExtra("answers")

        //assign textview with incoming datas <---
        mainWord.text = word

        cardFirstTextView.text=wordList?.get(0)
        cardSecondTextView.text=wordList?.get(1)
        cardThirdTextView.text=wordList?.get(2)
        cardFourthTextView.text=wordList?.get(3)
        // --->


        //create circle progressBar with timer
        progressBar1.progress = 0
        progressStatus = 0

        // set up max value for progress bar
        progressBar1.max = 2000

        Thread(Runnable {
            while (progressStatus < 2000){
                // update progress status
                progressStatus +=100
                // sleep the thread for 10 milliseconds
                Thread.sleep(1000)

                // update the progress bar
                handler.post {
                    progressBar1.progress = progressStatus

                    // show the progress on text view
                    progressText.text = "${progressStatus/100} sn"

                }
            }
        }).start()

    }
}