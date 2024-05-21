package basic.day16;

public class Question04 {

	public static class Solution {

		public String solution(String myString) {
			StringBuilder answer = new StringBuilder();

			String[] split = myString.split("");

			for (int i = 0; i < split.length; i++) {
				if (split[i].equals("a")) {
					split[i] = "A";
				}

				if (Character.isUpperCase(myString.charAt(i)) && !split[i].equals("A")) {
					split[i] = split[i].toLowerCase();
				}
			}

			for (int i = 0; i < split.length; i++) {
				answer.append(split[i]);
			}

			return answer.toString();
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("abstract algebra"));
		System.out.println(solution.solution("PrOgRaMmErS"));
	}
}
