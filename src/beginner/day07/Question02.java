package beginner.day07;

public class Question02 {

    public static class Solution {

        public int solution(int angle) {
            int answer = 0;

            if (angle == 180) {
                answer = 4;
            } else if (90 < angle && angle < 180) {
                answer = 3;
            } else if (angle == 90) {
                answer = 2;
            } else {
                answer = 1;
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(70));
        System.out.println(solution.solution(91));
        System.out.println(solution.solution(180));
    }
}
