package beginner.day03;

public class Question01 {

    public static class Solution {

        public int solution(int num1, int num2) {

            return num1 % num2;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(3, 2));
        System.out.println(solution.solution(10, 5));
    }
}
