package basic.day14;

public class Question01 {

	public static class Solution {

		public int solution(int[] num_list) {
			int answer = 0;

			int evenSum = 0;
			int oddSum = 0;
			for (int i = 0; i < num_list.length; i++) {
				if (i % 2 == 0) {
					evenSum += num_list[i];
				} else {
					oddSum += num_list[i];
				}
			}

			answer = Math.max(evenSum, oddSum);

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] num_list1 = { 4, 2, 6, 1, 7, 6 };
		int[] num_list2 = { -1, 2, 5, 6, 3 };

		System.out.println(solution.solution(num_list1));
		System.out.println(solution.solution(num_list2));
	}
}
