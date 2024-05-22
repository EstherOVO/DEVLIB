package basic.day17;

public class Question02 {

	public static class Solution {

		public int solution(String myString, String pat) {
			int answer = 0;

			for (int i = 0; i < myString.length(); i++) {
				String subStr = myString.substring(0, i + 1);
				if (subStr.endsWith(pat)) {
					answer++;
				}
			}
			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("banana", "ana"));
		System.out.println(solution.solution("aaaa", "aa"));
	}
}
