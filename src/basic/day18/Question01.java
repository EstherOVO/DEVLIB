package basic.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question01 {

	public static class Solution {

		public int[] solution(String myString) {
			int[] answer = {};

			String[] split = myString.split("x");
			List<Integer> intList = new ArrayList<>();

			for (int i = 0; i < split.length; i++) {
				if (!split[i].equals("x")) {
					intList.add(split[i].length());
				}
			}

			if (myString.endsWith("x")) {
				intList.add(0);
			}

			answer = intList.stream().mapToInt(Integer::intValue).toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(Arrays.toString(solution.solution("oxooxoxxox")));
		System.out.println(Arrays.toString(solution.solution("xabcxdefxghi")));
	}
}
