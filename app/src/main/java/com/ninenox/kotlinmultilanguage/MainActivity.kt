package com.ninenox.kotlinmultilanguage

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivityBase() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        change_language_th_button.setOnClickListener {
            setNewLocale("TH",true)
        }
        change_language_en_button.setOnClickListener {
            setNewLocale("EN",true)
        }
    }

    private fun setNewLocale(
        language: String,
        restartProcess: Boolean
    ): Boolean {
        App.localeManager!!.setNewLocale(this, language)
        val i = Intent(this, MainActivity::class.java)
        startActivity(i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK))
        if (restartProcess) {
            System.exit(0)
        } else {
            Toast.makeText(this, "Activity restarted", Toast.LENGTH_LONG).show()
        }
        return true
    }
}
