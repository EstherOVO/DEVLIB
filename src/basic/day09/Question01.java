package basic.day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question01 {

	public static class Solution {

		public int[] solution(String[] intStrs, int k, int s, int l) {
			int[] answer = {};

			List<Integer> numberList = new ArrayList<>();

			for (int i = 0; i < intStrs.length; i++) {
				String str = intStrs[i].substring(s, s + l);
				if (Integer.parseInt(str) > k) {
					numberList.add(Integer.parseInt(str));
				}
			}

			answer = numberList.stream()
					.mapToInt(Integer::intValue)
					.toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		String[] intStrs = { "0123456789", "9876543210", "9999999999999" };

		System.out.println(Arrays.toString(solution.solution(intStrs, 50000, 5, 5)));
	}
}
