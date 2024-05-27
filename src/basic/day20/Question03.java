package basic.day20;

import java.util.HashMap;
import java.util.Map;

public class Question03 {

	public static class Solution {

		public int solution(String[] strArr) {
			int answer = 0;

			Map<Integer, Integer> lengthMap = new HashMap<>();

			for (int i = 0; i < strArr.length; i++) {
				lengthMap.put(strArr[i].length(), lengthMap.getOrDefault(strArr[i].length(), 0) + 1);
			}

			answer = lengthMap.values().stream().mapToInt(Integer::intValue).max().orElse(0);

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		String[] strArr = { "a","bc","d","efg","hi" };

		System.out.println(solution.solution(strArr));
	}
}
