package basic.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question04 {

	public static class Solution {

		public int[] solution(int[] arr) {
			int[] answer = {};

			List<Integer> numberList = new ArrayList<>();

			int first = 0;
			int last = 0;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 2) {
					first = i;
					numberList.add(arr[i]);
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[j] == 2) {
							last = j;
						}
					}
					break;
				}
			}

			for (int k = first + 1; k <= last; k++) {
				numberList.add(arr[k]);
			}

			if (numberList.isEmpty()) {
				numberList.add(-1);
			}

			answer = numberList.stream().mapToInt(Integer::intValue).toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr1 = { 1, 2, 1, 4, 5, 2, 9 };
		int[] arr2 = { 1, 2, 1 };
		int[] arr3 = { 1, 1, 1 };
		int[] arr4 = { 1, 2, 1, 2, 1, 10, 2, 1 };

		System.out.println(Arrays.toString(solution.solution(arr1)));
		System.out.println(Arrays.toString(solution.solution(arr2)));
		System.out.println(Arrays.toString(solution.solution(arr3)));
		System.out.println(Arrays.toString(solution.solution(arr4)));
	}
}
