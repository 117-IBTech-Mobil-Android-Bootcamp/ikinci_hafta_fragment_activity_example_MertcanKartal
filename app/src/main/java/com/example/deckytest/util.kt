package com.example.deckytest

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


//add fragment shortcut (extension function)
inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> Unit) {
    val fragmentTransaction = beginTransaction()
    fragmentTransaction.func()
    fragmentTransaction.commit()
}