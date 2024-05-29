package basic.day24;

import java.util.Arrays;

public class Question03 {

    public static class Solution {

        public int[] solution(int[] arr, int k) {
            int[] answer = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                if (k % 2 == 1) {
                    answer[i] = arr[i] * k;
                } else {
                    answer[i] = arr[i] + k;
                }
            }
            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] arr = { 1, 2, 3, 100, 99, 98 };

        System.out.println(Arrays.toString(solution.solution(arr, 3)));
        System.out.println(Arrays.toString(solution.solution(arr, 2)));
    }
}
