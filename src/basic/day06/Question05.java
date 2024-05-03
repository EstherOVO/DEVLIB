package basic.day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question05 {

	public static class Solution {

		public int[] solution(int[] arr, int[][] queries) {
			int[] answer = {};

			List<Integer> qList = new ArrayList<>();
			List<Integer> fList = new ArrayList<>();

			for (int i = 0; i < queries.length; i++) {

				for (int j = queries[i][0]; j <= queries[i][1]; j++) {
					if (arr[j] > queries[i][2]) {
						qList.add(arr[j]);
					}
				}

				if (!qList.isEmpty()) {
					Collections.sort(qList);
					fList.add(qList.get(0));
				} else {
					fList.add(-1);
				}

				qList.clear();
			}

			answer = fList.stream().mapToInt(Integer::intValue).toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr = { 0, 1, 2, 4, 3 };
		int[][] queries = { { 0, 4, 2 }, { 0, 3, 2 }, { 0, 2, 2 } };

		System.out.println(Arrays.toString(solution.solution(arr, queries)));
	}
}
