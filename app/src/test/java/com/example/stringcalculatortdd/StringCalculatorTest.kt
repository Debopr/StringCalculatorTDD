package com.example.stringcalculatortdd

import org.junit.Assert.assertEquals
import org.junit.Test

class StringCalculatorTest {
    private val calculator = StringCalculator()

    @Test
    fun `returns 0 for an empty string`() {
        assertEquals(0, calculator.add(""))
    }
    @Test
    fun `returns the number itself when only one number is passed`() {
        assertEquals(2, calculator.add("2"))
    }
    @Test
    fun `returns the sum of two numbers`() {
        assertEquals(4, calculator.add("1,3"))
    }

}