package basic.day20;

public class Question02 {

	public static class Solution {

		public int solution(int[] arr1, int[] arr2) {
			int answer = 0;

			if (arr1.length == arr2.length) {
				int arr1Sum = 0;
				int arr2Sum = 0;

				for (int i = 0; i < arr1.length; i++) {
					arr1Sum += arr1[i];
				}

				for (int j = 0; j < arr2.length; j++) {
					arr2Sum += arr2[j];
				}
				answer = arr1Sum != arr2Sum ? (arr1Sum > arr2Sum ? 1 : -1) : answer;

			} else {
				answer = arr1.length > arr2.length ? 1 : -1;
			}
			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] arr1 = { 49, 13 };
		int[] arr2 = { 70, 11, 2 };

		int[] arr3 = { 100, 17, 84, 1 };
		int[] arr4 = { 55, 12, 65, 36 };

		int[] arr5 = { 1, 2, 3, 4, 5 };
		int[] arr6 = { 3, 3, 3, 3, 3 };

		System.out.println(solution.solution(arr1, arr2));
		System.out.println(solution.solution(arr3, arr4));
		System.out.println(solution.solution(arr5, arr6));
	}
}
