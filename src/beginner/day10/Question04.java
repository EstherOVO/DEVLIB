package beginner.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question04 {

    public static class Solution {

        public int[] solution(int[] numbers, String direction) {
            int[] answer = {};

            List<Integer> intList = new ArrayList<>();

            if (direction.equals("right")) {
                intList.add(numbers[numbers.length - 1]);

                for (int i = 0; i < numbers.length - 1; i++) {
                    intList.add(numbers[i]);
                }

            } else {

                for (int i = 1; i < numbers.length; i++) {
                    intList.add(numbers[i]);
                }
                intList.add(numbers[0]);
            }

            answer = intList.stream().mapToInt(Integer::intValue).toArray();

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] numbers1 = { 1, 2, 3 };
        int[] numbers2 = { 4, 455, 6, 4, -1, 45, 6 };

        System.out.println(Arrays.toString(solution.solution(numbers1, "right")));
        System.out.println(Arrays.toString(solution.solution(numbers2, "left")));
    }
}
