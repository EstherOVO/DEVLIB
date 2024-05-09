package basic.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question04 {

	public static class Solution {

		public String solution(String my_string, int m, int c) {
			StringBuilder answer = new StringBuilder();

			List<String> words = new ArrayList<>();

			for (int i = 0; i < my_string.length(); i += m) {
				words.add(my_string.substring(i, i + m));
			}

			List<String> chars = new ArrayList<>();

			for (int i = 0; i < words.size(); i++) {
				chars.addAll(Arrays.asList(words.get(i).split("")));
				answer.append(chars.get(c - 1));

				chars.clear();
			}
			return answer.toString();
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("ihrhbakrfpndopljhygc", 4, 2));
		System.out.println(solution.solution("programmers", 1, 1));
	}
}
