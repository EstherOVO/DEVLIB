package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question07 {

    public static class Solution {

//      프로그래머스(Programmers) - 연습문제 - 바탕화면 정리
        public int[] solution(String[] wallpaper) {
            int[] answer = new int[4];

            String[][] drag = new String[wallpaper.length][wallpaper[0].length()];

            List<Integer> xList = new ArrayList<>();
            List<Integer> yList = new ArrayList<>();

            for (int i = 0; i < wallpaper.length; i++) {

                String[] split = wallpaper[i].split("");

                for (int j = 0; j < split.length; j++) {
                    drag[i][j] = split[j];
                }
            }

            for (int i = 0; i < drag.length; i++) {
                for (int j = 0; j < drag[i].length; j++) {
                    if (drag[i][j].equals("#")) {
                        xList.add(i);
                        yList.add(j);
                    }
                }
            }

            answer[0] = xList.stream().mapToInt(Integer::intValue).min().orElse(0);
            answer[1] = yList.stream().mapToInt(Integer::intValue).min().orElse(0);
            answer[2] = (xList.stream().mapToInt(Integer::intValue).max().orElse(0)) + 1;
            answer[3] = (yList.stream().mapToInt(Integer::intValue).max().orElse(0)) + 1;

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] wallpaper1 = { ".#...", "..#..", "...#." };
        String[] wallpaper2 = { "..........", ".....#....", "......##..", "...##.....", "....#....." };
        String[] wallpaper3 = { ".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...." };
        String[] wallpaper4 = { "..", "#." };

        System.out.println(Arrays.toString(solution.solution(wallpaper1))); // [0, 1, 3, 4]
        System.out.println(Arrays.toString(solution.solution(wallpaper2))); // [1, 3, 5, 8]
        System.out.println(Arrays.toString(solution.solution(wallpaper3))); // [0, 0, 7, 9]
        System.out.println(Arrays.toString(solution.solution(wallpaper4))); // [1, 0, 2, 1]
    }
}
