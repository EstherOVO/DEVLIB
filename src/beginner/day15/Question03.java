package beginner.day15;

import java.util.*;

public class Question03 {

    public static class Solution {

        public String solution(String s) {
            StringBuilder answer = new StringBuilder();

            List<String> strList = new ArrayList<>(Arrays.asList(s.split("")));
            Map<String, Integer> frequencyMap = new TreeMap<>();

            Collections.sort(strList);

            for (String string : strList) {
                frequencyMap.put(string, frequencyMap.getOrDefault(string, 0) + 1);
            }


            for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
                if (entry.getValue() == 1) answer.append(entry.getKey());
            }

            return answer.toString();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("abcabcadc"));
        System.out.println(solution.solution("abdc"));
        System.out.println(solution.solution("hello"));
    }
}
