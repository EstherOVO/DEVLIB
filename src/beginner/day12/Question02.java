package beginner.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question02 {

    public static class Solution {

        public int[] solution(String my_string) {
            int[] answer = {};

            List<Integer> intList = new ArrayList<>();

            for (int i = 0; i < my_string.length(); i++) {
                String str = my_string.substring(i, i + 1);
                if (str.matches("[0-9]")) intList.add(Integer.valueOf(str));
            }

            answer = intList.stream().mapToInt(Integer::intValue).sorted().toArray();

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution("hi12392")));
        System.out.println(Arrays.toString(solution.solution("p2o4i8gj2")));
        System.out.println(Arrays.toString(solution.solution("abcde0")));
    }
}
