package level01;

import java.util.*;

public class Question01 {

	public static class Solution {

		public int solution(String[] friends, String[] gifts) {
			int answer = 0;

			List<String> giver = new ArrayList<>();
			List<String> receiver = new ArrayList<>();

			for (int i = 0; i < gifts.length; i++) {
				String[] split = gifts[i].split(" ");
				giver.add(split[0]);
				receiver.add(split[1]);
			}

//			이름 : 선물을 준 횟수
			Map<String, Integer> giverMap = new HashMap<>();
			for (String string : friends) {
				giverMap.put(string, 0);
			}

			for (String string : giver) {
				giverMap.replace(string, giverMap.get(string) + 1);
			}

//			이름 : 선물을 받은 횟수
			Map<String, Integer> receiverMap = new HashMap<>();
			for (String string : friends) {
				receiverMap.put(string, 0);
			}

			for (String string : receiver) {
				receiverMap.replace(string, receiverMap.get(string) + 1);
			}

//			이름 : 다음 달 선물을 받을 횟수
			Map<String, Integer> nextMonth = new HashMap<>();
			for (String string : friends) {
				nextMonth.put(string, 0);
			}

			for (int i = 0; i < friends.length; i++) {
				for (int j = 0; j < i; j++) {
					if (j > i) {
						String me = friends[i];
						String you = friends[j];

						Integer meCount = giverMap.get(me);
						Integer youCount = giverMap.get(you);

						if (meCount > youCount) {
							nextMonth.replace(me, nextMonth.get(me) + 1);
						} else if (meCount < youCount) {
							nextMonth.replace(you, nextMonth.get(you) + 1);
						} else {
							int myPresentRate = giverMap.get(me) - receiverMap.get(me);
							int yourPresentRate = giverMap.get(you) - receiverMap.get(you);

							if (myPresentRate > yourPresentRate) {
								nextMonth.replace(me, nextMonth.get(me) + 1);
							} else if (myPresentRate < yourPresentRate) {
								nextMonth.replace(you, nextMonth.get(you) + 1);
							}
						}
					}
				}
			}

			answer = nextMonth.values().stream()
					.mapToInt(Integer::intValue)
					.max()
					.orElse(0);

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		String[] friends1 = {"muzi", "ryan", "frodo", "neo" };
		String[] gifts1 = { "muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi" };

		String[] friends2 = { "joy", "brad", "alessandro", "conan", "david" };
		String[] gifts2 = { "alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david" };

		String[] friends3 = { "a", "b", "c" };
		String[] gifts3 = { "a b", "b a", "c a", "a c", "a c", "c a" };

		System.out.println(solution.solution(friends1, gifts1));
		System.out.println(solution.solution(friends2, gifts2));
		System.out.println(solution.solution(friends3, gifts3));
	}
}
