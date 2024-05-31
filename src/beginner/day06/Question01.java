package beginner.day06;

public class Question01 {

    public static class Solution {

        public String solution(String my_string) {
            StringBuilder answer = new StringBuilder();

            answer.append(my_string).reverse();

            return answer.toString();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("jaron"));
        System.out.println(solution.solution("bread"));
    }
}
