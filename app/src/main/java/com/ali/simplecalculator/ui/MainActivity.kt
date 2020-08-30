package com.ali.simplecalculator.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.ali.simplecalculator.R
import com.ali.simplecalculator.common.getNumber
import com.ali.simplecalculator.ui.presenter.PresenterInjector
import com.ali.simplecalculator.ui.view.ICalcView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ICalcView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PresenterInjector.injectPresenter(this)
    }

    fun onBtnClicked(view: View) {

        resultText.append((view as Button).text.trim())
    }

    fun onOperatorClicked(view: View) {
        if (resultText.text.isEmpty())
            resultText.text = ""
        else resultText.append("\n${(view as Button).text.trim()}\n")
    }

    override fun getNumber1(): Double {
        val number: String = resultText.text.toString().trim()

        return number.getNumber()[0].trim().toDouble()
    }

    override fun getNumber2(): Double {
        val number: String = resultText.text.toString().trim()

        return number.getNumber()[1].trim().toDouble()
    }


    override fun update(result: Double) {
       resultText.text="$result"
    }
}