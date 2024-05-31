package beginner.day06;

public class Question04 {

    public static class Solution {

        public String solution(String my_string, int n) {
            StringBuilder answer = new StringBuilder();

            String[] split = my_string.split("");

            for (int i = 0; i < split.length; i++) {
                for (int j = 0; j < n; j++) {
                    answer.append(split[i]);
                }
            }

            return answer.toString();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("hello", 3));
    }
}
