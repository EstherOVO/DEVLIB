package basic.day18;

public class Question03 {

	public static class Solution {

		public int solution(String binomial) {
			int answer = 0;

			String[] split = binomial.split(" ");

			int i1 = Integer.parseInt(split[0]);
			int i2 = Integer.parseInt(split[2]);

			switch (split[1]) {
				case "+" -> answer = i1 + i2;
				case "-" -> answer = i1 - i2;
				case "*" -> answer = i1 * i2;
			}
			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("43 + 12"));
		System.out.println(solution.solution("0 - 7777"));
		System.out.println(solution.solution("40000 * 40000"));
	}
}
