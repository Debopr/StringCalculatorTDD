package com.example.stringcalculatortdd

import org.junit.Assert.assertEquals
import org.junit.Test

class StringCalculatorTest {
    private val calculator = StringCalculator()

    @Test
    fun `returns 0 for an empty string`() {
        assertEquals(0, calculator.add(""))
    }
}