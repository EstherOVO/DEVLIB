package level01;

import java.util.*;

public class Question01 {

	public static class Solution {

//		프로그래머스(Programmers) - 2024 KAKAO WINTER INTERNSHIP - 가장 많이 받은 선물
		public int solution(String[] friends, String[] gifts) {
			int answer = 0;

			Map<String, Integer> giver = new HashMap<>();
			Map<String, Integer> receiver = new HashMap<>();
			Map<String, Map<String, Integer>> records = new HashMap<>();
			Map<String, Integer> presentPoints = new HashMap<>();
			Map<String, Integer> nextMonth = new HashMap<>();

			for (String friend : friends) {
				giver.put(friend, 0);
				receiver.put(friend, 0);
				records.put(friend, new HashMap<>());
				presentPoints.put(friend, 0);
				nextMonth.put(friend, 0);
			}

//			1. 누가 → 누구에게 선물을 줬는지
			List<Map<String, String>> giveAndTake = new ArrayList<>();
			for (int i = 0; i < gifts.length; i++) {
				String[] split = gifts[i].split(" ");
				Map<String, String> map = new HashMap<>();
				map.put(split[0], split[1]);

				giveAndTake.add(map);
			}

//          2. 과거 선물 주고 받은 내역 정보 초기화
//          Map<String(받은 사람), Integer(준 사람이 받은 사람에게 선물을 준 횟수)>
			for(int i = 0; i < friends.length; i++) {
				Map<String, Integer> transactionCount = records.get(friends[i]);
				for(int j = 0; j < friends.length; j++) {
					if(i == j) {
						continue;   // 본인 제외
					}
					transactionCount.put(friends[j], 0);
				}
			}

//          3. 선물 지수 측정 + 히스토리 선물 주고 받은 내역 카운트
			for (int i = 0; i < giveAndTake.size(); i++) {
				for (Map.Entry<String, String> giveTakeMap : giveAndTake.get(i).entrySet()) {
					String givePerson = giveTakeMap.getKey();
					String takePerson = giveTakeMap.getValue();

//                  선물 지수 계산(주거나 받았을 경우 Value 값 카운트)
					giver.replace(givePerson, giver.get(givePerson) + 1);
					receiver.replace(takePerson, receiver.get(takePerson) + 1);

//                  1번에 해당될 경우 카운트
					Map<String, Integer> map = records.get(givePerson);
					map.put(takePerson, map.getOrDefault(takePerson, 0) + 1);

					records.replace(givePerson, map);
				}
			}

//			4. 선물 지수 최종 측정
			for (String friend : friends) {
				presentPoints.replace(friend, (giver.get(friend) - receiver.get(friend)));
			}

//			5. 최종 연산
			for (int i = 0; i < friends.length; i++) {
				for (int j = 0; j < friends.length; j++) {
//                  이름이 같거나(본인), 이미 비교를 한 사람끼리는 제외한다.
					if (!friends[i].equals(friends[j]) && j > i) {
						String me = friends[i];
						String you = friends[j];

						Integer meCount = records.get(me).get(you);
						Integer youCount = records.get(you).get(me);

						if (meCount > youCount) {
							nextMonth.replace(me, nextMonth.get(me) + 1);
						} else if (meCount < youCount) {
							nextMonth.replace(you, nextMonth.get(you) + 1);
						} else {
							Integer myPoint = presentPoints.get(me);
							Integer yourPoint = presentPoints.get(you);

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

		System.out.println(solution.solution(friends1, gifts1));	// 2
		System.out.println(solution.solution(friends2, gifts2));	// 4
		System.out.println(solution.solution(friends3, gifts3));	// 0
	}
}
