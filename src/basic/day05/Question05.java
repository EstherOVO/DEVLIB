package basic.day05;

public class Question05 {

	public static class Solution {

		public int solution(int[] num_list) {
			int answer = 0;

			String even = "";
			String odd = "";

			for (int i : num_list) {
				if (i % 2 == 0) {
					even += String.valueOf(i);
				} else {
					odd += String.valueOf(i);
				}
			}

			answer = Integer.valueOf(even) + Integer.valueOf(odd);

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] num_list = { 3, 4, 5, 2, 1 };

		System.out.println(solution.solution(num_list));
	}
}
