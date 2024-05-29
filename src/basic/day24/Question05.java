package basic.day24;

import java.util.Arrays;

public class Question05 {

    public static class Solution {

        public int[][] solution(int n) {
            int[][] answer = new int[n][n];

            for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < answer[i].length; j++) {
                    if (i == j) {
                        answer[i][j] = 1;
                    } else {
                        answer[i][j] = 0;
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(Arrays.deepToString(solution.solution(3)));
        System.out.println(Arrays.deepToString(solution.solution(6)));
        System.out.println(Arrays.deepToString(solution.solution(1)));
    }
}
