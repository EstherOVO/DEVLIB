package basic.day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question03 {

    public static class Solution {

        public int[][] solution(int[][] arr) {
            int[][] answer = {};

            List<List<Integer>> intList = new ArrayList<>();

//          1. 매개변수 arr 배열을 intList 리스트에 넣기
            for (int i = 0; i < arr.length; i++) {
                List<Integer> temp = new ArrayList<>();
                for (int j = 0; j < arr[i].length; j++) {
                    temp.add(arr[i][j]);
                }
                intList.add(temp);
            }

//          2. 행 사이즈 및 열 사이즈 비교
            for (int i = 0; i < intList.size(); i++) {
                for (int j = 0; j < intList.get(i).size(); j++) {

                    int rowSize = intList.size();           // 행 사이즈
                    int colSize = intList.get(i).size();    // 열 사이즈 → arr[rowSize][colSize]

//                  행 사이즈가 더 클 경우
                    if (rowSize > colSize) {
                        for (int k = colSize; k < rowSize; k++) {
//                          행 사이즈에 맞춰 열마다 0을 추가한다.
                            intList.get(i).add(0);
                        }

//                    열 사이즈가 더 클 경우
                    } else if (rowSize < colSize) {
                        for (int l = rowSize; l < colSize; l++) {
//                          열 사이즈에 맞춰 행을 생성하고
                            List<Integer> temp = new ArrayList<>();
                            intList.add(temp);
                            for (int m = 0; m < colSize; m++) {
//                              새로 생성한 행에 열 사이즈만큼 0을 추가한다.
                                intList.get(l).add(0);
                            }
                        }

//                    만약 행 사이즈와 열 사이즈가 같을 경우 그대로 반환한다.
                    } else {
                        break;
                    }
                }
            }

//          리스트 → 2차원 배열 변환
            answer = intList.stream()
                    .map(list -> list.stream().mapToInt(Integer::intValue).toArray())
                    .toArray(int[][]::new);

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] arr1 = { {572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876} };
        int[][] arr2 = { {57, 192, 534, 2}, {9, 345, 192, 999} };
        int[][] arr3 = { {1, 2}, {3, 4} };

        System.out.println(Arrays.deepToString(solution.solution(arr1)));
        System.out.println(Arrays.deepToString(solution.solution(arr2)));
        System.out.println(Arrays.deepToString(solution.solution(arr3)));
    }
}
