package basic.day10;

public class Question02 {

	public static class Solution {

		public int solution(String my_string, String is_prefix) {
			int answer = 0;

			String[] strs = new String[my_string.length()];

			for (int i = 0; i < my_string.length(); i++) {
				strs[i] = my_string.substring(0, i + 1);
			}

			for (String str : strs) {
				if (str.equals(is_prefix)) {
					answer = 1;
				}
			}
			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("banana", "ban"));
		System.out.println(solution.solution("banana", "nan"));
		System.out.println(solution.solution("banana", "abcd"));
		System.out.println(solution.solution("banana", "bananan"));
	}
}
