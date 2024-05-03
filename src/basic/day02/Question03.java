package basic.day02;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String[] split = a.split("");
		
		for (String string : split) {
			System.out.println(string);
		}
	}
}
