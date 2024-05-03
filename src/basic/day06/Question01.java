package basic.day06;

import java.util.Arrays;

public class Question01 {

	public static class Solution {

		public int[] solution(int[] num_list) {
			int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

			for (int i = 0; i < answer.length; i++) {
				if (i == answer.length - 1) {
					if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
						answer[answer.length - 1] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
					} else {
						answer[answer.length - 1] = num_list[num_list.length - 1] * 2;
					}
				}
			}

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] num_list = { 2, 1, 6 };

		System.out.println(Arrays.toString(solution.solution(num_list)));
	}
}
