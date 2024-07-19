package beginner.day22

class Question01{

    fun solution(n: Int): Int {
        var answer: Int = 0

        val map = mutableMapOf<Int,Int>()

        for (key in 1..100) {

            while (key <= 100) {

                answer++

                if (answer.toString().contains("3")
                    || answer % 3 == 0) {
                    continue
                }

                map[key] = answer
                break
            }

            if (key == n) {
                answer = map[key]!!
                break
            }
        }

        return answer
    }
}

fun main() {

    val solution = Question01()

    println(solution.solution(15))
    println(solution.solution(40))
}