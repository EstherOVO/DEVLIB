package beginner.day18;

public class Question01 {

    public static class Solution {

        public int solution(String str1, String str2) {

            return str1.contains(str2) ? 1 : 2;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
        System.out.println(solution.solution("ppprrrogrammers", "pppp"));
        System.out.println(solution.solution("AbcAbcA", "AAA"));
    }
}
