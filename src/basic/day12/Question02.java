package basic.day12;

public class Question02 {

	public static class Solution {

		public int solution(int[] num_list) {
			int answer = -1;

			for (int i = 0; i < num_list.length; i++) {
				if (num_list[i] < 0) {
					return i;
				}
			}
			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] num_list1 = { 12, 4, 15, 46, 38, -2, 15 };
		int[] num_list2 = { 13, 22, 53, 24, 15, 6 };

		System.out.println(solution.solution(num_list1));
		System.out.println(solution.solution(num_list2));
	}
}
