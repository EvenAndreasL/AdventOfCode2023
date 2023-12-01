fun main() {

    fun sumList(input: List<String>): Int {
        var result = 0
        input.forEach{ it ->
            val number = it.first { it.isDigit() }.toString() + it.last { it.isDigit() }.toString()
            result += number.toInt()
        }
        return result
    }

    sumList(readInput("Day01")).println()
}