package beginner.day14;

public class Question04 {

    public static class Solution {

        public String solution(String my_string) {
            StringBuilder answer = new StringBuilder();

            char[] charArr = my_string.toCharArray();

            for (int i = 0; i < charArr.length; i++) {
                answer.append(Character.isUpperCase(charArr[i]) ? String.valueOf(charArr[i]).toLowerCase()
                        : String.valueOf(charArr[i]).toUpperCase());
            }

            return answer.toString();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("cccCCC"));
        System.out.println(solution.solution("abCdEfghIJ"));
    }
}
