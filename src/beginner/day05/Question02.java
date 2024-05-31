package beginner.day05;

import java.util.Arrays;

public class Question02 {

    public static class Solution {

        public int[] solution(int money) {
            int[] answer = new int[2];

            int quantity = money / 5500;
            int change = money - (5500 * quantity);

            answer[0] = quantity;
            answer[1] = change;

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(5500)));
        System.out.println(Arrays.toString(solution.solution(15000)));
    }
}
