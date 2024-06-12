package beginner.day16;

public class Question04 {

    public static class Solution {

        public int solution(String[] s1, String[] s2) {
            int answer = 0;

            for (int i = 0; i < s1.length; i++) {
                for (int j = 0; j < s2.length; j++) {
                    if (s1[i].equals(s2[j])) answer++;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] s1_1 = { "a", "b", "c" };
        String[] s2_1 = { "com", "b", "d", "p", "c" };

        String[] s1_2 = { "n", "omg" };
        String[] s2_2 = { "m", "dot" };

        System.out.println(solution.solution(s1_1, s2_1));
        System.out.println(solution.solution(s1_2, s2_2));
    }
}
