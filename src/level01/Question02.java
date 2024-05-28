package level01;

public class Question02 {

    public static class Solution {

//      프로그래머스(Programmers) - PCCP 기출문제 - [PCCP 기출문제] 1번 / 붕대 감기
        public int solution(int[] bandage, int health, int[][] attacks) {
            int lastAttackTime = attacks[attacks.length - 1][0];    // 마지막 공격 시간
            int max = health;    // 최대 체력
            int duration = 0;    // 공격 지속 시간
            int nextAttack = 0;  // 다음 공격

            int attackDuration = bandage[0];	// 기술 시전 시간
            int recoverHealth = bandage[1];		// 초당 회복량
            int plusHealth = bandage[2];		// 추가 회복량

            for (int i = 0; i <= lastAttackTime; i++) {

//				현재 시간과 공격 시간이 같을 경우
                if (i == attacks[nextAttack][0]) {
                    int damage = attacks[nextAttack][1];
                    health -= damage;
                    duration = 0;

//				    만약 체력이 다 소진되었을 경우, -1 리턴한다.
                    if (health <= 0) {
                        return -1;
                    }
                    nextAttack++;

//			    현재 시간과 공격 시간이 다를 경우
                } else {
                    health += recoverHealth;
                    duration++;

//				    공격 지속 시간과 기술 시전 시간이 같다면 추가 회복량을 제공하고 공격 지속 시간을 초기화한다.
                    if (duration == attackDuration) {
                        health += plusHealth;
                        duration = 0;
                    }

//				    체력이 최대치를 넘지 않도록 한다.
                    if (health > max) {
                        health = max;
                    }
                }
            }
            return health;
        }
    }

    public static void main(String[] args) {

        Question02.Solution solution = new Question02.Solution();

        int[] bandage1 = { 5, 1, 5 };
        int[][] attacks1 = { {2, 10}, {9, 15}, {10, 5}, {11, 5} };

        int[] bandage2 = { 3, 2, 7 };
        int[][] attacks2 = { {1, 15}, {5, 16}, {8, 6} };

        int[] bandage3 = { 4, 2, 7 };
        int[][] attacks3 = { {1, 15}, {5, 16}, {8, 6} };

        int[] bandage4 = { 1, 1, 1 };
        int[][] attacks4 = { {1, 2}, {3, 2} };

        System.out.println(solution.solution(bandage1, 30, attacks1));	// 5
        System.out.println(solution.solution(bandage2, 20, attacks2));	// -1
        System.out.println(solution.solution(bandage3, 20, attacks3));	// -1
        System.out.println(solution.solution(bandage4, 5, attacks4));	// 3
    }
}
