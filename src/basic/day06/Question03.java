package basic.day06;

public class Question03 {

	public static class Solution {

		public String solution(int[] numLog) {
			String answer = "";

			for (int i = 1; i < numLog.length; i++) {
				int num = numLog[i] - numLog[i - 1];
				switch (num) {
				case 1 -> answer += "w";
				case -1 -> answer += "s";
				case 10 -> answer += "d";
				case -10 -> answer += "a";
				}
			}

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] num_list = { 0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1 };

		System.out.println(solution.solution(num_list));
	}
}
