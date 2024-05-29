package beginner.day01;

public class Question03 {

    public static class Solution {

        public int solution(int num1, int num2) {
            int answer = num1 * num2;

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(3, 4));
        System.out.println(solution.solution(27, 19));
    }
}
