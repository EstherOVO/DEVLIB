package beginner.day14;

import java.util.Arrays;

public class Question01 {

    public static class Solution {

        public int solution(int[] array, int n) {
            int answer = 0;

            Arrays.sort(array);

            int gapMin = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                int abs = Math.abs(array[i] - n);
                if (gapMin > abs) {
                    gapMin = abs;
                    answer = array[i];
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] array1 = { 3, 10, 28 };
        int[] array2 = { 10, 11, 12 };

        System.out.println(solution.solution(array1, 20));
        System.out.println(solution.solution(array2, 13));
    }
}
