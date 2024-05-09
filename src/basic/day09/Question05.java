package basic.day09;

public class Question05 {

	public static class Solution {

		public int solution(String my_string, String is_suffix) {
			int answer = 0;

			String[] strs = new String[my_string.length()];

			for (int i = 0; i < my_string.length(); i++) {
				strs[i] = my_string.substring((my_string.length() - 1) - i, my_string.length());
			}

			for (String str : strs) {
				if (str.equals(is_suffix)) {
					answer = 1;
				}
			}
			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("banana", "ana"));
		System.out.println(solution.solution("banana", "nan"));
		System.out.println(solution.solution("banana", "wxyz"));
		System.out.println(solution.solution("banana", "abanana"));
	}
}
