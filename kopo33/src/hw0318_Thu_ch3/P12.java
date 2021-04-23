package hw0318_Thu_ch3;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class P12 {

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
				System.out.println((temp * 9/5) + 32 +"¡ÆF");
			} else if (chNum == 2) {
				temp = scan.nextInt();
				System.out.println((temp - 32) * 5/9 + "¡ÆC");
			} else {
				System.out.println("Please choose right number!");
			}
		}
	}	
}



