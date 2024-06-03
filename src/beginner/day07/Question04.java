package beginner.day07;

public class Question04 {

    public static class Solution {

        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    answer += i;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(10));
        System.out.println(solution.solution(4));
    }
}
