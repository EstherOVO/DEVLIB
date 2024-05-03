package basic.day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Question02 {

	public static class Solution {

		public int[] solution(int l, int r) {
			int[] answer = {};

			Set<Integer> numbers = new LinkedHashSet<>();
			List<String> temp = new ArrayList<>();

			for (int i = l; i <= r; i++) {
				String[] split = String.valueOf(i).split("");
				for (String string : split) {
					if (string.equals("0") || string.equals("5")) {
						temp.add(string);
					}
				}

				String join = String.join("", temp);
				if (!join.equals("")) {
					if (Integer.valueOf(join) >= l && Integer.valueOf(join) <= r) {
						numbers.add((Integer.valueOf(join)));
					}
				}
				temp.clear();
			}

			if (numbers.isEmpty()) {
				numbers.add(-1);
			}

			answer = numbers.stream().mapToInt(Integer::valueOf).toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(Arrays.toString(solution.solution(5, 555)));
	}
}
