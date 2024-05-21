package basic.day15;

public class Question05 {

	public static class Solution {

		public int solution(String myString, String pat) {
			int answer = 0;

			if (myString.toLowerCase().contains(pat.toLowerCase())) {
				answer = 1;
			}

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("AbCdEfG", "aBc"));
		System.out.println(solution.solution("aaAA", "aaaaa"));
	}
}
