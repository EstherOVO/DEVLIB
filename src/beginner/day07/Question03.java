package beginner.day07;

public class Question03 {

    public static class Solution {

        public int solution(int n, int k) {
            int answer = 0;

            if (n >= 10) {
                k -= (n / 10);
            }

            answer = (n * 12000) + (k * 2000);

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(10, 3));
        System.out.println(solution.solution(64, 6));
    }
}
