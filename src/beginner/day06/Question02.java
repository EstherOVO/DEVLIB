package beginner.day06;

import java.util.Scanner;

public class Question02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder star = new StringBuilder();

        for (int i = 1; i <= n; i++) {

            star.append("*");

            System.out.println(star.toString());
        }
    }
}
