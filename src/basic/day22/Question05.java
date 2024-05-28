package basic.day22;

public class Question05 {

	public static class Solution {

		public int solution(String my_string, String target) {

			return my_string.contains(target) ? 1 : 0;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("banana", "ana"));
		System.out.println(solution.solution("banana", "wxyz"));
	}
}
