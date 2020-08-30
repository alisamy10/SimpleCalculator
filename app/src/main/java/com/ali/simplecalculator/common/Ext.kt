package com.ali.simplecalculator.common

fun String.getNumber(): Array<String> {
    var opr = arrayOf<String>()

    when {
        this.contains("+") -> {
            opr = this.split("\\+".toRegex()).toTypedArray()
        }
        this.contains("-") -> {
            opr = this.split("-".toRegex()).toTypedArray()
        }
        this.contains("/") -> {
            opr = this.split("/".toRegex()).toTypedArray()
        }
        this.contains("*") -> {
            opr = this.split("\\*".toRegex()).toTypedArray()
        }
    }
    return opr
}