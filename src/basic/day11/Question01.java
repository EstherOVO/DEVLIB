package basic.day11;

import java.util.*;

public class Question01 {

	public static class Solution {

		public int[] solution(String my_string) {
			int[] answer = {};

			Map<String, Integer> alphabets = new LinkedHashMap<>();
			char lowerCh = 'a';
			char upperCh = 'A';

			for (char i = 0; i < 26; i++) {
				String upperAlphabet = String.valueOf(upperCh);
				upperCh++;
				alphabets.put(upperAlphabet, 0);
			}

			for (char i = 0; i < 26; i++) {
				String lowerAlphabet = String.valueOf(lowerCh);
				lowerCh++;
				alphabets.put(lowerAlphabet, 0);
			}

			String[] split = my_string.split("");

			for (int i = 0; i < split.length; i++) {
				for (String str : alphabets.keySet()) {
					if (split[i].equals(str)) {
						alphabets.replace(str, alphabets.get(str) + 1);
					}
				}
			}

			answer = alphabets.values().stream().mapToInt(Integer::intValue).toArray();

			return answer;
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		System.out.println(Arrays.toString(solution.solution("Programmers")));
	}
}
