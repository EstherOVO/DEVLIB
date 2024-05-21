package basic.day16;

public class Question02 {

	public static class Solution {

		public String solution(String myString) {

			return myString.toLowerCase();
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("aBcDeFg"));
		System.out.println(solution.solution("aaa"));
	}
}
