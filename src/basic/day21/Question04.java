package basic.day21;

public class Question04 {

	public static class Solution {

		public int solution(String num_str) {
			int answer = 0;

			int[] result = new int[num_str.length()];
			String[] split = num_str.split("");

			for (int i = 0; i < result.length; i++) {
				result[i] = Integer.parseInt(split[i]);
			}

			for (int j = 0; j < result.length; j++) {
				answer += result[j];
			}

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("123456789"));
		System.out.println(solution.solution("1000000"));
	}
}
