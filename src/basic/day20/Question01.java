package basic.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question01 {

	public static class Solution {

		public int[] solution(int[] arr) {
			int[] answer = {};

			List<Integer> intList = new ArrayList<>();

			for (int i = 0; i < arr.length; i++) {
				intList.add(arr[i]);
			}

			int number = 0;
			for (int i = 0; i < 11; i++) {
				if (intList.size() <= Math.pow(2, i)) {
					number = i;
					break;
				}
			}
			
			if (intList.size() != Math.pow(2, number)) {
				while (true) {
					intList.add(0);
					int size = intList.size();
					if (size == Math.pow(2, number)) break;
				}
			}
			
			answer = intList.stream().mapToInt(Integer::intValue).toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 58, 172, 746, 89 };

		System.out.println(Arrays.toString(solution.solution(arr1)));
		System.out.println(Arrays.toString(solution.solution(arr2)));
	}
}
