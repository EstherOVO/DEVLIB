package basic.day25;

public class Question04 {

    public static class Solution {

        public int solution(int[][] board, int k) {
            int answer = 0;

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (i + j <= k) {
                        answer += board[i][j];
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] board = { {0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5} };

        System.out.println(solution.solution(board, 2));
    }
}
