package basic.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question04 {

	public static class Solution {

		public int[] solution(int[] arr) {
			int[] answer = {};

			List<Integer> stk = new ArrayList<>();

			for (int i = 0; i < arr.length; i++) {
				if (stk.isEmpty()) {
					stk.add(arr[i]);
				} else {
					int number = stk.get(stk.size() - 1);

					if (arr[i] == number) {
						stk.remove(stk.size() - 1);
					} else {
						stk.add(arr[i]);
					}
				}
			}

			if (stk.isEmpty()) {
				stk.add(-1);
			}

			answer = stk.stream().mapToInt(Integer::intValue).toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr1 = { 0, 1, 1, 1, 0 };
		int[] arr2 = { 0, 1, 0, 1, 0 };
		int[] arr3 = { 0, 1, 1, 0 };

		System.out.println(Arrays.toString(solution.solution(arr1)));
		System.out.println(Arrays.toString(solution.solution(arr2)));
		System.out.println(Arrays.toString(solution.solution(arr3)));
	}
}
