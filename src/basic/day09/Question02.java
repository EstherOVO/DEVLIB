package basic.day09;

public class Question02 {

	public static class Solution {

		public String solution(String[] my_strings, int[][] parts) {
			StringBuilder answer = new StringBuilder();

			for (int i = 0; i < my_strings.length; i++) {
				answer.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
			}
			return answer.toString();
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		String[] my_strings = { "progressive", "hamburger", "hammer", "ahocorasick" };
		int[][] parts = { {0, 4}, {1, 2}, {3, 5}, {7, 7} };

		System.out.println(solution.solution(my_strings, parts));
	}
}
