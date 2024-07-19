package beginner.day21

class Question04{

    fun solution(spell: Array<String>, dic: Array<String>): Int {

        val containsOrNot = dic.asSequence().any { word ->
            spell.asSequence().all { alphabet ->
                word.contains(alphabet)
            }
        }

        return if (containsOrNot) 1 else 2
    }
}

fun main() {

    val solution = Question04()

    val spell1 = arrayOf("p", "o", "s")
    val dic1 = arrayOf("sod", "eocd", "qixm", "adio", "soo")

    val spell2 = arrayOf("z", "d", "x")
    val dic2 = arrayOf("def", "dww", "dzx", "loveaw")

    val spell3 = arrayOf("s", "o", "m", "d")
    val dic3 = arrayOf("moos", "dzx", "smm", "sunmmo", "som")

    println(solution.solution(spell1, dic1))
    println(solution.solution(spell2, dic2))
    println(solution.solution(spell3, dic3))
}