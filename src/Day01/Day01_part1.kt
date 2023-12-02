package Day01

fun main() {

    fun solve(input: List<String>, rx: Regex): Int {
        var result = 0
        input.forEach {
            val first = rx.findAll(it, 0).first().value
            val last = rx.findAll(it, 0).last().value
           result += first.toInt() * 10 + last.toInt()
        }
        return result
    }

    solve(readInput("Day01/Day01"), Regex("\\d")).println()

/*
    fun sumList(input: List<String>): Int {
        var result = 0
        input.forEach{ it ->
            val number = it.first { it.isDigit() }.toString() + it.last { it.isDigit() }.toString()
            result += number.toInt()
        }
        return result
    }
    sumList(readInput("Day01/Day01")).println()
*/
}