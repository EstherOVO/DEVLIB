package level01;

import java.util.HashMap;
import java.util.Map;

public class Question11 {

    public static class Solution {

//      프로그래머스(Programmers) - 2020 카카오 인턴십 - 키패드 누르기
        public String solution(int[] numbers, String hand) {
            StringBuilder answer = new StringBuilder();

//          각 키패드 번호의 위치 설정
            Map<Integer, Integer> position = new HashMap<>();

            int count = 1;
            for (int i = 1; i <= 9; i++) {
                position.put(i, count);
                if (i % 3 == 0) count++;
            }
            position.put(0, 4);

            int leftHandPosition = 4;
            int rightHandPosition = 4;

//          키패드 누르기 시작
            for (int i = 0; i < numbers.length; i++) {

                if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {

                    for (Map.Entry<Integer, Integer> entry : position.entrySet()) {
                        if (entry.getKey() == numbers[i]) {
                            leftHandPosition = entry.getValue();
                        }
                    }
                    answer.append("L");

                } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {

                    for (Map.Entry<Integer, Integer> entry : position.entrySet()) {
                        if (entry.getKey() == numbers[i]) {
                            rightHandPosition = entry.getValue();
                        }
                    }
                    answer.append("R");

                } else {

                    for (Map.Entry<Integer, Integer> entry : position.entrySet()) {

                        if (entry.getKey() == numbers[i]) {

                            int leftHandDistance = 0;
                            int rightHandDistance = 0;

                            if (entry.getValue() == leftHandPosition) {
                                leftHandDistance = 1;
                            } else {
                                leftHandDistance = Math.abs(entry.getValue() - leftHandPosition) + 1;
                            }

                            if (entry.getValue() == rightHandPosition) {
                                rightHandDistance = 1;
                            } else {
                                rightHandDistance = Math.abs(entry.getValue() - rightHandPosition) + 1;
                            }

                            String add = leftHandDistance > rightHandDistance ? "R"
                                    : (leftHandDistance < rightHandDistance ? "L" :
                                    (hand.equals("right") ? "R" : "L"));

                            if (add.equals("L")) {
                                leftHandPosition = entry.getValue();
                            } else {
                                rightHandPosition = entry.getValue();
                            }

                            answer.append(add);
                        }
                    }
                }
            }

            return answer.toString();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        //int[] numbers1 = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };   // "LRLLLRLLRRL"
        //int[] numbers2 = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };   // "LRLLRRLLLRR"
        int[] numbers3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };      // "LLRLLRLLRL"

        //System.out.println(solution.solution(numbers1, "right"));
        //System.out.println(solution.solution(numbers2, "left"));
        System.out.println(solution.solution(numbers3, "right"));
    }
}
