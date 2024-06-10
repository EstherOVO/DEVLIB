package beginner.day14;

import java.util.stream.Stream;

public class Question02 {

    public static class Solution {

        public int solution(int order) {
            int answer = 0;

            int[] arr = Stream.of(String.valueOf(order).split("")).mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 3 || arr[i] == 6 || arr[i] == 9) answer++;
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(3));
        System.out.println(solution.solution(29423));
    }
}
