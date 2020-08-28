package com.ali.simplecalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onBtnClicked(view: View) {

        resultText.append((view as Button).text.trim())
    }

    fun onOperatorClicked(view: View) {
        if (resultText.text.isEmpty())
            resultText.text = ""
        else resultText.append("\n${(view as Button).text.trim()}\n")
    }
}