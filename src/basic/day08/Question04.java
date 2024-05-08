package basic.day08;

public class Question04 {

	public static class Solution {

		public int solution(String number) {
			int answer = 0;

			int sum = 0;
			for (int i = 0; i < number.length(); i++) {
				sum += number.charAt(i) - '0';
			}
			return answer = sum % 9;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("123"));
		System.out.println(solution.solution("78720646226947352489"));
	}
}
