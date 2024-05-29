package basic.day25;

public class Question02 {

    public static class Solution {

        public int solution(int[][] arr) {
            int answer = 1;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] != arr[j][i]) {
                        answer = 0;
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] arr1 = { {5, 192, 33}, {192, 72, 95}, {33, 95, 999} };
        int[][] arr2 = { {19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81} };

        System.out.println(solution.solution(arr1));
        System.out.println(solution.solution(arr2));
    }
}
