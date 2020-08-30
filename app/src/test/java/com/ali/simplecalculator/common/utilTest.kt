package com.ali.simplecalculator.common

import org.hamcrest.core.Is.`is`
import org.junit.Test

import org.junit.Assert.*

class utilTest {

    @Test
    fun getNumber() {
        // arrange
        val number = "6 + 4"
        // act
            var expected=number.getNumbers()

        // assert
       assertThat(expected[0].trim(), `is`("6"))
        assertThat(expected[1].trim(), `is`("4"))

    }
}