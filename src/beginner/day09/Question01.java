package beginner.day09;

public class Question01 {

    public static class Solution {

        public int solution(int hp) {

            return (hp / 5) + (hp % 5) / 3 + ((hp % 5) % 3);
        }
    }

    public static void main(String[] args) {

        Question01.Solution solution = new Solution();

        System.out.println(solution.solution(23));
        System.out.println(solution.solution(24));
        System.out.println(solution.solution(999));
    }
}
