package hw0318_Thu_ch3;

import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;
import java.time.DateTimeException;

public class P7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String date1 = scan.nextLine();
		String date2 = scan.nextLine();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDate ld1 = LocalDate.parse(date1, dtf);
		LocalDate ld2 = LocalDate.parse(date2, dtf);
		
		System.out.println(Math.abs(ChronoUnit.DAYS.between(ld1,ld2)));
	}
}





/*int a = ld1.getDayOfMonth();
int b = ld2.getDayOfMonth();
if (a > b) {
	System.out.println(a - b);
} else {
	System.out.println(b - a);
}*/



