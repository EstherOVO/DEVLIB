package beginner.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question04 {

    public static class Solution {

        public int[] solution(int n) {
            int[] answer = {};

            List<Integer> intList = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) intList.add(i);
            }

            answer = intList.stream().mapToInt(Integer::intValue).toArray();

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(24)));
        System.out.println(Arrays.toString(solution.solution(29)));
    }
}
