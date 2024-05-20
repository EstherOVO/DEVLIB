package basic.day13;

import java.util.Arrays;

public class Question01 {

	public static class Solution {

		public int[] solution(int[] num_list, int n) {
			int[] answer = new int[num_list.length - (n - 1)];

			int count = 0;
			for (int i = n - 1; i < num_list.length; i++) {
				answer[count] = num_list[i];
				count++;
			}
			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] num_list1 = { 2, 1, 6 };
		int[] num_list2 = { 5, 2, 1, 7, 5 };

		System.out.println(Arrays.toString(solution.solution(num_list1, 3)));
		System.out.println(Arrays.toString(solution.solution(num_list2, 2)));
	}
}
