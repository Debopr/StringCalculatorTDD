package com.example.stringcalculatortdd


class StringCalculator {
    fun add(numbers: String): Int {
        if (numbers.isEmpty()) return 0

        var delimiter = "[,\n]"  // Default delimiters: comma & newline
        var numString = numbers

        // Check for custom delimiter syntax "//[delimiter]\n[numbers]"
        if (numbers.startsWith("//")) {
            val parts = numbers.split("\n", limit = 2)
            delimiter = Regex.escape(parts[0].substring(2)) // Extract and escape delimiter
            numString = parts[1] // Get the actual numbers
        }

        val numList = numString.split(Regex(delimiter)).map { it.toInt() }

        // Check for negative numbers
        val negatives = numList.filter { it < 0 }
        if (negatives.isNotEmpty()) {
            throw IllegalArgumentException("negatives not allowed: ${negatives.joinToString(", ")}")
        }

        return numList.sum()
    }
}
