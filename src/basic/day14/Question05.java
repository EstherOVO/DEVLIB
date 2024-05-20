package basic.day14;

import java.util.Arrays;

public class Question05 {

	public static class Solution {

		public int[] solution(int[] arr, int[][] queries) {
			int[] answer = {};

			for (int i = 0; i < queries.length; i++) {
				int i1 = queries[i][0];
				int i2 = queries[i][1];

				for (int j = 0; j < arr.length; j++) {
					if (j >= i1 && j <= i2) {
						arr[j] = arr[j] + 1;
					}
				}
			}
			return answer = Arrays.copyOf(arr, arr.length);
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr = { 0, 1, 2, 3, 4 };
		int[][] queries = { {0, 1}, {1, 2}, {2, 3} };

		System.out.println(Arrays.toString(solution.solution(arr, queries)));
	}
}
