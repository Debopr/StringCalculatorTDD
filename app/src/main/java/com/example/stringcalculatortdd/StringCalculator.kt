package com.example.stringcalculatortdd

class StringCalculator {
    fun add(numbers: String): Int {
        if (numbers.isEmpty()) return 0
        return numbers
            .split(",", "\n").sumOf { it.toInt() }
    }
}