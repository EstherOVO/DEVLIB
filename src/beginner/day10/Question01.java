package beginner.day10;

public class Question01 {

    public static class Solution {

        public int solution(int[] dot) {

            return dot[0] > 0 && dot[1] > 0 ? 1 :
                    (dot[0] < 0 && dot[1] < 0 ? 3 :
                    (dot[0] < 0 && dot[1] > 0 ? 2 : 4));
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] dot1 = { 2, 4 };
        int[] dot2 = { -7, 9 };

        System.out.println(solution.solution(dot1));
        System.out.println(solution.solution(dot2));
    }
}
