package basic.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question03 {

	public static class Solution {

		public String[] solution(String[] strArr) {
			String[] answer = {};

			List<String> strList = new ArrayList<>();

			for (int i = 0; i < strArr.length; i++) {
				if (!strArr[i].contains("ad")) {
					strList.add(strArr[i]);
				}
			}

			answer = strList.stream().toArray(String[]::new);

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		String[] strArr1 = { "and","notad","abcd" };
		String[] strArr2 = { "there","are","no","a","ds" };

		System.out.println(Arrays.toString(solution.solution(strArr1)));
		System.out.println(Arrays.toString(solution.solution(strArr2)));
	}
}
