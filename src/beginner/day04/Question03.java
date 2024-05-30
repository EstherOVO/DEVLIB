package beginner.day04;

public class Question03 {

    public static class Solution {

        public int solution(int slice, int n) {
            int answer = 0;

            for (int i = 0; i <= 50; i++) {
                if (n <= slice * i) {
                    answer = i;
                    break;
                }
            }
            
            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(7, 10));
        System.out.println(solution.solution(4, 12));
    }
}
