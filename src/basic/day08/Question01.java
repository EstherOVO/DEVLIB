package basic.day08;

public class Question01 {

	public static class Solution {

		public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {

			return (x1 || x2) && (x3 || x4);
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution(false, true, true, true));
		System.out.println(solution.solution(true, false, false, false));
	}
}
