package basic.day23;

import java.util.ArrayList;
import java.util.List;

public class Question02 {

	public static class Solution {

		public String solution(String[] str_list, String ex) {
			StringBuilder answer = new StringBuilder();

			List<String> result = new ArrayList<>();

			for (int i = 0; i < str_list.length; i++) {
				if (!str_list[i].contains(ex)) {
					result.add(str_list[i]);
				}
			}

			for (int i = 0; i < result.size(); i++) {
				answer.append(result.get(i));
			}

			return answer.toString();
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		String[] str_list1 = { "abc", "def", "ghi" };
		String[] str_list2 = { "abc", "bbc", "cbc" };

		System.out.println(solution.solution(str_list1, "ef"));
		System.out.println(solution.solution(str_list2, "c"));
	}
}
