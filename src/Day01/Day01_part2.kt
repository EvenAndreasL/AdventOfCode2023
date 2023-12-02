package Day01

import println

fun main() {

    val numbs = "one|two|three|four|five|six|seven|eight|nine"

    fun parseMatch(input: String): Int {
        when(input){
            "one" -> return 1
            "two" -> return 2
            "three" -> return 3
            "four" -> return 4
            "five" -> return 5
            "six" -> return 6
            "seven" -> return 7
            "eight" -> return 8
            "nine" -> return 9
        }
        return input.toInt()
    }

    fun solve(input: List<String>, nums: String): Int {
        var result = 0
        input.forEach {
            val first = "\\d|$numbs".toRegex().findAll(it, 0).first().value
            val last = "\\d|${nums.reversed()}".toRegex().findAll(it.reversed(), 0).first().value
            result += parseMatch(first) * 10 + parseMatch(last.reversed())
        }
        return result
    }

    solve(readInput("Day01/Day01"), numbs).println()

/*
Old method
    fun toNumber(input: String): String{
        return input.replace("one" , "one1one").replace("two", "two2two").replace("three", "three3three").
        replace("four", "four4four").replace("five","five5five").replace("six","six6six").
        replace("seven","seven7seven").replace("eight","eight8eight").replace("nine","nine9nine")
    }
    fun sumList(input: List<String>): Int {
        var result = 0
        input.forEach{ it ->
            val line = toNumber(it)
            val number = line.first { it.isDigit() }.toString() +
                    line.last { it.isDigit() }.toString()
            result += number.toInt()
        }
        return result
    }
    sumList(readInput("Day01/Day01")).println()
*/

}
