package basic.day09;

import java.util.Arrays;

public class Question04 {

	public static class Solution {

		public String[] solution(String my_string) {
			String[] answer = new String[my_string.length()];

			for (int i = 0; i < my_string.length(); i++) {
				answer[i] = my_string.substring((my_string.length() - 1) - i, my_string.length());
			}

			Arrays.sort(answer);

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(Arrays.toString(solution.solution("banana")));
		System.out.println(Arrays.toString(solution.solution("programmers")));
	}
}
