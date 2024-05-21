package basic.day15;

public class Question03 {

	public static class Solution {

		public int solution(int[] num_list) {
			int answer = 0;

			for (int i = 0; i < num_list.length; i++) {

				while (true) {

					if (num_list[i] == 1) break;

					if (num_list[i] % 2 == 0) {
						num_list[i] = num_list[i] / 2;
						answer++;
					} else {
						num_list[i] = (num_list[i] - 1) / 2;
						answer++;
					}
				}
			}
			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] num_list = { 12, 4, 15, 1, 14 };

		System.out.println(solution.solution(num_list));
	}
}
