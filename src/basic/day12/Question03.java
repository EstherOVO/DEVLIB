package basic.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question03 {

	public static class Solution {

		public int[] solution(int[] arr, int[][] intervals) {
			int[] answer = {};

			List<Integer> numberList = new ArrayList<>();

			for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
				numberList.add(arr[i]);
			}

			for (int i = intervals[1][0]; i <= intervals[1][1]; i++) {
				numberList.add(arr[i]);
			}

			answer = numberList.stream().mapToInt(Integer::intValue).toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr = { 1, 2, 3, 4, 5 };
		int[][] intervals = { {1, 3}, {0, 4} };

		System.out.println(Arrays.toString(solution.solution(arr, intervals)));
	}
}
