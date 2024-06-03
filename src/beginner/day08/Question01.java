package beginner.day08;

import java.util.Arrays;

public class Question01 {

    public static class Solution {

        public int[] solution(int[] numbers, int num1, int num2) {

            return numbers = Arrays.copyOfRange(numbers, num1, num2 + 1);
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] numbers1 = { 1, 2, 3, 4, 5 };
        int[] numbers2 = { 1, 3, 5 };

        System.out.println(Arrays.toString(solution.solution(numbers1, 1, 3)));
        System.out.println(Arrays.toString(solution.solution(numbers2, 1, 2)));
    }
}
