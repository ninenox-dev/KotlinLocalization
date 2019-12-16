package com.ninenox.demokotlinlocalemanager

import androidx.appcompat.app.AppCompatActivity
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
    }
}
