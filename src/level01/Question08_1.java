package level01;

import java.util.HashMap;
import java.util.Map;

public class Question08_1 {

    public static class Solution {

//      프로그래머스(Programmers) - 2022 KAKAO TECH INTERNSHIP - 성격 유형 검사하기
        public String solution(String[] survey, int[] choices) {
            StringBuilder answer = new StringBuilder();

            Map<String, Integer> testResultMap = new HashMap<>();
            String[] type = { "R", "T", "C", "F", "J", "M", "A", "N" };

            for (int i = 0; i < type.length; i++) {
                testResultMap.put(type[i], 0);
            }

            for (int i = 0; i < survey.length; i++) {

                String first = survey[i].substring(0, 1);
                String second = survey[i].substring(1, 2);

                switch (choices[i]) {
                    case 1 -> testResultMap.replace(first, testResultMap.get(first) + 3);
                    case 2 -> testResultMap.replace(first, testResultMap.get(first) + 2);
                    case 3 -> testResultMap.replace(first, testResultMap.get(first) + 1);
                    case 5 -> testResultMap.replace(second, testResultMap.get(second) + 1);
                    case 6 -> testResultMap.replace(second, testResultMap.get(second) + 2);
                    case 7 -> testResultMap.replace(second, testResultMap.get(second) + 3);
                }
            }

            String rt = testResultMap.keySet().stream()
                    .filter(key -> key.equals("R") || key.equals("T"))
                    .reduce((key1, key2) -> testResultMap.get(key1) >= testResultMap.get(key2) ? key1 : key2)
                    .orElse("R");

            String cf = testResultMap.keySet().stream()
                    .filter(key -> key.equals("C") || key.equals("F"))
                    .reduce((key1, key2) -> testResultMap.get(key1) >= testResultMap.get(key2) ? key1 : key2)
                    .orElse("C");

            String jm = testResultMap.keySet().stream()
                    .filter(key -> key.equals("J") || key.equals("M"))
                    .reduce((key1, key2) -> testResultMap.get(key1) >= testResultMap.get(key2) ? key1 : key2)
                    .orElse("J");

            String an = testResultMap.keySet().stream()
                    .filter(key -> key.equals("A") || key.equals("N"))
                    .reduce((key1, key2) -> testResultMap.get(key1) >= testResultMap.get(key2) ? key1 : key2)
                    .orElse("A");

            answer.append(rt).append(cf).append(jm).append(an);

            return answer.toString();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] survey1 = { "AN", "CF", "MJ", "RT", "NA" };
        int[] choices1 = { 5, 3, 2, 7, 5 };

        String[] survey2 = { "TR", "RT", "TR" };
        int[] choices2 = { 7, 1, 3 };

        System.out.println(solution.solution(survey1, choices1)); // "TCMA"
        System.out.println(solution.solution(survey2, choices2)); // "RCJA"
    }
}
