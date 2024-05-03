package basic.day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question04 {

	public static class Solution {

		public int[] solution(int n) {
			int[] answer = {};

			List<Integer> numbers = new ArrayList<>();

			numbers.add(n);

			while (!(n == 1)) {

				if (n % 2 == 0) {
					n = n / 2;
					numbers.add(n);
				} else {
					n = 3 * n + 1;
					numbers.add(n);
				}
			}

			answer = numbers.stream().mapToInt(Integer::intValue).toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(Arrays.toString(solution.solution(10)));
	}
}
