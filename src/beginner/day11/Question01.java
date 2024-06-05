package beginner.day11;

public class Question01 {

    public static class Solution {

        public int solution(int[] box, int n) {

            int width = box[0] / n;
            int depth = box[1] / n;
            int height = box[2] / n;

            return width * depth * height;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] box1 = { 1, 1, 1 };
        int[] box2 = { 10, 8, 6 };

        System.out.println(solution.solution(box1, 1));
        System.out.println(solution.solution(box2, 3));
    }
}
