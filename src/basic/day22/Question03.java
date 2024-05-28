package basic.day22;

public class Question03 {

	public static class Solution {

		public String solution(int n) {

			return String.valueOf(n);
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution(123));
		System.out.println(solution.solution(2573));
	}
}
