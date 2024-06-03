package beginner.day08;

import java.util.HashMap;
import java.util.Map;

public class Question02 {

    public static class Solution {

        public String solution(int age) {
            StringBuilder answer = new StringBuilder();

            Map<String, Integer> alphaToAge = new HashMap<>();

            int count = 0;
            for (char i = 97; i <= 106; i++) {
                alphaToAge.put(Character.toString(i), count);
                count++;
            }

            String[] split = String.valueOf(age).split("");

            for (int i = 0; i < split.length; i++) {
                for (Map.Entry<String, Integer> entry : alphaToAge.entrySet()) {
                    if (Integer.valueOf(split[i]) == entry.getValue()) {
                        answer.append(entry.getKey());
                    }
                }
            }

            return answer.toString();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(23));
        System.out.println(solution.solution(51));
        System.out.println(solution.solution(100));
    }
}
