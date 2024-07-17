package beginner.day20

import kotlin.math.abs

class Question01{

    fun solution(dots: Array<IntArray>): Int {

        var maxWidth = Int.MIN_VALUE
        var minWidth = Int.MAX_VALUE
        var maxLength = Int.MIN_VALUE
        var minLength = Int.MAX_VALUE

        for (i in dots) {
            if (maxWidth < i[0]) maxWidth = i[0]
            if (minWidth > i[0]) minWidth = i[0]
            if (maxLength < i[1]) maxLength = i[1]
            if (minLength > i[1]) minLength = i[1]
        }

        return (maxWidth - minWidth) * (maxLength - minLength)
    }
}

fun main() {

    val solution = Question01()

    val dots1 = arrayOf(intArrayOf(1, 1), intArrayOf(2, 1), intArrayOf(2, 2), intArrayOf(1, 2))
    val dots2 = arrayOf(intArrayOf(-1, -1), intArrayOf(1, 1), intArrayOf(1, -1), intArrayOf(-1, 1))

    println(solution.solution(dots1))
    println(solution.solution(dots2))
}