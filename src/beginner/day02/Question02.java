package beginner.day02;

public class Question02 {

    public static class Solution {

        public int solution(int num1, int num2) {
            int answer = 0;

            if (num1 == num2) {
                answer = 1;
            } else {
                answer = -1;
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(2, 3));
        System.out.println(solution.solution(11, 11));
        System.out.println(solution.solution(7, 99));
    }
}
