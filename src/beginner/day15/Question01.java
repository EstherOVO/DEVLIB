package beginner.day15;

import java.util.HashMap;
import java.util.Map;

public class Question01 {

    public static class Solution {

        public long solution(String numbers) {
            long answer = 0;

            String[] numbersStr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
            Map<String, Integer> strToNum = new HashMap<>();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i <= 9; i++) {
                strToNum.put(numbersStr[i], i);
            }

            while (true) {

                for (Map.Entry<String, Integer> entry : strToNum.entrySet()) {
                    if (numbers.startsWith(entry.getKey())) {
                        result.append(entry.getValue());
                        numbers = numbers.substring(entry.getKey().length());
                    }
                }

                if (numbers.length() == 0) break;
            }

            answer = Long.parseLong(result.toString());

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(solution.solution("onefourzerosixseven"));
    }
}
