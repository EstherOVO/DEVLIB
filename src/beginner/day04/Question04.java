package beginner.day04;

public class Question04 {

    public static class Solution {

        public double solution(int[] numbers) {

            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

            return (double) sum / numbers.length;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] numbers1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] numbers2 = { 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99 };

        System.out.println(solution.solution(numbers1));
        System.out.println(solution.solution(numbers2));
    }
}
