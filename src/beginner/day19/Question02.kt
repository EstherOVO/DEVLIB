package beginner.day19

class Question02{

    fun solution(my_str: String, n: Int): Array<String> {
        val strList = mutableListOf<String>()

        strList.addAll(my_str.chunked(n))

        return strList.toTypedArray()
    }
}

fun main() {

    val solution = Question02()

    println(solution.solution("abc1Addfggg4556b", 6).contentToString())
    println(solution.solution("abcdef123", 3).contentToString())
}