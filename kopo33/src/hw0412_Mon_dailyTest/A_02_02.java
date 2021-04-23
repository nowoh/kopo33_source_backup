package hw0412_Mon_dailyTest;

import java.util.Scanner;

public class A_02_02{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a string");
		String str = scan.nextLine();
		char[] chr = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (chr[i] == 0) {
				System.out.println('j');
			} else {
				int incod1 = (int)chr[i]+48;
				char incod2 = (char)incod1;
				System.out.print(incod2);
			}
			
		}
	}
}
