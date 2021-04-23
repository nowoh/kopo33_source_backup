package hw0318_Thu_ch3;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		if (a < 0) {
			System.out.println(a *= -1);			
		} else if (a > 0) {
			System.out.println(a);
		} else {
			System.out.println(a);
		}
	}	
}



