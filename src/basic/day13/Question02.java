package basic.day13;

import java.util.Arrays;

public class Question02 {

	public static class Solution {

		public int[] solution(int[] num_list, int n) {
			int[] answer = new int[num_list.length];

			int[] intArray1 = Arrays.copyOfRange(num_list, n, num_list.length);
			int[] intArray2 = Arrays.copyOfRange(num_list, 0, n);

			System.arraycopy(intArray1, 0, answer, 0, intArray1.length);
			System.arraycopy(intArray2, 0, answer, intArray1.length, intArray2.length);

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] num_list1 = { 2, 1, 6 };
		int[] num_list2 = { 5, 2, 1, 7, 5 };

		System.out.println(Arrays.toString(solution.solution(num_list1, 1)));
		System.out.println(Arrays.toString(solution.solution(num_list2, 3)));
	}
}
