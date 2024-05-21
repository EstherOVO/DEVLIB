package basic.day16;

import java.util.Arrays;

public class Question03 {

	public static class Solution {

		public String[] solution(String[] strArr) {
			String[] answer = {};

			for (int i = 0; i < strArr.length; i++) {
				if (i % 2 == 0) {
					strArr[i] = strArr[i].toLowerCase();
				} else {
					strArr[i] = strArr[i].toUpperCase();
				}
			}
			return answer = Arrays.copyOf(strArr, strArr.length);
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		String[] strArr1 = { "AAA","BBB","CCC","DDD" };
		String[] strArr2 = { "aBc","AbC" };

		System.out.println(Arrays.toString(solution.solution(strArr1)));
		System.out.println(Arrays.toString(solution.solution(strArr2)));
	}
}
