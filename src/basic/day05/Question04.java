package basic.day05;

public class Question04 {

	public static class Solution {

		public int solution(int[] num_list) {
			int answer = 0;

			int multiply = 1;
			int sum = 0;

			for (int i : num_list) {
				multiply *= i;
			}

			for (int i : num_list) {
				sum += i;
			}

			double pow = Math.pow(sum, 2);

			if (multiply < pow) {
				answer = 1;
				return answer;
			} else {
				return answer;
			}
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] num_list = { 3, 4, 5, 2, 1 };

		System.out.println(solution.solution(num_list));
	}
}
