package basic.day22;

public class Question01 {

	public static class Solution {

		public String solution(String n_str) {

			return String.valueOf(Integer.valueOf(n_str));
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("0010"));
		System.out.println(solution.solution("854020"));
	}
}
