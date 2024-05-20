package basic.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question03 {

	public static class Solution {

		public String[] solution(String[] todo_list, boolean[] finished) {
			String[] answer = {};

			List<String> incompleteList = new ArrayList<>();

			for (int i = 0; i < todo_list.length; i++) {
				if (!finished[i]) {
					incompleteList.add(todo_list[i]);
				}
			}

			answer = incompleteList.stream().toArray(String[]::new);

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		String[] todo_list = { "problemsolving", "practiceguitar", "swim", "studygraph" };
		boolean[] finished = { true, false, true, false };

		System.out.println(Arrays.toString(solution.solution(todo_list, finished)));
	}
}
