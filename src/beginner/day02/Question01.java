package beginner.day02;

public class Question01 {

    public static class Solution {

        public int solution(int num1, int num2) {
            double answer = (double) num1 / num2 * 1000;

            return (int) answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(3, 2));
        System.out.println(solution.solution(7, 3));
        System.out.println(solution.solution(1, 16));
    }
}
