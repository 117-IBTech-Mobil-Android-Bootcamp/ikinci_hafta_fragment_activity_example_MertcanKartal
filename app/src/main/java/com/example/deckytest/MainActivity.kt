package com.example.deckytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //-> you can use it
        // supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,KelimeTestiFragment()).commit()

        //add fragment with extension func
        supportFragmentManager.inTransaction {
            replace(R.id.fragmentContainer, KelimeTestiFragment())
        }
    }
}