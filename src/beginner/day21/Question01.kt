package beginner.day21

class Question01{

    fun solution(my_string: String): Int {
        var answer: Int = 0

        val delimiter = Regex("[a-zA-Z]")

        val strs = my_string.split(delimiter)

        for (str in strs) {
            if (str != "") answer += str.toInt()
        }

        return answer
    }
}

fun main() {

    val solution = Question01()

    println(solution.solution("aAb1B2cC34oOp"))
    println(solution.solution("1a2b3c4d123Z"))
}