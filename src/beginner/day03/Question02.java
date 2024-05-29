package beginner.day03;

import java.util.Arrays;

public class Question02 {

    public static class Solution {

        public int solution(int[] array) {
            int answer = 0;

            int[] array1 = Arrays.stream(array)
                    .sorted()
                    .toArray();

            answer = array1[array1.length / 2];

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] array1 = { 1, 2, 7, 10, 11 };
        int[] array2 = { 9, -1, 0 };

        System.out.println(solution.solution(array1));
        System.out.println(solution.solution(array2));
    }
}
