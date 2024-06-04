package beginner.day09;

public class Question04 {

    public static class Solution {

        public int solution(int balls, int share) {
            double answer = 1;

            for(int i = 0; i < share; i++) {
                answer = answer * (balls - i) / (i + 1);
            }

            return (int) answer;
        }
    }

    public static void main(String[] args) {

        Question04.Solution solution = new Solution();

        System.out.println(solution.solution(3, 2));
        System.out.println(solution.solution(5, 3));
    }
}
