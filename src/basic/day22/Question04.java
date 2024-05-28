package basic.day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question04 {

	public static class Solution {

		public int[] solution(int[] arr, int[] delete_list) {
			int[] answer = {};

			List<Integer> intList = new ArrayList<>();

			for (int i = 0; i < arr.length; i++) {
				intList.add(arr[i]);
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < delete_list.length; j++) {
					if (arr[i] == delete_list[j]) {
						intList.remove(intList.indexOf(arr[i]));
					}
				}
			}

			answer = intList.stream().mapToInt(Integer::intValue).toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr1 = { 293, 1000, 395, 678, 94 };
		int[] delete_list1 = { 94, 777, 104, 1000, 1, 12 };

		int[] arr2 = { 110, 66, 439, 785, 1 };
		int[] delete_list2 = { 377, 823, 119, 43 };

		System.out.println(Arrays.toString(solution.solution(arr1, delete_list1)));
		System.out.println(Arrays.toString(solution.solution(arr2, delete_list2)));
	}
}
