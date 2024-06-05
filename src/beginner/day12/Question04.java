package beginner.day12;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Question04 {

    public static class Solution {

        public int[] solution(int n) {
            int[] answer = {};

            Set<Integer> intSet = new TreeSet<>();

            int decimal = 2;
            while (true) {

                int remainder = n % decimal;

                if (remainder == 0) {
                    n = n / decimal;
                    intSet.add(decimal);
                } else {
                    decimal++;
                }

                if (n == 1) break;
            }

            answer = intSet.stream().mapToInt(Integer::intValue).toArray();

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(12)));
        System.out.println(Arrays.toString(solution.solution(17)));
        System.out.println(Arrays.toString(solution.solution(420)));
    }
}
