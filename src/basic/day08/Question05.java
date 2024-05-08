package basic.day08;

public class Question05 {

	public static class Solution {

		public String solution(String my_string, int[][] queries) {
			StringBuilder answer = new StringBuilder();
			answer.append(my_string);

			StringBuilder sb = new StringBuilder();

			int a = 0;
			int b = 0;
			for (int i = 0; i < queries.length; i++) {
				for (int j = 0; j < queries[i].length; j++) {
					a = queries[i][0];
					b = queries[i][1];
				}
				String substring = answer.substring(a, b + 1);
				sb.append(substring).reverse();
				answer.replace(a, b + 1, sb.toString());

				sb.setLength(0);
			}
			return answer.toString();
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[][] queries = { { 2, 3 }, { 0, 7 }, { 5, 9 }, { 6, 10 } };

		System.out.println(solution.solution("rermgorpsam", queries));
	}
}
