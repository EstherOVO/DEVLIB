package beginner.day12;

public class Question01 {

    public static class Solution {

        public String solution(String my_string) {

            String[] vowels = { "a", "e", "i", "o", "u" };

            for (String vowel : vowels) {
                my_string = my_string.replaceAll(vowel, "");
            }

            return my_string;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("bus"));
        System.out.println(solution.solution("nice to meet you"));
    }
}
