package beginner.day19

class Question03{

    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = 0

        for (i in array) {
            if (n == i) answer++
        }

        return answer
    }
}

fun main() {

    val solution = Question03()

    val array1 = intArrayOf(1, 1, 2, 3, 4, 5)
    val array2 = intArrayOf(0, 2, 3, 4)

    println(solution.solution(array1, 1))
    println(solution.solution(array2, 1))
}