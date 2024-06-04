package beginner.day09;

import java.util.HashMap;
import java.util.Map;

public class Question02 {

    public static class Solution {

        public String solution(String letter) {
            StringBuilder answer = new StringBuilder();

            Map<String, String> translateCodeMap = new HashMap<>();

            String[] morse = { ".-", "-...", "-.-.", "-.." , ".", "..-.",
                    "--.", "....", "..", ".---", "-.-", ".-..",
                    "--", "-.", "---", ".--.", "--.-", ".-.",
                    "...", "-", "..-", "...-", ".--", "-..-",
                    "-.--", "--.." };

            char alphabet = 97;
            for (int i = 0; i < morse.length; i++) {
                translateCodeMap.put(morse[i], Character.toString(alphabet));
                alphabet++;
            }

            String[] letterSplit = letter.split(" ");
            for (int i = 0; i < letterSplit.length; i++) {
                for (Map.Entry<String, String> entry : translateCodeMap.entrySet()) {
                    if (letterSplit[i].equals(entry.getKey())) {
                        answer.append(entry.getValue());
                    }
                }
            }

            return answer.toString();
        }
    }

    public static void main(String[] args) {

        Question02.Solution solution = new Solution();

        System.out.println(solution.solution(".... . .-.. .-.. ---"));
        System.out.println(solution.solution(".--. -.-- - .... --- -."));
    }
}
