package com.ali.simplecalculator.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.ali.simplecalculator.R
import com.ali.simplecalculator.common.getNumbers
import com.ali.simplecalculator.ui.presenter.PresenterInjector
import com.ali.simplecalculator.ui.view.ICalcView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), ICalcView {

    private val iCompleteListeners = ArrayList<ICompleteListener>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PresenterInjector.injectPresenter(this)
        equalBtn.setOnClickListener{
            onEqualClicked()
        }
        clearBtn.setOnClickListener{
            onClearClicked()
        }
        pointBtn.setOnClickListener{
            onDotClicked()
        }
    }

    private fun onDotClicked() {
        if (resultText.text.isEmpty())
            resultText.text = "0"
        else if (!resultText.text.toString().contains("."))
            resultText.append(".")
    }

    private fun onClearClicked() {
        resultText.text = ""
    }

    private fun onEqualClicked() {
        val text: String = resultText.text.toString().trim()
        when {
            text.contains("+") -> {
                for (listener in iCompleteListeners) {
                    listener.add()
                }
            }
            text.contains("-") -> {
                for (listener in iCompleteListeners) {
                    listener.subtract()
                }
            }
            text.contains("*") -> {
                for (listener in iCompleteListeners) {
                    listener.multiply()
                }
            }
            text.contains("/") -> {
                for (listener in iCompleteListeners) {
                    listener.divide()
                }
            }
        }
    }

    fun onBtnClicked(view: View) {

        resultText.append((view as Button).text.trim())
    }

    fun onOperatorClicked(view: View) {



        if (resultText.text.isEmpty())
            resultText.text = ""
        else{
            Log.e("a", resultText.text.toString())
            resultText.append("\n${(view as Button).text.trim()}\n")
        }
    }

    override fun getNumber1(): Double {
        val number: String = resultText.text.toString().trim()

        return number.getNumbers()[0].trim().toDouble()
    }

    override fun getNumber2(): Double {
        val number: String = resultText.text.toString().trim()

        return number.getNumbers()[1].trim().toDouble()
    }


    // subscribe to every equal to know the operation and update the result
    override fun subScribe(iCompleteListener: ICompleteListener) {
        iCompleteListeners.add(iCompleteListener)
    }

    override fun update(result: Double) {
       resultText.text="$result"
    }
}