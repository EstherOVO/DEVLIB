package basic.day23;

import java.time.LocalDate;

public class Question05 {

	public static class Solution {

		public int solution(int[] date1, int[] date2) {
			int answer = 0;

			LocalDate first = LocalDate.of(date1[0], date1[1], date1[2]);
			LocalDate second = LocalDate.of(date2[0], date2[1], date2[2]);

			if (first.isBefore(second)) answer = 1;

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] date1 = { 2021, 12, 28 };
		int[] date2 = { 2021, 12, 29 };

		int[] date3 = { 1024, 10, 24 };
		int[] date4 = { 1024, 10, 24 };

		System.out.println(solution.solution(date1, date2));
		System.out.println(solution.solution(date3, date4));
	}
}
