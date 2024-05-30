package beginner.day04;

public class Question01 {

    public static class Solution {

        public int solution(int n) {
            int answer = 0;

            for (int i = 0; i <= 15; i++) {
                if (n <= i * 7) {
                    answer = i;
                    break;
                }
            }
            
            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(7));
        System.out.println(solution.solution(1));
        System.out.println(solution.solution(15));
    }
}
