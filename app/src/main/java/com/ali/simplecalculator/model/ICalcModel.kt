package com.ali.simplecalculator.model

interface ICalcModel {

    fun add(num1: Double, num2: Double): Double
    fun subtract(num1: Double, num2: Double): Double
    fun multiply(num1: Double, num2: Double): Double
    fun divided(num1: Double, num2: Double): Double
}