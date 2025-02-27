package com.example.stringcalculatortdd

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
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

    @Test
    fun `returns the sum of multiple numbers`() {
        assertEquals(6, calculator.add("1,2,3"))
        assertEquals(10, calculator.add("1,2,3,4"))
    }

    @Test
    fun `handles new lines between numbers`() {
        assertEquals(6, calculator.add("1\n2,3"))
        assertEquals(10, calculator.add("1,2\n3,4"))
    }

    @Test
    fun `handles custom delimiters`() {
        assertEquals(3, calculator.add("//;\n1;2"))
        assertEquals(6, calculator.add("//#\n1#2#3"))
    }
    @Test
    fun `throws exception for negative numbers`() {
        val exception = assertThrows(IllegalArgumentException::class.java) {
            calculator.add("1,-2,3")
        }
        assertEquals("negatives not allowed: -2", exception.message)
    }





}