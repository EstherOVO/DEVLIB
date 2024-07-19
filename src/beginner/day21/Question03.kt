package beginner.day21

import kotlin.math.max
import kotlin.math.min

class Question03{

    fun solution(sides: IntArray): Int {
        var answer: Int = 0

        val max = max(sides[0], sides[1])
        val min = min(sides[0], sides[1])
        val anotherLengthList1 = mutableListOf<Int>()
        val anotherLengthList2 = mutableListOf<Int>()

        for (i in 1..2000) {
            if (i + min > max && i <= max) anotherLengthList1.add(i)
            if (i < max + min && i > max) anotherLengthList2.add(i)
        }

        return anotherLengthList1.size + anotherLengthList2.size
    }
}

fun main() {

    val solution = Question03()

    val sides1 = intArrayOf(1, 2)
    val sides2 = intArrayOf(3, 6)
    val sides3 = intArrayOf(11, 7)

    println(solution.solution(sides1))
    println(solution.solution(sides2))
    println(solution.solution(sides3))
}