package beginner.day20

class Question04{

    fun solution(polynomial: String): String {
        var answer: StringBuilder = StringBuilder()

        val polynomials = polynomial.split(" + ")

        var xStr = ""
        val delimiter = "x"
        var const = 0
        var xConst = 0

        for (pol in polynomials) {
            if (pol.contains("x")) {
                if (pol == "x") xStr = "1x" else xStr = pol
                xConst += xStr.substringBefore(delimiter).toInt()

            } else const += pol.toInt()
        }

        when (polynomial.contains("x")) {
            true -> {
                if (xConst == 1) {
                    if (const == 0) {
                        answer.append("x")
                    } else {
                        answer.append("x").append(" + ").append(const)
                    }
                } else {
                    if (const == 0) {
                        answer.append(xConst).append("x")
                    } else {
                        answer.append(xConst).append("x + ").append(const)
                    }
                }
            }
            false -> {
                answer.append(const)
            }
        }

        return answer.toString()
    }
}

fun main() {

    val solution = Question04()

    println(solution.solution("3x + 7 + x"))
    println(solution.solution("x + x + x"))
}