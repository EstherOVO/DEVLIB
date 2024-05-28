package basic.day23;

public class Question04 {

	public static class Solution {

		public int solution(int a, int b) {

			return a % 2 == 1 && b % 2 == 1 ?
					(a * a) + (b * b) :
					(a % 2 == 1 || b % 2 == 1 ? 2 * (a + b) : Math.abs(a - b));
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution(3, 5));
		System.out.println(solution.solution(6, 1));
		System.out.println(solution.solution(2, 4));
	}
}
