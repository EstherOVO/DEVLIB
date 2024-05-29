package basic.day24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question01 {

    public static class Solution {

        public int solution(String[] order) {
            int answer = 0;

            Map<String, Integer> menu = new HashMap<>();
            List<Integer> totalPrice = new ArrayList<>();

            menu.put("cafelatte", 5000);
            menu.put("americano", 4500);

            for (int i = 0; i < order.length; i++) {
                if (order[i].contains("cafelatte")) {
                    totalPrice.add(menu.get("cafelatte"));
                } else {
                    totalPrice.add(menu.get("americano"));
                }
            }

            answer = totalPrice.stream().mapToInt(Integer::intValue).sum();

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] order1 = { "cafelatte", "americanoice", "hotcafelatte", "anything" };
        String[] order2 = { "americanoice", "americano", "iceamericano" };

        System.out.println(solution.solution(order1));
        System.out.println(solution.solution(order2));
    }
}
