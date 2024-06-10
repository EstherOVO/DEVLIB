package beginner.day13;

public class Question04 {

    public static class Solution {

        public int solution(int[] sides) {

            int max = 0;
            for (int i = 0; i < sides.length; i++) {
                if (max < sides[i]) {
                    max = sides[i];
                }
            }

            for (int i = 0; i < sides.length; i++) {
                if (sides[i] == max) {
                    sides[i] = 0;
                    break;
                }
            }

            int sum = 0;
            for (int i = 0; i < sides.length; i++) {
                sum += sides[i];
            }

            return max < sum ? 1 : 2;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] sides1 = { 1, 2, 3 };
        int[] sides2 = { 3, 6, 2 };
        int[] sides3 = { 199, 72, 222 };

        System.out.println(solution.solution(sides1));
        System.out.println(solution.solution(sides2));
        System.out.println(solution.solution(sides3));
    }
}
