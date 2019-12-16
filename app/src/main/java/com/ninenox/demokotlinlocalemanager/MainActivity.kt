package com.ninenox.demokotlinlocalemanager

import android.os.Bundle
import com.ninenox.kotlinlocalemanager.AppCompatActivityBase
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivityBase() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        th_button.setOnClickListener {
            setNewLocale("th")
        }

        en_button.setOnClickListener {
            setNewLocale("en")
        }

        addFragment()
    }

    fun addFragment() {
        val mFragmentManager = supportFragmentManager
        val fragmentTransaction =
            mFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_frame_layout, BlankFragment()).commit()


    }
}
