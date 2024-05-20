package basic.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question05 {

	public static class Solution {

		public int[] solution(int[] num_list, int n) {
			int[] answer = {};

			List<Integer> list = new ArrayList<>();

			for (int i = 0; i < num_list.length; i += n) {
				list.add(num_list[i]);
			}

			answer = list.stream().mapToInt(Integer::intValue).toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] num_list = { 4, 2, 6, 1, 7, 6 };

		System.out.println(Arrays.toString(solution.solution(num_list, 2)));
		System.out.println(Arrays.toString(solution.solution(num_list, 4)));
	}
}
