package basic.day03;

public class Question02 {
	
	public static class Solution {
		
		public String solution(String[] arr) {
			String answer = "";

	        for (String string : arr) {
	            answer += string;
	        }
	        
	        return answer;
		}    
	}

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		String[] arr = {"a","b","c"};
		
		System.out.println(solution.solution(arr));
	}
}
