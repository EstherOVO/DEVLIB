package level01;

import java.util.*;

public class Question06 {

    public static class Solution {

//      프로그래머스(Programmers) - 2023 KAKAO BLIND RECRUITMENT - 개인정보 수집 유효기간
        public int[] solution(String today, String[] terms, String[] privacies) {
            int[] answer = {};

            Map<Integer, Map<String, String>> mapNumber = new HashMap<>();
            List<Integer> finalCheckPrivacy = new ArrayList<>();

            for (int i = 0; i < privacies.length; i++) {
                Map<String, String> map = new HashMap<>();

                String[] split = privacies[i].split(" ");
                map.put(split[0], split[1]);

                mapNumber.put(i + 1, map);
            }

            for (int i = 0; i < privacies.length; i++) {
                for (int j = 0; j < terms.length; j++) {

                    String[] termSplit = terms[j].split(" ");
                    String[] privacySplit = privacies[i].split(" ");

                    if (termSplit[0].equals(privacySplit[1])) {

                        String[] startDate = privacySplit[0].split("[.]");

                        int year = Integer.parseInt(startDate[0]);
                        int month = Integer.parseInt(startDate[1]) + Integer.parseInt(termSplit[1]);
                        if (month > 12) {
                            year += month / 12;
                            month = month % 12;
                        }
                        int day = Integer.parseInt(startDate[2]);

                        String[] todaySplit = today.split("[.]");

                        int todayYear = Integer.parseInt(todaySplit[0]);
                        int todayMonth = Integer.parseInt(todaySplit[1]);
                        int todayDay = Integer.parseInt(todaySplit[2]);

                        for (Map.Entry<Integer, Map<String, String>> integerMapEntry : mapNumber.entrySet()) {
                            Map<String, String> value = integerMapEntry.getValue();
                            for (Map.Entry<String, String> entry : value.entrySet()) {
                                if (entry.getKey().equals(privacySplit[0]) && entry.getValue().equals(privacySplit[1])) {

                                    if (todayYear > year) {

                                        finalCheckPrivacy.add(integerMapEntry.getKey());
                                        break;

                                    } else if (todayYear == year) {
                                        if (todayMonth > month) {
                                            finalCheckPrivacy.add(integerMapEntry.getKey());
                                            break;

                                        } else if (todayMonth == month) {
                                            if (todayDay >= day) finalCheckPrivacy.add(integerMapEntry.getKey());
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            answer = finalCheckPrivacy.stream().mapToInt(Integer::intValue).toArray();

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] terms1 = { "A 6", "B 12", "C 3" };
        String[] privacies1 = { "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C" };

        String[] terms2 = { "Z 3", "D 5" };
        String[] privacies2 = { "2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z" };

        System.out.println(Arrays.toString(solution.solution("2022.05.19", terms1, privacies1))); // [1, 3]
        System.out.println(Arrays.toString(solution.solution("2020.01.01", terms2, privacies2))); // [1, 4, 5]
    }
}
