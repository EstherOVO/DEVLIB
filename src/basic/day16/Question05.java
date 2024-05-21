package basic.day16;

public class Question05 {

	public static class Solution {

		public String solution(String my_string, String alp) {
			StringBuilder answer = new StringBuilder();

			String[] split = my_string.split("");

			for (int i = 0; i < split.length; i++) {
				if (split[i].equals(alp)) {
					split[i] = split[i].toUpperCase();
				}

				answer.append(split[i]);
			}
			return answer.toString();
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("programmers", "p"));
		System.out.println(solution.solution("lowercase", "x"));
	}
}
