package basic.day23;

public class Question03 {

	public static class Solution {

		public int solution(int[] num_list, int n) {
			int answer = 0;

			for (int i = 0; i < num_list.length; i++) {
				if (num_list[i] == n) {
					answer = 1;
					break;
				}
			}
			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] num_list1 = { 1, 2, 3, 4, 5 };
		int[] num_list2 = { 15, 98, 23, 2, 15 };

		System.out.println(solution.solution(num_list1, 3));
		System.out.println(solution.solution(num_list2, 20));
	}
}
