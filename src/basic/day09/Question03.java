package basic.day09;

public class Question03 {

	public static class Solution {

		public String solution(String my_string, int n) {
			String answer = "";

			int x = my_string.length() - n;

			return answer = my_string.substring(x, my_string.length());
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("ProgrammerS123", 11));
		System.out.println(solution.solution("He110W0r1d", 5));
	}
}
