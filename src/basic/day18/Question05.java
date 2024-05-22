package basic.day18;

public class Question05 {

	public static class Solution {

		public String solution(String rny_string) {

			return rny_string.replace("m", "rn");
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("masterpiece"));
		System.out.println(solution.solution("programmers"));
		System.out.println(solution.solution("jerry"));
		System.out.println(solution.solution("burn"));
	}
}
