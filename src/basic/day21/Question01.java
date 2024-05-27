package basic.day21;

import java.util.Arrays;

public class Question01 {

	public static class Solution {

		public int[] solution(int[] num_list) {
			int[] answer = {};

			answer = Arrays.stream(num_list)
					.sorted()
					.skip(5)
					.toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] num_list = { 12, 4, 15, 46, 38, 1, 14, 56, 32, 10 };

		System.out.println(Arrays.toString(solution.solution(num_list)));
	}
}
