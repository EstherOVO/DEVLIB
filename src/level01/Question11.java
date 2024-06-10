package level01;

import java.util.*;

public class Question11 {

    public static class Solution {

//      프로그래머스(Programmers) - 2020 카카오 인턴십 - 키패드 누르기
        public String solution(int[] numbers, String hand) {
            StringBuilder answer = new StringBuilder();

//          각 키패드 번호의 위치 설정
            Map<Integer, int[]> keypad = new HashMap<>();

            int horizontal = 1;
            int vertical = 1;
            for (int i = 1; i <= 9; i++) {
                int[] position = { vertical, horizontal };
                keypad.put(i, position);

                horizontal++;
                if (horizontal >= 4) horizontal = 1;
                if (i % 3 == 0) vertical++;
            }
            keypad.put(0, new int[]{4, 2});

            int[] leftHandPosition = { 4, 1 };      // 왼손 엄지손가락 위치 *
            int[] rightHandPosition = { 4, 3 };     // 오른손 엄지손가락 위치 #

//          키패드 누르기 시작
            for (int i = 0; i < numbers.length; i++) {

                if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {

                    for (Map.Entry<Integer, int[]> entry : keypad.entrySet()) {
                        if (entry.getKey() == numbers[i]) {
                            int[] value = entry.getValue();
                            leftHandPosition[0] = value[0];
                            leftHandPosition[1] = value[1];
                        }
                    }
                    answer.append("L");

                } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {

                    for (Map.Entry<Integer, int[]> entry : keypad.entrySet()) {
                        if (entry.getKey() == numbers[i]) {
                            int[] value = entry.getValue();
                            rightHandPosition[0] = value[0];
                            rightHandPosition[1] = value[1];
                        }
                    }
                    answer.append("R");

                } else {

                    for (Map.Entry<Integer, int[]> entry : keypad.entrySet()) {

                        if (entry.getKey() == numbers[i]) {

                            int leftHandDistance = 0;
                            int rightHandDistance = 0;

                            int[] value = entry.getValue();

//                          왼손가락 위치의 가로 레벨 = 누르려는 번호의 가로 레벨 && 왼손가락 위치의 세로 레벨 =/= 누르려는 번호의 세로 레벨
                            if (leftHandPosition[0] == value[0] && leftHandPosition[1] != value[1]) {
                                leftHandDistance = 1;

//                          왼손가락 위치의 가로 레벨 =/= 누르려는 번호의 가로 레벨 && 왼손가락 위치의 세로 레벨 = 누르려는 번호의 세로 레벨
                            } else if (leftHandPosition[0] != value[0] && leftHandPosition[1] == value[1]) {
                                leftHandDistance = Math.abs(leftHandPosition[0] - value[0]);

//                          왼손가락 위치의 가로 레벨 =/= 누르려는 번호의 가로 레벨 && 왼손가락 위치의 세로 레벨 =/= 누르려는 번호의 세로 레벨
                            } else if (leftHandPosition[0] != value[0] && leftHandPosition[1] != value[1]) {
                                leftHandDistance = Math.abs(leftHandPosition[0] - value[0]) + 1;
                            }

//                          오른손가락 위치의 가로 레벨 = 누르려는 번호의 가로 레벨 && 오른손가락 위치의 세로 레벨 =/= 누르려는 번호의 세로 레벨
                            if (rightHandPosition[0] == value[0] && rightHandPosition[1] != value[1]) {
                                rightHandDistance = 1;

//                          오른손가락 위치의 가로 레벨 =/= 누르려는 번호의 가로 레벨 && 오른손가락 위치의 세로 레벨 = 누르려는 번호의 세로 레벨
                            } else if (rightHandPosition[0] != value[0] && rightHandPosition[1] == value[1]) {
                                rightHandDistance = Math.abs(rightHandPosition[0] - value[0]);

//                          오른손가락 위치의 가로 레벨 =/= 누르려는 번호의 가로 레벨 && 오른손가락 위치의 세로 레벨 =/= 누르려는 번호의 세로 레벨
                            } else if (rightHandPosition[0] != value[0] && rightHandPosition[1] != value[1]) {
                                rightHandDistance = Math.abs(rightHandPosition[0] - value[0]) + 1;
                            }

                            String add = leftHandDistance == rightHandDistance ?
                                    (hand.equals("right") ? "R" : "L") :
                                    (leftHandDistance < rightHandDistance ? "L" : "R");

                            if (add.equals("L")) {
                                leftHandPosition[0] = value[0];
                                leftHandPosition[1] = value[1];
                            } else {
                                rightHandPosition[0] = value[0];
                                rightHandPosition[1] = value[1];
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

        int[] numbers1 = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
        int[] numbers2 = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
        int[] numbers3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

        System.out.println(solution.solution(numbers1, "right"));   // "LRLLLRLLRRL"
        System.out.println(solution.solution(numbers2, "left"));    // "LRLLRRLLLRR"
        System.out.println(solution.solution(numbers3, "right"));   // "LLRLLRLLRL"
    }
}
