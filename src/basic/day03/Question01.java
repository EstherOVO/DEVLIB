package basic.day03;

public class Question01 {
	
	public static class Solution {
		
		public String solution(String str1, String str2) {
			String answer = "";

	        String[] split1 = str1.split("");
	        String[] split2 = str2.split("");

	        for (int i = 0; i < split1.length; i++) {
	            answer += split1[i] + split2[i];
	        }
	        
	        return answer;
		}    
	}

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		System.out.println(solution.solution("aaaaa", "bbbbb"));
	}
}
