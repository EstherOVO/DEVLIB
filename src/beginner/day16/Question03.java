package beginner.day16;

public class Question03 {

    public static class Solution {

        public int solution(String my_string) {
            int answer = 0;

            String[] split = my_string.split(" ");

            answer = Integer.parseInt(split[0]);

            for (int i = 1; i < split.length; i++) {

                if (i % 2 == 1) {
                    if (split[i].equals("+")) {
                        answer += Integer.parseInt(split[i + 1]);
                    } else {
                        answer -= Integer.parseInt(split[i + 1]);
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("3 + 4"));
    }
}
