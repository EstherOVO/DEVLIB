package basic.day04;

import java.util.ArrayList;
import java.util.List;

public class Question03 {

	public static class Solution {

		public int solution(int n) {
			int answer = 0;

			List<Integer> list = new ArrayList<>();
			for (int i = 1; i <= n; i++) {
				list.add(i);
			}

			if (n % 2 != 0) {
				answer = list.stream().filter(number -> number % 2 != 0).mapToInt(Integer::intValue).sum();
			} else {
				answer = list.stream().filter(number -> number % 2 == 0).mapToInt(number -> number * number).sum();
			}
			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution(10));
	}
}
