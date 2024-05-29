package beginner.day02;

import java.util.Arrays;

public class Question03 {

    public static class Solution {

        public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            int numer = numer1 * denom2 + numer2 * denom1;
            int denom = denom1 * denom2;

            int gcd = gcd(numer, denom);

            numer /= gcd;
            denom /= gcd;

            return new int[]{numer, denom};
        }

        public int gcd(int a, int b) {
            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }
            return a;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(1, 2, 3, 4)));
        System.out.println(Arrays.toString(solution.solution(9, 2, 1, 3)));
    }
}
