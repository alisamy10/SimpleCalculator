package com.ali.simplecalculator.ui.view

import com.ali.simplecalculator.ui.ICompleteListener

interface ICalcView {
    fun getNumber1(): Double
    fun getNumber2(): Double
    fun subScribe(iCompleteListener: ICompleteListener)
    fun update(result: Double)
}