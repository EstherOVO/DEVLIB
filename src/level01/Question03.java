package level01;

import java.util.*;

public class Question03 {

	public static class Solution {

//		프로그래머스(Programmers) - 2022 KAKAO BLIND RECRUITMENT - 신고 결과 받기
		public int[] solution(String[] id_list, String[] report, int k) {
			int[] answer = {};
			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		String[] id_list1 = { "muzi", "frodo", "apeach", "neo" };
		String[] report1 = { "muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi" };

		String[] id_list2 = { "con", "ryan" };
		String[] report2 = { "ryan con", "ryan con", "ryan con", "ryan con" };

		System.out.println(Arrays.toString(solution.solution(id_list1, report1, 2)));	// [2, 1, 1, 0]
		System.out.println(Arrays.toString(solution.solution(id_list2, report2, 3)));	// [0, 0]
	}
}
