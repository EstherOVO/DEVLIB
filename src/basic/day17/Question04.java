package basic.day17;

import java.util.Arrays;

public class Question04 {

	public static class Solution {

		public String[] solution(String my_string) {

			return my_string.split(" ");
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(Arrays.toString(solution.solution("i love you")));
		System.out.println(Arrays.toString(solution.solution("programmers")));
	}
}
