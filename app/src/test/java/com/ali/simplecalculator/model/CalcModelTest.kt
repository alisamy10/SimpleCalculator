package com.ali.simplecalculator.model

import org.hamcrest.core.Is.`is`
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class CalcModelTest {

lateinit var calcModel: CalcModel

    @Before
    fun init() {
        calcModel=CalcModel()
    }

    @Test
    fun add() {

        val result = calcModel.add(1.0,3.0)
        assertThat(result, `is`(4.0))
    }

    @Test
    fun subtract() {
        val result = calcModel.subtract(1.0,3.0)
        assertThat(result, `is`(-2.0))
    }

    @Test
    fun multiply() {
        val result = calcModel.multiply(1.0,3.0)
        assertThat(result, `is`(3.0))
    }

    @Test
    fun divided() {
        val result = calcModel.divided(6.0,3.0)
        assertThat(result, `is`(2.0))
    }
}