package basic.day18;

public class Question04 {

	public static class Solution {

		public int solution(String myString, String pat) {
			int answer = 0;

			String[] split = pat.split("");
			StringBuilder abba = new StringBuilder();

			for (int i = 0; i < split.length; i++) {
				if (split[i].equals("A")) {
					split[i] = "B";
					abba.append(split[i]);
				} else {
					split[i] = "A";
					abba.append(split[i]);
				}
			}

			if (myString.contains(abba.toString())) {
				answer = 1;
			}

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("ABBAA", "AABB"));
		System.out.println(solution.solution("ABAB", "ABAB"));
	}
}
