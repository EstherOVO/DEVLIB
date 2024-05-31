package beginner.day05;

public class Question01 {

    public static class Solution {

        public int solution(int price) {
            double answer = price;

            if (answer >= 500000) {
                answer = answer * 0.8;
            } else if (answer >= 300000) {
                answer = answer * 0.9;
            } else if (answer >= 100000) {
                answer = answer * 0.95;
            }

            return (int) answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(150000));
        System.out.println(solution.solution(580000));
    }
}
