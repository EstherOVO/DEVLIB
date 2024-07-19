package beginner.day22

import kotlin.math.abs

class Question02{

    fun solution(dots: Array<IntArray>): Int {

        val x1 = dots[0][0]
        val y1 = dots[0][1]
        val x2 = dots[1][0]
        val y2 = dots[1][1]
        val x3 = dots[2][0]
        val y3 = dots[2][1]
        val x4 = dots[3][0]
        val y4 = dots[3][1]

        if (abs((x1 - x2) * (y3 - y4)) == abs((y1 - y2) * (x3 - x4))) return 1
        if (abs((x1 - x3) * (y2 - y4)) == abs((y1 - y3) * (x2 - x4))) return 1
        if (abs((x1 - x4) * (y2 - y3)) == abs((y1 - y4) * (x2 - x3))) return 1

        return 0
    }
}

fun main() {

    val solution = Question02()

    val dots1 = arrayOf(intArrayOf(1, 4), intArrayOf(9, 2), intArrayOf(3, 8), intArrayOf(11, 6))
    val dots2 = arrayOf(intArrayOf(3, 5), intArrayOf(4, 1), intArrayOf(2, 4), intArrayOf(5, 10))

    println(solution.solution(dots1))
    println(solution.solution(dots2))
}