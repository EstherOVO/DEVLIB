package beginner.day18;

public class Question03 {

    public static class Solution {

        public int solution(int n, int t) {
            int answer = n;

            for (int i = 1; i <= t; i++) {
                answer *= 2;
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(2, 10));
        System.out.println(solution.solution(7, 15));
    }
}
