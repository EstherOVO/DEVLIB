package beginner.day10;

public class Question03 {

    public static class Solution {

        public int solution(int[] numbers, int k) {
            int answer = 0;

            int count = 0;
            int skip = 0;
            while (true) {

                answer = numbers[skip];

                skip += 2;
                if (skip >= numbers.length) skip = skip - numbers.length;

                count++;

                if (count == k) break;
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] numbers1 = { 1, 2, 3, 4 };
        int[] numbers2 = { 1, 2, 3, 4, 5, 6 };
        int[] numbers3 = { 1, 2, 3 };

        System.out.println(solution.solution(numbers1, 2));
        System.out.println(solution.solution(numbers2, 5));
        System.out.println(solution.solution(numbers3, 3));
    }
}
