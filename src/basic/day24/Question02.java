package basic.day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question02 {

    public static class Solution {

        public String[] solution(String[] picture, int k) {
            String[] answer = {};

            List<String> strList = new ArrayList<>();

            for (int i = 0; i < picture.length; i++) {

                String[] split = picture[i].split("");
                StringBuilder pixel = new StringBuilder();

                for (int j = 0; j < split.length; j++) {
                    for (int m = 0; m < k; m++) {
                        pixel.append(split[j]);
                    }
                }

                for (int l = 0; l < k; l++) {
                    strList.add(pixel.toString());
                }
            }

            answer = strList.stream().toArray(String[]::new);

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] picture1 = { ".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...." };
        String[] picture2 = { "x.x", ".x.", "x.x" };

        System.out.println(Arrays.toString(solution.solution(picture1, 2)));
        System.out.println(Arrays.toString(solution.solution(picture2, 3)));
    }
}
