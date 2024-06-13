package level01;

import java.util.Arrays;

public class Question12 {

    public static class Solution {

//      프로그래머스(Programmers) - PCCE 기출문제 - [PCCE 기출문제] 10번 / 데이터 분석
        public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
            int[][] answer = {};



            for (int i = 0; i < data.length; i++) {

                switch (ext) {

                    case "date" :
                    case "maximum" :
                    case "remain" :
                }

            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] data = { {1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8} };

        System.out.println(Arrays.deepToString(solution.solution(data, "date", 20300501, "remain")));;
    }
}
