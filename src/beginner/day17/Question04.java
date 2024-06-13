package beginner.day17;

import java.util.Arrays;

public class Question04 {

    public static class Solution {

        public String[] solution(String[] quiz) {
            String[] answer = new String[quiz.length];

            for (int i = 0; i < quiz.length; i++) {

                String[] split = quiz[i].split(" ");

                int x = Integer.parseInt(split[0]);
                int y = Integer.parseInt(split[2]);
                int z = Integer.parseInt(split[4]);

                switch (split[1]) {
                    case "+" -> answer[i] = x + y == z ? "O" : "X";
                    case "-" -> answer[i] = x - y == z ? "O" : "X";
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] quiz1 = { "3 - 4 = -3", "5 + 6 = 11" };
        String[] quiz2 = { "19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2" };

        System.out.println(Arrays.toString(solution.solution(quiz1)));
        System.out.println(Arrays.toString(solution.solution(quiz2)));
    }
}
