package basic.day04;

public class Question04 {

	public static class Solution {

		public int solution(String ineq, String eq, int n, int m) {
			int answer = 0;

			if (eq.equals("=")) {
				switch (ineq) {
				case "<":
					answer = (n <= m ? 1 : 0);
					break;
				case ">":
					answer = (n >= m ? 1 : 0);
					break;
				}
			} else {
				switch (ineq) {
				case "<":
					answer = (n < m ? 1 : 0);
					break;
				case ">":
					answer = (n > m ? 1 : 0);
					break;
				}
			}

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("<", "=", 20, 50));
	}
}
