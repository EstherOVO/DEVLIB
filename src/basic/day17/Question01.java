package basic.day17;

public class Question01 {

	public static class Solution {

		public String solution(String myString, String pat) {
			String answer = "";

			for (int i = myString.length() - 1; i >= 0; i--) {
				String subStr = myString.substring(0, i + 1);
				if (subStr.endsWith(pat)) {
					answer = subStr;
					break;
				}
			}
			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("AbCdEFG", "dE"));
		System.out.println(solution.solution("AAAAaaaa", "a"));
	}
}
