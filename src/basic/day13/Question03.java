package basic.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question03 {

	public static class Solution {

		public String[] solution(String[] str_list) {
			String[] answer = {};

			List<String> list = new ArrayList<>();

			for (int i = 0; i < str_list.length; i++) {
				if (str_list[i].equals("l")) {
					for (int j = 0; j < i; j++) {
						list.add(str_list[j]);
					}
					break;
				} else if (str_list[i].equals("r")) {
					for (int k = i + 1; k < str_list.length; k++) {
						list.add(str_list[k]);
					}
					break;
				}
			}

			answer = list.stream().toArray(String[]::new);

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		String[] str_list1 = { "u", "u", "l", "r" };
		String[] str_list2 = { "l" };

		System.out.println(Arrays.toString(solution.solution(str_list1)));
		System.out.println(Arrays.toString(solution.solution(str_list2)));
	}
}
