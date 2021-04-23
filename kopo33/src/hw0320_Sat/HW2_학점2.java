package hw0320_Sat;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class HW2_ÇÐÁ¡_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] units = new int [n];
		String[] grade = new String[n];
		for (int i = 0; i < n; i++) {
			units[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			grade[i] = scan.nextInt();
		}
		
	}
}


