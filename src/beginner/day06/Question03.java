package beginner.day06;

import java.util.Arrays;

public class Question03 {

    public static class Solution {

        public int[] solution(int[] num_list) {
            int[] answer = new int[2];

            int evenCount = 0;
            int oddCount = 0;

            for (int i = 0; i < num_list.length; i++) {

                if (num_list[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            answer[0] = evenCount;
            answer[1] = oddCount;

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] num_list1 = { 1, 2, 3, 4, 5 };
        int[] num_list2 = { 1, 3, 5, 7 };

        System.out.println(Arrays.toString(solution.solution(num_list1)));
        System.out.println(Arrays.toString(solution.solution(num_list2)));
    }
}
