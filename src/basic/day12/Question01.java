package basic.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question01 {

	public static class Solution {

		public int[] solution(int n, int[] slicer, int[] num_list) {
			int[] answer = {};

			List<Integer> numberList = new ArrayList<>();

			switch (n) {
				case 1 :
					for (int i = 0; i <= slicer[1]; i++) {
						numberList.add(num_list[i]);
					}
					break;
				case 2 :
					for (int i = slicer[0]; i < num_list.length; i++) {
						numberList.add(num_list[i]);
					}
					break;
				case 3 :
					for (int i = slicer[0]; i <= slicer[1]; i++) {
						numberList.add(num_list[i]);
					}
					break;
				case 4 :
					for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
						numberList.add(num_list[i]);
					}
					break;
			}
			answer = numberList.stream().mapToInt(Integer::intValue).toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] slicer = { 1, 5, 2 };
		int[] num_list = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(Arrays.toString(solution.solution(3, slicer, num_list)));
		System.out.println(Arrays.toString(solution.solution(4, slicer, num_list)));
	}
}
