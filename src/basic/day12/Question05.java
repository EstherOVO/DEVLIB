package basic.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question05 {

	public static class Solution {

		public int[] solution(int[] arr, int[] query) {
			int[] answer = {};

			List<Integer> numberList = new ArrayList<>();

			for (int i = 0; i < arr.length; i++) {
				numberList.add(arr[i]);
			}

			for (int i = 0; i < query.length; i++) {
				if (i % 2 == 0) {
					numberList.subList(query[i] + 1, numberList.size()).clear();
				} else {
					numberList.subList(0, query[i]).clear();
				}
			}

			answer = numberList.stream().mapToInt(Integer::intValue).toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr = { 0, 1, 2, 3, 4, 5 };
		int[] query = { 4, 1, 2 };

		System.out.println(Arrays.toString(solution.solution(arr, query)));
	}
}
