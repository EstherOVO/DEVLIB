package beginner.day16;

public class Question01 {

    public static class Solution {

        public int solution(String message) {

            return message.length() * 2;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("happy birthday!"));
        System.out.println(solution.solution("I love you~"));
    }
}
