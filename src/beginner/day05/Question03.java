package beginner.day05;

public class Question03 {

    public static class Solution {

        public int solution(int age) {

            return 2023 - age;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(40));
        System.out.println(solution.solution(23));
    }
}
