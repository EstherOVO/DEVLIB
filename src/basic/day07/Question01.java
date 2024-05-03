package basic.day07;

import java.util.Arrays;

public class Question01 {

	public static class Solution {

		public int[] solution(int[] arr, int[][] queries) {
			int[] answer = arr;

			for (int[] query : queries) {

				int s = query[0];
				int e = query[1];
				int k = query[2];

				for (int i = s; i <= e; i++) {
					if (i % k == 0) {
						arr[i] = arr[i] + 1;
					}
				}
			}

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr = { 0, 1, 2, 4, 3 };
		int[][] queries = { { 0, 4, 1 }, { 0, 3, 2 }, { 0, 3, 3 } };

		System.out.println(Arrays.toString(solution.solution(arr, queries)));
	}
}
