package beginner.day18;

import java.util.Arrays;

public class Question04 {

    public static class Solution {

        public String solution(String my_string) {

            return Arrays.stream(my_string.split(""))
                    .map(String::toLowerCase)
                    .sorted()
                    .reduce(String::concat)
                    .get();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("Bcad"));
        System.out.println(solution.solution("heLLo"));
        System.out.println(solution.solution("Python"));
    }
}
