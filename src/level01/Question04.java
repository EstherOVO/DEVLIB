package level01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question04 {

    public static class Solution {

//      프로그래머스(Programmers) - 연습문제 - 달리기 경주
        public String[] solution(String[] players, String[] callings) {
            String[] answer = {};

            Map<String, Integer> ranking = new HashMap<>();

//          플레이어들의 이름과 순위를 담은 맵을 초기화한다.
            for (int i = 0; i < players.length; i++) {
                ranking.put(players[i], i);
            }

            for (String calling : callings) {

//              이름이 불려 순위가 변동될 경우 이름 + 순위를 담은 raking 맵의 순위를 변동시키고,
                Integer index = ranking.get(calling);
                ranking.put(players[index], index - 1);
                ranking.put(players[index - 1], index);

//              이름 + 순위가 또 담긴 players 배열의 순위를 변동시켜 준다.
                String temp = players[index];
                players[index] = players[index - 1];
                players[index - 1] = temp;
            }

//          ranking(Map)만 생성하지 못하는 이유 :
//          - ranking(Map)의 순위가 변동돼도 players에 반영되지 않아, 다음 for 사이클 진행 시 players[index] 호출에서 오류가 난다.
//          String temp를 활용해서만 못하는 이유 :
//          - ranking(Map)의 get 메서드를 통해 인덱스를 불러와야 하는데, index가 정해지지 않으면 players[index] 호출 시 오류가 난다.
//          → 따라서 Map과 기존 players 문자열 배열을 통해 순위를 변경해 주어야 한다.

            return answer = Arrays.copyOf(players, players.length);
        }
    }

    public static void main(String[] args) {

        Question04.Solution solution = new Question04.Solution();

        String[] players = { "mumu", "soe", "poe", "kai", "mine" };
        String[] callings = { "kai", "kai", "mine", "mine" };

        System.out.println(Arrays.toString(solution.solution(players, callings)));	// ["mumu", "kai", "mine", "soe", "poe"]
    }
}
