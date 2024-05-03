package basic.day04;

public class Question02 {
	
	public static class Solution {
		
		public int solution(int number, int n, int m) {
			int answer = 0;

            if (number % n == 0 && number % m == 0) {
                answer = 1;
            }

            return answer;
		}    
	}

	public static void main(String[] args) {
		
		Solution solution = new Solution();
	
		System.out.println(solution.solution(60, 2, 3));
	}
}
