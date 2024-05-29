package basic.day25;

import java.util.Arrays;

public class Question01 {

    public static class Solution {

        public int[][] solution(int n) {
            int[][] answer = new int[n][n];

            int number = 1;
            int rowStart = 0;
            int rowEnd = n - 1;
            int colStart = 0;
            int colEnd = n - 1;

            while (number <= n * n) {

                for (int i = colStart; i <= colEnd; i++) {
                    answer[rowStart][i] = number;
                    number++;
                }
                rowStart++;

                for (int i = rowStart; i <= rowEnd; i++) {
                    answer[i][colEnd] = number;
                    number++;
                }
                colEnd--;

                for (int i = colEnd; i >= colStart; i--) {
                    answer[rowEnd][i] = number;
                    number++;
                }
                rowEnd--;

                for (int i = rowEnd; i >= rowStart; i--) {
                    answer[i][colStart] = number;
                    number++;
                }
                colStart++;
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(Arrays.deepToString(solution.solution(4)));
        System.out.println(Arrays.deepToString(solution.solution(5)));
    }
}
