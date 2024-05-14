package basic.day11;

public class Question05 {

	public static class Solution {

		public int solution(int[] arr, int idx) {
			int answer = -1;

			for (int i = 0; i < arr.length; i++) {
				if (i >= idx) {
					if (arr[i] == 1) {
						return i;
					}
				}
			}
			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr1 = { 0, 0, 0, 1 };
		int[] arr2 = { 1, 0, 0, 1, 0, 0 };
		int[] arr3 = { 1, 1, 1, 1, 0 };

		System.out.println(solution.solution(arr1, 1));
		System.out.println(solution.solution(arr2, 4));
		System.out.println(solution.solution(arr3, 3));
	}
}
