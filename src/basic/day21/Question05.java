package basic.day21;

public class Question05 {

	public static class Solution {

		public int solution(String n_str) {

			return Integer.parseInt(n_str);
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("10"));
		System.out.println(solution.solution("8542"));
	}
}
