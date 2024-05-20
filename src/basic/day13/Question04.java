package basic.day13;

import java.util.Arrays;

public class Question04 {

	public static class Solution {

		public int[] solution(int[] num_list, int n) {
			int[] answer = new int[n];

			for (int i = 0; i < n; i++) {
				answer[i] = num_list[i];
			}
			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] num_list1 = { 2, 1, 6 };
		int[] num_list2 = { 5, 2, 1, 7, 5 };

		System.out.println(Arrays.toString(solution.solution(num_list1, 1)));
		System.out.println(Arrays.toString(solution.solution(num_list2, 3)));
	}
}
