package basic.day21;

import java.util.*;

public class Question02 {

	public static class Solution {

		public int solution(int[] rank, boolean[] attendance) {
			int answer = 0;

			Map<Integer, Boolean> rankingMap = new HashMap<>();
			int[] result = new int[3];

			for (int i = 0; i < rank.length; i++) {
				rankingMap.put(rank[i], attendance[i]);
			}

			List<Integer> rankingList = new ArrayList<>(rankingMap.keySet());

			Collections.sort(rankingList);

			int count = 0;
			for (Integer number : rankingList) {
				if (rankingMap.get(number) && count <= 2) {
					for (int i = 0; i < rank.length; i++) {
						if (number == rank[i]) {
							result[count] = i;
						}
					}
					count++;
				}
			}
			return answer = 10000 * result[0] + 100 * result[1] + result[2];
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] rank1 = { 3, 7, 2, 5, 4, 6, 1 };
		boolean[] attendance1 = { false, true, true, true, true, false, false };

		int[] rank2 = { 1, 2, 3 };
		boolean[] attendance2 = { true, true, true };

		int[] rank3 = { 6, 1, 5, 2, 3, 4 };
		boolean[] attendance3 = { true, false, true, false, false, true };

		System.out.println(solution.solution(rank1, attendance1));
		System.out.println(solution.solution(rank2, attendance2));
		System.out.println(solution.solution(rank3, attendance3));
	}
}
