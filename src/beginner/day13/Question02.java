package beginner.day13;

import java.util.Arrays;

public class Question02 {

    public static class Solution {

        public int[] solution(String[] strlist) {

            return Arrays.stream(strlist).mapToInt(String::length).toArray();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] strlist1 = { "We", "are", "the", "world!" };
        String[] strlist2 = { "I", "Love", "Programmers." };

        System.out.println(Arrays.toString(solution.solution(strlist1)));
        System.out.println(Arrays.toString(solution.solution(strlist2)));
    }
}
