package com.ali.simplecalculator.ui

import com.ali.simplecalculator.model.ICalcModel
import com.ali.simplecalculator.ui.view.ICalcView

class CalcPresenter(private val iCalcView: ICalcView,private val iCalcModel: ICalcModel) : ICompleteListener {


    init {
        iCalcView.subScribe(this)
    }



    override fun add() {
        iCalcView.update(iCalcModel.add(iCalcView.getNumber1(),iCalcView.getNumber2()))

    }

    override fun subtract() {
        iCalcView.update(iCalcModel.subtract(iCalcView.getNumber1(),iCalcView.getNumber2()))

    }

    override fun multiply() {
        iCalcView.update(iCalcModel.multiply(iCalcView.getNumber1(),iCalcView.getNumber2()))

    }

    override fun divide() {
            try {
                iCalcView.update(iCalcModel.divided(iCalcView.getNumber1(), iCalcView.getNumber2()))
            }catch (e:Exception){
                 e.printStackTrace()
            }
    }
}