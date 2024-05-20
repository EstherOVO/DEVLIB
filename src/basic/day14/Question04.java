package basic.day14;

public class Question04 {

	public static class Solution {

		public int solution(int[] numbers, int n) {
			int answer = 0;

			for (int i = 0; i < numbers.length; i++) {
				answer += numbers[i];
				if (answer > n) {
					break;
				}
			}
			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] numbers1 = { 34, 5, 71, 29, 100, 34 };
		int[] numbers2 = { 58, 44, 27, 10, 100 };

		System.out.println(solution.solution(numbers1, 123));
		System.out.println(solution.solution(numbers2, 139));
	}
}
