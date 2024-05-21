package basic.day16;

public class Question01 {

	public static class Solution {

		public String solution(String myString) {

			return myString.toUpperCase();
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("aBcDeFg"));
		System.out.println(solution.solution("AAA"));
	}
}
