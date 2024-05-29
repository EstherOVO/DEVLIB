package beginner.day02;

import java.util.Arrays;

public class Question04 {

    public static class Solution {

        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                answer[i] = numbers[i] * 2;
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] numbers1 = { 1, 2, 3, 4, 5 };
        int[] numbers2 = { 1, 2, 100, -99, 1, 2, 3 };

        System.out.println(Arrays.toString(solution.solution(numbers1)));
        System.out.println(Arrays.toString(solution.solution(numbers2)));
    }
}
