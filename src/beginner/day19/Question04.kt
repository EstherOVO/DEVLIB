package beginner.day19

class Question04{

    fun solution(array: IntArray, height: Int): Int {
        var answer: Int = 0

        for (i in array) {
            if (height < i) answer++
        }

        return answer
    }
}

fun main() {

    val solution = Question04()

    val array1 = intArrayOf(149, 180, 192, 170)
    val array2 = intArrayOf(180, 120, 140)

    println(solution.solution(array1, 167))
    println(solution.solution(array2, 190))
}