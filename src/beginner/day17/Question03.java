package beginner.day17;

public class Question03 {

    public static class Solution {

        public int solution(int n) {
            int answer = 0;

            String[] split = String.valueOf(n).split("");

            for (int i = 0; i < split.length; i++) {
                answer += Integer.parseInt(split[i]);
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(1234));
        System.out.println(solution.solution(930211));
    }
}
