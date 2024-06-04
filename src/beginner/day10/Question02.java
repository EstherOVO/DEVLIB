package beginner.day10;

import java.util.Arrays;

public class Question02 {

    public static class Solution {

        public int[][] solution(int[] num_list, int n) {
            int[][] answer = new int[num_list.length / n][n];

            int count = 0;
            for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < n; j++) {
                    answer[i][j] = num_list[count];
                    count++;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] num_list1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] num_list2 = { 100, 95, 2, 4, 5, 6, 18, 33, 948 };

        System.out.println(Arrays.deepToString(solution.solution(num_list1, 2)));
        System.out.println(Arrays.deepToString(solution.solution(num_list2, 3)));
    }
}
