package hw0317_Wed_ch2;

import java.util.Scanner;

public class B_01_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if (a%b == 0 && a%c == 0) {
			System.out.println("Divisible by " +b +" and " +c +"!");
		} else {
			System.out.println("Not divisible by " +b +" and " +c +"!");
		}
		scan.close();
	}
}
