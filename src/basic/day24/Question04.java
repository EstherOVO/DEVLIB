package basic.day24;

public class Question04 {

    public static class Solution {

        public String solution(String myString) {
            StringBuilder answer = new StringBuilder();

            char[] charArr = myString.toCharArray();

            for (char c : charArr) {
                if (c < 108) {
                    c = 108;
                    answer.append(c);
                } else {
                    answer.append(c);
                }
            }
            return answer.toString();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("abcdevwxyz"));
        System.out.println(solution.solution("jjnnllkkmm"));
    }
}
