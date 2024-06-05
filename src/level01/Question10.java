package level01;

import java.util.ArrayList;
import java.util.List;

public class Question10 {

    public static class Solution {

//      프로그래머스(Programmers) - 2019 카카오 개발자 겨울 인턴십 - 크레인 인형뽑기 게임
        public int solution(int[][] board, int[] moves) {
            int answer = 0;

            List<Integer> clawMachine = new ArrayList<>();

            for (int i = 0; i < moves.length; i++) {

                int move = moves[i];

                for (int j = 0; j < board.length; j++) {

                    if (board[j][move - 1] != 0) {
                        int doll = board[j][move - 1];

                        if (clawMachine.size() == 0) {
                            clawMachine.add(doll);
                            board[j][move - 1] = 0;
                            break;
                        } else {
                            if (clawMachine.get(clawMachine.size() - 1) != doll) {
                                clawMachine.add(doll);
                                board[j][move - 1] = 0;
                                break;
                            } else {
                                clawMachine.remove(clawMachine.size() - 1);
                                board[j][move - 1] = 0;
                                answer += 2;
                                break;
                            }
                        }
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] board = { {0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1} };
        int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

        System.out.println(solution.solution(board, moves));    // 4
    }
}
