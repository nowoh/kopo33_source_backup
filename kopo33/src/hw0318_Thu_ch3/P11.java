package hw0318_Thu_ch3;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money;
		double EX_RATEWD = 1125.03;
		double EX_RATEWE = 1342.50;
		double EX_RATEWY = 10.31;
		while (true) {
			System.out.println("#Current Converter");
			System.out.println("1. ROK won -> USA dollar");
			System.out.println("2. USA dollar -> ROK won");
			System.out.println("3. ROK won -> EU euro");
			System.out.println("4. EU euro -> ROK won");
			System.out.println("5. ROK won -> JP yen");
			System.out.println("6. JP yen -> ROK won");
			System.out.print("--> ");
			int chNum = scan.nextInt();
			if (chNum == 1) {
				money = scan.nextInt();
				System.out.println(String.format("%.2f", (money / EX_RATEWD)));
			} else if (chNum == 2) {
				money = scan.nextInt();
				System.out.println(money * EX_RATEWD);
			} else if (chNum == 3) {
				money = scan.nextInt();
				System.out.println(String.format("%.2f", (money / EX_RATEWE)));
			} else if (chNum == 4) {
				money = scan.nextInt();
				System.out.println(money * EX_RATEWE);	
			} else if (chNum == 5) {
				money = scan.nextInt();
				System.out.println(String.format("%.2f", (money / EX_RATEWY)));
			} else if (chNum == 6) {
				money = scan.nextInt();
				System.out.println(money / EX_RATEWY);
			} else {
				System.out.println("Please choose right number!");
			}
		}
	}	
}



