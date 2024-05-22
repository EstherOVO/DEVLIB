package basic.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question02 {

	public static class Solution {

		public String[] solution(String myString) {
			String[] answer = {};

			String[] split = myString.split("x");
			List<String> strList = new ArrayList<>();

			for (int i = 0; i < split.length; i++) {
				if (!split[i].equals("x") && !split[i].equals("")) {
					strList.add(split[i]);
				}
			}

			answer = strList.stream().sorted().toArray(String[]::new);

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(Arrays.toString(solution.solution("axbxcxdx")));
		System.out.println(Arrays.toString(solution.solution("dxccxbbbxaaaa")));
	}
}
