package basic.day21;

public class Question03 {

	public static class Solution {

		public int solution(double flo) {

			return (int) flo;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution(1.42));
		System.out.println(solution.solution(69.32));
	}
}
