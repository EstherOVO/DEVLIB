package beginner.day03;

import java.util.HashMap;
import java.util.Map;

public class Question03_1 {

    public static class Solution {

        public int solution(int[] array) {
            int answer = 0;

            Map<Integer, Integer> findMax = new HashMap<>();

            for (int i = 0; i < array.length; i++) {
                findMax.put(array[i], findMax.getOrDefault(array[i], 0) + 1);
            }

            int max = Integer.MIN_VALUE;
            for (Map.Entry<Integer, Integer> entry : findMax.entrySet()) {
                if (max < entry.getValue()) {
                    max = entry.getValue();
                    answer = entry.getKey();

                } else if (max == entry.getValue()) {
                    answer = -1;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] array1 = { 1, 2, 3, 3, 3, 4 };
        int[] array2 = { 1, 1, 2, 2 };
        int[] array3 = { 1 };

        System.out.println(solution.solution(array1));
        System.out.println(solution.solution(array2));
        System.out.println(solution.solution(array3));
    }
}
