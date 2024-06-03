package beginner.day07;

public class Question01 {

    public static class Solution {

        public String solution(String my_string, String letter) {
            StringBuilder answer = new StringBuilder();

            String[] split = my_string.split("");

            for (int i = 0; i < split.length; i++) {
                if (!split[i].equals(letter)) {
                    answer.append(split[i]);
                }
            }

            return answer.toString();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("abcdef", "f"));
        System.out.println(solution.solution("BCBdbe", "B"));
    }
}
