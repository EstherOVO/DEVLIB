package beginner.day01;

public class Question04 {

    public static class Solution {

        public int solution(int num1, int num2) {
            int answer = num1 / num2;

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(10, 5));
        System.out.println(solution.solution(7, 2));
    }
}
