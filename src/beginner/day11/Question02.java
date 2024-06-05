package beginner.day11;

public class Question02 {

    public static class Solution {

        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= n; i++) {
                int count = 0;
                for (int j = 1; j <= n; j++) {
                    if (i % j == 0) count++;
                }

                if (count >= 3) answer++;
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(10));
        System.out.println(solution.solution(15));
    }
}
