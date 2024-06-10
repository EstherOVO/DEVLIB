package beginner.day13;

import java.util.Arrays;

public class Question03 {

    public static class Solution {

        public String solution(String my_string) {
            String answer = my_string;

            String[] split = answer.split("");
            answer = Arrays.stream(split).distinct().reduce(String::concat).get();

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("people"));
        System.out.println(solution.solution("We are the world"));
    }
}
