package basic.day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question05 {

	public static class Solution {

		public int[] solution(int[] arr) {
			int[] stk = {};

			List<Integer> intList = new ArrayList<>();

			int i = 0;

			for (i = 0; i < arr.length;) {

				if (intList.isEmpty()) {
					intList.add(arr[i]);
					i++;
				} else {
					if (!intList.isEmpty() && intList.get(intList.size() - 1) < arr[i]) {
						intList.add(arr[i]);
						i++;
					} else if (!intList.isEmpty() && intList.get(intList.size() - 1) >= arr[i]) {
						intList.remove(intList.size() - 1);
					}
				}
			}

			stk = intList.stream().mapToInt(Integer::intValue).toArray();

			return stk;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr = { 1, 4, 2, 5, 3 };

		System.out.println(Arrays.toString(solution.solution(arr)));
	}
}
