package basic.day02;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println((n % 2 == 0 ? (n + " is even") : (n + " is odd")));
	}
}
