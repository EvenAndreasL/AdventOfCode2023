fun main() {

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



    sumList(readInput("Day01")).println()
}