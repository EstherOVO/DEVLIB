package basic.day10;

public class Question01 {

	public static class Solution {

		public String solution(String my_string, int n) {

			return my_string.substring(0, n);
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("ProgrammerS123", 11));
		System.out.println(solution.solution("He110W0r1d", 5));
	}
}
