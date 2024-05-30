package beginner.day03;

import java.util.Arrays;

public class Question04 {

    public static class Solution {

        public int[] solution(int n) {
            int[] answer = new int[(n + 1) / 2];

            int count = 0;
            for (int i = 1; i <= n; i += 2) {
                answer[count] = i;
                count++;
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(10)));
        System.out.println(Arrays.toString(solution.solution(15)));
    }
}
