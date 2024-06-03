package level01;

import java.util.Arrays;

public class Question05 {

    public static class Solution {

//      프로그래머스(Programmers) - 연습문제 - 공원 산책
        public int[] solution(String[] park, String[] routes) {
            int[] answer = {};

            int[][] walk = new int[7][6];

            for (int i = 0; i < routes.length; i++) {
                String[] routeSplit = routes[i].split(" ");
                for (int j = 0; j < park.length; j++) {
                    String[] parkSplit = park[j].split("");
                    for (int k = 0; k < parkSplit.length; k++) {

                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] park1 = { "SOO","OOO","OOO" };
        String[] routes1 = { "E 2","S 2","W 1" };

        String[] park2 = { "SOO","OXX","OOO" };
        String[] routes2 = { "E 2","S 2","W 1" };

        String[] park3 = { "OSO","OOO","OXO","OOO" };
        String[] routes3 = { "E 2","S 3","W 1" };

        System.out.println(Arrays.toString(solution.solution(park1, routes1))); // [2, 1]
        System.out.println(Arrays.toString(solution.solution(park2, routes2))); // [0, 1]
        System.out.println(Arrays.toString(solution.solution(park3, routes3))); // [0, 0]
    }
}
