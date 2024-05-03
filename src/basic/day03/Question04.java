package basic.day03;

public class Question04 {
	
	public static class Solution {
		
		public int solution(int a, int b) {
			int answer = 0;

	        String aPlusB = String.valueOf(a) + String.valueOf(b);
	        String bPlusA = String.valueOf(b) + String.valueOf(a);

	        int i1 = Integer.parseInt(aPlusB);
	        int i2 = Integer.parseInt(bPlusA);

	        answer = Math.max(i1, i2);

	        return answer;
		}    
	}

	public static void main(String[] args) {
		
		Solution solution = new Solution();
	
		System.out.println(solution.solution(9, 91));
	}
}
