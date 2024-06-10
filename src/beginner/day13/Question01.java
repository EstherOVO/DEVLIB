package beginner.day13;

import java.util.ArrayList;
import java.util.List;

public class Question01 {

    public static class Solution {

        public int solution(String s) {
            int answer = 0;

            List<Integer> intList = new ArrayList<>();

            String[] split = s.split(" ");
            for (int i = 0; i < split.length; i++) {
                if (!split[i].equals("Z")) {
                    intList.add(Integer.parseInt(split[i]));
                } else {
                    intList.add(-Integer.parseInt(split[i - 1]));
                }
            }

            answer = intList.stream().mapToInt(Integer::intValue).sum();

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("1 2 Z 3"));
        System.out.println(solution.solution("10 20 30 40"));
        System.out.println(solution.solution("10 Z 20 Z 1"));
        System.out.println(solution.solution("10 Z 20 Z"));
        System.out.println(solution.solution("-1 -2 -3 Z"));
    }
}
