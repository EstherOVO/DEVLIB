package basic.day02;

public class Question05 {
	
	public static class Solution {
		
		public String solution(String my_string, String overwrite_string, int s) {
			
			String answer = "";
	        
	        String str1 = my_string.substring(0, s);
	        String str2 = my_string.substring(s + overwrite_string.length());
	        answer = str1 + overwrite_string + str2;
	        
	        return answer;
		}    
	}

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		System.out.println(solution.solution("He11oWor1d", "lloWorl", 2));
	}
}
