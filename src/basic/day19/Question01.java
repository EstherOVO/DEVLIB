package basic.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question01 {

	public static class Solution {

		public String[] solution(String myStr) {
			String[] answer = {};

			String[] split = myStr.split("[a-c]+");
			List<String> strList = new ArrayList<>();

			for (int i = 0; i < split.length; i++) {
				if (!split[i].isEmpty()) {
					strList.add(split[i]);
				}
			}

			if (strList.isEmpty()) {
				strList.add("EMPTY");
			}

			answer = strList.stream().toArray(String[]::new);

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(Arrays.toString(solution.solution("baconlettucetomato")));
		System.out.println(Arrays.toString(solution.solution("abcd")));
		System.out.println(Arrays.toString(solution.solution("cabab")));
	}
}
