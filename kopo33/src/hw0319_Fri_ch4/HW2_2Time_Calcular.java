package hw0319_Fri_ch4;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;

public class HW2_2Time_Calcular {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		String time1 = scan.nextLine();
		String time2 = scan.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("HHmmss"); 
		Date d1 = sdf.parse(time1);
		Date d2 = sdf.parse(time2);
		long diff = Math.abs(d2.getTime() - d1.getTime());
		long sec = diff/1000;
		System.out.println(sec + "s");
		
	}
}