package basic.day23;

public class Question01 {

	public static class Solution {

		public int solution(String str1, String str2) {

			return str2.contains(str1) ? 1 : 0;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("abc", "aabcc"));
		System.out.println(solution.solution("tbt", "tbbttb"));
	}
}
