package beginner.day20

import kotlin.math.abs

class Question02{

    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0, 0)

        var xLimit = board[0] / 2
        var yLimit = board[1] / 2

        for (input in keyinput) {
            when (input) {
                "left" -> if (abs(answer[0] - 1) <= xLimit) answer[0]--
                "right" -> if (abs(answer[0] + 1) <= xLimit) answer[0]++
                "up" -> if (abs(answer[1] + 1) <= yLimit) answer[1]++
                "down" -> if (abs(answer[1] - 1) <= yLimit) answer[1]--
            }
        }

        return answer
    }
}

fun main() {

    val solution = Question02()

    val keyinput1 = arrayOf("left", "right", "up", "right", "right")
    val board1 = intArrayOf(11, 11)

    val keyinput2 = arrayOf("down", "down", "down", "down", "down")
    val board2 = intArrayOf(7, 9)

    println(solution.solution(keyinput1, board1).contentToString())
    println(solution.solution(keyinput2, board2).contentToString())
}