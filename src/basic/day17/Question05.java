package basic.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question05 {

	public static class Solution {

		public String[] solution(String my_string) {
			String[] answer = {};

			String[] split = my_string.split(" ");
			List<String> strList = new ArrayList<>();

			for (int i = 0; i < split.length; i++) {
				split[i].trim();
				if (split[i].length() != 0) {
					strList.add(split[i]);
				}
			}

			answer = strList.stream().toArray(String[]::new);

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(Arrays.toString(solution.solution(" i    love  you")));
		System.out.println(Arrays.toString(solution.solution("    programmers  ")));
	}
}
