package hw0329_Mon_review;

import java.util.Scanner;

public class ch3_Temper_convert {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double temp;
		while (true) {
			System.out.println("#Current Converter");
			System.out.println("1. Celsius -> Fahrenheit");
			System.out.println("2. Fahrenheit -> Celsius");
			System.out.print("--> ");
			int chNum = scan.nextInt();
			if (chNum== 1) {
				temp = scan.nextInt();
				System.out.println((temp * 9/5) + 32 +"��F");
			} else if (chNum == 2) {
				temp = scan.nextInt();
				System.out.println((temp - 32) * 5/9 + "��C");
			} else {
				System.out.println("Please choose right number!");
			}
		}
	}
}
