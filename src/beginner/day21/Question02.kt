package beginner.day21

class Question02 {

    fun solution(board: Array<IntArray>): Int {
        var answer: Int = 0

        for (i in 0 until board.size) {
            for (j in 0 until board[i].size) {
                if (board[i][j] == 1) {
                    boomPoint(board, i, j)
                }
            }
        }

        board.forEach {
            answer += it.filter {
                it == 0
            }.count()
        }

        return answer
    }
}

fun boomPoint(board: Array<IntArray>, row: Int, col: Int) {

    val fromRow = if (row - 1 < 0) row else row - 1
    val toRow = if (row + 1 >= board.size) row else row + 1
    val fromCol = if (col - 1 < 0) col else col - 1
    val toCol = if (col + 1 >= board.size) col else col + 1

    for (i in fromRow..toRow) {
        for (j in fromCol..toCol) {
            if (board[i][j] == 0) board[i][j] = -1
        }
    }
}

fun main() {

    val solution = Question02()

    val board1 = arrayOf(intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 1, 0, 0), intArrayOf(0, 0, 0, 0, 0))
    val board2 = arrayOf(intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 1, 1, 0), intArrayOf(0, 0, 0, 0, 0))
    val board3 = arrayOf(intArrayOf(1, 1, 1, 1, 1, 1), intArrayOf(1, 1, 1, 1, 1, 1), intArrayOf(1, 1, 1, 1, 1, 1), intArrayOf(1, 1, 1, 1, 1, 1), intArrayOf(1, 1, 1, 1, 1, 1), intArrayOf(1, 1, 1, 1, 1, 1))

    println(solution.solution(board1))
    println(solution.solution(board2))
    println(solution.solution(board3))
}