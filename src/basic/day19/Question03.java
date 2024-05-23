package basic.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question03 {

	public static class Solution {

		public int[] solution(int[] arr, boolean[] flag) {
			int[] answer = {};

			List<Integer> intList = new ArrayList<>();

			for (int i = 0; i < arr.length; i++) {
				if (flag[i]) {
					for (int j = 0; j < arr[i] * 2; j++) {
						intList.add(arr[i]);
					}
				} else {
					int size = intList.size();
					for (int k = size - 1; k >= size - arr[i]; k--) {
						intList.remove(k);
					}
				}
			}

			answer = intList.stream().mapToInt(Integer::intValue).toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr = { 3, 2, 4, 1, 3 };
		boolean[] flag = { true, false, true, false, false };

		System.out.println(Arrays.toString(solution.solution(arr, flag)));
	}
}
