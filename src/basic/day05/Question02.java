package basic.day05;

import java.util.ArrayList;
import java.util.List;

public class Question02 {

	public static class Solution {

		public int solution(int a, int d, boolean[] included) {
			int answer = 0;

			List<Integer> list = new ArrayList<>();
			List<Integer> numbers = new ArrayList<>();

			list.add(a);

			for (int i = 0; i < included.length; i++) {
				list.add(a += d);
				if (included[i]) {
					numbers.add(list.get(i));
				}
			}

			answer = numbers.stream().mapToInt(Integer::intValue).sum();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		boolean[] included = { true, false, false, true, true };

		System.out.println(solution.solution(3, 4, included));
	}
}
