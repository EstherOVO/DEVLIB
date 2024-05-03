package basic.day06;

public class Question02 {

	public static class Solution {

		public int solution(int n, String control) {
			int answer = 0;

			String[] split = control.split("");

			for (String string : split) {
				switch (string) {
				case "w" -> n = n + 1;
				case "s" -> n = n - 1;
				case "d" -> n = n + 10;
				case "a" -> n = n - 10;
				}
			}

			answer = n;

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution(0, "wsdawsdassw"));
	}
}
