package basic.day08;

import java.util.HashMap;
import java.util.Map;

public class Question02 {

	public static class Solution {

		public int solution(int a, int b, int c, int d) {
			int answer = 0;

			Map<Integer, Integer> map = new HashMap<>();
			map.put(a, map.getOrDefault(a, 0) + 1);
			map.put(b, map.getOrDefault(b, 0) + 1);
			map.put(c, map.getOrDefault(c, 0) + 1);
			map.put(d, map.getOrDefault(d, 0) + 1);

			if (map.size() == 1) return a * 1111;

			if (map.size() == 2) {
				if (map.containsValue(3)) {
					for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
						answer += entry.getKey() * (entry.getValue() == 3 ? 10 : 1);
					}
					return answer * answer;
				}
				int x = (a + b + c + d - 2 * a) / 2;
				return (a + x) * Math.abs(a - x);
			}

			if (map.size() == 3) {
				answer = 1;
				for (Map.Entry<Integer, Integer> el : map.entrySet())
					if (el.getValue() != 2) answer *= el.getKey();
				return answer;
			}
			return Math.min(Math.min(a, b), Math.min(c, d));
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution(2, 2, 2, 2)); // 2222
		System.out.println(solution.solution(4, 1, 4, 4)); // 1681
		System.out.println(solution.solution(6, 3, 3, 6)); // 27
		System.out.println(solution.solution(2, 5, 2, 6)); // 30
		System.out.println(solution.solution(6, 4, 2, 5)); // 2
	}
}
