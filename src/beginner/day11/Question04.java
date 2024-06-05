package beginner.day11;

public class Question04 {

    public static class Solution {

        public int solution(int n) {
            int answer = 0;

            int factorial = 1;
            for (int i = 1; i < 11; i++) {
                factorial *= i;
                if (factorial <= n) {
                    answer = i;
                }
            }
            
            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(3628800));
        System.out.println(solution.solution(7));
    }
}
