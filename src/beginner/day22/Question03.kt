package beginner.day22

import kotlin.math.abs

class Question03{

    fun solution(lines: Array<IntArray>): Int {

        val firstLine = mutableListOf<Int>()
        val secondLine = mutableListOf<Int>()
        val thirdLine = mutableListOf<Int>()

        val firSecLines = mutableSetOf<Int>().toMutableList()
        val secThirdLines = mutableSetOf<Int>().toMutableList()

        for(i in lines.indices){
            for (j in lines[i][0]..lines[i][1]) {
                if (i == 0) firstLine.add(j)
                if (i == 1) secondLine.add(j)
                if (i == 2) thirdLine.add(j)
            }
        }

        for(i in firstLine){
            for(j in secondLine){
                if(i == j) firSecLines.add(i)
            }
        }
        for(i in secondLine){
            for(j in thirdLine){
                if(i == j) secThirdLines.add(i)
            }
        }

        val firstLength = if (firSecLines.size >= 2) (abs(firSecLines[firSecLines.size - 1]) - abs(firSecLines[0])) else 0
        val secondLength = if (secThirdLines.size >= 2) (abs(secThirdLines[secThirdLines.size - 1]) - abs(secThirdLines[0])) else 0

        return firstLength + secondLength
    }
}

fun main() {

    val solution = Question03()

    val lines1 = arrayOf(intArrayOf(0, 1), intArrayOf(2, 5), intArrayOf(3, 9))
    val lines2 = arrayOf(intArrayOf(-1, 1), intArrayOf(1, 3), intArrayOf(3, 9))
    val lines3 = arrayOf(intArrayOf(0, 5), intArrayOf(3, 9), intArrayOf(1, 10))

    val lines4 = arrayOf(intArrayOf(0, 5), intArrayOf(4, 9), intArrayOf(1, 10))

    println(solution.solution(lines1))
    println(solution.solution(lines2))
    println(solution.solution(lines3))

    println(solution.solution(lines4))
}