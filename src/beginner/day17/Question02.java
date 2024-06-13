package beginner.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question02 {

    public static class Solution {

        public int[] solution(int n, int[] numlist) {
            int[] answer = {};

            List<Integer> intList = new ArrayList<>();

            for (int i = 0; i < numlist.length; i++) {
                if (numlist[i] % n == 0) intList.add(numlist[i]);
            }

            answer = intList.stream().mapToInt(Integer::intValue).toArray();

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] numlist1 = { 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int[] numlist2 = { 1, 9, 3, 10, 13, 5 };
        int[] numlist3 = { 2, 100, 120, 600, 12, 12 };

        System.out.println(Arrays.toString(solution.solution(3, numlist1)));
        System.out.println(Arrays.toString(solution.solution(5, numlist2)));
        System.out.println(Arrays.toString(solution.solution(12, numlist3)));
    }
}
