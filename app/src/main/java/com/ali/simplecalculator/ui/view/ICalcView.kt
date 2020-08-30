package com.ali.simplecalculator.ui.view


interface ICalcView {
    fun getNumber1(): Double
    fun getNumber2(): Double
    fun update(Result: Double)
}