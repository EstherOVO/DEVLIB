package beginner.day04;

public class Question02 {

    public static class Solution {

        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= 50; i++) {
                if ((i * 6) % n == 0) {
                    answer = i;
                    break;
                }
            }
            
            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(6));
        System.out.println(solution.solution(10));
        System.out.println(solution.solution(4));
    }
}
