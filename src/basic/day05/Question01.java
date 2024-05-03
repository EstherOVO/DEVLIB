package basic.day05;

public class Question01 {

	public static class Solution {

		public String solution(String code) {
			String answer = "";

			StringBuilder sb = new StringBuilder();
			int mode = 0;

			for (int i = 0; i < code.length(); i++) {
				switch (mode) {
				case 0:
					if (code.charAt(i) == '1') {
						mode = 1;
					} else {
						if (i % 2 == 0) {
							sb.append(code.charAt(i));
						}
					}
					break;
				case 1:
					if (code.charAt(i) == '1') {
						mode = 0;
					} else {
						if (i % 2 == 1) {
							sb.append(code.charAt(i));
						}
					}
					break;
				}
			}

			if (sb.toString().isEmpty()) {
				answer = "EMPTY";
			} else {
				answer = sb.toString();
			}

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("abc1abc1abc"));
	}
}
