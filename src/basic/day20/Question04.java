package basic.day20;

import java.util.Arrays;

public class Question04 {

	public static class Solution {

		public int[] solution(int[] arr, int n) {
			int[] answer = {};

			if (arr.length % 2 == 1) {
				for (int i = 0; i < arr.length; i += 2) {
					arr[i] = arr[i] + n;
				}

			} else {
				for (int i = 1; i < arr.length; i += 2) {
					arr[i] = arr[i] + n;
				}
			}
			return answer = Arrays.copyOf(arr, arr.length);
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr1 = { 49, 12, 100, 276, 33 };
		int[] arr2 = { 444, 555, 666, 777 };

		System.out.println(Arrays.toString(solution.solution(arr1, 27)));
		System.out.println(Arrays.toString(solution.solution(arr2, 100)));
	}
}
