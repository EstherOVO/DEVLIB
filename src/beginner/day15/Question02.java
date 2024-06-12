package beginner.day15;

import java.util.Arrays;

public class Question02 {

    public static class Solution {

        public String solution(String my_string, int num1, int num2) {

            String[] split = my_string.split("");
            String temp = "";

            temp = split[num1];
            split[num1] = split[num2];
            split[num2] = temp;

            return Arrays.stream(split).reduce(String::concat).get();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("hello", 1, 2));
        System.out.println(solution.solution("I love you", 3, 6));
    }
}
