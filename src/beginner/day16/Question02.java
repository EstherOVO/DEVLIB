package beginner.day16;

import java.util.Arrays;

public class Question02 {

    public static class Solution {

        public int[] solution(int[] array) {
            int[] answer = new int[2];

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) max = array[i];
            }

            for (int i = 0; i < array.length; i++) {
                if (max == array[i]) {
                    answer[0] = array[i];
                    answer[1] = i;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] array1 = { 1, 8, 3 };
        int[] array2 = { 9, 10, 11, 8 };

        System.out.println(Arrays.toString(solution.solution(array1)));
        System.out.println(Arrays.toString(solution.solution(array2)));
    }
}
