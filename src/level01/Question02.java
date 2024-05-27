package level01;

public class Question02 {

	public static class Solution {

//		프로그래머스(Programmers) - PCCP 기출문제 - [PCCP 기출문제] 1번 / 붕대 감기
		public int solution(int[] bandage, int health, int[][] attacks) {
			int answer = 0;

			int time = 0;
			int duration = 0;
			int max = health;
			int attackDuration = bandage[0];
			int recoverHealth = bandage[1];
			int plusHealth = bandage[2];

			while (true) {

				for (int i = 0; i < attacks.length; i++) {

					int attackTime = attacks[i][0];
					int damage = attacks[i][1];

					if (attackTime == time) {
						health -= damage;
						duration = 0;
					}

					if (health <= 0) {
						return -1;
					} else {
						if (time == attackTime && i == attacks.length - 1) {
							return health;
						}
					}
				}

				health += recoverHealth;

				if (health > max) {
					health = max;
				}

				if (duration == attackDuration && time % attackDuration == 0) {
					health += plusHealth;
					if (health > max) {
						health = max;
					}
					duration = 0;
				}

				duration++;
				time++;
			}
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		int[] bandage1 = { 5, 1, 5 };	// 기술 시전 시간, 초당 회복량, 추가 회복량
		int[][] attacks1 = { {2, 10}, {9, 15}, {10, 5}, {11, 5} };	// 공격 시간, 피해량

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
