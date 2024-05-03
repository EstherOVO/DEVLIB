package basic.day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question03 {

	public static class Solution {

		public int[] solution(int start_num, int end_num) {
			int[] answer = {};

			List<Integer> intList = new ArrayList<>();

			for (int i = start_num; i <= end_num; i++) {
				intList.add(i);
			}

			answer = intList.stream().mapToInt(Integer::intValue).toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(Arrays.toString(solution.solution(3, 10)));
	}
}
