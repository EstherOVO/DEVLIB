package basic.day22;

import java.math.BigInteger;

public class Question02 {

	public static class Solution {

		public String solution(String a, String b) {
			String answer = "";

			BigInteger bigIntA = new BigInteger(a);
			BigInteger bigIntB = new BigInteger(b);

			BigInteger add = bigIntA.add(bigIntB);

			return String.valueOf(add);
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(solution.solution("582", "734"));
		System.out.println(solution.solution("18446744073709551615", "287346502836570928366"));
		System.out.println(solution.solution("0", "0"));
	}
}
