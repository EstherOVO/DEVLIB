package basic.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question02 {

	public static class Solution {

		public String[] solution(String[] names) {
			String[] answer = {};

			List<String> list = new ArrayList<>();

			for (int i = 0; i < names.length; i += 5) {
				list.add(names[i]);
			}

			answer = list.stream().toArray(String[]::new);

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		String[] names = { "nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx" };

		System.out.println(Arrays.toString(solution.solution(names)));
	}
}
