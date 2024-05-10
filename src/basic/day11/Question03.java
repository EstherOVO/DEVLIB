package basic.day11;

public class Question03 {

	public static class Solution {

		public String solution(String my_string, int[] indices) {
			String answer = "";

			String[] split = my_string.split("");

			for (int index : indices) {
				split[index] = "";
			}
			return answer = String.join("", split);
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] indices = { 1, 16, 6, 15, 0, 10, 11, 3 };

		System.out.println(solution.solution("apporoograpemmemprs", indices));
	}
}
