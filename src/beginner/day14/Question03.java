package beginner.day14;

public class Question03 {

    public static class Solution {

        public String solution(String cipher, int code) {
            StringBuilder answer = new StringBuilder();

            String[] split = cipher.split("");

            for (int i = code - 1; i < split.length; i += code) {
                answer.append(split[i]);
            }

            return answer.toString();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("dfjardstddetckdaccccdegk", 4));
        System.out.println(solution.solution("pfqallllabwaoclk", 2));
    }
}
