package beginner.day11;

public class Question03 {

    public static class Solution {

        public int solution(int[] numbers) {

            int max = 0;
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (max < numbers[i] * numbers[j]) {
                        max = numbers[i] * numbers[j];
                    }
                }
            }

            return max;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] numbers1 = { 1, 2, 3, 4, 5 };
        int[] numbers2 = { 0, 31, 24, 10, 1, 9 };

        System.out.println(solution.solution(numbers1));
        System.out.println(solution.solution(numbers2));
    }
}
