package beginner.day08;

import java.util.*;

public class Question03 {

    public static class Solution {

        public int[] solution(int[] emergency) {
            int[] answer = Arrays.copyOf(emergency, emergency.length);

            Integer[] integers = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
            Arrays.sort(integers, Comparator.reverseOrder());

            Map<Integer, Integer> importance = new HashMap<>();

            for (int i = 0; i < integers.length; i++) {
                importance.put(integers[i], i + 1);
            }

            for (int i = 0; i < answer.length; i++) {
                for (Map.Entry<Integer, Integer> entry : importance.entrySet()) {
                    if (entry.getKey() == answer[i]) {
                        answer[i] = entry.getValue();
                        break;
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] emergency1 = { 3, 76, 24 };
        int[] emergency2 = { 1, 2, 3, 4, 5, 6, 7 };
        int[] emergency3 = { 30, 10, 23, 6, 100 };

        System.out.println(Arrays.toString(solution.solution(emergency1)));
        System.out.println(Arrays.toString(solution.solution(emergency2)));
        System.out.println(Arrays.toString(solution.solution(emergency3)));
    }
}
