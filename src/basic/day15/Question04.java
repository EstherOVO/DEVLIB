package basic.day15;

public class Question04 {

	public static class Solution {

		public int solution(int[] num_list) {
			int answer = 0;

			if (num_list.length >= 11) {
				int sum = 0;
				for (int i = 0; i < num_list.length; i++) {
					sum += num_list[i];
				}
				answer = sum;

			} else {
				int mul = 1;
				for (int j = 0; j < num_list.length; j++) {
					mul *= num_list[j];
				}
				answer = mul;
			}
			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] num_list1 = { 3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1 };
		int[] num_list2 = { 2, 3, 4, 5 };

		System.out.println(solution.solution(num_list1));
		System.out.println(solution.solution(num_list2));
	}
}
