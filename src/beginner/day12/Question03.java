package beginner.day12;

import java.util.ArrayList;
import java.util.List;

public class Question03 {

    public static class Solution {

        public int solution(String my_string) {
            int answer = 0;

            List<Integer> intList = new ArrayList<>();

            for (int i = 0; i < my_string.length(); i++) {
                String str = my_string.substring(i, i + 1);
                if (str.matches("[0-9]")) intList.add(Integer.valueOf(str));
            }

            answer = intList.stream().mapToInt(Integer::intValue).sum();

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("aAb1B2cC34oOp"));
        System.out.println(solution.solution("1a2b3c4d123"));
    }
}
