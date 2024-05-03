package basic.day05;

public class Question03 {

	public static class Solution {

		public int solution(int a, int b, int c) {
			int answer = 0;

			double i1 = a + b + c;
			double i2 = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
			double i3 = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);

			if (a != b && a != c && b != c) {
				answer = (int) i1;
			} else if (a == b && a == c) {
				answer = (int) (i1 * i2 * i3);
			} else {
				answer = (int) (i1 * i2);
			}

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution(5, 3, 3));
	}
}
