package beginner.day18;

public class Question02 {

    public static class Solution {

        public int solution(int n) {

            return Math.sqrt(n) % 1 == 0 ? 1 : 2;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(144));
        System.out.println(solution.solution(976));
    }
}
