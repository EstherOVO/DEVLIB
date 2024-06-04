package beginner.day09;

public class Question03 {

    public static class Solution {

        public String solution(String rsp) {
            StringBuilder answer = new StringBuilder();

            String[] rspSplit = rsp.split("");

            for (int i = 0; i < rspSplit.length; i++) {

                if (rspSplit[i].equals("2")) {
                    answer.append("0");
                } else if (rspSplit[i].equals("0")) {
                    answer.append("5");
                } else {
                    answer.append("2");
                }
            }

            return answer.toString();
        }
    }

    public static void main(String[] args) {

        Question03.Solution solution = new Solution();

        System.out.println(solution.solution("2"));
        System.out.println(solution.solution("205"));
    }
}
