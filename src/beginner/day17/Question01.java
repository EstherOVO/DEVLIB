package beginner.day17;

public class Question01 {

    public static class Solution {

        public int solution(int num, int k) {
            int answer = String.valueOf(num).indexOf(String.valueOf(k));

            return answer == -1 ? answer : answer + 1;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(29183, 1));
        System.out.println(solution.solution(232443, 4));
        System.out.println(solution.solution(123456, 7));
    }
}
