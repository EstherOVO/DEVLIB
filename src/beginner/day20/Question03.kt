package beginner.day20

class Question03{

    fun solution(numbers: IntArray): Int {
        var answer: Int = Int.MIN_VALUE

        for (i1 in numbers.indices) {
            if (i1 < numbers.size - 1) {
                for (i2 in (i1 + 1)..(numbers.size - 1)) {
                    if (answer < numbers[i1] * numbers[i2]) answer = numbers[i1] * numbers[i2]
                }
            }
        }

        return answer
    }
}

fun main() {

    val solution = Question03()

    val numbers1 = intArrayOf(1, 2, -3, 4, -5)
    val numbers2 = intArrayOf(0, -31, 24, 10, 1, 9)
    val numbers3 = intArrayOf(10, 20, 30, 5, 5, 20, 5)

    println(solution.solution(numbers1))
    println(solution.solution(numbers2))
    println(solution.solution(numbers3))
}