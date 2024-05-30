package beginner.day03;

import java.util.*;

public class Question03_2 {

    public static class Solution {

        public int solution(int[] array) {
            int answer = 0;

            List<Integer> intList = new ArrayList<>();
            List<Integer> frequencyList = new ArrayList<>();

            for (int i = 0; i < array.length; i++) {
                intList.add(array[i]);
            }

            List<Integer> distinctList = intList.stream().distinct().toList();

            int max = 0;
            for (int i = 0; i < distinctList.size(); i++) {
                Integer number = distinctList.get(i);

                int frequency = Collections.frequency(intList, number);
                frequencyList.add(frequency);

                if (max < frequency) {
                    max = frequency;
                    answer = number;
                }
            }

            if (Collections.frequency(frequencyList, max) >= 2) answer = -1;

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
