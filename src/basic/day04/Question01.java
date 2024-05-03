package basic.day04;

public class Question01 {
	
	public static class Solution {
		
		public int solution(int num, int n) {
			int answer = 0;
			
			if (num % n == 0) {
				answer = 1;
			}
			
			return answer;
		}    
	}

	public static void main(String[] args) {
		
		Solution solution = new Solution();
	
		System.out.println(solution.solution(98, 2));
	}
}
