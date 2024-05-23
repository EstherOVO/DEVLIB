package basic.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question05 {

	public static class Solution {

		public int[] solution(int[] arr, int k) {
			int[] answer = {};

			List<Integer> intList = new ArrayList<>();

			for (int i = 0; i < arr.length; i++) {
				if (!intList.contains(arr[i])) {
					if (intList.size() != k) {
						intList.add(arr[i]);
					} else {
						break;
					}
				}
			}

			if (intList.size() != k) {
				for (int i = intList.size(); i < k; i++) {
					intList.add(-1);
				}
			}

			answer = intList.stream().mapToInt(Integer::intValue).toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr1 = { 0, 1, 1, 2, 2, 3 };
		int[] arr2 = { 0, 1, 1, 1, 1 };

		System.out.println(Arrays.toString(solution.solution(arr1, 3)));
		System.out.println(Arrays.toString(solution.solution(arr2, 4)));
	}
}
