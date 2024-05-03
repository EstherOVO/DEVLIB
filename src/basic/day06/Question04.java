package basic.day06;

import java.util.Arrays;

public class Question04 {

	public static class Solution {

		public int[] solution(int[] arr, int[][] queries) {
			int[] answer = arr;

			int temp = 0;

			for (int i = 0; i < queries.length; i++) {
				temp = answer[queries[i][0]];
				answer[queries[i][0]] = answer[queries[i][1]];
				answer[queries[i][1]] = temp;
			}

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr = { 0, 1, 2, 3, 4 };
		int[][] queries = { { 0, 3 }, { 1, 2 }, { 1, 4 } };

		System.out.println(Arrays.toString(solution.solution(arr, queries)));
	}
}
