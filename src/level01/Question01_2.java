package level01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question01_2 {

	public static class Solution {

		public int solution(String[] friends, String[] gifts) {
			int answer = 0;

			Map<String, Integer> giver = new HashMap<>();
			Map<String, Map<String, Integer>> history = new HashMap<>();
			Map<String, Integer> giftPoints = new HashMap<>();
			Map<String, Integer> nextMonth = new HashMap<>();

			for (String friend : friends) {
				giver.put(friend, 0);
				history.put(friend, giver);
				giftPoints.put(friend, 0);
				nextMonth.put(friend, 0);
			}

//			히스토리 작성
			List<Map<String, String>> giveAndTake = new ArrayList<>();

			for (int i = 0; i < gifts.length; i++) {
				String[] split = gifts[i].split(" ");
				Map<String, String> map = new HashMap<>();
				map.put(split[0], split[1]);

				giveAndTake.add(map);
			}

			for (int i = 0; i < giveAndTake.size(); i++) {
				for (Map.Entry<String, String> entry : giveAndTake.get(i).entrySet()) {
					for (String name : friends) {
						if (name.equals(entry.getKey())) {
							giver.replace(name, giver.get(name) + 1);
							history.replace(name, giver);
						}
					}
				}
			}

//			선물 포인트
			for (int i = 0; i < friends.length; i++) {
				int giveScore = 0;
				int receiveScore = 0;

				for (Map.Entry<String, String> entry : giveAndTake.get(i).entrySet()) {
					if (entry.getKey().equals(friends[i])) {
						giveScore++;
					}
					if (entry.getValue().equals(friends[i])) {
						receiveScore++;
					}
				}
				giftPoints.replace(friends[i], (giveScore - receiveScore));
			}


//			최종 연산
			for (int i = 0; i < friends.length; i++) {
				for (int j = 0; j < friends.length; j++) {
					if (!friends[i].equals(friends[j]) && j > i) {
						String me = friends[i];
						String you = friends[j];

						Integer meCount = history.get(me).get(you);
						Integer youCount = history.get(you).get(me);

						if (meCount > youCount) {
							nextMonth.replace(me, nextMonth.get(me) + 1);
						} else if (meCount < youCount) {
							nextMonth.replace(you, nextMonth.get(you) + 1);
						} else {

							Integer myPoint = giftPoints.get(me);
							Integer yourPoint = giftPoints.get(you);

							if (myPoint > yourPoint) {
								nextMonth.replace(me, nextMonth.get(me) + 1);
							} else if (myPoint < yourPoint) {
								nextMonth.replace(you, nextMonth.get(you) + 1);
							} else {
								nextMonth.replace(me, nextMonth.getOrDefault(me, 0));
								nextMonth.replace(you, nextMonth.getOrDefault(you, 0));
							}
						}
					}
				}
			}

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
