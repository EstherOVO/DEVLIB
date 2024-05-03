package basic.day03;

public class Question05 {
	
	public static class Solution {
		
		public int solution(int a, int b) {
			int answer = 0;

	        String aPlusB = String.valueOf(a) + String.valueOf(b);

	        int i1 = Integer.parseInt(aPlusB);
	        int i2 = 2 * a * b;

	        if (i1 == i2) {
	            answer = i1;
	        } else {
	            answer = Math.max(i1, i2);
	        }

	        return answer;
		}    
	}

	public static void main(String[] args) {
		
		Solution solution = new Solution();
	
		System.out.println(solution.solution(2, 91));
	}
}
