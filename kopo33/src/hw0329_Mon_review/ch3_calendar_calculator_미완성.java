package hw0329_Mon_review;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class ch3_calendar_calculator_¹Ì¿Ï¼º {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd");
		Scanner scan = new Scanner(System.in);
		String date1 = scan.nextLine();
		String date2 = scan.nextLine();
		Date D1 = Date.parse(date1);
		Date D2 = (Date) date.parse(date2);
		System.out.println();
		
	}

}
