package basic.day08;

public class Question03 {

	public static class Solution {

		public String solution(String my_string, int[] index_list) {
			StringBuilder answer = new StringBuilder();

			for (int i = 0; i < index_list.length; i++) {

				answer.append(my_string.charAt(index_list[i]));
			}
			return answer.toString();
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] index_list1 = { 16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7 };
		int[] index_list2 = { 1, 2, 0, 0, 3 };

		System.out.println(solution.solution("cvsgiorszzzmrpaqpe", index_list1));
		System.out.println(solution.solution("zpiaz", index_list2));
	}
}
