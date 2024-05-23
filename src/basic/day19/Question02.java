package basic.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question02 {

	public static class Solution {

		public int[] solution(int[] arr) {
			int[] answer = {};

			List<Integer> intList = new ArrayList<>();

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i]; j++) {
					intList.add(arr[i]);
				}
			}

			answer = intList.stream().mapToInt(Integer::intValue).toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr1 = { 5, 1, 4 };
		int[] arr2 = { 6, 6 };
		int[] arr3 = { 1 };

		System.out.println(Arrays.toString(solution.solution(arr1)));
		System.out.println(Arrays.toString(solution.solution(arr2)));
		System.out.println(Arrays.toString(solution.solution(arr3)));
	}
}
