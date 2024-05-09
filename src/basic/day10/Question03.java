package basic.day10;

public class Question03 {

	public static class Solution {

		public String solution(String my_string, int s, int e) {
			StringBuilder answer = new StringBuilder();
			answer.append(my_string);

			StringBuilder substring = new StringBuilder();

			String str = answer.substring(s, e + 1);
			substring.append(str).reverse();

			answer.replace(s, e + 1, substring.toString());

			return answer.toString();
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("Progra21Sremm3", 6, 12));
		System.out.println(solution.solution("Stanley1yelnatS", 4, 10));
	}
}
