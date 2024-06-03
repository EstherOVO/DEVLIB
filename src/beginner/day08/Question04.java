package beginner.day08;

public class Question04 {

    public static class Solution {

        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    answer++;
                }
            }
            
            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(20));
        System.out.println(solution.solution(100));
    }
}
