package basic.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question02 {

	public static class Solution {

		public int[] solution(int n, int k) {
			int[] answer = {};

			List<Integer> numbers = new ArrayList<>();

			for (int i = 1; i <= n; i++) {
				if (i % k == 0) {
					numbers.add(i);
				}
			}
			return answer = numbers.stream().mapToInt(Integer::intValue).toArray();
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(Arrays.toString(solution.solution(10, 3)));
		System.out.println(Arrays.toString(solution.solution(15, 5)));
	}
}
