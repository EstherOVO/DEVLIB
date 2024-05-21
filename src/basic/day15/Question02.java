package basic.day15;

import java.util.Arrays;

public class Question02 {

	public static class Solution {

		public int solution(int[] arr) {
			int answer = 0;

			while (true) {

				int[] temp = Arrays.copyOf(arr, arr.length);

				for (int i = 0; i < arr.length; i++) {
					if (arr[i] >= 50 && arr[i] % 2 == 0) {
						arr[i] = arr[i] / 2;
					} else if (arr[i] < 50 && arr[i] % 2 == 1) {
						arr[i] = (arr[i] * 2) + 1;
					}
				}

				if (Arrays.equals(arr, temp)) {
					break;
				}

				answer++;
			}
			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr = { 1, 2, 3, 100, 99, 98 };

		System.out.println(solution.solution(arr));
	}
}
