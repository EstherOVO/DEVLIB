package beginner.day05;

import java.util.Arrays;

public class Question04 {

    public static class Solution {

        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length];

            int count = 0;
            for (int i = num_list.length - 1; i >= 0; i--) {
                answer[count] = num_list[i];
                count++;
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] num_list1 = { 1, 2, 3, 4, 5 };
        int[] num_list2 = { 1, 1, 1, 1, 1, 2 };
        int[] num_list3 = { 1, 0, 1, 1, 1, 3, 5 };

        System.out.println(Arrays.toString(solution.solution(num_list1)));
        System.out.println(Arrays.toString(solution.solution(num_list2)));
        System.out.println(Arrays.toString(solution.solution(num_list3)));
    }
}
