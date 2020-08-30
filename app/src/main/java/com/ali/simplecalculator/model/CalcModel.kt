package com.ali.simplecalculator.model

class CalcModel : ICalcModel {
    override fun add(num1: Double, num2: Double): Double {
        return num1 + num2
    }

    override fun subtract(num1: Double, num2: Double): Double {
        return num1 - num2
    }

    override fun multiply(num1: Double, num2: Double): Double {
        return num1 * num2
    }

    override fun divided(num1: Double, num2: Double): Double {

        return if (num2 != 0.0) num1 / num2 else throw IllegalArgumentException("Can`t Divide By Zero")
        //        return 0.0;
    }
}
