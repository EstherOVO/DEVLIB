package basic.day03;

public class Question03 {
	
	public static class Solution {
		
		public String solution(String my_string, int k) {
			String answer = "";

	        for (int i = 0; i < k; i++) {
	            answer += my_string;
	        }
	        
	        return answer;
		}    
	}

	public static void main(String[] args) {
		
		Solution solution = new Solution();
	
		System.out.println(solution.solution("string", 3));
	}
}
