package beginner.day19;

public class Question01 {

    public static class Solution {

        public int solution(int[] array) {
            int answer = 0;

            for (int i = 0; i < array.length; i++) {

                String[] split = String.valueOf(array[i]).split("");
                for (int j = 0; j < split.length; j++) {
                    if (split[j].equals("7")) answer++;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] array1 = { 7, 77, 17 };
        int[] array2 = { 10, 29 };

        System.out.println(solution.solution(array1));
        System.out.println(solution.solution(array2));
    }
}
