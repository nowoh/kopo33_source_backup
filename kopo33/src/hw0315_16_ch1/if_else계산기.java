package hw0315_16_ch1;

import java.util.Scanner;

public class if_else°è»ê±â {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What operation do you want?\n");
		System.out.println("1. +\n");
		System.out.println("2. -\n");
		System.out.println("3. *\n");
		System.out.println("4. /\n");
		System.out.println("--->");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		if (a == 1) {
			System.out.println(b+c);
		} else if (a == 2) {
			System.out.println(b-c);
		} else if (a == 3) {
			System.out.println(b*c);
		} else if (a == 4) {
			System.out.println(b/c);
		}
		scan.close();
	}
}