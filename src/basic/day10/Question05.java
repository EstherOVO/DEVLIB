package basic.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question05 {

	public static class Solution {

		public String solution(int q, int r, String code) {
			StringBuilder answer = new StringBuilder();

			List<String> strList = new ArrayList<>(Arrays.asList(code.split("")));

			for (int i = 0; i < strList.size(); i++) {

				if ((i % q) == r) {
					answer.append(strList.get(i));
				}
			}
			return answer.toString();
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution(3, 1, "qjnwezgrpirldywt"));
		System.out.println(solution.solution(1, 0, "programmers"));
	}
}
