package com.example.thetimecalculatorprogram
class Operation(var stringOne: String, var stringTwo: String) {
    fun conversionSeconds(string: String): Int {
        var indexHour = 0
        var indexMinutes = 0
        var indexSecond = 0
        var secHour = 0
        var secMinutes = 0
        var secSecond = 0
        for (char in string) {
            if (char == 'h') {
                indexHour = string.indexOf("h")
                val stringHour = string.substring(0, indexHour).trim()
                secHour = stringHour.toInt() * 3600
            }
            if (char == 'm') {
                indexMinutes = string.indexOf("m")
                val stringMinutes = string.substring(indexHour + 1, indexMinutes).trim()
                secMinutes = stringMinutes.toInt() * 60
            }
            if (char == 's') {
                indexSecond = string.indexOf("s")
                val stringSecond = string.substring(indexMinutes + 1, indexSecond).trim()
                secSecond = stringSecond.toInt()
            }
        }
        val second = secHour + secMinutes + secSecond
        return second
    }
    fun sum(): String {
        var totalSec = conversionSeconds(stringOne) + conversionSeconds(stringTwo)
        val hours = totalSec / 3600
        val minutes = (totalSec % 3600) / 60
        val seconds = totalSec % 60
        return "$hours h $minutes m $seconds s"
    }
    fun div(): String {
        var totalS = conversionSeconds(stringOne) - conversionSeconds(stringTwo)
        val hours = totalS / 3600
        val minutes = (totalS % 3600) / 60
        val seconds = totalS % 60
        return "$hours h $minutes m $seconds s"
    }


}